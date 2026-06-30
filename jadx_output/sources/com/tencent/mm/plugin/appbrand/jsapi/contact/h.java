package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes15.dex */
public class h implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.c f80551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f80552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f80554g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.j f80555h;

    public h(com.tencent.mm.plugin.appbrand.jsapi.contact.j jVar, com.tencent.mm.plugin.appbrand.jsapi.contact.c cVar, android.app.Activity activity, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f80555h = jVar;
        this.f80551d = cVar;
        this.f80552e = activity;
        this.f80553f = lVar;
        this.f80554g = i17;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.ContentValues contentValues;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80553f;
        com.tencent.mm.plugin.appbrand.jsapi.contact.c cVar = this.f80551d;
        com.tencent.mm.plugin.appbrand.jsapi.contact.j jVar = this.f80555h;
        android.app.Activity activity = this.f80552e;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT_OR_EDIT", android.provider.ContactsContract.Contacts.CONTENT_URI);
            intent.setType("vnd.android.cursor.item/person");
            com.tencent.mm.plugin.appbrand.jsapi.contact.j.C(jVar, intent, cVar, activity, lVar);
            com.tencent.mm.plugin.appbrand.jsapi.contact.g gVar = new com.tencent.mm.plugin.appbrand.jsapi.contact.g(this);
            try {
                nf.g.a(activity).j(intent, gVar);
                return;
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddPhoneContact", "showAddContactMenu case1, get RemoteException[%s] retry", e17);
                nf.g.a(activity).j(intent, gVar);
                return;
            }
        }
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.INSERT", android.provider.ContactsContract.Contacts.CONTENT_URI);
        com.tencent.mm.plugin.appbrand.jsapi.contact.j.C(jVar, intent2, cVar, activity, lVar);
        android.app.Activity activity2 = this.f80552e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/contact/JsApiAddPhoneContact$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity2, "com/tencent/mm/plugin/appbrand/jsapi/contact/JsApiAddPhoneContact$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.appbrand.jsapi.contact.f fVar = new com.tencent.mm.plugin.appbrand.jsapi.contact.f(this);
        try {
            nf.g.a(activity).j(intent2, fVar);
        } catch (android.os.RemoteException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddPhoneContact", "showAddContactMenu case0, get RemoteException[%s] retry", e18);
            try {
                java.util.ArrayList<? extends android.os.Parcelable> parcelableArrayListExtra = intent2.getParcelableArrayListExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
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
                intent2.putParcelableArrayListExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, parcelableArrayListExtra);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiAddPhoneContact", th6, "removeContactAvatarDataFromIntent", new java.lang.Object[0]);
            }
            nf.g.a(activity).j(intent2, fVar);
        }
    }
}
