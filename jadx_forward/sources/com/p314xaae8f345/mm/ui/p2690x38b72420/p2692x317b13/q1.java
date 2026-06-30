package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public final class q1 extends com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a {
    public java.util.ArrayList C;
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.f1 D;
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.g1 E;
    public rl5.r F;
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf G;
    public final jz5.g H;
    public final jz5.g I;

    public q1(int i17) {
        super(9, i17);
        this.H = jz5.h.b(new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.o1(this));
        this.I = jz5.h.b(new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.p1(this));
    }

    public static final void g(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 q1Var, java.lang.String str, int i17) {
        b95.j Ai;
        q1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3 c16508x1e702dd3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class);
        if (c16508x1e702dd3 != null && (Ai = c16508x1e702dd3.Ai()) != null) {
            Ai.a(str);
        }
        java.util.ArrayList arrayList = q1Var.C;
        if (arrayList != null) {
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = q1Var.G;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8146xced61ae5();
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.g1 g1Var = q1Var.E;
        if (g1Var != null) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.p6 p6Var = ((com.p314xaae8f345.mm.ui.p2690x38b72420.n6) g1Var).f288574a;
            p6Var.f288627y++;
            if (p6Var.f288628z.isEmpty()) {
                p6Var.f288628z = str;
            } else {
                p6Var.f288628z += "｜" + str;
            }
        }
        java.util.ArrayList arrayList2 = q1Var.C;
        if (arrayList2 != null && com.p314xaae8f345.mm.ui.p2690x38b72420.t8.a(arrayList2)) {
            return;
        }
        q1Var.h(false, (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h1) ((jz5.n) q1Var.H).mo141623x754a37bb());
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d
    public void a(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar) {
        java.util.ArrayList arrayList = this.C;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.ui.contact.item.RecentForwardListDataItem$fillingDataItem$1$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecentForwardListDataItem", "getItemConvert, type:" + type);
                return new com.p314xaae8f345.mm.ui.p2690x38b72420.s8(new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.j1(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1.this));
            }
        }, arrayList, false);
        this.G = c22848x6ddd90cf;
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.k1(arrayList, this);
        c22848x6ddd90cf.f374637n = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.l1(arrayList, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c b() {
        return (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.i1) ((jz5.n) this.I).mo141623x754a37bb();
    }

    public final void h(boolean z17, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h1 h1Var) {
        int i17 = z17 ? 0 : 8;
        android.widget.LinearLayout linearLayout = h1Var.f288407a;
        if (linearLayout != null) {
            linearLayout.setVisibility(i17);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = h1Var.f288408b;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.setVisibility(i17);
        }
        android.widget.TextView textView = h1Var.f288409c;
        if (textView == null) {
            return;
        }
        textView.setVisibility(i17);
    }

    public final void i(boolean z17) {
        java.util.ArrayList arrayList = this.C;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.ui.p2690x38b72420.v8) it.next()).f288753d.f288768e = z17;
            }
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.G;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8146xced61ae5();
        }
    }
}
