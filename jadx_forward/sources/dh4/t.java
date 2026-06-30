package dh4;

/* loaded from: classes8.dex */
public class t implements p21.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f314115a;

    /* renamed from: b, reason: collision with root package name */
    public bh4.b f314116b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f314117c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f314118d = new java.util.HashSet();

    public t() {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(gm0.j1.u().h() + "talkroom/");
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().h() + "talkroom/");
        sb6.append("talkroomMemberList.info");
        java.lang.String sb7 = sb6.toString();
        this.f314115a = sb7;
        this.f314117c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        if (this.f314116b != null) {
            return;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
            this.f314116b = new bh4.b();
            return;
        }
        try {
            this.f314116b = (bh4.b) new bh4.b().mo11468x92b714fd(com.p314xaae8f345.mm.vfs.w6.N(sb7, 0, -1));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomInfoListMgr", e17, "", new java.lang.Object[0]);
            this.f314116b = new bh4.b();
        }
    }

    public synchronized void a(p21.a aVar) {
        this.f314118d.add(aVar);
    }

    public final void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator it = this.f314118d.iterator();
        while (it.hasNext()) {
            this.f314117c.mo50293x3498a0(new dh4.s(this, (p21.a) it.next(), str, str2, str3));
        }
    }

    public synchronized boolean c(java.lang.String str) {
        java.util.Iterator it = this.f314116b.f102450d.iterator();
        while (it.hasNext()) {
            bh4.a aVar = (bh4.a) it.next();
            if (aVar.f102447d.equals(str) && aVar.f102449f == 0) {
                return true;
            }
        }
        return false;
    }

    public synchronized java.util.LinkedList d(java.lang.String str) {
        java.util.Iterator it = this.f314116b.f102450d.iterator();
        while (it.hasNext()) {
            bh4.a aVar = (bh4.a) it.next();
            if (aVar.f102447d.equals(str)) {
                return (java.util.LinkedList) aVar.f102448e.clone();
            }
        }
        return new java.util.LinkedList();
    }

    public final boolean e(bh4.b bVar) {
        boolean isEmpty = bVar.f102450d.isEmpty();
        java.lang.String str = this.f314115a;
        if (isEmpty) {
            com.p314xaae8f345.mm.vfs.w6.h(str);
            return true;
        }
        try {
            byte[] mo14344x5f01b1f6 = bVar.mo14344x5f01b1f6();
            com.p314xaae8f345.mm.vfs.w6.S(str, mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomInfoListMgr", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public synchronized void f(p21.a aVar) {
        this.f314118d.remove(aVar);
    }

    public synchronized void g(java.lang.String str, java.util.LinkedList linkedList, java.lang.String str2, java.lang.String str3, int i17) {
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomInfoListMgr", "updateList talk: %s,  size: %d", str, java.lang.Integer.valueOf(linkedList.size()));
        java.util.LinkedList linkedList2 = (java.util.LinkedList) linkedList.clone();
        boolean isEmpty = linkedList2.isEmpty();
        java.util.Iterator it = this.f314116b.f102450d.iterator();
        while (it.hasNext()) {
            bh4.a aVar = (bh4.a) it.next();
            if (aVar.f102447d.equals(str)) {
                if (isEmpty) {
                    this.f314116b.f102450d.remove(aVar);
                } else {
                    aVar.f102448e = linkedList2;
                    aVar.f102449f = i17;
                }
                e(this.f314116b);
                b(str, str2, str3);
                return;
            }
        }
        if (!isEmpty) {
            bh4.a aVar2 = new bh4.a();
            aVar2.f102447d = str;
            aVar2.f102448e = linkedList2;
            aVar2.f102449f = i17;
            this.f314116b.f102450d.add(aVar2);
        }
        e(this.f314116b);
        b(str, str2, str3);
    }
}
