package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2304x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/ting/view/TingAddToListenEducationDialog;", "Lhg5/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ting.view.TingAddToListenEducationDialog */
/* loaded from: classes8.dex */
public final class DialogC18732x79d0ea5b extends hg5.d {

    /* renamed from: r, reason: collision with root package name */
    public android.content.Context f256350r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f256351s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f256352t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f256353u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogC18732x79d0ea5b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // hg5.d
    public int E() {
        return i65.a.k(getContext()) - i65.a.b(getContext(), 580);
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bpj, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        super.G();
        android.view.View view = this.f362936i;
        this.f256351s = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc) : null;
        android.view.View view2 = this.f362936i;
        this.f256352t = view2 != null ? (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f566990hq2) : null;
        android.view.View view3 = this.f362936i;
        this.f256353u = view3 != null ? (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.khs) : null;
        android.view.View view4 = this.f362936i;
        android.widget.ImageView imageView = view4 != null ? (android.widget.ImageView) view4.findViewById(com.p314xaae8f345.mm.R.id.q4q) : null;
        if (imageView != null) {
            imageView.setImageResource(!com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f81193xeb1dcbbf : com.p314xaae8f345.mm.R.raw.f81194x3238aa99);
        }
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        android.widget.TextView textView = this.f256351s;
        com.p314xaae8f345.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
        android.widget.TextView textView2 = this.f256353u;
        com.p314xaae8f345.mm.ui.bk.r0(textView2 != null ? textView2.getPaint() : null, 0.8f);
        android.widget.TextView textView3 = this.f256353u;
        if (textView3 != null) {
            textView3.setOnClickListener(new lm4.e(this));
        }
        android.widget.TextView textView4 = this.f256352t;
        if (textView4 != null) {
            textView4.setOnClickListener(new lm4.g(this));
        }
        android.widget.TextView textView5 = this.f256352t;
        if (textView5 != null) {
            dy1.a.i(textView5, "listen_later_new_user_guide");
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.f256350r = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC18732x79d0ea5b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f256350r = context;
    }
}
