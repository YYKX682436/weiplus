package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.Chatting */
/* loaded from: classes8.dex */
public class C4471x5995de66 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 f18541xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66();

    /* renamed from: chat_type */
    private int f18542x60910bc1;

    /* renamed from: hasSetFields */
    private final boolean[] f18543xcb94b041 = new boolean[3];

    /* renamed from: participant_count */
    private int f18544x4ef03103;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 m38461xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 m38462x7c90cfc0() {
        return f18541xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 m38463x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 m38464x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 c4471x5995de66 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f18542x60910bc1), java.lang.Integer.valueOf(c4471x5995de66.f18542x60910bc1)) && n51.f.a(java.lang.Integer.valueOf(this.f18544x4ef03103), java.lang.Integer.valueOf(c4471x5995de66.f18544x4ef03103));
    }

    /* renamed from: getChatType */
    public int m38465xd1876828() {
        return this.f18542x60910bc1;
    }

    /* renamed from: getParticipantCount */
    public int m38466xb9636112() {
        return this.f18544x4ef03103;
    }

    /* renamed from: hasChatType */
    public boolean m38467x101e76c() {
        return m38468x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38468x6e095e9(int i17) {
        return this.f18543xcb94b041[i17];
    }

    /* renamed from: hasParticipantCount */
    public boolean m38469x241c5c56() {
        return m38468x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 m38470x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18543xcb94b041[1]) {
                fVar.e(1, this.f18542x60910bc1);
            }
            if (this.f18543xcb94b041[2]) {
                fVar.e(2, this.f18544x4ef03103);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18543xcb94b041[1] ? 0 + b36.f.e(1, this.f18542x60910bc1) : 0;
            return this.f18543xcb94b041[2] ? e17 + b36.f.e(2, this.f18544x4ef03103) : e17;
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
            this.f18542x60910bc1 = aVar2.g(intValue);
            this.f18543xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f18544x4ef03103 = aVar2.g(intValue);
        this.f18543xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setChatType */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 m38472xcc3fc934(int i17) {
        this.f18542x60910bc1 = i17;
        this.f18543xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setParticipantCount */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 m38473x5d5ff61e(int i17) {
        this.f18544x4ef03103 = i17;
        this.f18543xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 m38471x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66) super.mo11468x92b714fd(bArr);
    }
}
