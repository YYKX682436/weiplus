package ru3;

/* loaded from: classes10.dex */
public final class a implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646 f481282d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646 c17034x841bd646) {
        this.f481282d = c17034x841bd646;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public final void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646 c17034x841bd646 = this.f481282d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c17034x841bd646.f237419d, "tpplayer prepared finished");
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = c17034x841bd646.f237421f;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100975x68ac462();
        }
    }
}
