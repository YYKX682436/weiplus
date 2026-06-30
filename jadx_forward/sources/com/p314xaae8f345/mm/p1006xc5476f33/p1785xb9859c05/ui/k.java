package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o f224419d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar) {
        this.f224419d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/DialPadController$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar = this.f224419d;
        android.widget.TextView textView = oVar.f224483b;
        oVar.f224493l = textView.getText().toString();
        oVar.f224494m = oVar.f224484c.getText().toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f224493l) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f224494m)) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputPhoneNumber", "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                java.lang.String a17 = oVar.a(textView.getText().toString().replace("+", ""), t83.f.i(string));
                oVar.f224494m = a17;
                oVar.e(a17, -1);
                oVar.b();
            }
        } else {
            oVar.f224493l = textView.getText().toString().replace("+", "");
            java.lang.String str = oVar.f224493l + oVar.f224494m;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = oVar.f224490i;
            java.lang.String e17 = t83.c.e(abstractActivityC21394xb3d2c0cf, str);
            oVar.f224495n = e17;
            oVar.f224496o = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17) ? o25.b.c(e17, abstractActivityC21394xb3d2c0cf) : null;
            java.lang.String i17 = t83.f.i(oVar.f224494m);
            android.content.SharedPreferences.Editor edit = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("IPCall_LastInputPref", 0).edit();
            edit.putString("IPCall_LastInputPhoneNumber", i17);
            edit.apply();
            java.lang.String charSequence = textView.getText().toString();
            java.lang.String str2 = oVar.f224492k;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    str2 = "";
                }
                android.content.SharedPreferences.Editor edit2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("IPCall_LastInputPref", 0).edit();
                edit2.putString("IPCall_LastInputCountryCode", charSequence.replace("+", ""));
                edit2.putString("IPCall_LastInputCountryName", str2);
                edit2.apply();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.n nVar = oVar.f224482a;
            if (nVar != null) {
                java.lang.String str3 = oVar.f224493l;
                java.lang.String i18 = t83.f.i(oVar.f224494m);
                java.lang.String str4 = oVar.f224495n;
                java.lang.String str5 = oVar.f224496o;
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16134x74658289 activityC16134x74658289 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16134x74658289) nVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "onDial, countryCode: %s, phoneNumber: %s, contactId: %s, nickname: %s", str3, i18, str4, str5);
                if (t83.f.c(activityC16134x74658289)) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j.a().e(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3, -1))) {
                        db5.e1.s(activityC16134x74658289, activityC16134x74658289.getString(com.p314xaae8f345.mm.R.C30867xcad56011.apz), activityC16134x74658289.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572305aq0));
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(12058, str3);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12059, 0, 0, 0, 0, 1);
                        android.content.Intent intent = new android.content.Intent(activityC16134x74658289, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5.class);
                        intent.putExtra("IPCallTalkUI_contactId", str4);
                        intent.putExtra("IPCallTalkUI_countryCode", str3);
                        intent.putExtra("IPCallTalkUI_nickname", str5);
                        intent.putExtra("IPCallTalkUI_phoneNumber", i18);
                        intent.putExtra("IPCallTalkUI_dialScene", activityC16134x74658289.f224136u);
                        intent.putExtra("IPCallTalkUI_countryType", activityC16134x74658289.f224137v);
                        activityC16134x74658289.startActivityForResult(intent, 1001);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/DialPadController$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
