package com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061;

/* loaded from: classes7.dex */
public final class d0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.s, im5.a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v f149960d;

    public d0(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v vVar, im5.b bVar) {
        this.f149960d = vVar;
        if (bVar != null) {
            bVar.mo46316x322b85(this);
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.C10766x6c5cbbad c10766x6c5cbbad = (com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.C10766x6c5cbbad) obj;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v vVar = this.f149960d;
        if (vVar != null) {
            try {
                if (c10766x6c5cbbad != null) {
                    try {
                        vVar.a(c10766x6c5cbbad.f149988d, c10766x6c5cbbad.f149989e, c10766x6c5cbbad.f149990f, c10766x6c5cbbad.f149991g);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IPCRunCgi", e17, "remoteCgiImpl do callback", new java.lang.Object[0]);
                    }
                }
            } finally {
                this.f149960d = null;
            }
        }
    }

    public final void b(java.lang.String str) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v vVar = this.f149960d;
        if (vVar != null) {
            try {
                try {
                    vVar.a(3, -1, str, null);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IPCRunCgi", e17, "remoteCgiImpl do callbackUnexpectedError(%s)", str);
                }
            } finally {
                this.f149960d = null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s
    public void c(java.lang.Exception exc) {
        b(java.lang.String.format(java.util.Locale.ENGLISH, "onCaughtInvokeException(%s)", exc));
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s
    public void d() {
        b("onBridgeNotFound");
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        this.f149960d = null;
    }
}
