package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.SnsResult */
/* loaded from: classes8.dex */
public class C4523xa109795 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 f19013xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795();

    /* renamed from: emoji_md5 */
    private java.lang.String f19014x6489c205;

    /* renamed from: hasSetFields */
    private final boolean[] f19015xcb94b041 = new boolean[3];
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 url;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 m39465xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 m39466x7c90cfc0() {
        return f19013xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 m39467x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 m39468x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 c4523xa109795 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795) fVar;
        return n51.f.a(this.url, c4523xa109795.url) && n51.f.a(this.f19014x6489c205, c4523xa109795.f19014x6489c205);
    }

    /* renamed from: getEmojiMd5 */
    public java.lang.String m39469xc128bcce() {
        return this.f19015xcb94b041[2] ? this.f19014x6489c205 : "";
    }

    /* renamed from: getUrl */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 m39470xb5887639() {
        return this.f19015xcb94b041[1] ? this.url : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33.m38936xaf65a0fc();
    }

    /* renamed from: hasEmojiMd5 */
    public boolean m39471xf0a33c12() {
        return m39472x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39472x6e095e9(int i17) {
        return this.f19015xcb94b041[i17];
    }

    /* renamed from: hasUrl */
    public boolean m39473xb7047c75() {
        return m39472x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 m39474x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 c4492x30422e33 = this.url;
            if (c4492x30422e33 != null && this.f19015xcb94b041[1]) {
                fVar.i(1, c4492x30422e33.mo75928xcd1e8d8());
                this.url.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f19014x6489c205;
            if (str != null && this.f19015xcb94b041[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 c4492x30422e332 = this.url;
            if (c4492x30422e332 != null && this.f19015xcb94b041[1]) {
                i18 = 0 + b36.f.i(1, c4492x30422e332.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f19014x6489c205;
            return (str2 == null || !this.f19015xcb94b041[2]) ? i18 : i18 + b36.f.j(2, str2);
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
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            this.f19014x6489c205 = aVar2.k(intValue);
            this.f19015xcb94b041[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 c4492x30422e333 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33();
            if (bArr != null && bArr.length > 0) {
                c4492x30422e333.mo11468x92b714fd(bArr);
            }
            this.url = c4492x30422e333;
        }
        this.f19015xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setEmojiMd5 */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 m39476xbbe11dda(java.lang.String str) {
        this.f19014x6489c205 = str;
        this.f19015xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setUrl */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 m39477xca029dad(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4492x30422e33 c4492x30422e33) {
        this.url = c4492x30422e33;
        this.f19015xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 m39475x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4523xa109795) super.mo11468x92b714fd(bArr);
    }
}
