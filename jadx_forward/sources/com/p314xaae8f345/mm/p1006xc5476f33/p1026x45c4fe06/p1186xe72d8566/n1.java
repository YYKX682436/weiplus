package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes7.dex */
public final class n1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f170069a = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:12:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.n1 r25, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 r26, java.lang.String r27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r28) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.n1.c(com.tencent.mm.plugin.appbrand.screenshot.n1, com.tencent.mm.plugin.appbrand.AppBrandRuntime, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.q0
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = runtime.Q;
        if (c20976x6ba6452a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RecordScreenshotTakeReactor", "onScreenshotTaken, lifecycleScope is null");
            return;
        }
        android.app.Activity r07 = runtime.r0();
        if (!(r07 != null ? r07.hasWindowFocus() : true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.RecordScreenshotTakeReactor", "onScreenshotTaken, hasWindowFocus is false");
            return;
        }
        oz5.i e17 = com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a.e(c20976x6ba6452a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.l1(this, runtime, path, null), 1, null);
        ((p3325xe03a0797.p3326xc267989b.c3) e17).p(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.j1(c20976x6ba6452a, this, path));
        ((java.util.concurrent.ConcurrentHashMap) this.f170069a).put(path, e17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.q0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime, java.lang.String fromPath, java.lang.String toPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromPath, "fromPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toPath, "toPath");
        p3325xe03a0797.p3326xc267989b.f1 f1Var = (p3325xe03a0797.p3326xc267989b.f1) ((java.util.concurrent.ConcurrentHashMap) this.f170069a).remove(fromPath);
        if (f1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RecordScreenshotTakeReactor", "onScreenshotMove, deferred is null");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = runtime.Q;
        if (c20976x6ba6452a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RecordScreenshotTakeReactor", "onScreenshotMove, lifecycleScope is null");
        } else {
            v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.h1(f1Var, fromPath, toPath, null), 1, null);
        }
    }
}
