package tt1;

/* loaded from: classes15.dex */
public class f implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f503350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f503351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 f503352c;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 abstractActivityC13036x7f885875, java.lang.String str, boolean z17) {
        this.f503352c = abstractActivityC13036x7f885875;
        this.f503350a = str;
        this.f503351b = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875.f176163v;
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 abstractActivityC13036x7f885875 = this.f503352c;
            abstractActivityC13036x7f885875.j7(true);
            gm0.j1.n().f354821b.g(new xt1.m0(abstractActivityC13036x7f885875.f176173p.f67736x95970a65, this.f503350a, 17));
            db5.e1.T(abstractActivityC13036x7f885875, abstractActivityC13036x7f885875.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.asp));
            if (this.f503351b) {
                abstractActivityC13036x7f885875.finish();
            }
        }
    }
}
