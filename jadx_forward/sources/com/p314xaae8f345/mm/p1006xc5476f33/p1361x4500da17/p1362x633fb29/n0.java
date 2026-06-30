package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes8.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final c02.b f178839a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f178840b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f178841c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public c02.g f178842d;

    public n0(c02.b bVar) {
        if (bVar == null) {
            this.f178839a = new c02.b();
        } else {
            this.f178839a = bVar;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.n0.a():void");
    }

    public n0(byte[] bArr) {
        c02.b bVar = new c02.b();
        this.f178839a = bVar;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            bVar.mo11468x92b714fd(bArr);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PBAppInfo", "Parsing Failed: %s", e17.getMessage());
        }
        a();
    }
}
