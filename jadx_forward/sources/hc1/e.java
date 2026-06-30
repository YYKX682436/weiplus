package hc1;

/* loaded from: classes7.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 f361822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f361823e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var, int i17) {
        super(0);
        this.f361822d = h1Var;
        this.f361823e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 v17 = this.f361822d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        android.view.View findViewById = v17.getRootView().findViewById(com.p314xaae8f345.mm.R.id.sdv);
        hc1.b bVar = findViewById instanceof hc1.b ? (hc1.b) findViewById : null;
        if (bVar != null) {
            bVar.n(this.f361823e);
            bVar.requestLayout();
        }
        return jz5.f0.f384359a;
    }
}
