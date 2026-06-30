package vi1;

/* loaded from: classes7.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j1 f518863d;

    public i1(vi1.j1 j1Var) {
        this.f518863d = j1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vi1.j1 j1Var = this.f518863d;
        vi1.d0 d0Var = j1Var.f518878b;
        if (d0Var != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = j1Var.f518882f;
            java.lang.Boolean valueOf = viewOnClickListenerC22631x1cc07cc8 != null ? java.lang.Boolean.valueOf(viewOnClickListenerC22631x1cc07cc8.f292896x) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            boolean booleanValue = valueOf.booleanValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.p1177xd1075a44.C12545x36e72905 c12545x36e72905 = j1Var.f518880d;
            java.lang.String valueOf2 = java.lang.String.valueOf(c12545x36e72905 != null ? c12545x36e72905.m52280xfb85ada3() : null);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b c21490xb2dd0b6b = j1Var.f518881e;
            java.lang.String valueOf3 = java.lang.String.valueOf(c21490xb2dd0b6b != null ? c21490xb2dd0b6b.m78931xfb85ada3() : null);
            vi1.b1 b1Var = (vi1.b1) d0Var;
            vi1.l2 l2Var = vi1.l2.f518934a;
            java.lang.String str = b1Var.f518807b;
            vi1.j2 a17 = l2Var.a(str);
            if (a17 != null) {
                vi1.j2 a18 = l2Var.a(str);
                java.lang.Long valueOf4 = a18 != null ? java.lang.Long.valueOf(a18.f518899o) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf4);
                a17.f518899o = valueOf4.longValue() + 1;
            }
            if (booleanValue) {
                vi1.j2 a19 = l2Var.a(str);
                if (a19 != null) {
                    vi1.j2 a27 = l2Var.a(str);
                    java.lang.Long valueOf5 = a27 != null ? java.lang.Long.valueOf(a27.f518902r) : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf5);
                    a19.f518902r = valueOf5.longValue() + 1;
                }
            } else {
                vi1.j2 a28 = l2Var.a(str);
                if (a28 != null) {
                    vi1.j2 a29 = l2Var.a(str);
                    java.lang.Long valueOf6 = a29 != null ? java.lang.Long.valueOf(a29.f518903s) : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf6);
                    a28.f518903s = valueOf6.longValue() + 1;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PhoneNumberAddLogic", "verifyCode mAppId:" + str + ", mobile:" + valueOf2 + " code:" + valueOf3);
            android.content.Context context = b1Var.f518806a;
            vi1.a1 a1Var = new vi1.a1(b1Var, booleanValue, valueOf2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4.c(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3w), true, null));
            r45.w20 w20Var = new r45.w20();
            w20Var.f470331d = str;
            w20Var.f470332e = valueOf2;
            w20Var.f470333f = valueOf3;
            ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/checkverifycode", str, w20Var, r45.x20.class).n(new vi1.g(a1Var))).s(new vi1.h(a1Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
