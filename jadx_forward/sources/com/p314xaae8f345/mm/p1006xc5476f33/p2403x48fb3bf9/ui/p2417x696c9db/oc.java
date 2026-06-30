package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class oc implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f268271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.z f268272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.tc f268273f;

    public oc(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.tc tcVar, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, com.p314xaae8f345.p3210x3857dc.z zVar) {
        this.f268273f = tcVar;
        this.f268271d = c19762x487075a;
        this.f268272e = zVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f268273f.f268446c.f265343d2);
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = this.f268271d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onJsConfirm, onDismiss %d, %b", valueOf, java.lang.Boolean.valueOf(c19762x487075a.f38859x6ac9171));
        if (c19762x487075a.f38859x6ac9171) {
            return;
        }
        this.f268272e.a();
    }
}
