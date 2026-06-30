package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.FtnUploadOptions */
/* loaded from: classes8.dex */
public class C4496x98cb1ffd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd f18829xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd();

    /* renamed from: hasSetFields */
    private final boolean[] f18830xcb94b041 = new boolean[3];

    /* renamed from: host */
    private java.lang.String f18831x30f5a8;

    /* renamed from: port */
    private int f18832x349881;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd m39010xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd m39011x7c90cfc0() {
        return f18829xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd m39012x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd m39013x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd c4496x98cb1ffd = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd) fVar;
        return n51.f.a(this.f18831x30f5a8, c4496x98cb1ffd.f18831x30f5a8) && n51.f.a(java.lang.Integer.valueOf(this.f18832x349881), java.lang.Integer.valueOf(c4496x98cb1ffd.f18832x349881));
    }

    /* renamed from: getHost */
    public java.lang.String m39014xfb805e1e() {
        return this.f18830xcb94b041[1] ? this.f18831x30f5a8 : "";
    }

    /* renamed from: getPort */
    public int m39015xfb8400f7() {
        return this.f18832x349881;
    }

    /* renamed from: hasFieldNumber */
    public boolean m39016x6e095e9(int i17) {
        return this.f18830xcb94b041[i17];
    }

    /* renamed from: hasHost */
    public boolean m39017x29851f62() {
        return m39016x6e095e9(1);
    }

    /* renamed from: hasPort */
    public boolean m39018x2988c23b() {
        return m39016x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd m39019x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f18831x30f5a8;
            if (str != null && this.f18830xcb94b041[1]) {
                fVar.j(1, str);
            }
            if (this.f18830xcb94b041[2]) {
                fVar.e(2, this.f18832x349881);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f18831x30f5a8;
            if (str2 != null && this.f18830xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            return this.f18830xcb94b041[2] ? i18 + b36.f.e(2, this.f18832x349881) : i18;
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
            this.f18831x30f5a8 = aVar2.k(intValue);
            this.f18830xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f18832x349881 = aVar2.g(intValue);
        this.f18830xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setHost */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd m39021x764b252a(java.lang.String str) {
        this.f18831x30f5a8 = str;
        this.f18830xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setPort */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd m39022x764ec803(int i17) {
        this.f18832x349881 = i17;
        this.f18830xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd m39020x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4496x98cb1ffd) super.mo11468x92b714fd(bArr);
    }
}
