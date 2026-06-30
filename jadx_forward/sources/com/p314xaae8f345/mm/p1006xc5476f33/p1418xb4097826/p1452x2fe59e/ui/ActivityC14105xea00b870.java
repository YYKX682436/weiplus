package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderVideoFluentTransparentActivity;", "Lcom/tencent/mm/ui/fluent/ViewFluentTransparentActivity;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderVideoFluentTransparentActivity */
/* loaded from: classes3.dex */
public final class ActivityC14105xea00b870 extends com.p314xaae8f345.mm.ui.p2705xb436f21c.AbstractActivityC22405xf322b380 {

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f191115h;

    @Override // com.p314xaae8f345.mm.ui.p2705xb436f21c.AbstractActivityC22405xf322b380
    public boolean K6(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        activity.hashCode();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2705xb436f21c.AbstractActivityC22405xf322b380, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575905la);
        } else {
            setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575905la);
        }
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(attributes, "getAttributes(...)");
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView;
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            eVar.b();
        }
        android.widget.ImageView imageView = new android.widget.ImageView(this);
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        this.f191115h = imageView;
        viewGroup.addView(imageView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.ImageView imageView2 = this.f191115h;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
            throw null;
        }
        imageView2.setVisibility(8);
        android.widget.ImageView imageView3 = this.f191115h;
        if (imageView3 != null) {
            imageView3.setImageDrawable(new android.graphics.drawable.ColorDrawable(-16777216));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2705xb436f21c.AbstractActivityC22405xf322b380, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
