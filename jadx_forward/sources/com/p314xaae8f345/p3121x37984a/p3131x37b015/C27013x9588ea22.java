package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.LiteralValue */
/* loaded from: classes12.dex */
public class C27013x9588ea22 extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9 implements com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad {
    public C27013x9588ea22(byte b17) {
        this.f57826xaf4e2c54 = m108482x40030c70(3, b17, 0.0d, null);
    }

    /* renamed from: createCppObj */
    private static native long m108482x40030c70(int i17, long j17, double d17, java.lang.String str);

    /* renamed from: createCurrentDate */
    private static native long m108483x50ed8e2b();

    /* renamed from: createCurrentTime */
    private static native long m108484x50f4f14a();

    /* renamed from: createCurrentTimeStamp */
    private static native long m108485xea882099();

    /* renamed from: currentDate */
    public static com.p314xaae8f345.p3121x37984a.p3131x37b015.C27013x9588ea22 m108486x23cebcc7() {
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27013x9588ea22 c27013x9588ea22 = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27013x9588ea22();
        c27013x9588ea22.f57826xaf4e2c54 = m108483x50ed8e2b();
        return c27013x9588ea22;
    }

    /* renamed from: currentTime */
    public static com.p314xaae8f345.p3121x37984a.p3131x37b015.C27013x9588ea22 m108487x23d61fe6() {
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27013x9588ea22 c27013x9588ea22 = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27013x9588ea22();
        c27013x9588ea22.f57826xaf4e2c54 = m108484x50f4f14a();
        return c27013x9588ea22;
    }

    /* renamed from: currentTimeStamp */
    public static com.p314xaae8f345.p3121x37984a.p3131x37b015.C27013x9588ea22 m108488x4567b37d() {
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C27013x9588ea22 c27013x9588ea22 = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27013x9588ea22();
        c27013x9588ea22.f57826xaf4e2c54 = m108485xea882099();
        return c27013x9588ea22;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9, com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27009xda923bfc
    /* renamed from: asIdentifier */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9 mo108057xe3667e7b() {
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 12;
    }

    public C27013x9588ea22(short s17) {
        this.f57826xaf4e2c54 = m108482x40030c70(3, s17, 0.0d, null);
    }

    public C27013x9588ea22(int i17) {
        this.f57826xaf4e2c54 = m108482x40030c70(3, i17, 0.0d, null);
    }

    public C27013x9588ea22(long j17) {
        this.f57826xaf4e2c54 = m108482x40030c70(3, j17, 0.0d, null);
    }

    public C27013x9588ea22(float f17) {
        this.f57826xaf4e2c54 = m108482x40030c70(5, 0L, f17, null);
    }

    public C27013x9588ea22(double d17) {
        this.f57826xaf4e2c54 = m108482x40030c70(5, 0L, d17, null);
    }

    public C27013x9588ea22(boolean z17) {
        this.f57826xaf4e2c54 = m108482x40030c70(2, z17 ? 1L : 0L, 0.0d, null);
    }

    public C27013x9588ea22(java.lang.String str) {
        if (str == null) {
            this.f57826xaf4e2c54 = m108482x40030c70(1, 0L, 0.0d, null);
        } else {
            this.f57826xaf4e2c54 = m108482x40030c70(6, 0L, 0.0d, str);
        }
    }

    private C27013x9588ea22() {
    }
}
