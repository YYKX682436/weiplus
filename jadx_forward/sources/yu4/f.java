package yu4;

/* loaded from: classes8.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu4.k f547403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.sn3 f547404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547405f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yu4.k kVar, r45.sn3 sn3Var, java.lang.String str) {
        super(0);
        this.f547403d = kVar;
        this.f547404e = sn3Var;
        this.f547405f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yu4.k kVar = this.f547403d;
        kVar.getClass();
        r45.sn3 shareContent = this.f547404e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareContent, "shareContent");
        if (shareContent.f467396n != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            kVar.f547422q = android.os.SystemClock.elapsedRealtime();
            o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
            android.content.Context context = kVar.getContext();
            r45.xi0 xi0Var = kVar.f547414f;
            ((r35.k1) q1Var).Bi(context, xi0Var.f471656o, shareContent.f467396n.mo14344x5f01b1f6(), null, xi0Var.f471658q, kVar.f547422q, null, new yu4.i(kVar, this.f547405f, shareContent));
        }
        return jz5.f0.f384359a;
    }
}
