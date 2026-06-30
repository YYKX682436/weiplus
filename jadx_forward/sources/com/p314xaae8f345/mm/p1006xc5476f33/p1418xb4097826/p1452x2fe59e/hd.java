package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class hd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id f188451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 f188452g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id idVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 c5542xa257d922) {
        super(0);
        this.f188449d = str;
        this.f188450e = str2;
        this.f188451f = idVar;
        this.f188452g = c5542xa257d922;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thanksUpdateListener event objectID:");
        java.lang.String str = this.f188449d;
        sb6.append(str);
        sb6.append(" wxUsername:");
        java.lang.String str2 = this.f188450e;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id idVar = this.f188451f;
        java.util.Iterator it = idVar.f188540m.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.f1 f1Var = (so2.f1) next;
            if (r26.i0.q(f1Var.f491869d.m75945x2fec8307(5), str2, false, 2, null) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f1Var.f491870e, str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", "thanksUpdateListener event index " + i17);
                am.md mdVar = this.f188452g.f135866g;
                f1Var.f491869d.set(15, java.lang.Integer.valueOf((mdVar == null || !mdVar.f88871b) ? 0 : 1));
                yw2.n nVar = idVar.f188543p;
                if (nVar != null && (m82555x4905e9fa = nVar.o().m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
                    mo7946xf939df19.m8148xed6e4d18(i17, 1);
                }
            }
            i17 = i18;
        }
        return jz5.f0.f384359a;
    }
}
