package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9;

/* loaded from: classes7.dex */
public final class h implements com.p314xaae8f345.mm.p794xb0fa9b5e.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.C12290x66551320 f165421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f165422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165423f;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.C12290x66551320 c12290x66551320, p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str) {
        this.f165421d = c12290x66551320;
        this.f165422e = qVar;
        this.f165423f = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        byte[] bArr = null;
        java.lang.String str = c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetch with args:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.C12290x66551320 c12290x66551320 = this.f165421d;
        sb6.append(c12290x66551320);
        sb6.append(", onCallback(");
        sb6.append((java.lang.String) str);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHTMLWebView.EmojiFetcher", sb6.toString());
        boolean z17 = str == 0 || str.length() == 0;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f165422e;
        try {
            if (z17) {
                ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                return;
            }
            try {
                byte[] c17 = s46.d.c(com.p314xaae8f345.mm.vfs.w6.E(str));
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.i.f165425b.put(this.f165423f, c17);
                com.p314xaae8f345.mm.vfs.w6.h(str);
                bArr = c17;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandHTMLWebView.EmojiFetcher", "fetch with args:" + c12290x66551320 + ", decode gif bytes with exception:" + e17);
                com.p314xaae8f345.mm.vfs.w6.h(str);
            }
            str = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(bArr);
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.vfs.w6.h(str);
            throw th6;
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s
    public void c(java.lang.Exception exc) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandHTMLWebView.EmojiFetcher", "fetch with args:" + this.f165421d + ", onCaughtInvokeException(" + exc + ')');
        this.f165422e.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandHTMLWebView.EmojiFetcher", "fetch with args:" + this.f165421d + ", onBridgeNotFound()");
        this.f165422e.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
    }
}
