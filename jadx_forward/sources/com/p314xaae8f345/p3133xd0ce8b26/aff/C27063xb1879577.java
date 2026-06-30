package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkAddMsgCmd */
/* loaded from: classes4.dex */
public class C27063xb1879577 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 f58693xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577();

    /* renamed from: Content */
    private java.lang.String f58694x9befcc59;

    /* renamed from: CreateTime */
    private long f58695xc86e6609;

    /* renamed from: FromUsername */
    private java.lang.String f58696x696a0ec0;
    private long Id;

    /* renamed from: MsgType */
    private int f58697xb3509a3b;

    /* renamed from: PushContent */
    private java.lang.String f58698x973073df;

    /* renamed from: RoomName */
    private java.lang.String f58699xf982ee26;
    private long Seq;

    /* renamed from: Status */
    private long f58700x9432bc12;

    /* renamed from: ToUsername */
    private java.lang.String f58701x65c92c91;

    /* renamed from: hasSetFields */
    private final boolean[] f58702xcb94b041 = new boolean[11];

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m108999xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m109000x7c90cfc0() {
        return f58693xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m109001x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m109002x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 c27063xb1879577 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.Id), java.lang.Long.valueOf(c27063xb1879577.Id)) && n51.f.a(this.f58696x696a0ec0, c27063xb1879577.f58696x696a0ec0) && n51.f.a(this.f58701x65c92c91, c27063xb1879577.f58701x65c92c91) && n51.f.a(this.f58699xf982ee26, c27063xb1879577.f58699xf982ee26) && n51.f.a(java.lang.Integer.valueOf(this.f58697xb3509a3b), java.lang.Integer.valueOf(c27063xb1879577.f58697xb3509a3b)) && n51.f.a(this.f58694x9befcc59, c27063xb1879577.f58694x9befcc59) && n51.f.a(this.f58698x973073df, c27063xb1879577.f58698x973073df) && n51.f.a(java.lang.Long.valueOf(this.Seq), java.lang.Long.valueOf(c27063xb1879577.Seq)) && n51.f.a(java.lang.Long.valueOf(this.f58695xc86e6609), java.lang.Long.valueOf(c27063xb1879577.f58695xc86e6609)) && n51.f.a(java.lang.Long.valueOf(this.f58700x9432bc12), java.lang.Long.valueOf(c27063xb1879577.f58700x9432bc12));
    }

    /* renamed from: getContent */
    public java.lang.String m109003x76847043() {
        return this.f58702xcb94b041[6] ? this.f58694x9befcc59 : "";
    }

    /* renamed from: getCreateTime */
    public long m109004x3fdd41df() {
        return this.f58695xc86e6609;
    }

    /* renamed from: getFromUsername */
    public java.lang.String m109005xc0914d16() {
        return this.f58702xcb94b041[2] ? this.f58696x696a0ec0 : "";
    }

    /* renamed from: getId */
    public long m109006x5db1b11() {
        return this.Id;
    }

    /* renamed from: getMsgType */
    public int m109007x8de53e25() {
        return this.f58697xb3509a3b;
    }

    /* renamed from: getPushContent */
    public java.lang.String m109008xd9d12c9() {
        return this.f58702xcb94b041[7] ? this.f58698x973073df : "";
    }

    /* renamed from: getRoomName */
    public java.lang.String m109009x7182c77c() {
        return this.f58702xcb94b041[4] ? this.f58699xf982ee26 : "";
    }

    /* renamed from: getSeq */
    public long m109010xb5886d29() {
        return this.Seq;
    }

    /* renamed from: getStatus */
    public long m109011x2fe4f2e8() {
        return this.f58700x9432bc12;
    }

    /* renamed from: getToUsername */
    public java.lang.String m109012xdd380867() {
        return this.f58702xcb94b041[3] ? this.f58701x65c92c91 : "";
    }

    /* renamed from: hasContent */
    public boolean m109013xb1daf87f() {
        return m109015x6e095e9(6);
    }

    /* renamed from: hasCreateTime */
    public boolean m109014x7ab50023() {
        return m109015x6e095e9(9);
    }

    /* renamed from: hasFieldNumber */
    public boolean m109015x6e095e9(int i17) {
        return this.f58702xcb94b041[i17];
    }

    /* renamed from: hasFromUsername */
    public boolean m109016xa4728a5a() {
        return m109015x6e095e9(2);
    }

    /* renamed from: hasId */
    public boolean m109017x5e75d55() {
        return m109015x6e095e9(1);
    }

    /* renamed from: hasMsgType */
    public boolean m109018xc93bc661() {
        return m109015x6e095e9(5);
    }

    /* renamed from: hasPushContent */
    public boolean m109019x2dbd1d05() {
        return m109015x6e095e9(7);
    }

    /* renamed from: hasRoomName */
    public boolean m109020xa0fd46c0() {
        return m109015x6e095e9(4);
    }

    /* renamed from: hasSeq */
    public boolean m109021xb7047365() {
        return m109015x6e095e9(8);
    }

    /* renamed from: hasStatus */
    public boolean m109022xefbe732c() {
        return m109015x6e095e9(10);
    }

    /* renamed from: hasToUsername */
    public boolean m109023x180fc6ab() {
        return m109015x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m109024x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f58702xcb94b041[1]) {
                fVar.h(1, this.Id);
            }
            java.lang.String str = this.f58696x696a0ec0;
            if (str != null && this.f58702xcb94b041[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f58701x65c92c91;
            if (str2 != null && this.f58702xcb94b041[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f58699xf982ee26;
            if (str3 != null && this.f58702xcb94b041[4]) {
                fVar.j(4, str3);
            }
            if (this.f58702xcb94b041[5]) {
                fVar.e(5, this.f58697xb3509a3b);
            }
            java.lang.String str4 = this.f58694x9befcc59;
            if (str4 != null && this.f58702xcb94b041[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f58698x973073df;
            if (str5 != null && this.f58702xcb94b041[7]) {
                fVar.j(7, str5);
            }
            if (this.f58702xcb94b041[8]) {
                fVar.h(8, this.Seq);
            }
            if (this.f58702xcb94b041[9]) {
                fVar.h(9, this.f58695xc86e6609);
            }
            if (this.f58702xcb94b041[10]) {
                fVar.h(10, this.f58700x9432bc12);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.f58702xcb94b041[1] ? 0 + b36.f.h(1, this.Id) : 0;
            java.lang.String str6 = this.f58696x696a0ec0;
            if (str6 != null && this.f58702xcb94b041[2]) {
                h17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f58701x65c92c91;
            if (str7 != null && this.f58702xcb94b041[3]) {
                h17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f58699xf982ee26;
            if (str8 != null && this.f58702xcb94b041[4]) {
                h17 += b36.f.j(4, str8);
            }
            if (this.f58702xcb94b041[5]) {
                h17 += b36.f.e(5, this.f58697xb3509a3b);
            }
            java.lang.String str9 = this.f58694x9befcc59;
            if (str9 != null && this.f58702xcb94b041[6]) {
                h17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f58698x973073df;
            if (str10 != null && this.f58702xcb94b041[7]) {
                h17 += b36.f.j(7, str10);
            }
            if (this.f58702xcb94b041[8]) {
                h17 += b36.f.h(8, this.Seq);
            }
            if (this.f58702xcb94b041[9]) {
                h17 += b36.f.h(9, this.f58695xc86e6609);
            }
            return this.f58702xcb94b041[10] ? h17 + b36.f.h(10, this.f58700x9432bc12) : h17;
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
                this.Id = aVar2.i(intValue);
                this.f58702xcb94b041[1] = true;
                return 0;
            case 2:
                this.f58696x696a0ec0 = aVar2.k(intValue);
                this.f58702xcb94b041[2] = true;
                return 0;
            case 3:
                this.f58701x65c92c91 = aVar2.k(intValue);
                this.f58702xcb94b041[3] = true;
                return 0;
            case 4:
                this.f58699xf982ee26 = aVar2.k(intValue);
                this.f58702xcb94b041[4] = true;
                return 0;
            case 5:
                this.f58697xb3509a3b = aVar2.g(intValue);
                this.f58702xcb94b041[5] = true;
                return 0;
            case 6:
                this.f58694x9befcc59 = aVar2.k(intValue);
                this.f58702xcb94b041[6] = true;
                return 0;
            case 7:
                this.f58698x973073df = aVar2.k(intValue);
                this.f58702xcb94b041[7] = true;
                return 0;
            case 8:
                this.Seq = aVar2.i(intValue);
                this.f58702xcb94b041[8] = true;
                return 0;
            case 9:
                this.f58695xc86e6609 = aVar2.i(intValue);
                this.f58702xcb94b041[9] = true;
                return 0;
            case 10:
                this.f58700x9432bc12 = aVar2.i(intValue);
                this.f58702xcb94b041[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setContent */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m109026xe9f5bdb7(java.lang.String str) {
        this.f58694x9befcc59 = str;
        this.f58702xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setCreateTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m109027x6e018feb(long j17) {
        this.f58695xc86e6609 = j17;
        this.f58702xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setFromUsername */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m109028xf6da4822(java.lang.String str) {
        this.f58696x696a0ec0 = str;
        this.f58702xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m109029x684351d(long j17) {
        this.Id = j17;
        this.f58702xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setMsgType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m109030x1568b99(int i17) {
        this.f58697xb3509a3b = i17;
        this.f58702xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setPushContent */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m109031xa402863d(java.lang.String str) {
        this.f58698x973073df = str;
        this.f58702xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setRoomName */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m109032x6c3b2888(java.lang.String str) {
        this.f58699xf982ee26 = str;
        this.f58702xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setSeq */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m109033xca02949d(long j17) {
        this.Seq = j17;
        this.f58702xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setStatus */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m109034x231a26f4(long j17) {
        this.f58700x9432bc12 = j17;
        this.f58702xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setToUsername */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m109035xb5c5673(java.lang.String str) {
        this.f58701x65c92c91 = str;
        this.f58702xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 m109025x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27063xb1879577) super.mo11468x92b714fd(bArr);
    }
}
