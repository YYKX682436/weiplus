package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final c02.b f97306a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f97307b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f97308c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public c02.g f97309d;

    public n0(c02.b bVar) {
        if (bVar == null) {
            this.f97306a = new c02.b();
        } else {
            this.f97306a = bVar;
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        if (r2 != 6) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.downloader_app.model.n0.a():void");
    }

    public n0(byte[] bArr) {
        c02.b bVar = new c02.b();
        this.f97306a = bVar;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            bVar.parseFrom(bArr);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PBAppInfo", "Parsing Failed: %s", e17.getMessage());
        }
        a();
    }
}
