package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.TransforProfile */
/* loaded from: classes8.dex */
public class C4530xd375c928 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 f19065xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928();

    /* renamed from: cellular_recv_bytes */
    private long f19066x2dbf4ec7;

    /* renamed from: cellular_send_bytes */
    private long f19067xe08582e9;

    /* renamed from: hasSetFields */
    private final boolean[] f19068xcb94b041 = new boolean[12];

    /* renamed from: json_profile */
    private java.lang.String f19069x2da8b552;

    /* renamed from: previous_completed_size */
    private long f19070x981f5fbd;

    /* renamed from: protocol */
    private int f19071xc50a8e98;

    /* renamed from: protocol_error */
    private int f19072x1afc71a1;

    /* renamed from: recved_bytes */
    private long f19073x48c810b1;

    /* renamed from: sent_bytes */
    private long f19074x7ecbe104;

    /* renamed from: seq_check */
    private int f19075x97f50128;

    /* renamed from: wifi_recv_bytes */
    private long f19076x5787d03c;

    /* renamed from: wifi_send_bytes */
    private long f19077xa4e045e;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39612xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39613x7c90cfc0() {
        return f19065xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39614x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39615x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 c4530xd375c928 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f19071xc50a8e98), java.lang.Integer.valueOf(c4530xd375c928.f19071xc50a8e98)) && n51.f.a(java.lang.Integer.valueOf(this.f19072x1afc71a1), java.lang.Integer.valueOf(c4530xd375c928.f19072x1afc71a1)) && n51.f.a(java.lang.Long.valueOf(this.f19070x981f5fbd), java.lang.Long.valueOf(c4530xd375c928.f19070x981f5fbd)) && n51.f.a(java.lang.Long.valueOf(this.f19073x48c810b1), java.lang.Long.valueOf(c4530xd375c928.f19073x48c810b1)) && n51.f.a(java.lang.Long.valueOf(this.f19074x7ecbe104), java.lang.Long.valueOf(c4530xd375c928.f19074x7ecbe104)) && n51.f.a(java.lang.Integer.valueOf(this.f19075x97f50128), java.lang.Integer.valueOf(c4530xd375c928.f19075x97f50128)) && n51.f.a(this.f19069x2da8b552, c4530xd375c928.f19069x2da8b552) && n51.f.a(java.lang.Long.valueOf(this.f19076x5787d03c), java.lang.Long.valueOf(c4530xd375c928.f19076x5787d03c)) && n51.f.a(java.lang.Long.valueOf(this.f19077xa4e045e), java.lang.Long.valueOf(c4530xd375c928.f19077xa4e045e)) && n51.f.a(java.lang.Long.valueOf(this.f19066x2dbf4ec7), java.lang.Long.valueOf(c4530xd375c928.f19066x2dbf4ec7)) && n51.f.a(java.lang.Long.valueOf(this.f19067xe08582e9), java.lang.Long.valueOf(c4530xd375c928.f19067xe08582e9));
    }

    /* renamed from: getCellularRecvBytes */
    public long m39616xe5c57b25() {
        return this.f19066x2dbf4ec7;
    }

    /* renamed from: getCellularSendBytes */
    public long m39617xa1373ac3() {
        return this.f19067xe08582e9;
    }

    /* renamed from: getJsonProfile */
    public java.lang.String m39618x7abaa66b() {
        return this.f19068xcb94b041[7] ? this.f19069x2da8b552 : "";
    }

    /* renamed from: getPreviousCompletedSize */
    public long m39619x1ad13d7f() {
        return this.f19070x981f5fbd;
    }

    /* renamed from: getProtocol */
    public int m39620x40e4cc0e() {
        return this.f19071xc50a8e98;
    }

    /* renamed from: getProtocolError */
    public int m39621xe6206e9a() {
        return this.f19072x1afc71a1;
    }

    /* renamed from: getRecvedBytes */
    public long m39622x4e3ded30() {
        return this.f19073x48c810b1;
    }

    /* renamed from: getSentBytes */
    public long m39623x1abc70fd() {
        return this.f19074x7ecbe104;
    }

    /* renamed from: getSeqCheck */
    public int m39624xc98b595f() {
        return this.f19075x97f50128;
    }

    /* renamed from: getWifiRecvBytes */
    public long m39625x5650ada() {
        return this.f19076x5787d03c;
    }

    /* renamed from: getWifiSendBytes */
    public long m39626xc0d6ca78() {
        return this.f19077xa4e045e;
    }

    /* renamed from: hasCellularRecvBytes */
    public boolean m39627xd22be861() {
        return m39629x6e095e9(10);
    }

    /* renamed from: hasCellularSendBytes */
    public boolean m39628x8d9da7ff() {
        return m39629x6e095e9(11);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39629x6e095e9(int i17) {
        return this.f19068xcb94b041[i17];
    }

    /* renamed from: hasJsonProfile */
    public boolean m39630x9adab0a7() {
        return m39629x6e095e9(7);
    }

    /* renamed from: hasPreviousCompletedSize */
    public boolean m39631x6786acbb() {
        return m39629x6e095e9(3);
    }

    /* renamed from: hasProtocol */
    public boolean m39632x705f4b52() {
        return m39629x6e095e9(1);
    }

    /* renamed from: hasProtocolError */
    public boolean m39633x7e66d9d6() {
        return m39629x6e095e9(2);
    }

    /* renamed from: hasRecvedBytes */
    public boolean m39634x6e5df76c() {
        return m39629x6e095e9(4);
    }

    /* renamed from: hasSentBytes */
    public boolean m39635xda91da39() {
        return m39629x6e095e9(5);
    }

    /* renamed from: hasSeqCheck */
    public boolean m39636xf905d8a3() {
        return m39629x6e095e9(6);
    }

    /* renamed from: hasWifiRecvBytes */
    public boolean m39637x9dab7616() {
        return m39629x6e095e9(8);
    }

    /* renamed from: hasWifiSendBytes */
    public boolean m39638x591d35b4() {
        return m39629x6e095e9(9);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39639x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f19068xcb94b041[1]) {
                fVar.e(1, this.f19071xc50a8e98);
            }
            if (this.f19068xcb94b041[2]) {
                fVar.e(2, this.f19072x1afc71a1);
            }
            if (this.f19068xcb94b041[3]) {
                fVar.h(3, this.f19070x981f5fbd);
            }
            if (this.f19068xcb94b041[4]) {
                fVar.h(4, this.f19073x48c810b1);
            }
            if (this.f19068xcb94b041[5]) {
                fVar.h(5, this.f19074x7ecbe104);
            }
            if (this.f19068xcb94b041[6]) {
                fVar.e(6, this.f19075x97f50128);
            }
            java.lang.String str = this.f19069x2da8b552;
            if (str != null && this.f19068xcb94b041[7]) {
                fVar.j(7, str);
            }
            if (this.f19068xcb94b041[8]) {
                fVar.h(8, this.f19076x5787d03c);
            }
            if (this.f19068xcb94b041[9]) {
                fVar.h(9, this.f19077xa4e045e);
            }
            if (this.f19068xcb94b041[10]) {
                fVar.h(10, this.f19066x2dbf4ec7);
            }
            if (this.f19068xcb94b041[11]) {
                fVar.h(11, this.f19067xe08582e9);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f19068xcb94b041[1] ? 0 + b36.f.e(1, this.f19071xc50a8e98) : 0;
            if (this.f19068xcb94b041[2]) {
                e17 += b36.f.e(2, this.f19072x1afc71a1);
            }
            if (this.f19068xcb94b041[3]) {
                e17 += b36.f.h(3, this.f19070x981f5fbd);
            }
            if (this.f19068xcb94b041[4]) {
                e17 += b36.f.h(4, this.f19073x48c810b1);
            }
            if (this.f19068xcb94b041[5]) {
                e17 += b36.f.h(5, this.f19074x7ecbe104);
            }
            if (this.f19068xcb94b041[6]) {
                e17 += b36.f.e(6, this.f19075x97f50128);
            }
            java.lang.String str2 = this.f19069x2da8b552;
            if (str2 != null && this.f19068xcb94b041[7]) {
                e17 += b36.f.j(7, str2);
            }
            if (this.f19068xcb94b041[8]) {
                e17 += b36.f.h(8, this.f19076x5787d03c);
            }
            if (this.f19068xcb94b041[9]) {
                e17 += b36.f.h(9, this.f19077xa4e045e);
            }
            if (this.f19068xcb94b041[10]) {
                e17 += b36.f.h(10, this.f19066x2dbf4ec7);
            }
            return this.f19068xcb94b041[11] ? e17 + b36.f.h(11, this.f19067xe08582e9) : e17;
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
                this.f19071xc50a8e98 = aVar2.g(intValue);
                this.f19068xcb94b041[1] = true;
                return 0;
            case 2:
                this.f19072x1afc71a1 = aVar2.g(intValue);
                this.f19068xcb94b041[2] = true;
                return 0;
            case 3:
                this.f19070x981f5fbd = aVar2.i(intValue);
                this.f19068xcb94b041[3] = true;
                return 0;
            case 4:
                this.f19073x48c810b1 = aVar2.i(intValue);
                this.f19068xcb94b041[4] = true;
                return 0;
            case 5:
                this.f19074x7ecbe104 = aVar2.i(intValue);
                this.f19068xcb94b041[5] = true;
                return 0;
            case 6:
                this.f19075x97f50128 = aVar2.g(intValue);
                this.f19068xcb94b041[6] = true;
                return 0;
            case 7:
                this.f19069x2da8b552 = aVar2.k(intValue);
                this.f19068xcb94b041[7] = true;
                return 0;
            case 8:
                this.f19076x5787d03c = aVar2.i(intValue);
                this.f19068xcb94b041[8] = true;
                return 0;
            case 9:
                this.f19077xa4e045e = aVar2.i(intValue);
                this.f19068xcb94b041[9] = true;
                return 0;
            case 10:
                this.f19066x2dbf4ec7 = aVar2.i(intValue);
                this.f19068xcb94b041[10] = true;
                return 0;
            case 11:
                this.f19067xe08582e9 = aVar2.i(intValue);
                this.f19068xcb94b041[11] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setCellularRecvBytes */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39641xc15b8799(long j17) {
        this.f19066x2dbf4ec7 = j17;
        this.f19068xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setCellularSendBytes */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39642x7ccd4737(long j17) {
        this.f19067xe08582e9 = j17;
        this.f19068xcb94b041[11] = true;
        return this;
    }

    /* renamed from: setJsonProfile */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39643x112019df(java.lang.String str) {
        this.f19069x2da8b552 = str;
        this.f19068xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setPreviousCompletedSize */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39644xeae3eff3(long j17) {
        this.f19070x981f5fbd = j17;
        this.f19068xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setProtocol */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39645x3b9d2d1a(int i17) {
        this.f19071xc50a8e98 = i17;
        this.f19068xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setProtocolError */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39646x78f6d50e(int i17) {
        this.f19072x1afc71a1 = i17;
        this.f19068xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setRecvedBytes */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39647xe4a360a4(long j17) {
        this.f19073x48c810b1 = j17;
        this.f19068xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setSentBytes */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39648x77103171(long j17) {
        this.f19074x7ecbe104 = j17;
        this.f19068xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setSeqCheck */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39649xc443ba6b(int i17) {
        this.f19075x97f50128 = i17;
        this.f19068xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setWifiRecvBytes */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39650x983b714e(long j17) {
        this.f19076x5787d03c = j17;
        this.f19068xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setWifiSendBytes */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39651x53ad30ec(long j17) {
        this.f19077xa4e045e = j17;
        this.f19068xcb94b041[9] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 m39640x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4530xd375c928) super.mo11468x92b714fd(bArr);
    }
}
