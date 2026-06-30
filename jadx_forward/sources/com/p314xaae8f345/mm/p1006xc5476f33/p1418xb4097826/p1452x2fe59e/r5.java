package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class r5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f190422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var) {
        super(0);
        this.f190422d = a7Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f190422d;
        android.widget.TextView textView = null;
        if (a7Var.G()) {
            yw2.a0 a0Var = a7Var.f187749o;
            if (a0Var != null && (viewGroup2 = a0Var.f548147m) != null) {
                viewGroup2.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a = a7Var.L;
                if (c15268x6a41bd8a != null) {
                    c15268x6a41bd8a.k(viewGroup2);
                }
                java.lang.String i07 = a7Var.i0(a7Var.j0().f469761d);
                yw2.a0 a0Var2 = a7Var.f187749o;
                if (a0Var2 != null && (viewGroup3 = a0Var2.f548147m) != null) {
                    textView = (android.widget.TextView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.t5o);
                }
                if (textView != null) {
                    textView.setText(i07);
                }
                viewGroup2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q5(a7Var));
            }
        } else {
            yw2.a0 a0Var3 = a7Var.f187749o;
            if (a0Var3 != null && (viewGroup = a0Var3.f548147m) != null) {
                viewGroup.setVisibility(8);
                viewGroup.setOnClickListener(null);
            }
        }
        return jz5.f0.f384359a;
    }
}
