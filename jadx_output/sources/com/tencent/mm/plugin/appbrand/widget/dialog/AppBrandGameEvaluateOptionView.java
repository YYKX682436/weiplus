package com.tencent.mm.plugin.appbrand.widget.dialog;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandGameEvaluateOptionView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", org.chromium.base.BaseSwitches.V, "Ljz5/f0;", "onClick", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fl1/d1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AppBrandGameEvaluateOptionView extends android.widget.FrameLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public r45.l25 f91128d;

    /* renamed from: e, reason: collision with root package name */
    public fl1.d1 f91129e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f91130f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.FrameLayout f91131g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppBrandGameEvaluateOptionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(int i17, r45.bg7 config, fl1.d1 callback) {
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f91129e = callback;
        java.lang.Object obj = config.f370752f.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        this.f91128d = (r45.l25) obj;
        android.widget.FrameLayout frameLayout = this.f91131g;
        android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.o3b);
        r45.l25 l25Var = this.f91128d;
        if (l25Var == null) {
            kotlin.jvm.internal.o.o("optionConfig");
            throw null;
        }
        textView.setText(l25Var.f379099f);
        n11.a b17 = n11.a.b();
        r45.l25 l25Var2 = this.f91128d;
        if (l25Var2 != null) {
            b17.g(l25Var2.f379098e, (android.widget.ImageView) frameLayout.findViewById(com.tencent.mm.R.id.h88));
        } else {
            kotlin.jvm.internal.o.o("optionConfig");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandGameEvaluateOptionView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.FrameLayout frameLayout = this.f91131g;
        frameLayout.setBackgroundResource(com.tencent.mm.R.color.Brand_Alpha_0_1);
        ((android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.o3b)).setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.f478502m));
        this.f91130f.postDelayed(new fl1.e1(this), 100L);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandGameEvaluateOptionView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandGameEvaluateOptionView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f91130f = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488031ew, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
        this.f91131g = frameLayout;
        addView(frameLayout);
        frameLayout.setOnClickListener(this);
    }
}
