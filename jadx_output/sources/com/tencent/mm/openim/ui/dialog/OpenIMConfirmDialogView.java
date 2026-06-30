package com.tencent.mm.openim.ui.dialog;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/openim/ui/dialog/OpenIMConfirmDialogView;", "Lcom/tencent/mm/openim/ui/view/BaseDialogView;", "", "getCloseLayoutHeight", "getContentViewLayoutId", "Lw41/a;", "confirmData", "Ljz5/f0;", "setConfirmData", "Lab0/r;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnConfirmDialogOpListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class OpenIMConfirmDialogView extends com.tencent.mm.openim.ui.view.BaseDialogView {
    public android.widget.TextView A1;
    public android.widget.TextView B1;
    public ab0.r C1;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.TextView f72294p1;

    /* renamed from: x1, reason: collision with root package name */
    public android.widget.TextView f72295x1;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.ImageView f72296y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.TextView f72297z1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpenIMConfirmDialogView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.openim.ui.view.BaseDialogView
    public android.view.View c(android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.c_b);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
    }

    @Override // com.tencent.mm.openim.ui.view.BaseDialogView
    public void f(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.c_n);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f72294p1 = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.c_h);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.c_c);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f72295x1 = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.c_b);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.f485462hr4);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f72296y1 = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = view.findViewById(com.tencent.mm.R.id.hr6);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f72297z1 = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = view.findViewById(com.tencent.mm.R.id.f485463hr5);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.A1 = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = view.findViewById(com.tencent.mm.R.id.f485461hr3);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.B1 = (android.widget.TextView) findViewById8;
        android.widget.TextView textView = this.f72294p1;
        if (textView == null) {
            kotlin.jvm.internal.o.o("dialogTitle");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.widget.TextView textView2 = this.f72295x1;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("confirmButton");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.widget.TextView textView3 = this.f72295x1;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("confirmButton");
            throw null;
        }
        textView3.setOnClickListener(new w41.d(this));
        setOnCloseClickListener(new w41.e(this));
        setCanceledOnTouchOutside(true);
        setEnableDialogScroll(false);
        setEnableScrollRightClose(true);
        setIsFixDialogHeight(true);
    }

    @Override // com.tencent.mm.openim.ui.view.BaseDialogView
    public int getCloseLayoutHeight() {
        return getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
    }

    @Override // com.tencent.mm.openim.ui.view.BaseDialogView
    public int getContentViewLayoutId() {
        return com.tencent.mm.R.layout.boh;
    }

    public final void setConfirmData(w41.a aVar) {
        java.lang.CharSequence charSequence;
        android.widget.TextView textView = this.f72297z1;
        if (textView == null) {
            kotlin.jvm.internal.o.o("nickNameTextView");
            throw null;
        }
        if (aVar == null || (charSequence = aVar.f442845a) == null) {
            charSequence = "";
        }
        textView.setText(charSequence);
        java.lang.CharSequence charSequence2 = aVar != null ? aVar.f442846b : null;
        boolean z17 = true;
        if (charSequence2 == null || charSequence2.length() == 0) {
            android.widget.TextView textView2 = this.A1;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("openImDescWording");
                throw null;
            }
            textView2.setText("");
            android.widget.TextView textView3 = this.A1;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("openImDescWording");
                throw null;
            }
            textView3.setVisibility(4);
        } else {
            android.widget.TextView textView4 = this.A1;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("openImDescWording");
                throw null;
            }
            textView4.setText(charSequence2);
            android.widget.TextView textView5 = this.A1;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("openImDescWording");
                throw null;
            }
            textView5.setVisibility(0);
        }
        if (aVar != null) {
            java.lang.String str = aVar.f442848d;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                android.widget.TextView textView6 = this.B1;
                if (textView6 == null) {
                    kotlin.jvm.internal.o.o("antispamTips");
                    throw null;
                }
                textView6.setVisibility(8);
            } else {
                android.widget.TextView textView7 = this.B1;
                if (textView7 == null) {
                    kotlin.jvm.internal.o.o("antispamTips");
                    throw null;
                }
                textView7.setText(str);
                android.widget.TextView textView8 = this.B1;
                if (textView8 == null) {
                    kotlin.jvm.internal.o.o("antispamTips");
                    throw null;
                }
                textView8.setVisibility(0);
            }
        }
        android.widget.ImageView imageView = this.f72296y1;
        if (imageView != null) {
            com.tencent.mm.pluginsdk.ui.u.a(imageView, aVar != null ? aVar.f442847c : null);
        } else {
            kotlin.jvm.internal.o.o("avatarImageView");
            throw null;
        }
    }

    public final void setOnConfirmDialogOpListener(ab0.r rVar) {
        this.C1 = rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenIMConfirmDialogView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
