package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b;

/* loaded from: classes7.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.h0 f165821a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.h0();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12319xdc45d1ef params, fh1.z bizHostImpl) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizHostImpl, "bizHostImpl");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.k0.f165835a;
        java.lang.String str = params.f165775d;
        java.lang.String str2 = params.f165776e;
        int i17 = params.f165777f;
        java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.k0.f165836b.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            fj1.y yVar = (fj1.y) next;
            boolean z17 = false;
            if (yVar.f344680g == i17) {
                if ((str2 == null || str2.length() == 0) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yVar.c(), str2)) {
                    if (!(str == null || str.length() == 0)) {
                        java.lang.String str3 = yVar.f344678e;
                        if (str3 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(dm.i4.f66875xa013b0d5);
                            throw null;
                        }
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, str)) {
                        }
                    }
                }
                z17 = true;
            }
            if (z17) {
                obj = next;
                break;
            }
        }
        fj1.y yVar2 = (fj1.y) obj;
        if (yVar2 == null) {
            yVar2 = new fj1.y(params);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.k0 k0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.k0.f165835a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAMagicBrushFrameTaskManager", "addTask hash:" + yVar2.hashCode() + ", params:" + yVar2.f344676c);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.k0.f165836b.add(yVar2);
            uk0.a.b(params, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.t.f165849d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.u(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.v(yVar2), params));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.f0 f0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.f0(yVar2, bizHostImpl, params);
        ej1.g gVar = yVar2.f334811a;
        int compareTo = gVar.compareTo(ej1.g.INITIALIZED);
        ej1.g gVar2 = ej1.g.DESTROYED;
        if (compareTo >= 0 && gVar.compareTo(gVar2) < 0) {
            f0Var.mo152xb9724478();
            return;
        }
        if (gVar != gVar2) {
            yVar2.f334812b.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.g0(f0Var, yVar2));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAMagicBrushFrameLauncher", "WAMagicBrushFrameRuntime(" + yVar2.c() + ").runOnInitialized but destroyed");
    }
}
