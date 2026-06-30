package gv4;

/* loaded from: classes8.dex */
public final class c implements hv4.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hv4.a f357647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f357648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f357649f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357650g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357651h;

    public c(hv4.a aVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17, java.lang.String str, java.lang.String str2) {
        this.f357647d = aVar;
        this.f357648e = h0Var;
        this.f357649f = i17;
        this.f357650g = str;
        this.f357651h = str2;
    }

    @Override // hv4.a
    public void a(java.lang.String tag, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f357647d.a(tag, i17);
    }

    @Override // hv4.a
    public void b(r45.sn3 shareContent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareContent, "shareContent");
        this.f357647d.b(shareContent);
        ((r45.ck6) this.f357648e.f391656d).f453165q = 1;
    }

    @Override // hv4.a
    /* renamed from: onDismiss */
    public void mo75475xb349b3ab() {
        this.f357647d.mo75475xb349b3ab();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7064x67496ed7 c7064x67496ed7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7064x67496ed7();
        c7064x67496ed7.f143719d = 2L;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f357648e;
        if (((r45.ck6) h0Var.f391656d).f453165q == 1) {
            c7064x67496ed7.f143720e = 1L;
        } else {
            c7064x67496ed7.f143720e = 2L;
        }
        c7064x67496ed7.f143721f = this.f357649f;
        c7064x67496ed7.f143722g = c01.id.e();
        java.lang.String str = this.f357650g;
        c7064x67496ed7.f143723h = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) ? 2L : 1L;
        c7064x67496ed7.f143724i = c7064x67496ed7.b("EnterSceneId", str, true);
        c7064x67496ed7.f143725j = c7064x67496ed7.b("SessionId", this.f357651h, true);
        c7064x67496ed7.f143726k = c7064x67496ed7.b("QueryKey", ((r45.ck6) h0Var.f391656d).f453160i, true);
        c7064x67496ed7.k();
        su4.k3.m(c7064x67496ed7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.TagSearchUILogic", "stopTagSearchDialog url:" + ((r45.ck6) h0Var.f391656d).f453158g);
    }
}
