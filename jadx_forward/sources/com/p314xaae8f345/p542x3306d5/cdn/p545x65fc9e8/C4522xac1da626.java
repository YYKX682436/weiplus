package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.SnsOptions */
/* loaded from: classes4.dex */
public class C4522xac1da626 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 f19007xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626();

    /* renamed from: decrypt_key */
    private long f19008xe98c98ad;

    /* renamed from: hasSetFields */
    private final boolean[] f19009xcb94b041 = new boolean[5];

    /* renamed from: is_colddata */
    private boolean f19010xae13e003;

    /* renamed from: is_hotdata */
    private boolean f19011x9af07f62;

    /* renamed from: scene */
    private java.lang.String f19012x683188c;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 m39445xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 m39446x7c90cfc0() {
        return f19007xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 m39447x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 m39448x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 c4522xac1da626 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f19010xae13e003), java.lang.Boolean.valueOf(c4522xac1da626.f19010xae13e003)) && n51.f.a(java.lang.Boolean.valueOf(this.f19011x9af07f62), java.lang.Boolean.valueOf(c4522xac1da626.f19011x9af07f62)) && n51.f.a(this.f19012x683188c, c4522xac1da626.f19012x683188c) && n51.f.a(java.lang.Long.valueOf(this.f19008xe98c98ad), java.lang.Long.valueOf(c4522xac1da626.f19008xe98c98ad));
    }

    /* renamed from: getDecryptKey */
    public long m39449x6965fd88() {
        return this.f19008xe98c98ad;
    }

    /* renamed from: getIsColddata */
    public boolean m39450x98dbebce() {
        return this.f19010xae13e003;
    }

    /* renamed from: getIsHotdata */
    public boolean m39451x1e624e37() {
        return this.f19011x9af07f62;
    }

    /* renamed from: getScene */
    public java.lang.String m39452x7520bed6() {
        return this.f19009xcb94b041[3] ? this.f19012x683188c : "";
    }

    /* renamed from: hasDecryptKey */
    public boolean m39453xa43dbbcc() {
        return m39454x6e095e9(4);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39454x6e095e9(int i17) {
        return this.f19009xcb94b041[i17];
    }

    /* renamed from: hasIsColddata */
    public boolean m39455xd3b3aa12() {
        return m39454x6e095e9(1);
    }

    /* renamed from: hasIsHotdata */
    public boolean m39456xde37b773() {
        return m39454x6e095e9(2);
    }

    /* renamed from: hasScene */
    public boolean m39457x7b42612() {
        return m39454x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 m39458x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f19009xcb94b041[1]) {
                fVar.a(1, this.f19010xae13e003);
            }
            if (this.f19009xcb94b041[2]) {
                fVar.a(2, this.f19011x9af07f62);
            }
            java.lang.String str = this.f19012x683188c;
            if (str != null && this.f19009xcb94b041[3]) {
                fVar.j(3, str);
            }
            if (this.f19009xcb94b041[4]) {
                fVar.h(4, this.f19008xe98c98ad);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = this.f19009xcb94b041[1] ? 0 + b36.f.a(1, this.f19010xae13e003) : 0;
            if (this.f19009xcb94b041[2]) {
                a17 += b36.f.a(2, this.f19011x9af07f62);
            }
            java.lang.String str2 = this.f19012x683188c;
            if (str2 != null && this.f19009xcb94b041[3]) {
                a17 += b36.f.j(3, str2);
            }
            return this.f19009xcb94b041[4] ? a17 + b36.f.h(4, this.f19008xe98c98ad) : a17;
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
            this.f19010xae13e003 = aVar2.c(intValue);
            this.f19009xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f19011x9af07f62 = aVar2.c(intValue);
            this.f19009xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f19012x683188c = aVar2.k(intValue);
            this.f19009xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f19008xe98c98ad = aVar2.i(intValue);
        this.f19009xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setDecryptKey */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 m39460x978a4b94(long j17) {
        this.f19008xe98c98ad = j17;
        this.f19009xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setIsColddata */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 m39461xc70039da(boolean z17) {
        this.f19010xae13e003 = z17;
        this.f19009xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setIsHotdata */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 m39462x7ab60eab(boolean z17) {
        this.f19011x9af07f62 = z17;
        this.f19009xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setScene */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 m39463x53aed94a(java.lang.String str) {
        this.f19012x683188c = str;
        this.f19009xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 m39459x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4522xac1da626) super.mo11468x92b714fd(bArr);
    }
}
