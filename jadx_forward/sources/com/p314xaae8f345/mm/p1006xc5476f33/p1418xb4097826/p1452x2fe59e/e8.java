package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class e8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f188170f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 f188171g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f8Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 c5542xa257d922) {
        super(0);
        this.f188168d = str;
        this.f188169e = str2;
        this.f188170f = f8Var;
        this.f188171g = c5542xa257d922;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("favInfoUpdateListener event objectID:");
        java.lang.String str = this.f188168d;
        sb6.append(str);
        sb6.append(" wxUsername:");
        java.lang.String str2 = this.f188169e;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FavListDrawerPresenter", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f8Var = this.f188170f;
        java.util.Iterator it = f8Var.f188252p.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.c1 c1Var = (so2.c1) next;
            if (r26.i0.q(c1Var.f491821d.f466962g, str2, false, 2, null) && c1Var.f491822e.equals(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FavListDrawerPresenter", "favInfoUpdateListener event index " + i17);
                am.md mdVar = this.f188171g.f135866g;
                c1Var.f491821d.f466969q = (mdVar == null || !mdVar.f88871b) ? 0 : 1;
                yw2.f fVar = f8Var.f188253q;
                if (fVar != null && (m82555x4905e9fa = fVar.n().m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
                    mo7946xf939df19.m8148xed6e4d18(i17, 1);
                }
            }
            i17 = i18;
        }
        return jz5.f0.f384359a;
    }
}
