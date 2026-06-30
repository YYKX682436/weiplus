package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public final class h8 extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 {

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f289255J;
    public final java.util.HashSet K;

    public h8(java.lang.String str, android.content.Context context, com.p314xaae8f345.mm.ui.y9 y9Var) {
        super(context, y9Var);
        this.f289255J = str;
        this.K = new java.util.HashSet();
        ((l75.a1) c01.d9.b().r()).a(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2 = super.getView(i17, view, viewGroup);
        java.lang.Object tag = view2.getTag();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 n2Var = tag instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 ? (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2) tag : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) getItem(i17);
        java.lang.String h17 = l4Var != null ? l4Var.h1() : null;
        java.lang.String y07 = l4Var != null ? l4Var.y0() : null;
        if (y07 == null) {
            y07 = "";
        }
        java.lang.String str = y07;
        if (h17 != null) {
            if ((n2Var != null ? n2Var.f289417a : null) != null) {
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.g8(l4Var, h17, str, n2Var, i17));
            }
        }
        return view2;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        s(((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).s(6, null, this.f289255J, -1));
        java.lang.Object[] objArr = new java.lang.Object[1];
        android.database.Cursor j17 = j();
        objArr[0] = j17 != null ? java.lang.Integer.valueOf(j17.getCount()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuConversationAdapter", "resetCursor count: %s", objArr);
        com.p314xaae8f345.mm.ui.y9 y9Var = this.f294144h;
        if (y9Var != null) {
            y9Var.b(null);
        }
        notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2
    public void v(java.lang.String str, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 n2Var) {
        android.widget.LinearLayout linearLayout = n2Var != null ? n2Var.f289417a : null;
        if (linearLayout != null) {
            linearLayout.setDescendantFocusability(393216);
        }
        android.widget.ImageView imageView = n2Var != null ? n2Var.f289418b : null;
        if (imageView != null) {
            imageView.setClickable(false);
        }
        android.widget.ImageView imageView2 = n2Var != null ? n2Var.f289418b : null;
        if (imageView2 != null) {
            imageView2.setLongClickable(false);
        }
        java.util.HashSet hashSet = this.K;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2
    public void w() {
        ((l75.a1) c01.d9.b().r()).e(this);
    }
}
