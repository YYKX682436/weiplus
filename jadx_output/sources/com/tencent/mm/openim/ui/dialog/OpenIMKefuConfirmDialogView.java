package com.tencent.mm.openim.ui.dialog;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/openim/ui/dialog/OpenIMKefuConfirmDialogView;", "Lcom/tencent/mm/openim/ui/view/BaseDialogView;", "Ll75/q0;", "", "getCloseLayoutHeight", "", "getAnimationTime", "getContentViewLayoutId", "Lj41/u;", "contact", "Ljz5/f0;", "setContactInfo", "Lj41/i0;", "confirmData", "setConfirmData", "Lv41/r;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnConfirmDialogOpListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class OpenIMKefuConfirmDialogView extends com.tencent.mm.openim.ui.view.BaseDialogView implements l75.q0 {
    public android.widget.TextView A1;
    public android.widget.TextView B1;
    public j41.u C1;
    public v41.r D1;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.TextView f72298p1;

    /* renamed from: x1, reason: collision with root package name */
    public android.widget.TextView f72299x1;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.ImageView f72300y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.TextView f72301z1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpenIMKefuConfirmDialogView(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        this.f72298p1 = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.c_h);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.c_c);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f72299x1 = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.c_b);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.f485462hr4);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f72300y1 = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = view.findViewById(com.tencent.mm.R.id.hr6);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f72301z1 = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = view.findViewById(com.tencent.mm.R.id.f485463hr5);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.A1 = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = view.findViewById(com.tencent.mm.R.id.f485461hr3);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.B1 = (android.widget.TextView) findViewById8;
        android.widget.TextView textView = this.f72298p1;
        if (textView == null) {
            kotlin.jvm.internal.o.o("dialogTitle");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.widget.TextView textView2 = this.f72299x1;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("confirmButton");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.widget.TextView textView3 = this.f72299x1;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("confirmButton");
            throw null;
        }
        textView3.setOnClickListener(new w41.k(this));
        setOnCloseClickListener(new w41.l(this));
        setCanceledOnTouchOutside(true);
        setEnableDialogScroll(false);
        setEnableScrollRightClose(true);
        setIsFixDialogHeight(true);
        ((i41.l) i95.n0.c(i41.l.class)).Ui().add(this);
    }

    @Override // com.tencent.mm.openim.ui.view.BaseDialogView
    public long getAnimationTime() {
        return 200L;
    }

    @Override // com.tencent.mm.openim.ui.view.BaseDialogView
    public int getCloseLayoutHeight() {
        return getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
    }

    @Override // com.tencent.mm.openim.ui.view.BaseDialogView
    public int getContentViewLayoutId() {
        return com.tencent.mm.R.layout.boi;
    }

    public final void i(j41.u uVar) {
        if (uVar == null) {
            return;
        }
        k41.g0 g0Var = (k41.g0) uVar;
        j(g0Var.field_openImAppId, ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(g0Var.field_openImAppId, g0Var.field_openImDescWordingId));
    }

    public final void j(java.lang.String str, java.lang.String str2) {
        if (str2 == null || str2.length() == 0) {
            android.widget.TextView textView = this.A1;
            if (textView == null) {
                kotlin.jvm.internal.o.o("openImDescWording");
                throw null;
            }
            textView.setText("");
            android.widget.TextView textView2 = this.A1;
            if (textView2 != null) {
                textView2.setVisibility(4);
                return;
            } else {
                kotlin.jvm.internal.o.o("openImDescWording");
                throw null;
            }
        }
        if (kotlin.jvm.internal.o.b("3552365301", str)) {
            str2 = "@" + str2;
        }
        android.widget.TextView textView3 = this.A1;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("openImDescWording");
            throw null;
        }
        textView3.setText(str2);
        android.widget.TextView textView4 = this.A1;
        if (textView4 != null) {
            textView4.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("openImDescWording");
            throw null;
        }
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if ((str == null || str.length() == 0) || w0Var == null) {
            return;
        }
        java.lang.Object obj = w0Var.f316976d;
        if (obj instanceof u41.k) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.openim.storage.OpenIMWordingInfo");
            u41.k kVar = (u41.k) obj;
            java.lang.String str2 = kVar.field_appid;
            j41.u uVar = this.C1;
            if (kotlin.jvm.internal.o.b(str2, uVar != null ? ((k41.g0) uVar).field_openImAppId : null)) {
                java.lang.String str3 = kVar.field_wordingId;
                j41.u uVar2 = this.C1;
                if (kotlin.jvm.internal.o.b(str3, uVar2 != null ? ((k41.g0) uVar2).field_openImDescWordingId : null)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConfirmDialogView", "onNotifyChange openImAppId: %s, wordingId: %s, wording: %s", kVar.field_appid, kVar.field_wordingId, kVar.field_wording);
                    j(kVar.field_appid, kVar.field_wording);
                }
            }
        }
    }

    public final void setConfirmData(j41.i0 i0Var) {
        java.lang.String str;
        j41.u uVar = i0Var != null ? i0Var.f297643d : null;
        this.C1 = uVar;
        android.widget.TextView textView = this.f72301z1;
        if (textView == null) {
            kotlin.jvm.internal.o.o("nickNameTextView");
            throw null;
        }
        if (uVar == null || (str = ((k41.g0) uVar).field_nickname) == null) {
            str = "";
        }
        textView.setText(str);
        i(uVar);
        if (i0Var != null) {
            java.lang.String str2 = i0Var.f297645f;
            if (str2 == null || str2.length() == 0) {
                android.widget.TextView textView2 = this.B1;
                if (textView2 == null) {
                    kotlin.jvm.internal.o.o("antispamTips");
                    throw null;
                }
                textView2.setVisibility(8);
            } else {
                android.widget.TextView textView3 = this.B1;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("antispamTips");
                    throw null;
                }
                textView3.setText(i0Var.f297645f);
                android.widget.TextView textView4 = this.B1;
                if (textView4 == null) {
                    kotlin.jvm.internal.o.o("antispamTips");
                    throw null;
                }
                textView4.setVisibility(0);
            }
        }
        android.widget.ImageView imageView = this.f72300y1;
        if (imageView != null) {
            com.tencent.mm.pluginsdk.ui.u.a(imageView, uVar != null ? ((k41.g0) uVar).field_username : null);
        } else {
            kotlin.jvm.internal.o.o("avatarImageView");
            throw null;
        }
    }

    public final void setContactInfo(j41.u uVar) {
        java.lang.String str;
        android.widget.TextView textView = this.f72301z1;
        if (textView == null) {
            kotlin.jvm.internal.o.o("nickNameTextView");
            throw null;
        }
        if (uVar == null || (str = ((k41.g0) uVar).field_nickname) == null) {
            str = "";
        }
        textView.setText(str);
        i(uVar);
        android.widget.ImageView imageView = this.f72300y1;
        if (imageView != null) {
            com.tencent.mm.pluginsdk.ui.u.a(imageView, uVar != null ? ((k41.g0) uVar).field_username : null);
        } else {
            kotlin.jvm.internal.o.o("avatarImageView");
            throw null;
        }
    }

    public final void setOnConfirmDialogOpListener(v41.r rVar) {
        this.D1 = rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenIMKefuConfirmDialogView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
