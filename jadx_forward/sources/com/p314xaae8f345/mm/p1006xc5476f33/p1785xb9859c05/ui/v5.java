package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d f224577d;

    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d activityC16151x42cade4d) {
        this.f224577d = activityC16151x42cade4d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String substring;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d activityC16151x42cade4d = this.f224577d;
        activityC16151x42cade4d.A.d();
        q83.d dVar = activityC16151x42cade4d.A;
        dVar.f442287b = 1;
        dVar.f442288c = 5;
        dVar.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12766, 3);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16151x42cade4d.f224267t)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("smsto:");
            java.lang.String str = activityC16151x42cade4d.f224267t;
            activityC16151x42cade4d.getClass();
            java.lang.String str2 = "";
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((sb0.f) jVar).getClass();
            if (j35.u.d(context, "android.permission.READ_CONTACTS", true)) {
                android.database.Cursor query = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id=?", new java.lang.String[]{str}, null);
                if (query != null) {
                    try {
                        try {
                            if (query.moveToFirst()) {
                                while (!query.isAfterLast()) {
                                    str2 = str2 + query.getString(query.getColumnIndex("data1")) + ",";
                                    query.moveToNext();
                                }
                            }
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallUserProfileUI", "extractAddressItemFromCursor, error: %s, class: %s", e17.getMessage(), e17.getClass().getSimpleName());
                        }
                        query.close();
                        substring = str2.lastIndexOf(",") >= 0 ? str2.substring(0, str2.lastIndexOf(",")) : str2;
                        sb6.append(substring);
                        android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse(sb6.toString()));
                        intent.putExtra("sms_body", activityC16151x42cade4d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3v, c01.z1.g().f2()));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d activityC16151x42cade4d2 = this.f224577d;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(activityC16151x42cade4d2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activityC16151x42cade4d2.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(activityC16151x42cade4d2, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (java.lang.Throwable th6) {
                        query.close();
                        throw th6;
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallUserProfileUI", "no contact permission");
            }
            substring = null;
            sb6.append(substring);
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse(sb6.toString()));
            intent2.putExtra("sms_body", activityC16151x42cade4d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3v, c01.z1.g().f2()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d activityC16151x42cade4d22 = this.f224577d;
            java.util.ArrayList arrayList22 = new java.util.ArrayList();
            arrayList22.add(intent2);
            java.util.Collections.reverse(arrayList22);
            yj0.a.d(activityC16151x42cade4d22, arrayList22.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16151x42cade4d22.startActivity((android.content.Intent) arrayList22.get(0));
            yj0.a.f(activityC16151x42cade4d22, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16151x42cade4d.f224268u)) {
            android.content.Intent intent3 = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.parse("smsto:" + activityC16151x42cade4d.f224268u));
            intent3.putExtra("sms_body", activityC16151x42cade4d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3v, c01.z1.g().f2()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d activityC16151x42cade4d3 = this.f224577d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent3);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(activityC16151x42cade4d3, arrayList3.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16151x42cade4d3.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(activityC16151x42cade4d3, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
