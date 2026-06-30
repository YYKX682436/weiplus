package bm2;

/* loaded from: classes3.dex */
public final class l5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.m4 f22066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.q4 f22067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.n5 f22068f;

    public l5(bm2.m4 m4Var, bm2.q4 q4Var, bm2.n5 n5Var) {
        this.f22066d = m4Var;
        this.f22067e = q4Var;
        this.f22068f = n5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        java.util.LinkedList list;
        bm2.m4 m4Var = this.f22066d;
        r45.xn1 xn1Var = m4Var.f22101a;
        boolean z17 = (xn1Var == null || (list = xn1Var.getList(11)) == null || list.isEmpty()) ? false : true;
        r45.xn1 xn1Var2 = m4Var.f22101a;
        bm2.n5 n5Var = this.f22068f;
        java.lang.String str = null;
        bm2.q4 q4Var = this.f22067e;
        if (!z17) {
            q4Var.f22254p.setText("");
            q4Var.f22254p.setVisibility(8);
            java.lang.String str2 = n5Var.f22149o;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (xn1Var2 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) != null) {
                str = finderContact.getNickname();
            }
            sb6.append(str);
            sb6.append(" badge_infos is empty!");
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            q4Var.itemView.setTag(com.tencent.mm.R.id.e6j, "");
            return;
        }
        android.view.ViewParent parent = q4Var.f22254p.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        android.widget.TextView textView = q4Var.f22254p;
        java.lang.Integer valueOf = viewGroup != null ? java.lang.Integer.valueOf(zl2.r4.f473950a.V0(viewGroup, new int[]{textView.getId(), q4Var.f22256r.getId()})) : null;
        gm2.c1 c1Var = gm2.c1.f273320a;
        android.widget.TextView textView2 = q4Var.f22254p;
        android.content.Context context = q4Var.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.LinkedList list2 = xn1Var2.getList(11);
        int[] iArr = {2, 4, 5, 10, 13, 14, 17, 15, 16, 9, 12, 19, 20};
        int ordinal = n5Var.f22141d.ordinal();
        jz5.l d17 = gm2.c1.d(c1Var, textView2, context, " ", list2, iArr, ordinal != 1 ? ordinal != 2 ? gm2.c2.f273350i : gm2.c2.f273349h : gm2.c2.f273348g, null, 4, valueOf, null, 576, null);
        java.lang.Object obj = d17.f302833d;
        textView.setText((java.lang.CharSequence) obj);
        textView.setVisibility(0);
        if (((java.util.List) d17.f302834e).isEmpty()) {
            mm2.x0 x0Var = mm2.c1.f328773y6;
            java.util.LinkedList list3 = xn1Var2.getList(11);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            if (xn1Var2 != null && (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) != null) {
                str = finderContact2.getNickname();
            }
            sb7.append(str);
            sb7.append(",setUserItem");
            x0Var.b(list3, sb7.toString());
        }
        q4Var.itemView.setTag(com.tencent.mm.R.id.e6j, obj);
    }
}
