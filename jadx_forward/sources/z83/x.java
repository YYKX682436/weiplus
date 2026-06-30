package z83;

/* loaded from: classes5.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16162x32920c96 f552291d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16162x32920c96 activityC16162x32920c96) {
        this.f552291d = activityC16162x32920c96;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16162x32920c96.f224699q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startExtReg, ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16162x32920c96 activityC16162x32920c96 = this.f552291d;
        java.lang.String str = activityC16162x32920c96.f224702f;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickName");
            throw null;
        }
        sb6.append(str);
        sb6.append(", ");
        sb6.append(activityC16162x32920c96.f224708o);
        sb6.append(", ");
        sb6.append(activityC16162x32920c96.f224705i);
        sb6.append(", 4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegRebindUI", sb6.toString());
        gm0.j1.d().a(5888, activityC16162x32920c96);
        java.lang.String str2 = activityC16162x32920c96.f224702f;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickName");
            throw null;
        }
        java.lang.String str3 = activityC16162x32920c96.f224701e;
        if (str3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mobile");
            throw null;
        }
        boolean z17 = activityC16162x32920c96.f224708o;
        java.lang.String str4 = activityC16162x32920c96.f224700d;
        if (str4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
            throw null;
        }
        java.lang.String str5 = activityC16162x32920c96.f224703g;
        if (str5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headImgFileID");
            throw null;
        }
        java.lang.String str6 = activityC16162x32920c96.f224704h;
        if (str6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headImgAesKey");
            throw null;
        }
        x83.h hVar = new x83.h(str2, str3, 4, z17, str4, str5, str6);
        hVar.H(activityC16162x32920c96.f224705i);
        gm0.j1.d().g(hVar);
        activityC16162x32920c96.f224707n = db5.e1.Q(activityC16162x32920c96, activityC16162x32920c96.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16162x32920c96.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8h), true, true, new z83.z(hVar, activityC16162x32920c96));
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
