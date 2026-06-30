package af5;

/* loaded from: classes9.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f4599d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f4600e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f4601f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f4602g;

    /* renamed from: h, reason: collision with root package name */
    public int f4603h;

    /* renamed from: i, reason: collision with root package name */
    public int f4604i;

    /* renamed from: m, reason: collision with root package name */
    public int f4605m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4606n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4607o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ gk0.k f4608p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ gk0.h f4609q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView f4610r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4611s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f4612t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f4613u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f4614v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, gk0.k kVar, gk0.h hVar, com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView, int i17, int i18, android.widget.ImageView imageView, android.widget.ImageView imageView2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4607o = str;
        this.f4608p = kVar;
        this.f4609q = hVar;
        this.f4610r = chattingAskShareMvvmView;
        this.f4611s = i17;
        this.f4612t = i18;
        this.f4613u = imageView;
        this.f4614v = imageView2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        af5.n nVar = new af5.n(this.f4607o, this.f4608p, this.f4609q, this.f4610r, this.f4611s, this.f4612t, this.f4613u, this.f4614v, continuation);
        nVar.f4606n = obj;
        return nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((af5.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        int i17;
        int i18;
        pz5.a aVar = pz5.a.f359186d;
        int i19 = this.f4605m;
        if (i19 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f4606n;
            i95.m c17 = i95.n0.c(gk0.n0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            g75.z x66 = gk0.n0.x6((gk0.n0) c17, this.f4607o, this.f4608p, null, null, 8, null);
            x66.l("Common_HttpParams", this.f4609q);
            gk0.b Ni = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ni();
            this.f4606n = y0Var;
            this.f4599d = x66;
            chattingAskShareMvvmView = this.f4610r;
            this.f4600e = chattingAskShareMvvmView;
            android.widget.ImageView imageView3 = this.f4613u;
            this.f4601f = imageView3;
            android.widget.ImageView imageView4 = this.f4614v;
            this.f4602g = imageView4;
            int i27 = this.f4611s;
            this.f4603h = i27;
            int i28 = this.f4612t;
            this.f4604i = i28;
            this.f4605m = 1;
            java.lang.Object a17 = Ni.a(x66, this);
            if (a17 == aVar) {
                return aVar;
            }
            imageView = imageView3;
            obj = a17;
            imageView2 = imageView4;
            i17 = i27;
            i18 = i28;
        } else {
            if (i19 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i18 = this.f4604i;
            i17 = this.f4603h;
            imageView2 = (android.widget.ImageView) this.f4602g;
            imageView = (android.widget.ImageView) this.f4601f;
            chattingAskShareMvvmView = (com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView) this.f4600e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView.g(chattingAskShareMvvmView, bitmap, i17, i18, new af5.l(chattingAskShareMvvmView, imageView, imageView2));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAskShareMvvmView", "[loadThumbFromNetwork] load from network, bitmap is null");
            chattingAskShareMvvmView.post(new af5.m(chattingAskShareMvvmView, imageView, imageView2));
        }
        return jz5.f0.f302826a;
    }
}
