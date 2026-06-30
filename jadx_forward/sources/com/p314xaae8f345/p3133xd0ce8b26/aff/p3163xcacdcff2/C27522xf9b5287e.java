package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.PStatusJumpInfo */
/* loaded from: classes8.dex */
public class C27522xf9b5287e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e f60461xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e();

    /* renamed from: jumpType */
    public java.lang.String f60464xf0c83088 = "";

    /* renamed from: busiId */
    public java.lang.String f60463xade184e4 = "";

    /* renamed from: busiBuf */
    public java.lang.String f60462xe4effca = "";

    /* renamed from: keyBusiBuf */
    public java.lang.String f60465x24a7e06b = "";

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e m117161xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e m117162x7c90cfc0() {
        return f60461xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e m117163x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e m117164x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e c27522xf9b5287e = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e) fVar;
        return n51.f.a(this.f60464xf0c83088, c27522xf9b5287e.f60464xf0c83088) && n51.f.a(this.f60463xade184e4, c27522xf9b5287e.f60463xade184e4) && n51.f.a(this.f60462xe4effca, c27522xf9b5287e.f60462xe4effca) && n51.f.a(this.f60465x24a7e06b, c27522xf9b5287e.f60465x24a7e06b);
    }

    /* renamed from: getBusiBuf */
    public java.lang.String m117165x4c1c3b94() {
        return this.f60462xe4effca;
    }

    /* renamed from: getBusiId */
    public java.lang.String m117166x12f8a7da() {
        return this.f60463xade184e4;
    }

    /* renamed from: getJumpType */
    public java.lang.String m117167x6ca26dfe() {
        return this.f60464xf0c83088;
    }

    /* renamed from: getKeyBusiBuf */
    public java.lang.String m117168x12e89861() {
        return this.f60465x24a7e06b;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e m117169x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f60464xf0c83088;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f60463xade184e4;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f60462xe4effca;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f60465x24a7e06b;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f60464xf0c83088;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f60463xade184e4;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f60462xe4effca;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f60465x24a7e06b;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f60464xf0c83088 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f60463xade184e4 = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f60462xe4effca = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f60465x24a7e06b = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setBusiBuf */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e m117171xbf8d8908(java.lang.String str) {
        this.f60462xe4effca = str;
        return this;
    }

    /* renamed from: setBusiId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e m117172x62ddbe6(java.lang.String str) {
        this.f60463xade184e4 = str;
        return this;
    }

    /* renamed from: setJumpType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e m117173x675acf0a(java.lang.String str) {
        this.f60464xf0c83088 = str;
        return this;
    }

    /* renamed from: setKeyBusiBuf */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e m117174x410ce66d(java.lang.String str) {
        this.f60465x24a7e06b = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e m117170x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27522xf9b5287e) super.mo11468x92b714fd(bArr);
    }
}
