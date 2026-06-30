package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.h1 f101871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.finder.activity.uic.h1 h1Var) {
        super(0);
        this.f101871d = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.activity.uic.h1 h1Var = this.f101871d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = h1Var.f101878d;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        android.widget.ImageView imageView = h1Var.f101883i;
        if (imageView != null) {
            imageView.setVisibility(0);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("coverImageView");
        throw null;
    }
}
