package bw5;

/* loaded from: classes2.dex */
public class m90 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30126d;

    /* renamed from: e, reason: collision with root package name */
    public int f30127e;

    /* renamed from: f, reason: collision with root package name */
    public int f30128f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.k90 f30129g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.j90 f30130h;

    /* renamed from: i, reason: collision with root package name */
    public int f30131i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.i90 f30132m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f30133n;

    /* renamed from: o, reason: collision with root package name */
    public int f30134o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30135p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f30136q;

    /* renamed from: r, reason: collision with root package name */
    public int f30137r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f30138s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.l90 f30139t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.s40 f30140u;

    /* renamed from: v, reason: collision with root package name */
    public final android.util.ArrayMap f30141v = new android.util.ArrayMap();

    static {
        new bw5.m90();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m90 parseFrom(byte[] bArr) {
        return (bw5.m90) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.m90)) {
            return false;
        }
        bw5.m90 m90Var = (bw5.m90) fVar;
        return n51.f.a(this.BaseResponse, m90Var.BaseResponse) && n51.f.a(this.f30126d, m90Var.f30126d) && n51.f.a(java.lang.Integer.valueOf(this.f30127e), java.lang.Integer.valueOf(m90Var.f30127e)) && n51.f.a(java.lang.Integer.valueOf(this.f30128f), java.lang.Integer.valueOf(m90Var.f30128f)) && n51.f.a(this.f30129g, m90Var.f30129g) && n51.f.a(this.f30130h, m90Var.f30130h) && n51.f.a(java.lang.Integer.valueOf(this.f30131i), java.lang.Integer.valueOf(m90Var.f30131i)) && n51.f.a(this.f30132m, m90Var.f30132m) && n51.f.a(this.f30133n, m90Var.f30133n) && n51.f.a(java.lang.Integer.valueOf(this.f30134o), java.lang.Integer.valueOf(m90Var.f30134o)) && n51.f.a(java.lang.Boolean.valueOf(this.f30135p), java.lang.Boolean.valueOf(m90Var.f30135p)) && n51.f.a(this.f30136q, m90Var.f30136q) && n51.f.a(java.lang.Integer.valueOf(this.f30137r), java.lang.Integer.valueOf(m90Var.f30137r)) && n51.f.a(this.f30138s, m90Var.f30138s) && n51.f.a(this.f30139t, m90Var.f30139t) && n51.f.a(this.f30140u, m90Var.f30140u);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return hasFieldNumber(1) ? this.BaseResponse : new r45.ie();
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f30141v.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.m90();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.BaseResponse != null && hasFieldNumber(1)) {
                fVar.i(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            if (this.f30126d != null && hasFieldNumber(2)) {
                fVar.j(2, this.f30126d);
            }
            if (hasFieldNumber(3)) {
                fVar.e(3, this.f30127e);
            }
            if (hasFieldNumber(4)) {
                fVar.e(4, this.f30128f);
            }
            if (this.f30129g != null && hasFieldNumber(5)) {
                fVar.i(5, this.f30129g.computeSize());
                this.f30129g.writeFields(fVar);
            }
            if (this.f30130h != null && hasFieldNumber(6)) {
                fVar.i(6, this.f30130h.computeSize());
                this.f30130h.writeFields(fVar);
            }
            if (hasFieldNumber(7)) {
                fVar.e(7, this.f30131i);
            }
            if (this.f30132m != null && hasFieldNumber(8)) {
                fVar.i(8, this.f30132m.computeSize());
                this.f30132m.writeFields(fVar);
            }
            if (this.f30133n != null && hasFieldNumber(9)) {
                fVar.b(9, this.f30133n);
            }
            if (hasFieldNumber(10)) {
                fVar.e(10, this.f30134o);
            }
            if (hasFieldNumber(11)) {
                fVar.a(11, this.f30135p);
            }
            if (this.f30136q != null && hasFieldNumber(12)) {
                fVar.b(12, this.f30136q);
            }
            if (hasFieldNumber(13)) {
                fVar.e(13, this.f30137r);
            }
            if (this.f30138s != null && hasFieldNumber(14)) {
                fVar.j(14, this.f30138s);
            }
            if (this.f30139t != null && hasFieldNumber(15)) {
                fVar.i(15, this.f30139t.computeSize());
                this.f30139t.writeFields(fVar);
            }
            if (this.f30140u != null && hasFieldNumber(1001)) {
                fVar.i(1001, this.f30140u.computeSize());
                this.f30140u.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.BaseResponse != null && hasFieldNumber(1)) {
                i18 = b36.f.i(1, this.BaseResponse.computeSize()) + 0;
            }
            if (this.f30126d != null && hasFieldNumber(2)) {
                i18 += b36.f.j(2, this.f30126d);
            }
            if (hasFieldNumber(3)) {
                i18 += b36.f.e(3, this.f30127e);
            }
            if (hasFieldNumber(4)) {
                i18 += b36.f.e(4, this.f30128f);
            }
            if (this.f30129g != null && hasFieldNumber(5)) {
                i18 += b36.f.i(5, this.f30129g.computeSize());
            }
            if (this.f30130h != null && hasFieldNumber(6)) {
                i18 += b36.f.i(6, this.f30130h.computeSize());
            }
            if (hasFieldNumber(7)) {
                i18 += b36.f.e(7, this.f30131i);
            }
            if (this.f30132m != null && hasFieldNumber(8)) {
                i18 += b36.f.i(8, this.f30132m.computeSize());
            }
            if (this.f30133n != null && hasFieldNumber(9)) {
                i18 += b36.f.b(9, this.f30133n);
            }
            if (hasFieldNumber(10)) {
                i18 += b36.f.e(10, this.f30134o);
            }
            if (hasFieldNumber(11)) {
                i18 += b36.f.a(11, this.f30135p);
            }
            if (this.f30136q != null && hasFieldNumber(12)) {
                i18 += b36.f.b(12, this.f30136q);
            }
            if (hasFieldNumber(13)) {
                i18 += b36.f.e(13, this.f30137r);
            }
            if (this.f30138s != null && hasFieldNumber(14)) {
                i18 += b36.f.j(14, this.f30138s);
            }
            if (this.f30139t != null && hasFieldNumber(15)) {
                i18 += b36.f.i(15, this.f30139t.computeSize());
            }
            return (this.f30140u == null || !hasFieldNumber(1001)) ? i18 : i18 + b36.f.i(1001, this.f30140u.computeSize());
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
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
        android.util.ArrayMap arrayMap = this.f30141v;
        if (intValue == 1001) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.s40 s40Var = new bw5.s40();
                if (bArr != null && bArr.length > 0) {
                    s40Var.parseFrom(bArr);
                }
                this.f30140u = s40Var;
            }
            arrayMap.put(1001, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ie ieVar = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar.parseFrom(bArr2);
                    }
                    this.BaseResponse = ieVar;
                }
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f30126d = aVar2.k(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f30127e = aVar2.g(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f30128f = aVar2.g(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.k90 k90Var = new bw5.k90();
                    if (bArr3 != null && bArr3.length > 0) {
                        k90Var.parseFrom(bArr3);
                    }
                    this.f30129g = k90Var;
                }
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.j90 j90Var = new bw5.j90();
                    if (bArr4 != null && bArr4.length > 0) {
                        j90Var.parseFrom(bArr4);
                    }
                    this.f30130h = j90Var;
                }
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f30131i = aVar2.g(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.i90 i90Var = new bw5.i90();
                    if (bArr5 != null && bArr5.length > 0) {
                        i90Var.parseFrom(bArr5);
                    }
                    this.f30132m = i90Var;
                }
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            case 9:
                this.f30133n = aVar2.d(intValue);
                arrayMap.put(9, java.lang.Boolean.TRUE);
                return 0;
            case 10:
                this.f30134o = aVar2.g(intValue);
                arrayMap.put(10, java.lang.Boolean.TRUE);
                return 0;
            case 11:
                this.f30135p = aVar2.c(intValue);
                arrayMap.put(11, java.lang.Boolean.TRUE);
                return 0;
            case 12:
                this.f30136q = aVar2.d(intValue);
                arrayMap.put(12, java.lang.Boolean.TRUE);
                return 0;
            case 13:
                this.f30137r = aVar2.g(intValue);
                arrayMap.put(13, java.lang.Boolean.TRUE);
                return 0;
            case 14:
                this.f30138s = aVar2.k(intValue);
                arrayMap.put(14, java.lang.Boolean.TRUE);
                return 0;
            case 15:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.l90 l90Var = new bw5.l90();
                    if (bArr6 != null && bArr6.length > 0) {
                        l90Var.parseFrom(bArr6);
                    }
                    this.f30139t = l90Var;
                }
                arrayMap.put(15, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f30141v.put(1, java.lang.Boolean.TRUE);
        return this;
    }
}
