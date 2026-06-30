package l72;

/* loaded from: classes11.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61 f398395d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61 activityC13535x2550df61) {
        this.f398395d = activityC13535x2550df61;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetectaction/ui/FaceAgreementUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61 activityC13535x2550df61 = this.f398395d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "needShowProtocal : %s", java.lang.Boolean.valueOf(activityC13535x2550df61.f181739r));
        if (activityC13535x2550df61.f181739r) {
            activityC13535x2550df61.f181740s = true;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC13535x2550df61.mo55332x76847179(), 1, 3);
            activityC13535x2550df61.f181738q = z2Var;
            z2Var.m(activityC13535x2550df61.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6c), activityC13535x2550df61.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6_));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = activityC13535x2550df61.f181738q;
            l72.z zVar = new l72.z(activityC13535x2550df61);
            l72.a0 a0Var = new l72.a0(activityC13535x2550df61);
            z2Var2.D = zVar;
            z2Var2.E = a0Var;
            android.view.View inflate = android.view.View.inflate(activityC13535x2550df61.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.a_y, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dmi);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13535x2550df61.f181734m)) {
                textView.setText(activityC13535x2550df61.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6b));
            } else {
                textView.setText(activityC13535x2550df61.f181734m);
            }
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            activityC13535x2550df61.f181738q.s(inflate);
            android.view.View inflate2 = android.view.View.inflate(activityC13535x2550df61.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.a_x, null);
            android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.dmh);
            activityC13535x2550df61.f181732h = textView2;
            com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
            java.lang.String str = activityC13535x2550df61.f181733i;
            android.widget.TextView textView3 = activityC13535x2550df61.f181732h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.String.format(str, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(activityC13535x2550df61)));
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.String string = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13535x2550df61.f181735n) ? activityC13535x2550df61.f181735n : activityC13535x2550df61.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6e);
            arrayList3.add(string);
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                java.lang.String str2 = (java.lang.String) arrayList3.get(i17);
                int indexOf = string.indexOf(str2);
                int length = str2.length() + indexOf;
                if (indexOf >= 0 && length <= string.length()) {
                    spannableString.setSpan(new l72.c0((java.lang.String) arrayList2.get(i17), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29), true, new l72.x(activityC13535x2550df61, activityC13535x2550df61)), indexOf, length, 17);
                }
            }
            if (textView3 != null) {
                textView3.setText(spannableString);
                textView3.setOnTouchListener(new l72.y(activityC13535x2550df61, spannableString, textView3));
            }
            activityC13535x2550df61.f181738q.j(inflate2);
            activityC13535x2550df61.f181738q.C();
        } else {
            android.content.Intent intent = new android.content.Intent(activityC13535x2550df61, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1699xe125c5cf.ActivityC15538x252a13b6.class);
            android.os.Bundle extras = activityC13535x2550df61.getIntent().getExtras();
            if (extras != null) {
                intent.putExtras(extras);
            }
            intent.putExtra("needContract", activityC13535x2550df61.f181739r);
            activityC13535x2550df61.startActivityForResult(intent, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 67L, 1L, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceAgreementUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
