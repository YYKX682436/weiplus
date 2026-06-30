package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.StatementSelect */
/* loaded from: classes12.dex */
public class C27047xc5bef32b extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f implements com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27052xb46cb2ec {
    public C27047xc5bef32b() {
        this.f57826xaf4e2c54 = m108787x40030c70();
    }

    /* renamed from: configCondition */
    private static native void m108771xdb8e93f9(long j17, long j18);

    /* renamed from: configDistinct */
    private static native void m108772x53c0b45e(long j17);

    /* renamed from: configExcept */
    private static native void m108773xf4347afb(long j17);

    /* renamed from: configGroups */
    private static native void m108774xf74f4fb6(long j17, int[] iArr, long[] jArr, double[] dArr, java.lang.String[] strArr);

    /* renamed from: configHaving */
    private static native void m108775xf8179a07(long j17, long j18);

    /* renamed from: configIntersect */
    private static native void m108776x2ce08bfd(long j17);

    /* renamed from: configLimitCount */
    private static native void m108777x63f1e6f6(long j17, int i17, long j18);

    /* renamed from: configLimitRange */
    private static native void m108778x64becf24(long j17, int i17, long j18, int i18, long j19);

    /* renamed from: configOffset */
    private static native void m108779x448da75(long j17, int i17, long j18);

    /* renamed from: configOrders */
    private static native void m108780x4f0d8c7(long j17, long[] jArr);

    /* renamed from: configRecursive */
    private static native void m108781x54618b10(long j17);

    /* renamed from: configResultColumns */
    private static native void m108782x3a9204de(long j17, int[] iArr, long[] jArr, double[] dArr, java.lang.String[] strArr);

    /* renamed from: configTableOrSubqueries */
    private static native void m108783x74356f35(long j17, int[] iArr, long[] jArr, double[] dArr, java.lang.String[] strArr);

    /* renamed from: configUnion */
    private static native void m108784x7b9cad(long j17);

    /* renamed from: configUnionAll */
    private static native void m108785x30de89b4(long j17);

    /* renamed from: configWith */
    private static native void m108786x31913728(long j17, long[] jArr);

    /* renamed from: createCppObj */
    private static native long m108787x40030c70();

    /* renamed from: distinct */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108788x11352efc() {
        m108772x53c0b45e(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: except */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108789xb3230519() {
        m108773xf4347afb(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: from */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108790x3017aa(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27052xb46cb2ec... interfaceC27052xb46cb2ecArr) {
        if (interfaceC27052xb46cb2ecArr.length == 0) {
            return this;
        }
        int length = interfaceC27052xb46cb2ecArr.length;
        int[] iArr = new int[length];
        long[] jArr = new long[length];
        for (int i17 = 0; i17 < length; i17++) {
            iArr[i17] = com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27052xb46cb2ecArr[i17]);
            jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27052xb46cb2ecArr[i17]);
        }
        m108783x74356f35(this.f57826xaf4e2c54, iArr, jArr, null, null);
        return this;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9
    /* renamed from: getType */
    public int mo108058xfb85f7b0() {
        return 42;
    }

    /* renamed from: groupBy */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108793x117d5b36(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad... interfaceC27004x81a79aadArr) {
        if (interfaceC27004x81a79aadArr != null && interfaceC27004x81a79aadArr.length != 0) {
            int length = interfaceC27004x81a79aadArr.length;
            int[] iArr = new int[length];
            long[] jArr = new long[length];
            for (int i17 = 0; i17 < length; i17++) {
                iArr[i17] = com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aadArr[i17]);
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aadArr[i17]);
            }
            m108774xf74f4fb6(this.f57826xaf4e2c54, iArr, jArr, null, null);
        }
        return this;
    }

    /* renamed from: having */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108796xb7062425(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        m108775xf8179a07(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27003xbcd6eb8));
        return this;
    }

