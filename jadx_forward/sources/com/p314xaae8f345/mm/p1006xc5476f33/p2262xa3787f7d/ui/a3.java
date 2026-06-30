package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes10.dex */
public final class a3 extends uh4.d0 {
    @Override // uh4.c
    public java.lang.String b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // uh4.c
    public void c(android.content.Context context, uh4.b state, uh4.a aVar) {
        java.lang.String g27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (aVar == null) {
            return;
        }
        aVar.f509498i.setVisibility(8);
        if (!aVar.a()) {
            aVar.f509502m.setVisibility(8);
            int ordinal = state.ordinal();
            if (ordinal == 0) {
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqo));
                return;
            }
            if (ordinal == 1) {
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqp));
                return;
            }
            if (ordinal == 2) {
                aVar.f509502m.setVisibility(0);
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqn));
                return;
            } else {
                if (ordinal != 3) {
                    return;
                }
                aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqp));
                return;
            }
        }
        int ordinal2 = state.ordinal();
        if (ordinal2 == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(aVar.f509495f, true);
            android.widget.TextView textView = aVar.f509497h;
            java.lang.Object[] objArr = new java.lang.Object[1];
            g27 = n17 != null ? n17.g2() : null;
            objArr[0] = g27 != null ? g27 : "";
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqk, objArr));
            return;
        }
        if (ordinal2 == 1) {
            aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jql));
            return;
        }
        if (ordinal2 != 2) {
            if (ordinal2 != 3) {
                return;
            }
            aVar.f509497h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jql));
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(aVar.f509495f, true);
            android.widget.TextView textView2 = aVar.f509497h;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            g27 = n18 != null ? n18.g2() : null;
            objArr2[0] = g27 != null ? g27 : "";
            textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jqj, objArr2));
        }
    }
}
