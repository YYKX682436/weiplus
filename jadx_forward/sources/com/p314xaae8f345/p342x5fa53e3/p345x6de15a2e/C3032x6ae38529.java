package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkBypassMsgItem */
/* loaded from: classes4.dex */
public class C3032x6ae38529 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 f10721xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529();

    /* renamed from: content */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10722x38b73479;

    /* renamed from: createtime */
    private long f10723x51ab15c9;

    /* renamed from: from_username */
    private java.lang.String f10724xfd4da1cb;

    /* renamed from: hasSetFields */
    private final boolean[] f10725xcb94b041 = new boolean[9];

    /* renamed from: msg_session_id */
    private java.lang.String f10726xcb082e2;

    /* renamed from: msg_type */
    private int f10727xb3812938;

    /* renamed from: msgid */
    private long f10728x635d85c;
    private long seq;

    /* renamed from: to_username */
    private java.lang.String f10729x5907c61a;

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 m23372xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 m23373x7c90cfc0() {
        return f10721xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 m23374x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 m23375x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 c3032x6ae38529 = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f10728x635d85c), java.lang.Long.valueOf(c3032x6ae38529.f10728x635d85c)) && n51.f.a(this.f10724xfd4da1cb, c3032x6ae38529.f10724xfd4da1cb) && n51.f.a(this.f10729x5907c61a, c3032x6ae38529.f10729x5907c61a) && n51.f.a(java.lang.Integer.valueOf(this.f10727xb3812938), java.lang.Integer.valueOf(c3032x6ae38529.f10727xb3812938)) && n51.f.a(this.f10722x38b73479, c3032x6ae38529.f10722x38b73479) && n51.f.a(java.lang.Long.valueOf(this.f10723x51ab15c9), java.lang.Long.valueOf(c3032x6ae38529.f10723x51ab15c9)) && n51.f.a(java.lang.Long.valueOf(this.seq), java.lang.Long.valueOf(c3032x6ae38529.seq)) && n51.f.a(this.f10726xcb082e2, c3032x6ae38529.f10726xcb082e2);
    }

    /* renamed from: getContent */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m23376x76847043() {
        return this.f10725xcb94b041[5] ? this.f10722x38b73479 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getCreatetime */
    public long m23377x3febcdbf() {
        return this.f10723x51ab15c9;
    }

    /* renamed from: getFromUsername */
    public java.lang.String m23378xc0914d16() {
        return this.f10725xcb94b041[2] ? this.f10724xfd4da1cb : "";
    }

    /* renamed from: getMsgSessionId */
    public java.lang.String m23379x6f8b2a46() {
        return this.f10725xcb94b041[8] ? this.f10726xcb082e2 : "";
    }

    /* renamed from: getMsgType */
    public int m23380x8de53e25() {
        return this.f10727xb3812938;
    }

    /* renamed from: getMsgid */
    public long m23381x74d37ea6() {
        return this.f10728x635d85c;
    }

    /* renamed from: getSeq */
    public long m23382xb5886d29() {
        return this.seq;
    }

    /* renamed from: getToUsername */
    public java.lang.String m23383xdd380867() {
        return this.f10725xcb94b041[3] ? this.f10729x5907c61a : "";
    }

    /* renamed from: hasContent */
    public boolean m23384xb1daf87f() {
        return m23386x6e095e9(5);
    }

    /* renamed from: hasCreatetime */
    public boolean m23385x7ac38c03() {
        return m23386x6e095e9(6);
    }

    /* renamed from: hasFieldNumber */
    public boolean m23386x6e095e9(int i17) {
        return this.f10725xcb94b041[i17];
    }

    /* renamed from: hasFromUsername */
    public boolean m23387xa4728a5a() {
        return m23386x6e095e9(2);
    }

    /* renamed from: hasMsgSessionId */
    public boolean m23388x536c678a() {
        return m23386x6e095e9(8);
    }

    /* renamed from: hasMsgType */
    public boolean m23389xc93bc661() {
        return m23386x6e095e9(4);
    }

    /* renamed from: hasMsgid */
    public boolean m23390x766e5e2() {
        return m23386x6e095e9(1);
    }

    /* renamed from: hasSeq */
    public boolean m23391xb7047365() {
        return m23386x6e095e9(7);
    }

    /* renamed from: hasToUsername */
    public boolean m23392x180fc6ab() {
        return m23386x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 m23393x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f10725xcb94b041[1]) {
                fVar.h(1, this.f10728x635d85c);
            }
            java.lang.String str = this.f10724xfd4da1cb;
            if (str != null && this.f10725xcb94b041[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f10729x5907c61a;
            if (str2 != null && this.f10725xcb94b041[3]) {
                fVar.j(3, str2);
            }
            if (this.f10725xcb94b041[4]) {
                fVar.e(4, this.f10727xb3812938);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10722x38b73479;
            if (gVar != null && this.f10725xcb94b041[5]) {
                fVar.b(5, gVar);
            }
            if (this.f10725xcb94b041[6]) {
                fVar.h(6, this.f10723x51ab15c9);
            }
            if (this.f10725xcb94b041[7]) {
                fVar.h(7, this.seq);
            }
            java.lang.String str3 = this.f10726xcb082e2;
            if (str3 != null && this.f10725xcb94b041[8]) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.f10725xcb94b041[1] ? 0 + b36.f.h(1, this.f10728x635d85c) : 0;
            java.lang.String str4 = this.f10724xfd4da1cb;
            if (str4 != null && this.f10725xcb94b041[2]) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f10729x5907c61a;
            if (str5 != null && this.f10725xcb94b041[3]) {
                h17 += b36.f.j(3, str5);
            }
            if (this.f10725xcb94b041[4]) {
                h17 += b36.f.e(4, this.f10727xb3812938);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10722x38b73479;
            if (gVar2 != null && this.f10725xcb94b041[5]) {
                h17 += b36.f.b(5, gVar2);
            }
            if (this.f10725xcb94b041[6]) {
                h17 += b36.f.h(6, this.f10723x51ab15c9);
            }
            if (this.f10725xcb94b041[7]) {
                h17 += b36.f.h(7, this.seq);
            }
            java.lang.String str6 = this.f10726xcb082e2;
            return (str6 == null || !this.f10725xcb94b041[8]) ? h17 : h17 + b36.f.j(8, str6);
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
        switch (intValue) {
            case 1:
                this.f10728x635d85c = aVar2.i(intValue);
                this.f10725xcb94b041[1] = true;
                return 0;
            case 2:
                this.f10724xfd4da1cb = aVar2.k(intValue);
                this.f10725xcb94b041[2] = true;
                return 0;
            case 3:
                this.f10729x5907c61a = aVar2.k(intValue);
                this.f10725xcb94b041[3] = true;
                return 0;
            case 4:
                this.f10727xb3812938 = aVar2.g(intValue);
                this.f10725xcb94b041[4] = true;
                return 0;
            case 5:
                this.f10722x38b73479 = aVar2.d(intValue);
                this.f10725xcb94b041[5] = true;
                return 0;
            case 6:
                this.f10723x51ab15c9 = aVar2.i(intValue);
                this.f10725xcb94b041[6] = true;
                return 0;
            case 7:
                this.seq = aVar2.i(intValue);
                this.f10725xcb94b041[7] = true;
                return 0;
            case 8:
                this.f10726xcb082e2 = aVar2.k(intValue);
                this.f10725xcb94b041[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setContent */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 m23395xe9f5bdb7(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10722x38b73479 = gVar;
        this.f10725xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setCreatetime */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 m23396x6e101bcb(long j17) {
        this.f10723x51ab15c9 = j17;
        this.f10725xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setFromUsername */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 m23397xf6da4822(java.lang.String str) {
        this.f10724xfd4da1cb = str;
        this.f10725xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setMsgSessionId */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 m23398xa5d42552(java.lang.String str) {
        this.f10726xcb082e2 = str;
        this.f10725xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setMsgType */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 m23399x1568b99(int i17) {
        this.f10727xb3812938 = i17;
        this.f10725xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setMsgid */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 m23400x5361991a(long j17) {
        this.f10728x635d85c = j17;
        this.f10725xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setSeq */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 m23401xca02949d(long j17) {
        this.seq = j17;
        this.f10725xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setToUsername */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 m23402xb5c5673(java.lang.String str) {
        this.f10729x5907c61a = str;
        this.f10725xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 m23394x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3032x6ae38529) super.mo11468x92b714fd(bArr);
    }
}
