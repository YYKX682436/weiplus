package md4;

/* loaded from: classes.dex */
public final class b implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f407404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f407405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f407406c;

    public b(java.lang.ref.WeakReference weakReference, android.widget.TextView textView, android.content.Context context) {
        this.f407404a = weakReference;
        this.f407405b = textView;
        this.f407406c = context;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContactCallBack", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$refreshSrcInfo$1");
        java.lang.ref.WeakReference weakReference = this.f407404a;
        if (weakReference == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContactCallBack", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$refreshSrcInfo$1");
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) weakReference.get();
        if (imageView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContactCallBack", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$refreshSrcInfo$1");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        java.lang.Object tag = imageView.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str2 = (java.lang.String) tag;
        android.content.Context context = this.f407406c;
        android.widget.TextView textView = this.f407405b;
        if (n17 != null && ((int) n17.E2) > 0 && (imageView.getTag() instanceof java.lang.String) && c01.e2.G(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, str)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str);
            if (n07 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n07.d())) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, str);
            } else {
                md4.e.f407410a.a(imageView, n17, n07.d(), true);
            }
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, e17, textSize));
        } else {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574732oj4);
            float textSize2 = textView.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, string, textSize2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContactCallBack", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$refreshSrcInfo$1");
    }
}
