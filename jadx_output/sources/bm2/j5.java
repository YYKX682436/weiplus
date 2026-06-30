package bm2;

/* loaded from: classes3.dex */
public final class j5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.m4 f22011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.b5 f22012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.n5 f22013f;

    public j5(bm2.m4 m4Var, bm2.b5 b5Var, bm2.n5 n5Var) {
        this.f22011d = m4Var;
        this.f22012e = b5Var;
        this.f22013f = n5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList list;
        bm2.m4 m4Var = this.f22011d;
        r45.xn1 xn1Var = m4Var.f22101a;
        boolean z17 = (xn1Var == null || (list = xn1Var.getList(11)) == null || list.isEmpty()) ? false : true;
        bm2.b5 b5Var = this.f22012e;
        if (!z17) {
            b5Var.f21796g.setText("");
            b5Var.f21796g.setVisibility(8);
            return;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.view.View view = b5Var.f21793d;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        android.widget.TextView textView = b5Var.f21796g;
        int V0 = r4Var.V0((android.view.ViewGroup) view, new int[]{textView.getId()});
        gm2.c1 c1Var = gm2.c1.f273320a;
        android.widget.TextView textView2 = b5Var.f21796g;
        android.content.Context context = b5Var.itemView.getContext();
        r45.xn1 xn1Var2 = m4Var.f22101a;
        java.util.LinkedList list2 = xn1Var2.getList(11);
        int[] iArr = {2, 4, 5, 13, 14, 17, 15, 16, 19, 20};
        int ordinal = this.f22013f.f22141d.ordinal();
        gm2.c2 c2Var = ordinal != 1 ? ordinal != 2 ? gm2.c2.f273350i : gm2.c2.f273349h : gm2.c2.f273348g;
        kotlin.jvm.internal.o.d(context);
        jz5.l d17 = gm2.c1.d(c1Var, textView2, context, " ", list2, iArr, c2Var, null, 3, java.lang.Integer.valueOf(V0), null, 576, null);
        textView.setText((java.lang.CharSequence) d17.f302833d);
        textView.setVisibility(0);
        if (((java.util.List) d17.f302834e).isEmpty()) {
            mm2.x0 x0Var = mm2.c1.f328773y6;
            java.util.LinkedList list3 = xn1Var2.getList(11);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0);
            sb6.append(finderContact != null ? finderContact.getNickname() : null);
            sb6.append(",setRewardMember");
            x0Var.b(list3, sb6.toString());
        }
    }
}
