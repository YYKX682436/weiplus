package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class j implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185237a;

    public j(in5.s0 s0Var) {
        this.f185237a = s0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.CharSequence text;
        in5.s0 s0Var = this.f185237a;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.usj);
        boolean z17 = false;
        if (p17 != null && p17.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            text = s0Var.f374654e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyy);
        } else {
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f568002uv2);
            text = textView != null ? textView.getText() : null;
        }
        return kz5.b1.e(new jz5.l("aigc_wait_text", text));
    }
}
