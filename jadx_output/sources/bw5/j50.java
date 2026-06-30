package bw5;

/* loaded from: classes2.dex */
public class j50 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.f90 f28830d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.m40 f28831e;

    /* renamed from: g, reason: collision with root package name */
    public bw5.h50 f28833g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.g50 f28834h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.i50 f28835i;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f28832f = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final android.util.ArrayMap f28836m = new android.util.ArrayMap();

    static {
        new bw5.j50();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j50)) {
            return false;
        }
        bw5.j50 j50Var = (bw5.j50) fVar;
        return n51.f.a(this.BaseResponse, j50Var.BaseResponse) && n51.f.a(this.f28830d, j50Var.f28830d) && n51.f.a(this.f28831e, j50Var.f28831e) && n51.f.a(this.f28832f, j50Var.f28832f) && n51.f.a(this.f28833g, j50Var.f28833g) && n51.f.a(this.f28834h, j50Var.f28834h) && n51.f.a(this.f28835i, j50Var.f28835i);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return hasFieldNumber(1) ? this.BaseResponse : new r45.ie();
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f28836m.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.j50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28832f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.BaseResponse != null && hasFieldNumber(1)) {
                fVar.i(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            if (this.f28830d != null && hasFieldNumber(1001)) {
                fVar.i(1001, this.f28830d.computeSize());
                this.f28830d.writeFields(fVar);
            }
            if (this.f28831e != null && hasFieldNumber(1002)) {
                fVar.i(1002, this.f28831e.computeSize());
                this.f28831e.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            if (this.f28833g != null && hasFieldNumber(4)) {
                fVar.i(4, this.f28833g.computeSize());
                this.f28833g.writeFields(fVar);
            }
            if (this.f28834h != null && hasFieldNumber(5)) {
                fVar.i(5, this.f28834h.computeSize());
                this.f28834h.writeFields(fVar);
            }
            if (this.f28835i != null && hasFieldNumber(6)) {
                fVar.i(6, this.f28835i.computeSize());
                this.f28835i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.BaseResponse != null && hasFieldNumber(1)) {
                i18 = 0 + b36.f.i(1, this.BaseResponse.computeSize());
            }
            if (this.f28830d != null && hasFieldNumber(1001)) {
                i18 += b36.f.i(1001, this.f28830d.computeSize());
            }
            if (this.f28831e != null && hasFieldNumber(1002)) {
                i18 += b36.f.i(1002, this.f28831e.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (this.f28833g != null && hasFieldNumber(4)) {
                g17 += b36.f.i(4, this.f28833g.computeSize());
            }
            if (this.f28834h != null && hasFieldNumber(5)) {
                g17 += b36.f.i(5, this.f28834h.computeSize());
            }
            return (this.f28835i == null || !hasFieldNumber(6)) ? g17 : g17 + b36.f.i(6, this.f28835i.computeSize());
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
        android.util.ArrayMap arrayMap = this.f28836m;
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
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.f50 f50Var = new bw5.f50();
                if (bArr2 != null && bArr2.length > 0) {
                    f50Var.parseFrom(bArr2);
                }
                linkedList.add(f50Var);
            }
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                bw5.h50 h50Var = new bw5.h50();
                if (bArr3 != null && bArr3.length > 0) {
                    h50Var.parseFrom(bArr3);
                }
                this.f28833g = h50Var;
            }
            arrayMap.put(4, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                bw5.g50 g50Var = new bw5.g50();
                if (bArr4 != null && bArr4.length > 0) {
                    g50Var.parseFrom(bArr4);
                }
                this.f28834h = g50Var;
            }
            arrayMap.put(5, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 6) {
            java.util.LinkedList j28 = aVar2.j(intValue);
            int size5 = j28.size();
            for (int i37 = 0; i37 < size5; i37++) {
                byte[] bArr5 = (byte[]) j28.get(i37);
                bw5.i50 i50Var = new bw5.i50();
                if (bArr5 != null && bArr5.length > 0) {
                    i50Var.parseFrom(bArr5);
                }
                this.f28835i = i50Var;
            }
            arrayMap.put(6, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 1001) {
            java.util.LinkedList j29 = aVar2.j(intValue);
            int size6 = j29.size();
            for (int i38 = 0; i38 < size6; i38++) {
                byte[] bArr6 = (byte[]) j29.get(i38);
                bw5.f90 f90Var = new bw5.f90();
                if (bArr6 != null && bArr6.length > 0) {
                    f90Var.parseFrom(bArr6);
                }
                this.f28830d = f90Var;
            }
            arrayMap.put(1001, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue != 1002) {
            return -1;
        }
        java.util.LinkedList j37 = aVar2.j(intValue);
        int size7 = j37.size();
        for (int i39 = 0; i39 < size7; i39++) {
            byte[] bArr7 = (byte[]) j37.get(i39);
            bw5.m40 m40Var = new bw5.m40();
            if (bArr7 != null && bArr7.length > 0) {
                m40Var.parseFrom(bArr7);
            }
            this.f28831e = m40Var;
        }
        arrayMap.put(1002, java.lang.Boolean.TRUE);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.j50) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f28836m.put(1, java.lang.Boolean.TRUE);
        return this;
    }
}
