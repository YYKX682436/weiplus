package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes15.dex */
public class h implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.c f162084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f162085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162086f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f162087g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j f162088h;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.c cVar, android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f162088h = jVar;
        this.f162084d = cVar;
        this.f162085e = activity;
        this.f162086f = lVar;
        this.f162087g = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.ContentValues contentValues;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162086f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.c cVar = this.f162084d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j jVar = this.f162088h;
        android.app.Activity activity = this.f162085e;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT_OR_EDIT", android.provider.ContactsContract.Contacts.CONTENT_URI);
            intent.setType("vnd.android.cursor.item/person");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j.C(jVar, intent, cVar, activity, lVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.g(this);
            try {
                nf.g.a(activity).j(intent, gVar);
                return;
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddPhoneContact", "showAddContactMenu case1, get RemoteException[%s] retry", e17);
                nf.g.a(activity).j(intent, gVar);
                return;
            }
        }
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.INSERT", android.provider.ContactsContract.Contacts.CONTENT_URI);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j.C(jVar, intent2, cVar, activity, lVar);
        android.app.Activity activity2 = this.f162085e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/contact/JsApiAddPhoneContact$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity2, "com/tencent/mm/plugin/appbrand/jsapi/contact/JsApiAddPhoneContact$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.f(this);
        try {
            nf.g.a(activity).j(intent2, fVar);
        } catch (android.os.RemoteException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddPhoneContact", "showAddContactMenu case0, get RemoteException[%s] retry", e18);
            try {
                java.util.ArrayList<? extends android.os.Parcelable> parcelableArrayListExtra = intent2.getParcelableArrayListExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                java.util.Iterator<? extends android.os.Parcelable> it = parcelableArrayListExtra.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        contentValues = null;
                        break;
                    } else {
                        contentValues = (android.content.ContentValues) it.next();
                        if (contentValues.containsKey("data15")) {
                            break;
                        }
                    }
                }
                if (contentValues != null) {
                    parcelableArrayListExtra.remove(contentValues);
                }
                intent2.putParcelableArrayListExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, parcelableArrayListExtra);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiAddPhoneContact", th6, "removeContactAvatarDataFromIntent", new java.lang.Object[0]);
            }
            nf.g.a(activity).j(intent2, fVar);
        }
    }
}
