package com.p314xaae8f345.p592x631407a.p601x2eefaa;

/* renamed from: com.tencent.midas.data.APInitData */
/* loaded from: classes13.dex */
public class C4781x6fdb8e29 {

    /* renamed from: gInstance */
    private static com.p314xaae8f345.p592x631407a.p601x2eefaa.C4781x6fdb8e29 f20530xcc79a21c;

    /* renamed from: initdataCount */
    private static int f20531xcdf1f875;

    /* renamed from: initGUID */
    private java.lang.String f20532xff9eb99;

    /* renamed from: initInterfaceTime */
    private long f20533x84387476;

    private C4781x6fdb8e29() {
        f20531xcdf1f875 = 0;
        this.f20533x84387476 = 0L;
        this.f20532xff9eb99 = "";
    }

    /* renamed from: getInitdataCount */
    public static int m41817x8b51b4bf() {
        int i17 = f20531xcdf1f875;
        f20531xcdf1f875 = i17 + 1;
        return i17;
    }

    /* renamed from: init */
    public static void m41818x316510() {
        f20530xcc79a21c = new com.p314xaae8f345.p592x631407a.p601x2eefaa.C4781x6fdb8e29();
    }

    /* renamed from: setInitdataCount */
    public static void m41819x1e281b33(int i17) {
        f20531xcdf1f875 = i17;
    }

    /* renamed from: singleton */
    public static com.p314xaae8f345.p592x631407a.p601x2eefaa.C4781x6fdb8e29 m41820xa6eb780b() {
        if (f20530xcc79a21c == null) {
            f20530xcc79a21c = new com.p314xaae8f345.p592x631407a.p601x2eefaa.C4781x6fdb8e29();
        }
        return f20530xcc79a21c;
    }

    /* renamed from: getInitGUID */
    public java.lang.String m41821x8bd4290f() {
        return this.f20532xff9eb99;
    }

    /* renamed from: getInitInterfaceTime */
    public long m41822xd76cfbc0() {
        return this.f20533x84387476;
    }

    /* renamed from: setInitGUID */
    public void m41823x868c8a1b(java.lang.String str) {
        this.f20532xff9eb99 = str;
    }

    /* renamed from: setInitInterfaceTime */
    public void m41824xb3030834(long j17) {
        this.f20533x84387476 = j17;
    }
}
