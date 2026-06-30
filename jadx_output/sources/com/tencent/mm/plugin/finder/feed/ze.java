package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class ze implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f111250d;

    public ze(com.tencent.mm.plugin.finder.feed.af afVar) {
        this.f111250d = afVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        java.lang.String str;
        java.lang.String string;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.feed.af afVar = this.f111250d;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = afVar.I;
        if (roundCornerRelativeLayout == null) {
            kotlin.jvm.internal.o.o("bottomAreaJumpGroup");
            throw null;
        }
        roundCornerRelativeLayout.setTranslationY(0.0f);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", "1003");
        r45.l70 l70Var = afVar.U;
        java.lang.String str2 = "";
        if (l70Var == null || (str = l70Var.getString(0)) == null) {
            str = "";
        }
        hashMap.put("resource_id", str);
        r45.m70 m70Var = afVar.T;
        if (m70Var != null && (string = m70Var.getString(0)) != null) {
            str2 = string;
        }
        hashMap.put("activityId", str2);
        hashMap.put("enter_sence", afVar.P);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.R1, hashMap, afVar.Z, "311", null, null, false, 112, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = this.f111250d.I;
        if (roundCornerRelativeLayout != null) {
            roundCornerRelativeLayout.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("bottomAreaJumpGroup");
            throw null;
        }
    }
}
