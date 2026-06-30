package sr2;

/* loaded from: classes10.dex */
public final class a0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f493041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.p6 f493042e;

    public a0(sr2.w0 w0Var, so2.p6 p6Var) {
        this.f493041d = w0Var;
        this.f493042e = p6Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        sr2.w0 w0Var = this.f493041d;
        w0Var.getClass();
        so2.p6 p6Var = so2.p6.f492075e;
        boolean z17 = false;
        so2.p6 textType = this.f493042e;
        boolean z18 = textType == p6Var && w0Var.S6(w0Var.G, w0Var.H) != null;
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf == null || valueOf.intValue() != 0) {
            if (valueOf != null && valueOf.intValue() == 1) {
                so2.m mVar = z18 ? so2.m.f492009e : so2.m.f492008d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 c15336x844a2f32 = w0Var.I;
                if (c15336x844a2f32 != null) {
                    java.lang.String text = w0Var.F;
                    int i18 = w0Var.G;
                    int i19 = w0Var.H;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textType, "textType");
                    c15336x844a2f32.f212961s = textType;
                    if (!c15336x844a2f32.g(i18, i19, textType)) {
                        c15336x844a2f32.j(text, i18, i19);
                        java.lang.String str = c15336x844a2f32.f212958p;
                        c15336x844a2f32.p(str, str, c15336x844a2f32.f212961s, false);
                        int length = str.length() - c15336x844a2f32.f212958p.length();
                        c15336x844a2f32.o(length, c15336x844a2f32.f212959q);
                        c15336x844a2f32.q(new so2.n6(c15336x844a2f32.f212958p, str, c15336x844a2f32.f212959q, c15336x844a2f32.f212960r + length, c15336x844a2f32.f212961s, so2.a.f491775f, mVar, 0, null, 0L, ce1.h.f4368x366c91de, null));
                        c15336x844a2f32.n();
                        c15336x844a2f32.k();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pp ppVar = c15336x844a2f32.f212966x;
                        if (ppVar != null) {
                            ((sr2.w0) ppVar).n7(c15336x844a2f32.f212958p, str, c15336x844a2f32.f212959q, c15336x844a2f32.f212960r, c15336x844a2f32.f212961s, false, true);
                        }
                    }
                }
                w0Var.R6(textType == p6Var ? w0Var.L : w0Var.M);
                return;
            }
            return;
        }
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 c15336x844a2f322 = w0Var.I;
            if (c15336x844a2f322 != null && c15336x844a2f322.b(w0Var.F, w0Var.G, w0Var.H, textType)) {
                z17 = true;
            }
            if (z17) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = w0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((c61.l7) b6Var).Lk((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085, 20001, null, 1);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 c15336x844a2f323 = w0Var.I;
        if (c15336x844a2f323 != null) {
            java.lang.String text2 = w0Var.F;
            int i27 = w0Var.G;
            int i28 = w0Var.H;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text2, "text");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textType, "textType");
            c15336x844a2f323.f212961s = textType;
            if (!c15336x844a2f323.g(i27, i28, textType)) {
                c15336x844a2f323.j(text2, i27, i28);
                c15336x844a2f323.f212950e.setVisibility(8);
                android.view.View view = c15336x844a2f323.f212953h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderPostTextModifyView", "showModify", "(Ljava/lang/String;IILcom/tencent/mm/plugin/finder/model/TextType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderPostTextModifyView", "showModify", "(Ljava/lang/String;IILcom/tencent/mm/plugin/finder/model/TextType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c15336x844a2f323.f212957o;
                if (c1163xf1deaba4 != null) {
                    c1163xf1deaba4.setVisibility(8);
                }
                c15336x844a2f323.f212955m.setText(c15336x844a2f323.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nz7, c15336x844a2f323.f212958p));
                c15336x844a2f323.f212954i.requestFocus();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pp ppVar2 = c15336x844a2f323.f212966x;
                if (ppVar2 != null) {
                    ((sr2.w0) ppVar2).P6();
                }
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = w0Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852).mo26063x7b383410();
    }
}
