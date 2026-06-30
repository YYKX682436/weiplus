package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.Behavior */
/* loaded from: classes8.dex */
public class C4459x5de91672 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 f18433xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672();

    /* renamed from: download_behavior */
    private int f18434x4efe3429;

    /* renamed from: hasSetFields */
    private final boolean[] f18435xcb94b041 = new boolean[5];

    /* renamed from: is_autostart */
    private boolean f18436x15f9373e;

    /* renamed from: is_silent */
    private boolean f18437xe5e0410a;

    /* renamed from: prealloc_storage */
    private boolean f18438x9da875ae;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 m38191xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 m38192x7c90cfc0() {
        return f18433xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 m38193x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 m38194x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 c4459x5de91672 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f18434x4efe3429), java.lang.Integer.valueOf(c4459x5de91672.f18434x4efe3429)) && n51.f.a(java.lang.Boolean.valueOf(this.f18436x15f9373e), java.lang.Boolean.valueOf(c4459x5de91672.f18436x15f9373e)) && n51.f.a(java.lang.Boolean.valueOf(this.f18437xe5e0410a), java.lang.Boolean.valueOf(c4459x5de91672.f18437xe5e0410a)) && n51.f.a(java.lang.Boolean.valueOf(this.f18438x9da875ae), java.lang.Boolean.valueOf(c4459x5de91672.f18438x9da875ae));
    }

    /* renamed from: getDownloadBehavior */
    public int m38195xdbef3e70() {
        return this.f18434x4efe3429;
    }

    /* renamed from: getIsAutostart */
    public boolean m38196x8432a4d3() {
        return this.f18436x15f9373e;
    }

    /* renamed from: getIsSilent */
    public boolean m38197x6e3ec395() {
        return this.f18437xe5e0410a;
    }

    /* renamed from: getPreallocStorage */
    public boolean m38198x1545c973() {
        return this.f18438x9da875ae;
    }

    /* renamed from: hasDownloadBehavior */
    public boolean m38199x46a839b4() {
        return m38200x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38200x6e095e9(int i17) {
        return this.f18435xcb94b041[i17];
    }

    /* renamed from: hasIsAutostart */
    public boolean m38201xa452af0f() {
        return m38200x6e095e9(2);
    }

    /* renamed from: hasIsSilent */
    public boolean m38202x9db942d9() {
        return m38200x6e095e9(3);
    }

    /* renamed from: hasPreallocStorage */
    public boolean m38203xb59e55af() {
        return m38200x6e095e9(4);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 m38204x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18435xcb94b041[1]) {
                fVar.e(1, this.f18434x4efe3429);
            }
            if (this.f18435xcb94b041[2]) {
                fVar.a(2, this.f18436x15f9373e);
            }
            if (this.f18435xcb94b041[3]) {
                fVar.a(3, this.f18437xe5e0410a);
            }
            if (this.f18435xcb94b041[4]) {
                fVar.a(4, this.f18438x9da875ae);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f18435xcb94b041[1] ? 0 + b36.f.e(1, this.f18434x4efe3429) : 0;
            if (this.f18435xcb94b041[2]) {
                e17 += b36.f.a(2, this.f18436x15f9373e);
            }
            if (this.f18435xcb94b041[3]) {
                e17 += b36.f.a(3, this.f18437xe5e0410a);
            }
            return this.f18435xcb94b041[4] ? e17 + b36.f.a(4, this.f18438x9da875ae) : e17;
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
            this.f18434x4efe3429 = aVar2.g(intValue);
            this.f18435xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18436x15f9373e = aVar2.c(intValue);
            this.f18435xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f18437xe5e0410a = aVar2.c(intValue);
            this.f18435xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f18438x9da875ae = aVar2.c(intValue);
        this.f18435xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setDownloadBehavior */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 m38206x7febd37c(int i17) {
        this.f18434x4efe3429 = i17;
        this.f18435xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setIsAutostart */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 m38207x1a981847(boolean z17) {
        this.f18436x15f9373e = z17;
        this.f18435xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setIsSilent */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 m38208x68f724a1(boolean z17) {
        this.f18437xe5e0410a = z17;
        this.f18435xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setPreallocStorage */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 m38209x4c1c62e7(boolean z17) {
        this.f18438x9da875ae = z17;
        this.f18435xcb94b041[4] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 m38205x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4459x5de91672) super.mo11468x92b714fd(bArr);
    }
}
