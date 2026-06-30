package qq0;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f447445a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d f447446b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f447447c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f447448d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f447449e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f447450f;

    /* renamed from: g, reason: collision with root package name */
    public long f447451g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f447452h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f447453i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f447454j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Runnable f447455k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Runnable f447456l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f447457m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26 f447458n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f447459o;

    public u(java.lang.String bizName, com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d sclView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sclView, "sclView");
        this.f447445a = bizName;
        this.f447446b = sclView;
        this.f447447c = "";
        this.f447448d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        android.widget.ImageView imageView = new android.widget.ImageView(sclView.getContext());
        this.f447449e = imageView;
        this.f447457m = new java.util.ArrayList();
        this.f447459o = jz5.h.b(qq0.o.f447439d);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        android.view.View view = new android.view.View(sclView.getContext());
        this.f447450f = view;
        sclView.addView(imageView);
        imageView.setVisibility(8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/magicbrush/plugin/scl/startup/cover/MagicSclViewCoverLogic", "<init>", "(Ljava/lang/String;Lcom/tencent/mm/magicbrush/plugin/scl/view/MagicSclViewContainer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/magicbrush/plugin/scl/startup/cover/MagicSclViewCoverLogic", "<init>", "(Ljava/lang/String;Lcom/tencent/mm/magicbrush/plugin/scl/view/MagicSclViewContainer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static final void a(qq0.u uVar, java.lang.String str) {
        java.lang.String str2;
        hq0.e0 e0Var;
        if (uVar.f447451g > 0) {
            mq0.e0 e0Var2 = (mq0.e0) i95.n0.c(mq0.e0.class);
            com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = uVar.f447446b;
            fq0.x frameSet = c10867x3e50a04d.getFrameSet();
            java.lang.String valueOf = java.lang.String.valueOf(frameSet != null ? frameSet.f347011b : null);
            java.lang.String str3 = uVar.f447445a;
            fq0.x frameSet2 = c10867x3e50a04d.getFrameSet();
            if (frameSet2 == null || (e0Var = frameSet2.f347012c) == null || (str2 = e0Var.f364515c) == null) {
                str2 = "";
            }
            ((mq0.v0) e0Var2).wi("tryShowCover", str, valueOf, str3, str2, uVar.f447447c, java.lang.String.valueOf(java.lang.System.currentTimeMillis() - uVar.f447451g));
            uVar.f447451g = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r26) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qq0.u.b(boolean):void");
    }
}
