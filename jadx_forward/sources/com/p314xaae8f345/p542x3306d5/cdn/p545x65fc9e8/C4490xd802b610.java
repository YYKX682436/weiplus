package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.FileStat */
/* loaded from: classes8.dex */
public class C4490xd802b610 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 f18692xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610();
    private int crc;

    /* renamed from: filetype */
    private int f18693xd43766b6;

    /* renamed from: hasSetFields */
    private final boolean[] f18694xcb94b041 = new boolean[6];

    /* renamed from: md5, reason: collision with root package name */
    private java.lang.String f134062md5;

    /* renamed from: mp4md5 */
    private java.lang.String f18695xc043cced;

    /* renamed from: size */
    private long f18696x35e001;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 m38907xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 m38908x7c90cfc0() {
        return f18692xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 m38909x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 m38910x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 c4490xd802b610 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f18693xd43766b6), java.lang.Integer.valueOf(c4490xd802b610.f18693xd43766b6)) && n51.f.a(java.lang.Long.valueOf(this.f18696x35e001), java.lang.Long.valueOf(c4490xd802b610.f18696x35e001)) && n51.f.a(this.f134062md5, c4490xd802b610.f134062md5) && n51.f.a(this.f18695xc043cced, c4490xd802b610.f18695xc043cced) && n51.f.a(java.lang.Integer.valueOf(this.crc), java.lang.Integer.valueOf(c4490xd802b610.crc));
    }

    /* renamed from: getCrc */
    public int m38911xb588329e() {
        return this.crc;
    }

    /* renamed from: getFiletype */
    public int m38912x5011a42c() {
        return this.f18693xd43766b6;
    }

    /* renamed from: getMd5 */
    public java.lang.String m38913xb5885648() {
        return this.f18694xcb94b041[3] ? this.f134062md5 : "";
    }

    /* renamed from: getMp4md5 */
    public java.lang.String m38914x255aefe3() {
        return this.f18694xcb94b041[4] ? this.f18695xc043cced : "";
    }

    /* renamed from: getSize */
    public long m38915xfb854877() {
        return this.f18696x35e001;
    }

    /* renamed from: hasCrc */
    public boolean m38916xb70438da() {
        return m38917x6e095e9(5);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38917x6e095e9(int i17) {
        return this.f18694xcb94b041[i17];
    }

    /* renamed from: hasFiletype */
    public boolean m38918x7f8c2370() {
        return m38917x6e095e9(1);
    }

    /* renamed from: hasMd5 */
    public boolean m38919xb7045c84() {
        return m38917x6e095e9(3);
    }

    /* renamed from: hasMp4md5 */
    public boolean m38920xe5347027() {
        return m38917x6e095e9(4);
    }

    /* renamed from: hasSize */
    public boolean m38921x298a09bb() {
        return m38917x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 m38922x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18694xcb94b041[1]) {
                fVar.e(1, this.f18693xd43766b6);
            }
            if (this.f18694xcb94b041[2]) {
                fVar.h(2, this.f18696x35e001);
            }
            java.lang.String str = this.f134062md5;
            if (str != null && this.f18694xcb94b041[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f18695xc043cced;
            if (str2 != null && this.f18694xcb94b041[4]) {
                fVar.j(4, str2);
            }
            if (this.f18694xcb94b041[5]) {
                fVar.e(5, this.crc);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18694xcb94b041[1] ? 0 + b36.f.e(1, this.f18693xd43766b6) : 0;
            if (this.f18694xcb94b041[2]) {
                e17 += b36.f.h(2, this.f18696x35e001);
            }
            java.lang.String str3 = this.f134062md5;
            if (str3 != null && this.f18694xcb94b041[3]) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f18695xc043cced;
            if (str4 != null && this.f18694xcb94b041[4]) {
                e17 += b36.f.j(4, str4);
            }
            return this.f18694xcb94b041[5] ? e17 + b36.f.e(5, this.crc) : e17;
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
            this.f18693xd43766b6 = aVar2.g(intValue);
            this.f18694xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18696x35e001 = aVar2.i(intValue);
            this.f18694xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f134062md5 = aVar2.k(intValue);
            this.f18694xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f18695xc043cced = aVar2.k(intValue);
            this.f18694xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.crc = aVar2.g(intValue);
        this.f18694xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setCrc */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 m38924xca025a12(int i17) {
        this.crc = i17;
        this.f18694xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setFiletype */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 m38925x4aca0538(int i17) {
        this.f18693xd43766b6 = i17;
        this.f18694xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setMd5 */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 m38926xca027dbc(java.lang.String str) {
        this.f134062md5 = str;
        this.f18694xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setMp4md5 */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 m38927x189023ef(java.lang.String str) {
        this.f18695xc043cced = str;
        this.f18694xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setSize */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 m38928x76500f83(long j17) {
        this.f18696x35e001 = j17;
        this.f18694xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 m38923x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4490xd802b610) super.mo11468x92b714fd(bArr);
    }
}
