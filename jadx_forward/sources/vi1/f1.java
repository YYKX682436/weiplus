package vi1;

/* loaded from: classes7.dex */
public final class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j1 f518851d;

    public f1(vi1.j1 j1Var) {
        this.f518851d = j1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vi1.j1 j1Var = this.f518851d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.p1177xd1075a44.C12545x36e72905 c12545x36e72905 = j1Var.f518880d;
        java.lang.String valueOf = java.lang.String.valueOf(c12545x36e72905 != null ? c12545x36e72905.m52280xfb85ada3() : null);
        java.util.List list = j1Var.f518884h;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) it.next();
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, c12542x3a17e581.f168932d)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(j1Var.f518877a);
            i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.a3h);
            i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.gpa);
            i0Var.h();
        } else {
            vi1.d0 d0Var = j1Var.f518878b;
            if (d0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.p1177xd1075a44.C12545x36e72905 c12545x36e729052 = j1Var.f518880d;
                java.lang.String valueOf2 = java.lang.String.valueOf(c12545x36e729052 != null ? c12545x36e729052.m52280xfb85ada3() : null);
                vi1.b1 b1Var = (vi1.b1) d0Var;
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(valueOf2);
                android.content.Context context = b1Var.f518806a;
                if (K0) {
                    java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3l);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    b1Var.a(string);
                } else {
                    java.lang.String str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571687mf) + valueOf2;
                    java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571686me);
                    java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4f);
                    java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4j);
                    vi1.p0 p0Var = new vi1.p0(b1Var, valueOf2);
                    vi1.q0 q0Var = vi1.q0.f518965d;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                    aVar.f293242a = string2;
                    aVar.f293262s = str;
                    aVar.f293265v = string3;
                    aVar.E = p0Var;
                    aVar.f293266w = string4;
                    aVar.F = q0Var;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                    j0Var.e(aVar);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var2 = aVar.f293256m;
                    if (d0Var2 != null) {
                        d0Var2.a(j0Var.f293370r);
                    }
                    j0Var.show();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
