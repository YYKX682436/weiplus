package df2;

/* loaded from: classes3.dex */
public final class pk extends if2.b implements if2.e {
    public android.view.View A;
    public android.widget.EditText B;
    public android.view.View C;
    public android.view.View D;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 E;
    public final jz5.g F;
    public final jz5.g G;
    public android.view.ViewGroup H;
    public ce2.i I;

    /* renamed from: J, reason: collision with root package name */
    public ce2.i f312605J;
    public java.util.List K;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312606m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f312607n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f312608o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f312609p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f312610q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f312611r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 f312612s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f312613t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f312614u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f312615v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f312616w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930.C14278x370c3dac f312617x;

    /* renamed from: y, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f312618y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f312619z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312606m = "LiveGiftCustomGiftController";
        this.F = jz5.h.b(df2.mk.f312318d);
        this.G = jz5.h.b(df2.nk.f312396d);
    }

    public static final void i7(android.widget.EditText editText, df2.pk pkVar) {
        android.text.Editable text;
        if (((editText == null || (text = editText.getText()) == null) ? 0 : text.length()) <= 0) {
            android.view.View view = pkVar.C;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "showCustomTextEditorInput$checkDeleteBtnVisibility", "(Landroid/widget/EditText;Lcom/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "showCustomTextEditorInput$checkDeleteBtnVisibility", "(Landroid/widget/EditText;Lcom/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = pkVar.C;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "showCustomTextEditorInput$checkDeleteBtnVisibility", "(Landroid/widget/EditText;Lcom/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "showCustomTextEditorInput$checkDeleteBtnVisibility", "(Landroid/widget/EditText;Lcom/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean Z6(java.lang.String str, ce2.i iVar, ce2.i iVar2) {
        r45.na0 D0;
        java.util.LinkedList<r45.ma0> m75941xfb821914;
        r45.na0 D02;
        java.util.LinkedList m75941xfb8219142;
        java.lang.Object obj;
        if (iVar2 != null && (D0 = iVar2.D0()) != null && (m75941xfb821914 = D0.m75941xfb821914(0)) != null) {
            for (r45.ma0 ma0Var : m75941xfb821914) {
                if (iVar != null && (D02 = iVar.D0()) != null && (m75941xfb8219142 = D02.m75941xfb821914(0)) != null) {
                    java.util.Iterator it = m75941xfb8219142.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.ma0) obj).m75945x2fec8307(4), ma0Var.m75945x2fec8307(4))) {
                            break;
                        }
                    }
                    r45.ma0 ma0Var2 = (r45.ma0) obj;
                    if (ma0Var2 != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ma0Var2.m75945x2fec8307(2), ma0Var.m75945x2fec8307(2))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312606m, str + " component " + ma0Var.m75945x2fec8307(0) + ' ' + ma0Var.m75945x2fec8307(4) + " change from $" + ma0Var2.m75945x2fec8307(2) + " to " + ma0Var.m75945x2fec8307(2) + '!');
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean a7(ce2.i iVar, ce2.i iVar2) {
        java.lang.String str;
        r45.na0 D0;
        r45.pa0 pa0Var;
        r45.na0 D02;
        java.lang.String str2 = null;
        r45.pa0 pa0Var2 = (iVar2 == null || (D02 = iVar2.D0()) == null) ? null : (r45.pa0) D02.m75936x14adae67(1);
        if (pa0Var2 != null && pa0Var2.m75933x41a8a7f2(0)) {
            if (pa0Var2 == null || (str = pa0Var2.m75945x2fec8307(3)) == null) {
                str = "";
            }
            if (iVar != null && (D0 = iVar.D0()) != null && (pa0Var = (r45.pa0) D0.m75936x14adae67(1)) != null) {
                java.lang.String m75945x2fec8307 = pa0Var.m75945x2fec8307(3);
                str2 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String b7(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append(ya.b.f77479x42930b2 + i17 + ',' + pm0.b0.g((r45.ma0) obj) + '\n');
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sb7);
        return sb7;
    }

    public final java.util.ArrayList c7() {
        return (java.util.ArrayList) ((jz5.n) this.G).mo141623x754a37bb();
    }

    public final void d7(android.widget.EditText editText) {
        android.content.Context context;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
        }
        android.view.View view = this.f312610q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "hideCustomTextEditorInput", "(Landroid/widget/EditText;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "hideCustomTextEditorInput", "(Landroid/widget/EditText;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f312619z;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "hideCustomTextEditorInput", "(Landroid/widget/EditText;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "hideCustomTextEditorInput", "(Landroid/widget/EditText;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e1 = this.f312612s;
        if (c14940x2aae97e1 != null) {
            c14940x2aae97e1.h();
        }
        this.f312607n = null;
        this.f312608o = null;
        this.f312611r = null;
        this.f312612s = null;
        this.f312613t = null;
        this.f312614u = null;
        this.f312615v = null;
        this.f312616w = null;
        this.f312617x = null;
        this.f312618y = null;
        this.f312619z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((je2.t) m56788xbba4bfc0(je2.t.class)).f380800m).k(java.lang.Boolean.FALSE);
        c7().clear();
        bm2.a2 a2Var = (bm2.a2) ((jz5.n) this.F).mo141623x754a37bb();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("release:");
        java.util.ArrayList arrayList = a2Var.f103292e;
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a2Var.f103291d, sb6.toString());
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    public final void f7(java.lang.String str) {
        ce2.i iVar = this.f312605J;
        r45.na0 D0 = iVar != null ? iVar.D0() : null;
        float a17 = ce2.i.U1.a(str, D0 != null ? D0.m75941xfb821914(0) : null, D0 != null ? (r45.pa0) D0.m75936x14adae67(1) : null);
        ce2.i iVar2 = this.f312605J;
        float f17 = (iVar2 != null ? iVar2.f67813x29a891c4 : 0.0f) + a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312606m, str + " setCustomGiftPrice totalPrice:" + f17 + ",componentPrice:" + a17);
        android.widget.TextView textView = this.f312614u;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf((int) f17));
        }
        if (f17 <= 0.0f) {
            android.view.ViewGroup viewGroup = this.f312613t;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            android.view.ViewGroup viewGroup2 = this.f312615v;
            if (viewGroup2 == null) {
                return;
            }
            viewGroup2.setVisibility(4);
            return;
        }
        android.view.ViewGroup viewGroup3 = this.f312613t;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
        if (a17 <= 0.0f) {
            android.view.ViewGroup viewGroup4 = this.f312615v;
            if (viewGroup4 == null) {
                return;
            }
            viewGroup4.setVisibility(4);
            return;
        }
        android.widget.TextView textView2 = this.f312616w;
        if (textView2 != null) {
            textView2.setText(java.lang.String.valueOf((int) a17));
        }
        android.view.ViewGroup viewGroup5 = this.f312615v;
        if (viewGroup5 == null) {
            return;
        }
        viewGroup5.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g7(android.view.View r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.pk.g7(android.view.View, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h7(ce2.i r25, android.view.ViewGroup r26) {
        /*
            Method dump skipped, instructions count: 1667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.pk.h7(ce2.i, android.view.ViewGroup):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312606m, "onLiveActivate");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((je2.t) m56788xbba4bfc0(je2.t.class)).f380800m).k(java.lang.Boolean.FALSE);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        m124243x41012807();
        this.H = null;
        je2.t tVar = (je2.t) m56788xbba4bfc0(je2.t.class);
        java.lang.String source = this.f312606m + "_onViewUnmount";
        tVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        it2.z zVar = tVar.f380799i;
        if (zVar != null) {
            zVar.b(source, kt2.c.f393505e);
        }
    }

    /* renamed from: release */
    public final void m124243x41012807() {
        e7();
        this.I = null;
        this.f312605J = null;
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.E;
        if (f5Var != null) {
            f5Var.d();
        }
        this.E = null;
        this.K = null;
    }
}
