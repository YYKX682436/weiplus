package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class j implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103704a;

    public j(in5.s0 s0Var) {
        this.f103704a = s0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.CharSequence text;
        in5.s0 s0Var = this.f103704a;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.usj);
        boolean z17 = false;
        if (p17 != null && p17.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            text = s0Var.f293121e.getResources().getString(com.tencent.mm.R.string.nyy);
        } else {
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f486469uv2);
            text = textView != null ? textView.getText() : null;
        }
        return kz5.b1.e(new jz5.l("aigc_wait_text", text));
    }
}
