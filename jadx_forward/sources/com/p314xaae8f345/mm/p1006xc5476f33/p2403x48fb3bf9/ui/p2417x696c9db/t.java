package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes7.dex */
public class t implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u f268412e;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u uVar, java.lang.String str) {
        this.f268412e = uVar;
        this.f268411d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u uVar = this.f268412e;
        java.util.HashMap hashMap = (java.util.HashMap) uVar.f268449c;
        java.lang.String str = this.f268411d;
        java.util.List list = (java.util.List) hashMap.get(str);
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.MMSslErrorHandler", "onReceivedSslError, cancel selected, list should not be null");
            return;
        }
        ((java.util.HashMap) uVar.f268450d).put(str, java.lang.Boolean.FALSE);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebView.MMSslErrorHandler", "onReceivedSslError, cancel selected, list size = %d", java.lang.Integer.valueOf(list.size()));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.p3210x3857dc.l0) it.next()).mo120274xae7a2e7a();
        }
        list.clear();
        uVar.f268448b.mo120134x3e28c0f9();
    }
}
