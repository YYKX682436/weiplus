package vn2;

/* loaded from: classes2.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.h f519956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vn2.a1 f519957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.h hVar, vn2.a1 a1Var) {
        super(1);
        this.f519956d = hVar;
        this.f519957e = a1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        java.lang.ref.WeakReference it = (java.lang.ref.WeakReference) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object obj2 = it.get();
        boolean z18 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.h hVar = this.f519956d;
        boolean z19 = obj2 == hVar;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f387758a;
            z18 = false;
        }
        if (z18) {
            this.f519957e.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TopStoryMegaVideoPreload", "remove preload listener=" + hVar);
        }
        return java.lang.Boolean.valueOf(z19);
    }
}
