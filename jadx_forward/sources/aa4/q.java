package aa4;

/* loaded from: classes4.dex */
public final class q implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe f84212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v94.g f84213e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe c17860x8fb775fe, v94.g gVar) {
        this.f84212d = c17860x8fb775fe;
        this.f84213e = gVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLongClick", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/cover/preview/SnsImageBackPreview$loadCover$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.content.Context context = this.f84212d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showImageDebugInfo", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverDebugUtil");
        v94.g coverInfo = this.f84213e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverInfo, "coverInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 x1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1) coverInfo;
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(x1Var.t0());
        java.lang.String str = "path:" + x1Var.t0() + "\n width:" + n07.outWidth + " height:" + n07.outHeight + " \nsize:" + com.p314xaae8f345.mm.vfs.w6.k(x1Var.t0());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showAlert", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverDebugUtil");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(str);
        textView.setGravity(19);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        db5.e1.q(context, null, textView, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAlert", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverDebugUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImageDebugInfo", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverDebugUtil");
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/cover/preview/SnsImageBackPreview$loadCover$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$2");
        return true;
    }
}
