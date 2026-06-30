package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class w10 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.x10 f110948a;

    public w10(com.tencent.mm.plugin.finder.feed.x10 x10Var) {
        this.f110948a = x10Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        android.text.SpannableString i17;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.feed.x10 x10Var = this.f110948a;
        if (x10Var.f106185r == null) {
            return;
        }
        jz5.g gVar = x10Var.A;
        if (z17) {
            java.lang.Object value = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((android.widget.TextView) value).setVisibility(8);
            return;
        }
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.widget.TextView) value2).setVisibility(0);
        java.lang.Object value3 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        android.widget.TextView textView = (android.widget.TextView) value3;
        boolean A = r26.i0.A(x10Var.F, "#", false, 2, null);
        com.tencent.mm.ui.MMActivity mMActivity = x10Var.f106174d;
        if (A) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = x10Var.F;
            ((ke0.e) xVar).getClass();
            i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(mMActivity, str);
        } else {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = "#" + x10Var.F;
            ((ke0.e) xVar2).getClass();
            i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(mMActivity, str2);
        }
        textView.setText(i17);
    }
}
