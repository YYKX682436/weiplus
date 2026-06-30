package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.StatementDelete */
/* loaded from: classes12.dex */
public class C27035xac2643da extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f {
    public C27035xac2643da() {
        this.f57826xaf4e2c54 = m108660x40030c70();
    }

    /* renamed from: configCondition */
    private static native void m108652xdb8e93f9(long j17, long j18);

    /* renamed from: configLimitCount */
    private static native void m108653x63f1e6f6(long j17, int i17, long j18);

    /* renamed from: configLimitRange */
    private static native void m108654x64becf24(long j17, int i17, long j18, int i18, long j19);

    /* renamed from: configOffset */
    private static native void m108655x448da75(long j17, int i17, long j18);

    /* renamed from: configOrders */
    private static native void m108656x4f0d8c7(long j17, long[] jArr);

    /* renamed from: configRecursive */
    private static native void m108657x54618b10(long j17);

    /* renamed from: configTable */
    private static native void m108658x6781ac(long j17, int i17, long j18, java.lang.String str);

    /* renamed from: configWith */
    private static native void m108659x31913728(long j17, long[] jArr);

    /* renamed from: createCppObj */
    private static native long m108660x40030c70();

    /* renamed from: deleteFrom */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da m108662x692743f5(java.lang.String str) {
        m108658x6781ac(this.f57826xaf4e2c54, 6, 0L, str);
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 44;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da m108664x6234bbb(long j17, long j18) {
        m108654x64becf24(this.f57826xaf4e2c54, 3, j17, 3, j18);
        return this;
    }

    /* renamed from: offset */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da m108669xc3376493(long j17) {
        m108655x448da75(this.f57826xaf4e2c54, 3, j17);
        return this;
    }

    /* renamed from: orderBy */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da m108671xb80cf445(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880... c27017x4f962880Arr) {
        if (c27017x4f962880Arr != null && c27017x4f962880Arr.length != 0) {
            long[] jArr = new long[c27017x4f962880Arr.length];
            for (int i17 = 0; i17 < c27017x4f962880Arr.length; i17++) {
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27017x4f962880Arr[i17]);
            }
            m108656x4f0d8c7(this.f57826xaf4e2c54, jArr);
        }
        return this;
    }

    /* renamed from: where */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da m108672x6bdbce7(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        m108652xdb8e93f9(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27003xbcd6eb8));
        return this;
    }

    /* renamed from: with */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da m108673x37b0c6(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27001x4d5c2b7b... c27001x4d5c2b7bArr) {
        if (c27001x4d5c2b7bArr != null && c27001x4d5c2b7bArr.length != 0) {
            long[] jArr = new long[c27001x4d5c2b7bArr.length];
            for (int i17 = 0; i17 < c27001x4d5c2b7bArr.length; i17++) {
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27001x4d5c2b7bArr[i17]);
            }
            m108659x31913728(this.f57826xaf4e2c54, jArr);
        }
        return this;
    }

    /* renamed from: withRecursive */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da m108674x792a520c(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27001x4d5c2b7b... c27001x4d5c2b7bArr) {
        if (c27001x4d5c2b7bArr != null && c27001x4d5c2b7bArr.length != 0) {
            long[] jArr = new long[c27001x4d5c2b7bArr.length];
            for (int i17 = 0; i17 < c27001x4d5c2b7bArr.length; i17++) {
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27001x4d5c2b7bArr[i17]);
            }
            m108659x31913728(this.f57826xaf4e2c54, jArr);
            m108657x54618b10(this.f57826xaf4e2c54);
        }
        return this;
    }

    /* renamed from: deleteFrom */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da m108661x692743f5(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27019xa2e028b2 c27019xa2e028b2) {
        m108658x6781ac(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108431x78473747((com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9) c27019xa2e028b2), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27019xa2e028b2), null);
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da m108665x6234bbb(long j17, com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        m108654x64becf24(this.f57826xaf4e2c54, 3, j17, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad));
        return this;
    }

    /* renamed from: offset */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da m108670xc3376493(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        m108655x448da75(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad));
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da m108668x6234bbb(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad, com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad2) {
        m108654x64becf24(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad2), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad2));
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da m108667x6234bbb(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad, long j17) {
        m108654x64becf24(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad), 3, j17);
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da m108663x6234bbb(long j17) {
        m108653x63f1e6f6(this.f57826xaf4e2c54, 3, j17);
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27035xac2643da m108666x6234bbb(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        m108653x63f1e6f6(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad));
        return this;
    }
}
