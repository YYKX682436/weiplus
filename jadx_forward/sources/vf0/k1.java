package vf0;

/* loaded from: classes12.dex */
public class k1 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vf0.l1 f517745d;

    public k1(vf0.l1 l1Var) {
        this.f517745d = l1Var;
    }

    @Override // wf0.u1
    public void h(final wf0.r1 r1Var) {
        if (r1Var != null && r1Var.f527063b == wf0.s1.UPDATE && r1Var.f527065d == 4) {
            ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: vf0.k1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.List list;
                    java.util.List list2;
                    boolean equals;
                    vf0.k1 k1Var = vf0.k1.this;
                    wf0.r1 r1Var2 = r1Var;
                    k1Var.getClass();
                    java.lang.String str = r1Var2.f527062a;
                    if (str != null && str.contains(ya.b.f77495x8b74a326)) {
                        str = str.substring(0, str.indexOf(ya.b.f77495x8b74a326));
                    }
                    t21.v2 h17 = t21.d3.h(str);
                    if (h17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImportMultiVideoService", "notifyChanged, video info is null, file name = " + str);
                        return;
                    }
                    long j17 = h17.f496549n;
                    synchronized (k1Var.f517745d) {
                        list = (java.util.List) k1Var.f517745d.f517751d.get(java.lang.Long.valueOf(j17));
                        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(k1Var.f517745d.f517753f.get(java.lang.Long.valueOf(j17)));
                        list2 = (java.util.List) k1Var.f517745d.f517752e.get(java.lang.Long.valueOf(j17));
                        equals = java.lang.Boolean.TRUE.equals(k1Var.f517745d.f517754g.get(java.lang.Long.valueOf(j17)));
                    }
                    if (list == null || !list.contains(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideoService", "notifyChanged, video is not in process, file name = " + str + " msg local id = " + j17);
                        return;
                    }
                    int i17 = h17.f496544i;
                    if (i17 != 199 && i17 != 198) {
                        if ((i17 == 104 || i17 == 103) && equals) {
                            t21.d3.z(str);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideoService", "video has been paused at remux process, pause upload now");
                            return;
                        }
                        return;
                    }
                    synchronized (k1Var) {
                        list.remove(h17.d());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideoService", "remove process, file name = " + h17.d() + " already in process = " + list);
                        if (list2 != null) {
                            list2.remove(h17.f());
                        }
                    }
                    if (list.size() == 0) {
                        synchronized (k1Var.f517745d) {
                            k1Var.f517745d.f517751d.remove(java.lang.Long.valueOf(j17));
                            k1Var.f517745d.f517753f.remove(java.lang.Long.valueOf(j17));
                            k1Var.f517745d.f517752e.remove(java.lang.Long.valueOf(j17));
                            if (k1Var.f517745d.f517753f.size() == 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportMultiVideoService", "process list is empty. remove listener");
                            }
                        }
                    }
                }
            });
        }
    }
}
