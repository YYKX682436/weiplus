package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* loaded from: classes8.dex */
public class Url extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url f19154xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url();

    /* renamed from: backup_href */
    private java.lang.String f19155x42b88b88;

    /* renamed from: filetype */
    private int f19156xd43766b6;

    /* renamed from: hasSetFields */
    private final boolean[] f19157xcb94b041 = new boolean[5];

    /* renamed from: href */
    private java.lang.String f19158x30ff2b;

    /* renamed from: referer */
    private java.lang.String f19159x40acd92d;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url m39782xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url m39783x7c90cfc0() {
        return f19154xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url m39784x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url m39785x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url url = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url) fVar;
        return n51.f.a(this.f19158x30ff2b, url.f19158x30ff2b) && n51.f.a(this.f19159x40acd92d, url.f19159x40acd92d) && n51.f.a(this.f19155x42b88b88, url.f19155x42b88b88) && n51.f.a(java.lang.Integer.valueOf(this.f19156xd43766b6), java.lang.Integer.valueOf(url.f19156xd43766b6));
    }

    /* renamed from: getBackupHref */
    public java.lang.String m39786xb68ef003() {
        return this.f19157xcb94b041[3] ? this.f19155x42b88b88 : "";
    }

    /* renamed from: getFiletype */
    public int m39787x5011a42c() {
        return this.f19156xd43766b6;
    }

    /* renamed from: getHref */
    public java.lang.String m39788xfb8067a1() {
        return this.f19157xcb94b041[1] ? this.f19158x30ff2b : "";
    }

    /* renamed from: getReferer */
    public java.lang.String m39789x7e7a14f7() {
        return this.f19157xcb94b041[2] ? this.f19159x40acd92d : "";
    }

    /* renamed from: hasBackupHref */
    public boolean m39790xf166ae47() {
        return m39791x6e095e9(3);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39791x6e095e9(int i17) {
        return this.f19157xcb94b041[i17];
    }

    /* renamed from: hasFiletype */
    public boolean m39792x7f8c2370() {
        return m39791x6e095e9(4);
    }

    /* renamed from: hasHref */
    public boolean m39793x298528e5() {
        return m39791x6e095e9(1);
    }

    /* renamed from: hasReferer */
    public boolean m39794xb9d09d33() {
        return m39791x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url m39795x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f19158x30ff2b;
            if (str != null && this.f19157xcb94b041[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f19159x40acd92d;
            if (str2 != null && this.f19157xcb94b041[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f19155x42b88b88;
            if (str3 != null && this.f19157xcb94b041[3]) {
                fVar.j(3, str3);
            }
            if (this.f19157xcb94b041[4]) {
                fVar.e(4, this.f19156xd43766b6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f19158x30ff2b;
            if (str4 != null && this.f19157xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f19159x40acd92d;
            if (str5 != null && this.f19157xcb94b041[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f19155x42b88b88;
            if (str6 != null && this.f19157xcb94b041[3]) {
                i18 += b36.f.j(3, str6);
            }
            return this.f19157xcb94b041[4] ? i18 + b36.f.e(4, this.f19156xd43766b6) : i18;
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
            this.f19158x30ff2b = aVar2.k(intValue);
            this.f19157xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f19159x40acd92d = aVar2.k(intValue);
            this.f19157xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f19155x42b88b88 = aVar2.k(intValue);
            this.f19157xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f19156xd43766b6 = aVar2.g(intValue);
        this.f19157xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setBackupHref */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url m39797xe4b33e0f(java.lang.String str) {
        this.f19155x42b88b88 = str;
        this.f19157xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setFiletype */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url m39798x4aca0538(int i17) {
        this.f19156xd43766b6 = i17;
        this.f19157xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setHref */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url m39799x764b2ead(java.lang.String str) {
        this.f19158x30ff2b = str;
        this.f19157xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setReferer */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url m39800xf1eb626b(java.lang.String str) {
        this.f19159x40acd92d = str;
        this.f19157xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url m39796x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.Url) super.mo11468x92b714fd(bArr);
    }
}
