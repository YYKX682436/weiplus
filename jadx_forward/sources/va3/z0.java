package va3;

/* loaded from: classes9.dex */
public class z0 implements q21.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f515929a;

    /* renamed from: b, reason: collision with root package name */
    public ua3.b f515930b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f515931c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f515932d = new java.util.LinkedList();

    public z0() {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(gm0.j1.u().h() + "trackroom/");
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
        sb6.append(gm0.j1.u().h() + "trackroom/");
        sb6.append("trackroominfolist.info");
        java.lang.String sb7 = sb6.toString();
        this.f515929a = sb7;
        this.f515931c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        if (this.f515930b != null) {
            return;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
            this.f515930b = new ua3.b();
            return;
        }
        try {
            this.f515930b = (ua3.b) new ua3.b().mo11468x92b714fd(com.p314xaae8f345.mm.vfs.w6.N(sb7, 0, -1));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TrackRoomListMgr", e17, "", new java.lang.Object[0]);
            this.f515930b = new ua3.b();
        }
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator it = this.f515932d.iterator();
        while (it.hasNext()) {
            this.f515931c.mo50293x3498a0(new va3.y0(this, (q21.c) it.next(), str, str2, str3));
        }
    }

    public synchronized java.util.LinkedList b(java.lang.String str) {
        ua3.a aVar;
        java.util.Iterator it = this.f515930b.f507508d.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = (ua3.a) it.next();
            if (aVar.f507502d.equals(str)) {
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                if (!c01.v1.u(str)) {
                    return (java.util.LinkedList) aVar.f507503e.clone();
                }
            }
        }
        if (aVar != null) {
            g(aVar.f507502d, null, 0.0d, 0.0d, "", "", "");
        }
        return new java.util.LinkedList();
    }

    public synchronized ua3.a c(java.lang.String str) {
        java.util.Iterator it = this.f515930b.f507508d.iterator();
        while (it.hasNext()) {
            ua3.a aVar = (ua3.a) it.next();
            if (aVar.f507502d.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean d(ua3.b bVar) {
        bVar.f507508d.size();
        boolean isEmpty = bVar.f507508d.isEmpty();
        java.lang.String str = this.f515929a;
        if (isEmpty) {
            com.p314xaae8f345.mm.vfs.w6.h(str);
            return true;
        }
        try {
            byte[] mo14344x5f01b1f6 = bVar.mo14344x5f01b1f6();
            com.p314xaae8f345.mm.vfs.w6.S(str, mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TrackRoomListMgr", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public boolean e() {
        java.util.Iterator it = this.f515930b.f507508d.iterator();
        while (it.hasNext()) {
            ua3.a aVar = (ua3.a) it.next();
            aVar.f507503e.size();
            java.util.Iterator it6 = aVar.f507503e.iterator();
            while (it6.hasNext()) {
                if (((java.lang.String) it6.next()).equals(c01.z1.r())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackRoomListMgr", "now is sharing location..");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean f(java.lang.String str) {
        return b(str).size() > 0;
    }

    public synchronized void g(java.lang.String str, java.util.LinkedList linkedList, double d17, double d18, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackRoomListMgr", "updateList talk: %s,  size: %d %f %f", str, java.lang.Integer.valueOf(linkedList.size()), java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18));
        java.util.LinkedList linkedList2 = (java.util.LinkedList) linkedList.clone();
        boolean isEmpty = linkedList2.isEmpty();
        java.util.Iterator it = this.f515930b.f507508d.iterator();
        while (it.hasNext()) {
            ua3.a aVar = (ua3.a) it.next();
            if (aVar.f507502d.equals(str)) {
                if (isEmpty) {
                    this.f515930b.f507508d.remove(aVar);
                } else {
                    aVar.f507503e = linkedList2;
                    aVar.f507506h = str2;
                    aVar.f507505g = d17;
                    aVar.f507504f = d18;
                }
                d(this.f515930b);
                a(str, str3, str4);
                return;
            }
        }
        if (!isEmpty) {
            ua3.a aVar2 = new ua3.a();
            aVar2.f507502d = str;
            aVar2.f507503e = linkedList2;
            aVar2.f507506h = str2;
            aVar2.f507505g = d17;
            aVar2.f507504f = d18;
            this.f515930b.f507508d.add(aVar2);
        }
        d(this.f515930b);
        a(str, str3, str4);
    }
}