    /* renamed from: intersect */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108797x1dfb651f() {
        m108776x2ce08bfd(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108799x6234bbb(long j17, long j18) {
        m108778x64becf24(this.f57826xaf4e2c54, 3, j17, 3, j18);
        return this;
    }

    /* renamed from: offset */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108804xc3376493(long j17) {
        m108779x448da75(this.f57826xaf4e2c54, 3, j17);
        return this;
    }

    /* renamed from: orderBy */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108806xb80cf445(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880... c27017x4f962880Arr) {
        if (c27017x4f962880Arr != null && c27017x4f962880Arr.length != 0) {
            long[] jArr = new long[c27017x4f962880Arr.length];
            for (int i17 = 0; i17 < c27017x4f962880Arr.length; i17++) {
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27017x4f962880Arr[i17]);
            }
            m108780x4f0d8c7(this.f57826xaf4e2c54, jArr);
        }
        return this;
    }

    /* renamed from: select */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108807xc9ff34fc(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27022x3ee6b492... interfaceC27022x3ee6b492Arr) {
        if (interfaceC27022x3ee6b492Arr.length == 0) {
            return this;
        }
        int length = interfaceC27022x3ee6b492Arr.length;
        int[] iArr = new int[length];
        long[] jArr = new long[length];
        for (int i17 = 0; i17 < length; i17++) {
            iArr[i17] = com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27022x3ee6b492Arr[i17]);
            jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27022x3ee6b492Arr[i17]);
        }
        m108782x3a9204de(this.f57826xaf4e2c54, iArr, jArr, null, null);
        return this;
    }

    /* renamed from: union */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108810x6a456cf() {
        m108784x7b9cad(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: unionAll */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108811xee530452() {
        m108785x30de89b4(this.f57826xaf4e2c54);
        return this;
    }

    /* renamed from: where */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108812x6bdbce7(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        m108771xdb8e93f9(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27003xbcd6eb8));
        return this;
    }

    /* renamed from: with */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108813x37b0c6(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27001x4d5c2b7b... c27001x4d5c2b7bArr) {
        if (c27001x4d5c2b7bArr != null && c27001x4d5c2b7bArr.length != 0) {
            long[] jArr = new long[c27001x4d5c2b7bArr.length];
            for (int i17 = 0; i17 < c27001x4d5c2b7bArr.length; i17++) {
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27001x4d5c2b7bArr[i17]);
            }
            m108786x31913728(this.f57826xaf4e2c54, jArr);
        }
        return this;
    }

    /* renamed from: withRecursive */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108814x792a520c(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27001x4d5c2b7b... c27001x4d5c2b7bArr) {
        if (c27001x4d5c2b7bArr != null && c27001x4d5c2b7bArr.length != 0) {
            long[] jArr = new long[c27001x4d5c2b7bArr.length];
            for (int i17 = 0; i17 < c27001x4d5c2b7bArr.length; i17++) {
                jArr[i17] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c27001x4d5c2b7bArr[i17]);
            }
            m108786x31913728(this.f57826xaf4e2c54, jArr);
            m108781x54618b10(this.f57826xaf4e2c54);
        }
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108800x6234bbb(long j17, com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        m108778x64becf24(this.f57826xaf4e2c54, 3, j17, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad));
        return this;
    }

    /* renamed from: offset */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108805xc3376493(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        m108779x448da75(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad));
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108803x6234bbb(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad, com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad2) {
        m108778x64becf24(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad2), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad2));
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108802x6234bbb(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad, long j17) {
        m108778x64becf24(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad), 3, j17);
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108798x6234bbb(long j17) {
        m108777x63f1e6f6(this.f57826xaf4e2c54, 3, j17);
        return this;
    }

    /* renamed from: limit */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108801x6234bbb(com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad) {
        m108777x63f1e6f6(this.f57826xaf4e2c54, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad));
        return this;
    }

    /* renamed from: from */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108792x3017aa(java.lang.String... strArr) {
        if (strArr.length == 0) {
            return this;
        }
        int[] iArr = new int[strArr.length];
        java.util.Arrays.fill(iArr, 6);
        m108783x74356f35(this.f57826xaf4e2c54, iArr, null, null, strArr);
        return this;
    }

    /* renamed from: groupBy */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108795x117d5b36(java.lang.String... strArr) {
        if (strArr != null && strArr.length != 0) {
            int[] iArr = new int[strArr.length];
            java.util.Arrays.fill(iArr, 6);
            m108774xf74f4fb6(this.f57826xaf4e2c54, iArr, null, null, strArr);
        }
        return this;
    }

    /* renamed from: select */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108809xc9ff34fc(java.lang.String... strArr) {
        if (strArr.length == 0) {
            return this;
        }
        int[] iArr = new int[strArr.length];
        java.util.Arrays.fill(iArr, 6);
        m108782x3a9204de(this.f57826xaf4e2c54, iArr, null, null, strArr);
        return this;
    }

    /* renamed from: from */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108791x3017aa(java.lang.Object... objArr) {
        java.lang.String[] strArr;
        if (objArr.length == 0) {
            return this;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        long[] jArr = new long[length];
        java.lang.String[] strArr2 = new java.lang.String[length];
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < length; i19++) {
            java.lang.Object obj = objArr[i19];
            if (obj instanceof java.lang.String) {
                iArr[i19] = 6;
                strArr2[i17] = (java.lang.String) obj;
                i17++;
            } else if (obj instanceof com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27052xb46cb2ec) {
                com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27052xb46cb2ec interfaceC27052xb46cb2ec = (com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27052xb46cb2ec) obj;
                iArr[i19] = com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27052xb46cb2ec);
                jArr[i18] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27052xb46cb2ec);
                i18++;
            }
        }
        if (length * 0.75d > i17) {
            strArr = i17 == 0 ? null : (java.lang.String[]) java.util.Arrays.copyOf(strArr2, i17);
        } else {
            strArr = strArr2;
        }
        m108783x74356f35(this.f57826xaf4e2c54, iArr, jArr, null, strArr);
        return this;
    }

    /* renamed from: groupBy */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108794x117d5b36(java.lang.Object... objArr) {
        java.lang.String[] strArr;
        if (objArr != null && objArr.length != 0) {
            int length = objArr.length;
            int[] iArr = new int[length];
            long[] jArr = new long[length];
            java.lang.String[] strArr2 = new java.lang.String[length];
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < length; i19++) {
                java.lang.Object obj = objArr[i19];
                if (obj instanceof java.lang.String) {
                    iArr[i19] = 6;
                    strArr2[i17] = (java.lang.String) obj;
                    i17++;
                } else if (obj instanceof com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad) {
                    com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad interfaceC27004x81a79aad = (com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27004x81a79aad) obj;
                    iArr[i19] = com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27004x81a79aad);
                    jArr[i18] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27004x81a79aad);
                    i18++;
                }
            }
            if (length * 0.75d > i17) {
                strArr = i17 == 0 ? null : (java.lang.String[]) java.util.Arrays.copyOf(strArr2, i17);
            } else {
                strArr = strArr2;
            }
            m108774xf74f4fb6(this.f57826xaf4e2c54, iArr, jArr, null, strArr);
        }
        return this;
    }

    /* renamed from: select */
    public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27047xc5bef32b m108808xc9ff34fc(java.lang.Object... objArr) {
        java.lang.String[] strArr;
        if (objArr.length == 0) {
            return this;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        long[] jArr = new long[length];
        java.lang.String[] strArr2 = new java.lang.String[length];
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < length; i19++) {
            java.lang.Object obj = objArr[i19];
            if (obj instanceof java.lang.String) {
                iArr[i19] = 6;
                strArr2[i17] = (java.lang.String) obj;
                i17++;
            } else if (obj instanceof com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27022x3ee6b492) {
                com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27022x3ee6b492 interfaceC27022x3ee6b492 = (com.p314xaae8f345.p3121x37984a.p3131x37b015.InterfaceC27022x3ee6b492) obj;
                iArr[i19] = com.p314xaae8f345.p3121x37984a.p3131x37b015.C27008x165a88c9.m108432x78473747(interfaceC27022x3ee6b492);
                jArr[i18] = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get(interfaceC27022x3ee6b492);
                i18++;
            }
        }
        if (length * 0.75d > i17) {
            strArr = i17 == 0 ? null : (java.lang.String[]) java.util.Arrays.copyOf(strArr2, i17);
        } else {
            strArr = strArr2;
        }
        m108782x3a9204de(this.f57826xaf4e2c54, iArr, jArr, null, strArr);
        return this;
    }
}
