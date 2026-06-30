package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2042xac8f1cfd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/component/ScanUITopOpButtonComponent;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "onClickListener", "Ljz5/f0;", "setOnCloseClickListener", "setOnCancelClickListener", "setOnMoreClickListener", "", "show", "setShowMoreButton", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent */
/* loaded from: classes15.dex */
public final class C17322xb99fb086 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f241052d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f241053e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f241054f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f241055g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17322xb99fb086(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a(boolean z17) {
        android.widget.ImageView imageView = this.f241055g;
        if (imageView != null) {
            e04.i3.b(imageView, z17, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreButton");
            throw null;
        }
    }

    public final void b(boolean z17, android.animation.Animator.AnimatorListener animatorListener) {
        if (z17) {
            android.widget.ImageView imageView = this.f241053e;
            if (imageView != null) {
                e04.i3.b(imageView, false, new a04.a(this, animatorListener));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeButton");
                throw null;
            }
        }
        android.widget.TextView textView = this.f241054f;
        if (textView != null) {
            e04.i3.b(textView, false, new a04.b(this, animatorListener));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelButton");
            throw null;
        }
    }

    /* renamed from: setOnCancelClickListener */
    public final void m68736x4c239a61(android.view.View.OnClickListener onClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickListener, "onClickListener");
        android.widget.TextView textView = this.f241054f;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelButton");
            throw null;
        }
    }

    /* renamed from: setOnCloseClickListener */
    public final void m68737x3acb4705(android.view.View.OnClickListener onClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickListener, "onClickListener");
        android.widget.ImageView imageView = this.f241053e;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeButton");
            throw null;
        }
    }

    /* renamed from: setOnMoreClickListener */
    public final void m68738xfdb31526(android.view.View.OnClickListener onClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickListener, "onClickListener");
        android.widget.ImageView imageView = this.f241055g;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreButton");
            throw null;
        }
    }

    /* renamed from: setShowMoreButton */
    public final void m68739xfae5cec6(boolean z17) {
        android.widget.ImageView imageView = this.f241055g;
        if (imageView != null) {
            imageView.setVisibility(z17 ? 0 : 8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreButton");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17322xb99fb086(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570743bp1, this);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.off);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f241052d = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.bz6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f241053e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.b5j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f241054f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.jqu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f241055g = (android.widget.ImageView) findViewById4;
        android.view.View view = this.f241052d;
        if (view != null) {
            view.setPadding(0, com.p314xaae8f345.mm.ui.bl.h(context), 0, 0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("buttonContainer");
            throw null;
        }
    }
}
