package bw5;

/* loaded from: classes4.dex */
public class ef0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108419d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108420e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108421f;

    /* renamed from: g, reason: collision with root package name */
    public long f108422g;

    /* renamed from: h, reason: collision with root package name */
    public final android.util.ArrayMap f108423h = new android.util.ArrayMap();

    static {
        new bw5.ef0();
    }

    public java.lang.String b() {
        return m11828x6e095e9(100001) ? this.f108421f : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ef0)) {
            return false;
        }
        bw5.ef0 ef0Var = (bw5.ef0) fVar;
        return n51.f.a(this.f76494x2de60e5e, ef0Var.f76494x2de60e5e) && n51.f.a(this.f108419d, ef0Var.f108419d) && n51.f.a(this.f108420e, ef0Var.f108420e) && n51.f.a(this.f108421f, ef0Var.f108421f) && n51.f.a(java.lang.Long.valueOf(this.f108422g), java.lang.Long.valueOf(ef0Var.f108422g));
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return m11828x6e095e9(1) ? this.f76494x2de60e5e : new r45.he();
    }

    /* renamed from: hasFieldNumber */
    public boolean m11828x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f108423h.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ef0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f76494x2de60e5e != null && m11828x6e095e9(1)) {
                fVar.i(1, this.f76494x2de60e5e.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            if (this.f108419d != null && m11828x6e095e9(2)) {
                fVar.j(2, this.f108419d);
            }
            if (this.f108420e != null && m11828x6e095e9(3)) {
                fVar.b(3, this.f108420e);
            }
            if (this.f108421f != null && m11828x6e095e9(100001)) {
                fVar.j(100001, this.f108421f);
            }
            if (m11828x6e095e9(100002)) {
                fVar.h(100002, this.f108422g);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f76494x2de60e5e != null && m11828x6e095e9(1)) {
                i18 = 0 + b36.f.i(1, this.f76494x2de60e5e.mo75928xcd1e8d8());
            }
            if (this.f108419d != null && m11828x6e095e9(2)) {
                i18 += b36.f.j(2, this.f108419d);
            }
            if (this.f108420e != null && m11828x6e095e9(3)) {
                i18 += b36.f.b(3, this.f108420e);
            }
            if (this.f108421f != null && m11828x6e095e9(100001)) {
                i18 += b36.f.j(100001, this.f108421f);
            }
            return m11828x6e095e9(100002) ? i18 + b36.f.h(100002, this.f108422g) : i18;
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
        android.util.ArrayMap arrayMap = this.f108423h;
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar.mo11468x92b714fd(bArr);
                }
                this.f76494x2de60e5e = heVar;
            }
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            this.f108419d = aVar2.k(intValue);
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3) {
            this.f108420e = aVar2.d(intValue);
            arrayMap.put(3, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 100001:
                this.f108421f = aVar2.k(intValue);
                arrayMap.put(100001, java.lang.Boolean.TRUE);
                return 0;
            case 100002:
                this.f108422g = aVar2.i(intValue);
                arrayMap.put(100002, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.ef0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f108423h.put(1, java.lang.Boolean.TRUE);
        return this;
    }
}
