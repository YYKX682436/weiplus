package bw5;

/* loaded from: classes2.dex */
public class e50 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public int f26733e;

    /* renamed from: f, reason: collision with root package name */
    public int f26734f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26735g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.m40 f26736h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.o50 f26737i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.o50 f26738m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.o50 f26739n;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f26732d = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final android.util.ArrayMap f26740o = new android.util.ArrayMap();

    static {
        new bw5.e50();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.e50 parseFrom(byte[] bArr) {
        return (bw5.e50) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e50)) {
            return false;
        }
        bw5.e50 e50Var = (bw5.e50) fVar;
        return n51.f.a(this.BaseResponse, e50Var.BaseResponse) && n51.f.a(this.f26732d, e50Var.f26732d) && n51.f.a(java.lang.Integer.valueOf(this.f26733e), java.lang.Integer.valueOf(e50Var.f26733e)) && n51.f.a(java.lang.Integer.valueOf(this.f26734f), java.lang.Integer.valueOf(e50Var.f26734f)) && n51.f.a(java.lang.Boolean.valueOf(this.f26735g), java.lang.Boolean.valueOf(e50Var.f26735g)) && n51.f.a(this.f26736h, e50Var.f26736h) && n51.f.a(this.f26737i, e50Var.f26737i) && n51.f.a(this.f26738m, e50Var.f26738m) && n51.f.a(this.f26739n, e50Var.f26739n);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return hasFieldNumber(1) ? this.BaseResponse : new r45.ie();
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f26740o.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.e50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f26732d;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.BaseResponse != null && hasFieldNumber(1)) {
                fVar.i(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            if (hasFieldNumber(4)) {
                fVar.e(4, this.f26733e);
            }
            if (hasFieldNumber(5)) {
                fVar.e(5, this.f26734f);
            }
            if (hasFieldNumber(6)) {
                fVar.a(6, this.f26735g);
            }
            if (this.f26736h != null && hasFieldNumber(7)) {
                fVar.i(7, this.f26736h.computeSize());
                this.f26736h.writeFields(fVar);
            }
            if (this.f26737i != null && hasFieldNumber(102)) {
                fVar.i(102, this.f26737i.computeSize());
                this.f26737i.writeFields(fVar);
            }
            if (this.f26738m != null && hasFieldNumber(103)) {
                fVar.i(103, this.f26738m.computeSize());
                this.f26738m.writeFields(fVar);
            }
            if (this.f26739n != null && hasFieldNumber(104)) {
                fVar.i(104, this.f26739n.computeSize());
                this.f26739n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.BaseResponse != null && hasFieldNumber(1)) {
                i18 = 0 + b36.f.i(1, this.BaseResponse.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            if (hasFieldNumber(4)) {
                g17 += b36.f.e(4, this.f26733e);
            }
            if (hasFieldNumber(5)) {
                g17 += b36.f.e(5, this.f26734f);
            }
            if (hasFieldNumber(6)) {
                g17 += b36.f.a(6, this.f26735g);
            }
            if (this.f26736h != null && hasFieldNumber(7)) {
                g17 += b36.f.i(7, this.f26736h.computeSize());
            }
            if (this.f26737i != null && hasFieldNumber(102)) {
                g17 += b36.f.i(102, this.f26737i.computeSize());
            }
            if (this.f26738m != null && hasFieldNumber(103)) {
                g17 += b36.f.i(103, this.f26738m.computeSize());
            }
            return (this.f26739n == null || !hasFieldNumber(104)) ? g17 : g17 + b36.f.i(104, this.f26739n.computeSize());
        }
        if (i17 == 2) {
            linkedList.clear();
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
        android.util.ArrayMap arrayMap = this.f26740o;
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar.parseFrom(bArr);
                }
                this.BaseResponse = ieVar;
            }
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.o50 o50Var = new bw5.o50();
                if (bArr2 != null && bArr2.length > 0) {
                    o50Var.parseFrom(bArr2);
                }
                linkedList.add(o50Var);
            }
            arrayMap.put(3, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 4) {
            this.f26733e = aVar2.g(intValue);
            arrayMap.put(4, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 5) {
            this.f26734f = aVar2.g(intValue);
            arrayMap.put(5, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 6) {
            this.f26735g = aVar2.c(intValue);
            arrayMap.put(6, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 7) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                bw5.m40 m40Var = new bw5.m40();
                if (bArr3 != null && bArr3.length > 0) {
                    m40Var.parseFrom(bArr3);
                }
                this.f26736h = m40Var;
            }
            arrayMap.put(7, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 102:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.o50 o50Var2 = new bw5.o50();
                    if (bArr4 != null && bArr4.length > 0) {
                        o50Var2.parseFrom(bArr4);
                    }
                    this.f26737i = o50Var2;
                }
                arrayMap.put(102, java.lang.Boolean.TRUE);
                return 0;
            case 103:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.o50 o50Var3 = new bw5.o50();
                    if (bArr5 != null && bArr5.length > 0) {
                        o50Var3.parseFrom(bArr5);
                    }
                    this.f26738m = o50Var3;
                }
                arrayMap.put(103, java.lang.Boolean.TRUE);
                return 0;
            case 104:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.o50 o50Var4 = new bw5.o50();
                    if (bArr6 != null && bArr6.length > 0) {
                        o50Var4.parseFrom(bArr6);
                    }
                    this.f26739n = o50Var4;
                }
                arrayMap.put(104, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f26740o.put(1, java.lang.Boolean.TRUE);
        return this;
    }
}
