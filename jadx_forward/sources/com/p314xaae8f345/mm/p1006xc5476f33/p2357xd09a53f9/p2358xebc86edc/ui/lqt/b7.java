package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class b7 implements com.p314xaae8f345.mm.p2802xd031a825.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ry4 f259641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb f259642b;

    public b7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb, r45.ry4 ry4Var) {
        this.f259642b = activityC19020x7623dbfb;
        this.f259641a = ry4Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z
    /* renamed from: onClick */
    public void mo48650xaf6b9ae9(android.view.View view) {
        java.util.LinkedList linkedList;
        java.lang.String str;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.R1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb = this.f259642b;
        activityC19020x7623dbfb.getClass();
        r45.ry4 ry4Var = this.f259641a;
        if (ry4Var == null || (linkedList = ry4Var.f466822i) == null || linkedList.isEmpty()) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        java.lang.String str2 = "";
        java.lang.String str3 = "";
        while (it.hasNext()) {
            r45.if0 if0Var = (r45.if0) it.next();
            if (if0Var != null && (str = if0Var.f458514d) != null) {
                str3 = if0Var.f458515e;
                str2 = str;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC19020x7623dbfb.mo55332x76847179(), 2, 3);
        z2Var.y(activityC19020x7623dbfb.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
        z2Var.x(1);
        z2Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.f7(activityC19020x7623dbfb, z2Var);
        android.view.View inflate = android.view.View.inflate(activityC19020x7623dbfb.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.btb, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gwd);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            textView.setText(str2);
        }
        textView.getPaint().setFakeBoldText(true);
        z2Var.s(inflate);
        android.view.View inflate2 = android.view.View.inflate(activityC19020x7623dbfb.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bta, null);
        android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.gw8);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            textView2.setText(str3);
        }
        z2Var.j(inflate2);
        z2Var.C();
    }
}
