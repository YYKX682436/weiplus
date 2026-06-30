package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public final class i1 implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 f288415a;

    public i1(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 q1Var) {
        this.f288415a = q1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cci, viewGroup, false);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h1 h1Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h1) ((jz5.n) this.f288415a.H).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h1Var, "null cannot be cast to non-null type com.tencent.mm.ui.contact.item.RecentForwardListDataItem.RecentForwardListViewHolder");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = inflate != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) inflate.findViewById(com.p314xaae8f345.mm.R.id.llt) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c1163xf1deaba4, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        h1Var.f288408b = c1163xf1deaba4;
        android.widget.TextView textView = inflate != null ? (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gze) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(textView, "null cannot be cast to non-null type android.widget.TextView");
        h1Var.f288409c = textView;
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        android.widget.LinearLayout linearLayout = inflate != null ? (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.m7p) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(linearLayout, "null cannot be cast to non-null type android.widget.LinearLayout");
        h1Var.f288407a = linearLayout;
        inflate.setTag(h1Var);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        if ((bVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h1) && (dVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1)) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.q1 q1Var = this.f288415a;
            java.util.ArrayList arrayList = q1Var.C;
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h1 h1Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.h1) bVar;
            q1Var.h(arrayList != null ? com.p314xaae8f345.mm.ui.p2690x38b72420.t8.a(arrayList) : false, h1Var);
            boolean z19 = q1Var.f288369e;
            java.util.ArrayList arrayList2 = q1Var.C;
            if (arrayList2 != null) {
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.ui.p2690x38b72420.w8 w8Var = ((com.p314xaae8f345.mm.ui.p2690x38b72420.v8) it.next()).f288753d;
                    w8Var.f288767d = z19;
                    if (!z19) {
                        w8Var.f288766c = false;
                    }
                }
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = h1Var.f288408b;
            if (c1163xf1deaba4 != null) {
                if (c1163xf1deaba4.mo7946xf939df19() == null) {
                    c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false));
                    c1163xf1deaba4.m7963x830bc99d(true);
                    c1163xf1deaba4.mo7960x6cab2c8d(q1Var.G);
                } else {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
                    if (mo7946xf939df19 != null) {
                        mo7946xf939df19.m8146xced61ae5();
                    }
                }
            }
            if (q1Var.f288369e) {
                q1Var.i(false);
            }
        }
    }
}
