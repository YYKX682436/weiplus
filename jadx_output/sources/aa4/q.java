package aa4;

/* loaded from: classes4.dex */
public final class q implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview f2679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v94.g f2680e;

    public q(com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview snsImageBackPreview, v94.g gVar) {
        this.f2679d = snsImageBackPreview;
        this.f2680e = gVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/cover/preview/SnsImageBackPreview$loadCover$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.content.Context context = this.f2679d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showImageDebugInfo", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverDebugUtil");
        v94.g coverInfo = this.f2680e;
        kotlin.jvm.internal.o.g(coverInfo, "coverInfo");
        com.tencent.mm.plugin.sns.storage.x1 x1Var = (com.tencent.mm.plugin.sns.storage.x1) coverInfo;
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(x1Var.t0());
        java.lang.String str = "path:" + x1Var.t0() + "\n width:" + n07.outWidth + " height:" + n07.outHeight + " \nsize:" + com.tencent.mm.vfs.w6.k(x1Var.t0());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAlert", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverDebugUtil");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(str);
        textView.setGravity(19);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        db5.e1.q(context, null, textView, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAlert", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverDebugUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImageDebugInfo", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverDebugUtil");
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/cover/preview/SnsImageBackPreview$loadCover$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$2");
        return true;
    }
}
