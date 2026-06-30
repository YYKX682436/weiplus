package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.GetStatusReadListResponse */
/* loaded from: classes2.dex */
public class C27512xba466e9d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d f60361xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d();

    /* renamed from: error_code */
    private int f60362x617e99c4;

    /* renamed from: error_msg */
    private java.lang.String f60363x13a964ca;

    /* renamed from: from_cache */
    private boolean f60364x942342ad;

    /* renamed from: result */
    private boolean f60367xc84dc81d;

    /* renamed from: read_users */
    private java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4> f60366xf6b8421f = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f60365xcb94b041 = new boolean[6];

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d m116852xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d m116853x7c90cfc0() {
        return f60361xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d m116854x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d();
    }

    /* renamed from: addAllElementReadUsers */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d m116855xd5706bd6(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4> collection) {
        this.f60366xf6b8421f.addAll(collection);
        this.f60365xcb94b041[4] = true;
        return this;
    }

    /* renamed from: addElementReadUsers */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d m116856x813b4937(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4 c27544x21b1b2e4) {
        this.f60366xf6b8421f.add(c27544x21b1b2e4);
        this.f60365xcb94b041[4] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d m116857x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d c27512xba466e9d = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f60367xc84dc81d), java.lang.Boolean.valueOf(c27512xba466e9d.f60367xc84dc81d)) && n51.f.a(java.lang.Integer.valueOf(this.f60362x617e99c4), java.lang.Integer.valueOf(c27512xba466e9d.f60362x617e99c4)) && n51.f.a(this.f60363x13a964ca, c27512xba466e9d.f60363x13a964ca) && n51.f.a(this.f60366xf6b8421f, c27512xba466e9d.f60366xf6b8421f) && n51.f.a(java.lang.Boolean.valueOf(this.f60364x942342ad), java.lang.Boolean.valueOf(c27512xba466e9d.f60364x942342ad));
    }

    /* renamed from: getErrorCode */
    public int m116858x130a215f() {
        return this.f60362x617e99c4;
    }

    /* renamed from: getErrorMsg */
    public java.lang.String m116859xcf10fdcf() {
        return this.f60365xcb94b041[3] ? this.f60363x13a964ca : "";
    }

    /* renamed from: getFromCache */
    public boolean m116860x2a95342() {
        return this.f60364x942342ad;
    }

    /* renamed from: getReadUsers */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4> m116861xbc82435c() {
        return this.f60366xf6b8421f;
    }

    /* renamed from: getResult */
    public boolean m116862x2d64eb13() {
        return this.f60367xc84dc81d;
    }

    /* renamed from: hasErrorCode */
    public boolean m116863xd2df8a9b() {
        return m116865x6e095e9(2);
    }

    /* renamed from: hasErrorMsg */
    public boolean m116864xfe8b7d13() {
        return m116865x6e095e9(3);
    }

    /* renamed from: hasFieldNumber */
    public boolean m116865x6e095e9(int i17) {
        return this.f60365xcb94b041[i17];
    }

    /* renamed from: hasFromCache */
    public boolean m116866xc27ebc7e() {
        return m116865x6e095e9(5);
    }

    /* renamed from: hasReadUsers */
    public boolean m116867x7c57ac98() {
        return m116865x6e095e9(4);
    }

    /* renamed from: hasResult */
    public boolean m116868xed3e6b57() {
        return m116865x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d m116869x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f60365xcb94b041[1]) {
                fVar.a(1, this.f60367xc84dc81d);
            }
            if (this.f60365xcb94b041[2]) {
                fVar.e(2, this.f60362x617e99c4);
            }
            java.lang.String str = this.f60363x13a964ca;
            if (str != null && this.f60365xcb94b041[3]) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, this.f60366xf6b8421f);
            if (this.f60365xcb94b041[5]) {
                fVar.a(5, this.f60364x942342ad);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = this.f60365xcb94b041[1] ? 0 + b36.f.a(1, this.f60367xc84dc81d) : 0;
            if (this.f60365xcb94b041[2]) {
                a17 += b36.f.e(2, this.f60362x617e99c4);
            }
            java.lang.String str2 = this.f60363x13a964ca;
            if (str2 != null && this.f60365xcb94b041[3]) {
                a17 += b36.f.j(3, str2);
            }
            int g17 = a17 + b36.f.g(4, 8, this.f60366xf6b8421f);
            return this.f60365xcb94b041[5] ? g17 + b36.f.a(5, this.f60364x942342ad) : g17;
        }
        if (i17 == 2) {
            this.f60366xf6b8421f.clear();
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
            this.f60367xc84dc81d = aVar2.c(intValue);
            this.f60365xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f60362x617e99c4 = aVar2.g(intValue);
            this.f60365xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f60363x13a964ca = aVar2.k(intValue);
            this.f60365xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f60364x942342ad = aVar2.c(intValue);
            this.f60365xcb94b041[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4 c27544x21b1b2e4 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4();
            if (bArr != null && bArr.length > 0) {
                c27544x21b1b2e4.mo11468x92b714fd(bArr);
            }
            this.f60366xf6b8421f.add(c27544x21b1b2e4);
        }
        this.f60365xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setErrorCode */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d m116871x6f5de1d3(int i17) {
        this.f60362x617e99c4 = i17;
        this.f60365xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setErrorMsg */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d m116872xc9c95edb(java.lang.String str) {
        this.f60363x13a964ca = str;
        this.f60365xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setFromCache */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d m116873x5efd13b6(boolean z17) {
        this.f60364x942342ad = z17;
        this.f60365xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setReadUsers */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d m116874x18d603d0(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4> linkedList) {
        this.f60366xf6b8421f = linkedList;
        this.f60365xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setResult */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d m116875x209a1f1f(boolean z17) {
        this.f60367xc84dc81d = z17;
        this.f60365xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d m116870x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d) super.mo11468x92b714fd(bArr);
    }
}
