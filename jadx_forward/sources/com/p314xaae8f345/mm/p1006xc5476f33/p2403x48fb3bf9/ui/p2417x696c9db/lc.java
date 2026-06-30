package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class lc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f267179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.z f267180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.tc f267181f;

    public lc(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.tc tcVar, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, com.p314xaae8f345.p3210x3857dc.z zVar) {
        this.f267181f = tcVar;
        this.f267179d = c19762x487075a;
        this.f267180e = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f267179d.f38859x6ac9171 = true;
        this.f267180e.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "onJsConfirm confirm %d", java.lang.Integer.valueOf(this.f267181f.f268446c.f265343d2));
    }
}
