package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes10.dex */
public class l3 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 f272421a;

    public l3(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 c19652xe1933193) {
        this.f272421a = c19652xe1933193;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        try {
            this.f272421a.f271377q.n(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoiceInputFooter", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 c19652xe1933193 = this.f272421a;
        c19652xe1933193.f271377q.mo81352x6a67d012().sendKeyEvent(new android.view.KeyEvent(0, 67));
        c19652xe1933193.f271377q.mo81352x6a67d012().sendKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
    }
}
