package dk2;

/* loaded from: classes3.dex */
public final class ke extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f315236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f315237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f315238f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f315239g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315240h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke(dk2.vg vgVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, boolean z17, yz5.a aVar, java.lang.String str) {
        super(3);
        this.f315236d = vgVar;
        this.f315237e = h0Var;
        this.f315238f = z17;
        this.f315239g = aVar;
        this.f315240h = str;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj2;
        bw5.gq0 gq0Var = (bw5.gq0) obj3;
        if (((java.lang.Boolean) obj).booleanValue()) {
            dk2.vg vgVar = this.f315236d;
            vgVar.f315787a.set(7, gq0Var != null ? gq0Var.m12014xb5887639() : null);
            java.lang.String m75945x2fec8307 = vgVar.f315787a.m75945x2fec8307(7);
            this.f315237e.f391656d = m75945x2fec8307;
            dk2.ef.f314905a.L(this.f315238f, vgVar, this.f315239g, m75945x2fec8307);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveService", "fetch song url for listenId " + this.f315240h + " failed. ErrorMsg " + str);
        }
        return jz5.f0.f384359a;
    }
}
