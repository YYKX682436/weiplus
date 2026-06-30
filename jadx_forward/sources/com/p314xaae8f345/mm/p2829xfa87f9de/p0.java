package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes13.dex */
public class p0 extends i11.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2829xfa87f9de.r0 f296400b;

    public p0(com.p314xaae8f345.mm.p2829xfa87f9de.r0 r0Var) {
        this.f296400b = r0Var;
    }

    @Override // i11.s
    public void a(boolean z17, double d17, double d18, int i17, double d19, double d27, double d28, java.lang.String str, java.lang.String str2, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MM.XWebMMLocationProxy", "onLocationChanged, longitude:%s, latitude:%s, locType:%s, spped:%s", java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(i17), java.lang.Double.valueOf(d19));
        if (z17) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p2829xfa87f9de.n0(this, d17, d18, d27, d28, d19));
        } else {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p2829xfa87f9de.o0(this));
        }
    }

    @Override // com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce
    /* renamed from: onStatusUpdate */
    public void mo34914xf54242da(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MM.XWebMMLocationProxy", "onStatusUpdate, name:%s, status:%s", str, java.lang.Integer.valueOf(i17));
    }
}
