package com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5;

/* renamed from: com.tencent.tavkit.ciimage.ThreadLocalTextureCache */
/* loaded from: classes14.dex */
public class C25864x178eed28 {

    /* renamed from: TEXTURE_CACHE */
    private static final java.lang.ThreadLocal<com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25864x178eed28> f48853x1568931e = new java.lang.ThreadLocal<com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25864x178eed28>() { // from class: com.tencent.tavkit.ciimage.ThreadLocalTextureCache.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25864x178eed28 initialValue() {
            return new com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25864x178eed28();
        }
    };
    private final java.lang.String TAG;

    /* renamed from: textureCache */
    private final java.util.HashMap<java.lang.String, com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049> f48854xa4cfe327;

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p2969xcb80528d.p2970x2e306cb5.C25864x178eed28 m98400x9cf0d20b() {
        return f48853x1568931e.get();
    }

    /* renamed from: getTextureInfo */
    public synchronized com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m98401x3a00ef33(java.lang.String str) {
        return this.f48854xa4cfe327.get(str);
    }

    /* renamed from: putTextureInfo */
    public synchronized void m98402x12fd6dda(java.lang.String str, com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "putTextureInfo() called with: key = [" + str + "], textureInfo = [" + c25745xc3945049 + "]");
        this.f48854xa4cfe327.put(str, c25745xc3945049);
    }

    /* renamed from: release */
    public synchronized void m98403x41012807() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(this.TAG, "release() called, textureCache = " + this.f48854xa4cfe327);
        java.util.Iterator<com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049> it = this.f48854xa4cfe327.values().iterator();
        while (it.hasNext()) {
            it.next().m97285x41012807();
        }
        this.f48854xa4cfe327.clear();
    }

    /* renamed from: remove */
    public synchronized void m98404xc84af884(java.lang.String str) {
        this.f48854xa4cfe327.remove(str);
    }

    private C25864x178eed28() {
        java.lang.String str = "ThreadLocalTextureCache@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(str, "ThreadLocalTextureCache() called, thread = " + java.lang.Thread.currentThread().getName());
        this.f48854xa4cfe327 = new java.util.HashMap<>();
    }
}
