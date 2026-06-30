package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderVideoFluentTransparentActivity;", "Lcom/tencent/mm/ui/fluent/ViewFluentTransparentActivity;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes3.dex */
public final class FinderVideoFluentTransparentActivity extends com.tencent.mm.ui.fluent.ViewFluentTransparentActivity {

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f109582h;

    @Override // com.tencent.mm.ui.fluent.ViewFluentTransparentActivity
    public boolean K6(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        activity.hashCode();
        return true;
    }

    @Override // com.tencent.mm.ui.fluent.ViewFluentTransparentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (com.tencent.mm.ui.bk.C()) {
            setTheme(com.tencent.mm.R.style.f494372la);
        } else {
            setTheme(com.tencent.mm.R.style.f494372la);
        }
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
            kotlin.jvm.internal.o.f(attributes, "getAttributes(...)");
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView;
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.b();
        }
        android.widget.ImageView imageView = new android.widget.ImageView(this);
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        this.f109582h = imageView;
        viewGroup.addView(imageView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.ImageView imageView2 = this.f109582h;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("bgView");
            throw null;
        }
        imageView2.setVisibility(8);
        android.widget.ImageView imageView3 = this.f109582h;
        if (imageView3 != null) {
            imageView3.setImageDrawable(new android.graphics.drawable.ColorDrawable(-16777216));
        } else {
            kotlin.jvm.internal.o.o("bgView");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.fluent.ViewFluentTransparentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
