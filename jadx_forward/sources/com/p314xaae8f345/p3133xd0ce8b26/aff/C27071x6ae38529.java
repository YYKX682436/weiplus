package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkBypassMsgItem */
/* loaded from: classes4.dex */
public class C27071x6ae38529 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 f58754xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529();

    /* renamed from: content */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f58755x38b73479;

    /* renamed from: createtime */
    private long f58756x51ab15c9;

    /* renamed from: from_username */
    private java.lang.String f58757xfd4da1cb;

    /* renamed from: hasSetFields */
    private final boolean[] f58758xcb94b041 = new boolean[9];

    /* renamed from: msg_session_id */
    private java.lang.String f58759xcb082e2;

    /* renamed from: msg_type */
    private int f58760xb3812938;

    /* renamed from: msgid */
    private long f58761x635d85c;
    private long seq;

    /* renamed from: to_username */
    private java.lang.String f58762x5907c61a;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 m109172xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 m109173x7c90cfc0() {
        return f58754xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 m109174x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 m109175x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 c27071x6ae38529 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f58761x635d85c), java.lang.Long.valueOf(c27071x6ae38529.f58761x635d85c)) && n51.f.a(this.f58757xfd4da1cb, c27071x6ae38529.f58757xfd4da1cb) && n51.f.a(this.f58762x5907c61a, c27071x6ae38529.f58762x5907c61a) && n51.f.a(java.lang.Integer.valueOf(this.f58760xb3812938), java.lang.Integer.valueOf(c27071x6ae38529.f58760xb3812938)) && n51.f.a(this.f58755x38b73479, c27071x6ae38529.f58755x38b73479) && n51.f.a(java.lang.Long.valueOf(this.f58756x51ab15c9), java.lang.Long.valueOf(c27071x6ae38529.f58756x51ab15c9)) && n51.f.a(java.lang.Long.valueOf(this.seq), java.lang.Long.valueOf(c27071x6ae38529.seq)) && n51.f.a(this.f58759xcb082e2, c27071x6ae38529.f58759xcb082e2);
    }

    /* renamed from: getContent */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m109176x76847043() {
        return this.f58758xcb94b041[5] ? this.f58755x38b73479 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getCreatetime */
    public long m109177x3febcdbf() {
        return this.f58756x51ab15c9;
    }

    /* renamed from: getFromUsername */
    public java.lang.String m109178xc0914d16() {
        return this.f58758xcb94b041[2] ? this.f58757xfd4da1cb : "";
    }

    /* renamed from: getMsgSessionId */
    public java.lang.String m109179x6f8b2a46() {
        return this.f58758xcb94b041[8] ? this.f58759xcb082e2 : "";
    }

    /* renamed from: getMsgType */
    public int m109180x8de53e25() {
        return this.f58760xb3812938;
    }

    /* renamed from: getMsgid */
    public long m109181x74d37ea6() {
        return this.f58761x635d85c;
    }

    /* renamed from: getSeq */
    public long m109182xb5886d29() {
        return this.seq;
    }

    /* renamed from: getToUsername */
    public java.lang.String m109183xdd380867() {
        return this.f58758xcb94b041[3] ? this.f58762x5907c61a : "";
    }

    /* renamed from: hasContent */
    public boolean m109184xb1daf87f() {
        return m109186x6e095e9(5);
    }

    /* renamed from: hasCreatetime */
    public boolean m109185x7ac38c03() {
        return m109186x6e095e9(6);
    }

    /* renamed from: hasFieldNumber */
    public boolean m109186x6e095e9(int i17) {
        return this.f58758xcb94b041[i17];
    }

    /* renamed from: hasFromUsername */
    public boolean m109187xa4728a5a() {
        return m109186x6e095e9(2);
    }

    /* renamed from: hasMsgSessionId */
    public boolean m109188x536c678a() {
        return m109186x6e095e9(8);
    }

    /* renamed from: hasMsgType */
    public boolean m109189xc93bc661() {
        return m109186x6e095e9(4);
    }

    /* renamed from: hasMsgid */
    public boolean m109190x766e5e2() {
        return m109186x6e095e9(1);
    }

    /* renamed from: hasSeq */
    public boolean m109191xb7047365() {
        return m109186x6e095e9(7);
    }

    /* renamed from: hasToUsername */
    public boolean m109192x180fc6ab() {
        return m109186x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 m109193x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f58758xcb94b041[1]) {
                fVar.h(1, this.f58761x635d85c);
            }
            java.lang.String str = this.f58757xfd4da1cb;
            if (str != null && this.f58758xcb94b041[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f58762x5907c61a;
            if (str2 != null && this.f58758xcb94b041[3]) {
                fVar.j(3, str2);
            }
            if (this.f58758xcb94b041[4]) {
                fVar.e(4, this.f58760xb3812938);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f58755x38b73479;
            if (gVar != null && this.f58758xcb94b041[5]) {
                fVar.b(5, gVar);
            }
            if (this.f58758xcb94b041[6]) {
                fVar.h(6, this.f58756x51ab15c9);
            }
            if (this.f58758xcb94b041[7]) {
                fVar.h(7, this.seq);
            }
            java.lang.String str3 = this.f58759xcb082e2;
            if (str3 != null && this.f58758xcb94b041[8]) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.f58758xcb94b041[1] ? 0 + b36.f.h(1, this.f58761x635d85c) : 0;
            java.lang.String str4 = this.f58757xfd4da1cb;
            if (str4 != null && this.f58758xcb94b041[2]) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f58762x5907c61a;
            if (str5 != null && this.f58758xcb94b041[3]) {
                h17 += b36.f.j(3, str5);
            }
            if (this.f58758xcb94b041[4]) {
                h17 += b36.f.e(4, this.f58760xb3812938);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f58755x38b73479;
            if (gVar2 != null && this.f58758xcb94b041[5]) {
                h17 += b36.f.b(5, gVar2);
            }
            if (this.f58758xcb94b041[6]) {
                h17 += b36.f.h(6, this.f58756x51ab15c9);
            }
            if (this.f58758xcb94b041[7]) {
                h17 += b36.f.h(7, this.seq);
            }
            java.lang.String str6 = this.f58759xcb082e2;
            return (str6 == null || !this.f58758xcb94b041[8]) ? h17 : h17 + b36.f.j(8, str6);
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
                this.f58761x635d85c = aVar2.i(intValue);
                this.f58758xcb94b041[1] = true;
                return 0;
            case 2:
                this.f58757xfd4da1cb = aVar2.k(intValue);
                this.f58758xcb94b041[2] = true;
                return 0;
            case 3:
                this.f58762x5907c61a = aVar2.k(intValue);
                this.f58758xcb94b041[3] = true;
                return 0;
            case 4:
                this.f58760xb3812938 = aVar2.g(intValue);
                this.f58758xcb94b041[4] = true;
                return 0;
            case 5:
                this.f58755x38b73479 = aVar2.d(intValue);
                this.f58758xcb94b041[5] = true;
                return 0;
            case 6:
                this.f58756x51ab15c9 = aVar2.i(intValue);
                this.f58758xcb94b041[6] = true;
                return 0;
            case 7:
                this.seq = aVar2.i(intValue);
                this.f58758xcb94b041[7] = true;
                return 0;
            case 8:
                this.f58759xcb082e2 = aVar2.k(intValue);
                this.f58758xcb94b041[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setContent */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 m109195xe9f5bdb7(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f58755x38b73479 = gVar;
        this.f58758xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setCreatetime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 m109196x6e101bcb(long j17) {
        this.f58756x51ab15c9 = j17;
        this.f58758xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setFromUsername */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 m109197xf6da4822(java.lang.String str) {
        this.f58757xfd4da1cb = str;
        this.f58758xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setMsgSessionId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 m109198xa5d42552(java.lang.String str) {
        this.f58759xcb082e2 = str;
        this.f58758xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setMsgType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 m109199x1568b99(int i17) {
        this.f58760xb3812938 = i17;
        this.f58758xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setMsgid */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 m109200x5361991a(long j17) {
        this.f58761x635d85c = j17;
        this.f58758xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setSeq */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 m109201xca02949d(long j17) {
        this.seq = j17;
        this.f58758xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setToUsername */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 m109202xb5c5673(java.lang.String str) {
        this.f58762x5907c61a = str;
        this.f58758xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 m109194x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529) super.mo11468x92b714fd(bArr);
    }
}
