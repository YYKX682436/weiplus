package vy3;

/* loaded from: classes.dex */
public final class b implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f522997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522998e;

    public b(nw4.k kVar, java.lang.String str) {
        this.f522997d = kVar;
        this.f522998e = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        vy3.c cVar = vy3.c.f522999e;
        java.lang.String str = this.f522998e;
        nw4.k kVar = this.f522997d;
        if (itemId != 0) {
            if (itemId != 1) {
                return;
            }
            vy3.c.e(cVar, kVar.f422393a, str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10114, "1");
            return;
        }
        if (!cVar.f()) {
            vy3.c.e(cVar, kVar.f422393a, str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10114, "1");
            return;
        }
        android.content.Context context = kVar.f422393a;
        android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/contact");
        intent.putExtra("phone", str);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/scanner/box/jsapi/JsApiAddToAddressBook", "phoneCreateContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/scanner/box/jsapi/JsApiAddToAddressBook", "phoneCreateContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenDialPad", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10113, "1");
    }
}
