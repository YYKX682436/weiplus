package hf2;

/* loaded from: classes10.dex */
public final class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.b2 f362706d;

    public u1(hf2.b2 b2Var) {
        this.f362706d = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.text.Editable text;
        android.content.Context context;
        java.util.LinkedList linkedList;
        r45.ji0 ji0Var;
        android.view.Window window;
        android.view.View decorView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextOptionWidget$editClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hf2.b2 b2Var = this.f362706d;
        hf2.l2 l76 = b2Var.f362539a.l7();
        l76.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l76.f362638b, "editClickListener".concat(" hidePanel"));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = l76.f362640d;
        java.lang.String str = null;
        if (c22613xe7040d9c != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(c22613xe7040d9c, null, 1, null);
        }
        l76.f362637a.f362723v = false;
        hf2.x xVar = b2Var.f362539a;
        r45.h84 h84Var = xVar.f362719r;
        java.lang.String m75945x2fec8307 = h84Var != null ? h84Var.m75945x2fec8307(0) : null;
        boolean z17 = !(m75945x2fec8307 == null || m75945x2fec8307.length() == 0);
        java.lang.String str2 = b2Var.f362540b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "editClickListener isMaasSticker:" + z17);
        if (z17) {
            hf2.y0 g76 = xVar.g7();
            android.view.View view2 = g76.f362737e;
            if (view2 != null) {
                zl2.r4.f555483a.Q2(view2);
            }
            hf2.x xVar2 = g76.f362733a;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = xVar2.N6();
            if (N6 != null && (window = N6.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.post(new hf2.p0(g76));
            }
            android.view.View inflate = android.view.LayoutInflater.from(xVar2.O6()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.deg, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
            g76.f362737e = viewGroup;
            g76.f362738f = (android.widget.EditText) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.q8k);
            android.view.View view3 = g76.f362737e;
            g76.f362739g = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.cpe) : null;
            android.view.View view4 = g76.f362737e;
            android.view.View findViewById = view4 != null ? view4.findViewById(com.p314xaae8f345.mm.R.id.jpp) : null;
            g76.f362740h = findViewById;
            if (findViewById != null) {
                findViewById.setOnClickListener(new hf2.u0(g76));
            }
            android.view.View view5 = g76.f362737e;
            android.view.View findViewById2 = view5 != null ? view5.findViewById(com.p314xaae8f345.mm.R.id.asv) : null;
            g76.f362741i = findViewById2;
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new hf2.w0(g76));
            }
            android.view.ViewGroup viewGroup2 = xVar2.f362724w;
            if (viewGroup2 != null) {
                viewGroup2.addView(g76.f362737e, new android.view.ViewGroup.LayoutParams(-1, -1));
            }
            android.view.View view6 = xVar2.h7().f362547i;
            if (view6 != null) {
                view6.bringToFront();
            }
            android.widget.EditText editText = g76.f362738f;
            r45.ei0 ei0Var = xVar2.f362718q;
            java.lang.String str3 = (ei0Var == null || (linkedList = ei0Var.f455062d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) == null) ? null : ji0Var.f459362n;
            java.lang.String str4 = str3 != null ? str3 : "";
            int length = str4.length();
            int i17 = g76.f362735c;
            if (length > i17) {
                str4 = str4.substring(0, i17 - 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "substring(...)");
            }
            if (editText != null) {
                editText.requestFocus();
            }
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(editText, 0);
            }
            zl2.r4 r4Var = zl2.r4.f555483a;
            int i18 = g76.f362735c;
            r4Var.Z2(editText, null, i18, i18, false, com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_1, new hf2.s0(g76, editText));
            if (editText != null) {
                editText.setText(str4);
            }
            if (editText != null) {
                android.text.Editable text2 = editText.getText();
                editText.setSelection(text2 != null ? text2.length() : 0);
            }
            hf2.y0.e(editText, g76);
            android.view.View view7 = g76.f362740h;
            if (view7 != null) {
                if (editText != null && (text = editText.getText()) != null) {
                    str = text.toString();
                }
                view7.setEnabled(!(str == null || str.length() == 0));
            }
        } else {
            hf2.h0 f76 = xVar.f7();
            android.view.View view8 = f76.f362606d;
            if (view8 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view8, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerEditorWidget", "showStickerInput", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerEditorWidget", "showStickerInput", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view9 = f76.f362606d;
            if (view9 != null) {
                view9.bringToFront();
            }
            qc0.g1 g1Var = f76.f362605c;
            if (g1Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d.C17090xc5b6aeb7) g1Var).j(true, 17.0f);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "".concat(" hide"));
            android.view.View view10 = b2Var.f362547i;
            if (view10 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view10, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextOptionWidget", "hide", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view10, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextOptionWidget", "hide", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextOptionWidget$editClickListener$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
