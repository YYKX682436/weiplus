package bw5;

/* loaded from: classes4.dex */
public class jf0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28959d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.if0 f28960e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28961f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.s6 f28962g;

    /* renamed from: h, reason: collision with root package name */
    public int f28963h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.x7 f28964i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f28965m;

    /* renamed from: n, reason: collision with root package name */
    public final android.util.ArrayMap f28966n = new android.util.ArrayMap();

    static {
        new bw5.jf0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jf0)) {
            return false;
        }
        bw5.jf0 jf0Var = (bw5.jf0) fVar;
        return n51.f.a(this.BaseResponse, jf0Var.BaseResponse) && n51.f.a(this.f28959d, jf0Var.f28959d) && n51.f.a(this.f28960e, jf0Var.f28960e) && n51.f.a(this.f28961f, jf0Var.f28961f) && n51.f.a(this.f28962g, jf0Var.f28962g) && n51.f.a(java.lang.Integer.valueOf(this.f28963h), java.lang.Integer.valueOf(jf0Var.f28963h)) && n51.f.a(this.f28964i, jf0Var.f28964i) && n51.f.a(this.f28965m, jf0Var.f28965m);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return hasFieldNumber(1) ? this.BaseResponse : new r45.ie();
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f28966n.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jf0();
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
            if (this.f28959d != null && hasFieldNumber(2)) {
                fVar.j(2, this.f28959d);
            }
            if (this.f28960e != null && hasFieldNumber(3)) {
                fVar.i(3, this.f28960e.computeSize());
                this.f28960e.writeFields(fVar);
            }
            if (this.f28961f != null && hasFieldNumber(4)) {
                fVar.j(4, this.f28961f);
            }
            if (this.f28962g != null && hasFieldNumber(5)) {
                fVar.i(5, this.f28962g.computeSize());
                this.f28962g.writeFields(fVar);
            }
            if (hasFieldNumber(6)) {
                fVar.e(6, this.f28963h);
            }
            if (this.f28964i != null && hasFieldNumber(8)) {
                fVar.i(8, this.f28964i.computeSize());
                this.f28964i.writeFields(fVar);
            }
            if (this.f28965m != null && hasFieldNumber(1000)) {
                fVar.j(1000, this.f28965m);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.BaseResponse != null && hasFieldNumber(1)) {
                i18 = 0 + b36.f.i(1, this.BaseResponse.computeSize());
            }
            if (this.f28959d != null && hasFieldNumber(2)) {
                i18 += b36.f.j(2, this.f28959d);
            }
            if (this.f28960e != null && hasFieldNumber(3)) {
                i18 += b36.f.i(3, this.f28960e.computeSize());
            }
            if (this.f28961f != null && hasFieldNumber(4)) {
                i18 += b36.f.j(4, this.f28961f);
            }
            if (this.f28962g != null && hasFieldNumber(5)) {
                i18 += b36.f.i(5, this.f28962g.computeSize());
            }
            if (hasFieldNumber(6)) {
                i18 += b36.f.e(6, this.f28963h);
            }
            if (this.f28964i != null && hasFieldNumber(8)) {
                i18 += b36.f.i(8, this.f28964i.computeSize());
            }
            return (this.f28965m == null || !hasFieldNumber(1000)) ? i18 : i18 + b36.f.j(1000, this.f28965m);
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
        android.util.ArrayMap arrayMap = this.f28966n;
        if (intValue == 8) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.x7 x7Var = new bw5.x7();
                if (bArr != null && bArr.length > 0) {
                    x7Var.parseFrom(bArr);
                }
                this.f28964i = x7Var;
            }
            arrayMap.put(8, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 1000) {
            this.f28965m = aVar2.k(intValue);
            arrayMap.put(1000, java.lang.Boolean.TRUE);
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
                this.f28959d = aVar2.k(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.if0 if0Var = new bw5.if0();
                    if (bArr3 != null && bArr3.length > 0) {
                        if0Var.parseFrom(bArr3);
                    }
                    this.f28960e = if0Var;
                }
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f28961f = aVar2.k(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.s6 s6Var = new bw5.s6();
                    if (bArr4 != null && bArr4.length > 0) {
                        s6Var.parseFrom(bArr4);
                    }
                    this.f28962g = s6Var;
                }
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f28963h = aVar2.g(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.jf0) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f28966n.put(1, java.lang.Boolean.TRUE);
        return this;
    }
}
