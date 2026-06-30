package r50;

/* loaded from: classes5.dex */
public final class w implements nl5.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f474149a;

    public w(r50.j0 j0Var) {
        this.f474149a = j0Var;
    }

    @Override // nl5.a0
    public void a(android.view.View v17, nl5.z item, java.lang.String curSelect) {
        gl5.d1 d1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curSelect, "curSelect");
        int i17 = item.f419931b;
        boolean z17 = i17 == 6;
        r50.j0 j0Var = this.f474149a;
        if (z17) {
            j0Var.W6().e().append("\n");
        }
        if ((i17 == 7) && (d1Var = (gl5.d1) ((jz5.n) j0Var.f474119e).mo141623x754a37bb()) != null) {
            android.view.ViewParent parent = d1Var.e().getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                if (viewGroup.indexOfChild(d1Var.e()) != viewGroup.getChildCount() - 1) {
                    viewGroup.removeView(d1Var.e());
                    viewGroup.addView(d1Var.e());
                }
            }
            fl5.i iVar = d1Var.f354458b;
            android.view.View l17 = iVar.l();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "wrapView(...)");
            int[] iArr = new int[2];
            l17.getLocationOnScreen(iArr);
            gl5.g0 g0Var = new gl5.g0(l17.getMeasuredWidth(), l17.getMeasuredHeight(), iArr);
            d1Var.f354462f = true;
            android.view.View e17 = d1Var.e();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(e17, arrayList.toArray(), "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen", "openFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(e17, "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen", "openFullScreenEdt", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object mo141623x754a37bb = ((jz5.n) d1Var.f354472p).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) mo141623x754a37bb).setVisibility(4);
            android.view.ViewGroup.LayoutParams layoutParams = d1Var.c().getLayoutParams();
            layoutParams.width = -1;
            d1Var.c().setLayoutParams(layoutParams);
            d1Var.g(d1Var.c());
            iVar.mo81587x25bfb969(Integer.MAX_VALUE);
            iVar.mo81585x843d819f(6);
            iVar.mo81358x8f2956f(false);
            iVar.mo81586xc17f97e2(131073);
            d1Var.f();
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) d1Var.f354471o).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            iVar.getSizeAnimController().a(false);
            iVar.l().post(new gl5.z0(d1Var, g0Var));
        }
        if (i17 == 8) {
            a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f534152d;
            if (mVar != null) {
                mVar.l(2);
            }
            j0Var.W6().e().f();
        }
    }

    @Override // nl5.a0
    public void b(java.util.List items, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        r50.j0 j0Var = this.f474149a;
        java.lang.String string = j0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574063o93);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        items.add(new nl5.z(string, 6));
        gl5.d1 d1Var = (gl5.d1) ((jz5.n) j0Var.f474119e).mo141623x754a37bb();
        if (d1Var.f354462f && d1Var.e().getParent() != null) {
            return;
        }
        java.lang.String string2 = j0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574069o94);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        items.add(new nl5.z(string2, 8));
        java.lang.String string3 = j0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gul);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        items.add(new nl5.z(string3, 7));
    }
}
