package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class r5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f108889d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(0);
        this.f108889d = a7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f108889d;
        android.widget.TextView textView = null;
        if (a7Var.G()) {
            yw2.a0 a0Var = a7Var.f106216o;
            if (a0Var != null && (viewGroup2 = a0Var.f466614m) != null) {
                viewGroup2.setVisibility(0);
                com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = a7Var.L;
                if (finderCommentDrawer != null) {
                    finderCommentDrawer.k(viewGroup2);
                }
                java.lang.String i07 = a7Var.i0(a7Var.j0().f388228d);
                yw2.a0 a0Var2 = a7Var.f106216o;
                if (a0Var2 != null && (viewGroup3 = a0Var2.f466614m) != null) {
                    textView = (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.t5o);
                }
                if (textView != null) {
                    textView.setText(i07);
                }
                viewGroup2.setOnClickListener(new com.tencent.mm.plugin.finder.feed.q5(a7Var));
            }
        } else {
            yw2.a0 a0Var3 = a7Var.f106216o;
            if (a0Var3 != null && (viewGroup = a0Var3.f466614m) != null) {
                viewGroup.setVisibility(8);
                viewGroup.setOnClickListener(null);
            }
        }
        return jz5.f0.f302826a;
    }
}
