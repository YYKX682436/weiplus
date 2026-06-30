package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.b;

/* loaded from: classes14.dex */
public final class b extends com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a {

    /* renamed from: i, reason: collision with root package name */
    private int f128170i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f128171j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f128172k = -1;

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a
    public final void a(int i17, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.d dVar, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
        super.a(this.f128172k, dVar, floatBuffer, floatBuffer2);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a
    public final void d() {
        super.d();
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31156x9f4940f0(this.f128172k);
        this.f128172k = -1;
    }

    public final void a(java.nio.Buffer buffer, int i17, int i18) {
        if (this.f128170i != i17 || this.f128171j != i18) {
            this.f128170i = i17;
            this.f128171j = i18;
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31156x9f4940f0(this.f128172k);
            this.f128172k = -1;
        }
        this.f128172k = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31167x8ced7955(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, buffer, i17, i18, this.f128172k);
    }
}
