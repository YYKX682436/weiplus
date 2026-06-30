package sj4;

/* loaded from: classes11.dex */
public final class h1 implements bi4.t0, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final bi4.n1 f490380d;

    /* renamed from: e, reason: collision with root package name */
    public final bi4.l1 f490381e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f490382f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f490383g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f490384h;

    /* renamed from: i, reason: collision with root package name */
    public cj4.r1 f490385i;

    /* renamed from: m, reason: collision with root package name */
    public android.app.ProgressDialog f490386m;

    public h1(android.content.Context context, bi4.n1 param, bi4.l1 l1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        this.f490380d = param;
        this.f490381e = l1Var;
        this.f490382f = new java.lang.ref.WeakReference(context);
    }

    public final void a(pj4.b0 b0Var) {
        bi4.d1 d1Var = new bi4.d1();
        if (b0Var != null) {
            d1Var.f436470d = b0Var;
        }
        bi4.n1 n1Var = this.f490380d;
        d1Var.f436475i = n1Var.f436499h;
        d1Var.f436486w = n1Var.f436500i;
        d1Var.f436488y = n1Var.f436503o;
        android.os.ResultReceiver resultReceiver = new android.os.ResultReceiver() { // from class: com.tencent.mm.plugin.textstatus.third.TextStatusActionTask$jumpSetStatus$setStatusCallback$1
            {
                super(null);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                byte[] byteArray;
                super.onReceiveResult(i17, bundle);
                int i18 = i17 == -1 ? 0 : 2;
                bi4.l1 l1Var = sj4.h1.this.f490381e;
                if (l1Var != null) {
                    pj4.r0 r0Var = new pj4.r0();
                    r0Var.f436805d = 2;
                    pj4.w wVar = new pj4.w();
                    if (bundle != null && (byteArray = bundle.getByteArray("select_status_info")) != null) {
                        wVar.mo11468x92b714fd(byteArray);
                    }
                    r0Var.f436806e = wVar;
                    l1Var.mo10624xfbbb8828(i18, "", r0Var);
                }
            }
        };
        android.content.Context context = (android.content.Context) this.f490382f.get();
        if (context != null && (!(context instanceof android.app.Activity) || !((android.app.Activity) context).isFinishing())) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ri(context, d1Var, resultReceiver);
        }
        android.app.ProgressDialog progressDialog = this.f490386m;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f490386m = null;
    }

    @Override // bi4.t0
    /* renamed from: cancel */
    public void mo10635xae7a2e7a() {
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var;
        this.f490383g = true;
        java.lang.ref.WeakReference weakReference = this.f490384h;
        if (weakReference != null && (m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) weakReference.get()) != null) {
            gm0.j1.d().d(m1Var);
        }
        android.app.ProgressDialog progressDialog = this.f490386m;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
    
        if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1.f436672d, "5") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1.f436672d, "7")) == true) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r8, int r9, java.lang.String r10, com.p314xaae8f345.mm.p944x882e457a.m1 r11) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj4.h1.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
