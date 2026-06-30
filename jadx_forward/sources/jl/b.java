package jl;

/* loaded from: classes13.dex */
public class b implements jl.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f381723a;

    public b(java.lang.String str) {
        this.f381723a = str;
    }

    @Override // jl.e
    public void a() {
        java.util.ArrayList arrayList;
        java.lang.Object[] objArr = {this.f381723a};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioPcmDataTrackRecycleCacheTask", "runTask, appId:%s", objArr);
        il.j a17 = il.j.a();
        synchronized (a17.f373538c) {
            java.util.Iterator it = a17.f373536a.iterator();
            while (it.hasNext()) {
                hl.d dVar = (hl.d) a17.f373537b.get((java.lang.String) it.next());
                if (dVar != null) {
                    dVar.g();
                }
            }
            a17.f373536a.clear();
            a17.f373537b.clear();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioPcmDataTrackRecycleCacheTask", "delete all pcm cache File", null);
        il.j a18 = il.j.a();
        synchronized (a18.f373538c) {
            arrayList = new java.util.ArrayList();
            arrayList.addAll(a18.f373536a);
        }
        if (arrayList.size() > 0) {
            java.lang.String str = this.f381723a;
            if (arrayList.size() > 0) {
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    java.lang.String f17 = rl.a.f(str, (java.lang.String) it6.next());
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(f17);
                    if (r6Var.m()) {
                        r6Var.l();
                        int i18 = rl.b.f478676a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.FileUtil", "delete pcm cache file, file:%s", f17);
                    }
                }
            }
        }
    }

    @Override // jl.e
    public void end() {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioPcmDataTrackRecycleCacheTask", "end task", null);
    }
}
