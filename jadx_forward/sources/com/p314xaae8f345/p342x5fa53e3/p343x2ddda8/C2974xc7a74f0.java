package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.FaceFrame */
/* loaded from: classes4.dex */
public class C2974xc7a74f0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 f10227xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0();

    /* renamed from: image */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f10229x5faa95b;

    /* renamed from: x_coordinates */
    private java.util.LinkedList<java.lang.Float> f10230x17eaa4b4 = new java.util.LinkedList<>();

    /* renamed from: y_coordinates */
    private java.util.LinkedList<java.lang.Float> f10231x66dab35 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f10228xcb94b041 = new boolean[4];

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 m22425xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 m22426x7c90cfc0() {
        return f10227xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 m22427x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0();
    }

    /* renamed from: addAllElementXCoordinates */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 m22428xf9ed461f(java.util.Collection<java.lang.Float> collection) {
        this.f10230x17eaa4b4.addAll(collection);
        this.f10228xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addAllElementYCoordinates */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 m22429x19eeb7e(java.util.Collection<java.lang.Float> collection) {
        this.f10231x66dab35.addAll(collection);
        this.f10228xcb94b041[2] = true;
        return this;
    }

    /* renamed from: addElementXCoordinates */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 m22430xa685611e(float f17) {
        this.f10230x17eaa4b4.add(java.lang.Float.valueOf(f17));
        this.f10228xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementYCoordinates */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 m22431xae37067d(float f17) {
        this.f10231x66dab35.add(java.lang.Float.valueOf(f17));
        this.f10228xcb94b041[2] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 m22432x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 c2974xc7a74f0 = (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0) fVar;
        return n51.f.a(this.f10230x17eaa4b4, c2974xc7a74f0.f10230x17eaa4b4) && n51.f.a(this.f10231x66dab35, c2974xc7a74f0.f10231x66dab35) && n51.f.a(this.f10229x5faa95b, c2974xc7a74f0.f10229x5faa95b);
    }

    /* renamed from: getImage */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m22433x74984fa5() {
        return this.f10228xcb94b041[3] ? this.f10229x5faa95b : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getXCoordinates */
    public java.util.LinkedList<java.lang.Float> m22434xcf34f8d9() {
        return this.f10230x17eaa4b4;
    }

    /* renamed from: getYCoordinates */
    public java.util.LinkedList<java.lang.Float> m22435xd6e69e38() {
        return this.f10231x66dab35;
    }

    /* renamed from: hasFieldNumber */
    public boolean m22436x6e095e9(int i17) {
        return this.f10228xcb94b041[i17];
    }

    /* renamed from: hasImage */
    public boolean m22437x72bb6e1() {
        return m22436x6e095e9(3);
    }

    /* renamed from: hasXCoordinates */
    public boolean m22438xb316361d() {
        return m22436x6e095e9(1);
    }

    /* renamed from: hasYCoordinates */
    public boolean m22439xbac7db7c() {
        return m22436x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 m22440x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 5, this.f10230x17eaa4b4);
            fVar.g(2, 5, this.f10231x66dab35);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f10229x5faa95b;
            if (gVar != null && this.f10228xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 5, this.f10230x17eaa4b4) + 0 + b36.f.g(2, 5, this.f10231x66dab35);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f10229x5faa95b;
            return (gVar2 == null || !this.f10228xcb94b041[3]) ? g17 : g17 + b36.f.b(3, gVar2);
        }
        if (i17 == 2) {
            this.f10230x17eaa4b4.clear();
            this.f10231x66dab35.clear();
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
            this.f10230x17eaa4b4.add(java.lang.Float.valueOf(aVar2.f(intValue)));
            this.f10228xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f10231x66dab35.add(java.lang.Float.valueOf(aVar2.f(intValue)));
            this.f10228xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f10229x5faa95b = aVar2.d(intValue);
        this.f10228xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setImage */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 m22442x53266a19(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f10229x5faa95b = gVar;
        this.f10228xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setXCoordinates */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 m22443x57df3e5(java.util.LinkedList<java.lang.Float> linkedList) {
        this.f10230x17eaa4b4 = linkedList;
        this.f10228xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setYCoordinates */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 m22444xd2f9944(java.util.LinkedList<java.lang.Float> linkedList) {
        this.f10231x66dab35 = linkedList;
        this.f10228xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 m22441x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.C2974xc7a74f0) super.mo11468x92b714fd(bArr);
    }
}
