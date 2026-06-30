package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1223xb099fd48;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandGameEvaluateOptionView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, "Ljz5/f0;", "onClick", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fl1/d1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandGameEvaluateOptionView */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC12771x8f53376b extends android.widget.FrameLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public r45.l25 f172661d;

    /* renamed from: e, reason: collision with root package name */
    public fl1.d1 f172662e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f172663f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.FrameLayout f172664g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC12771x8f53376b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a(int i17, r45.bg7 config, fl1.d1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f172662e = callback;
        java.lang.Object obj = config.f452285f.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        this.f172661d = (r45.l25) obj;
        android.widget.FrameLayout frameLayout = this.f172664g;
        android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.o3b);
        r45.l25 l25Var = this.f172661d;
        if (l25Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("optionConfig");
            throw null;
        }
        textView.setText(l25Var.f460632f);
        n11.a b17 = n11.a.b();
        r45.l25 l25Var2 = this.f172661d;
        if (l25Var2 != null) {
            b17.g(l25Var2.f460631e, (android.widget.ImageView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.h88));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("optionConfig");
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
        android.widget.FrameLayout frameLayout = this.f172664g;
        frameLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77744x91fa6289);
        ((android.widget.TextView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.o3b)).setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        this.f172663f.mo50297x7c4d7ca2(new fl1.e1(this), 100L);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandGameEvaluateOptionView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC12771x8f53376b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f172663f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569564ew, (android.view.ViewGroup) this, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
        this.f172664g = frameLayout;
        addView(frameLayout);
        frameLayout.setOnClickListener(this);
    }
}
