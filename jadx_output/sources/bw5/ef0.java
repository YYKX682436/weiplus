package bw5;

/* loaded from: classes4.dex */
public class ef0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26886d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26887e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26888f;

    /* renamed from: g, reason: collision with root package name */
    public long f26889g;

    /* renamed from: h, reason: collision with root package name */
    public final android.util.ArrayMap f26890h = new android.util.ArrayMap();

    static {
        new bw5.ef0();
    }

    public java.lang.String b() {
        return hasFieldNumber(100001) ? this.f26888f : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ef0)) {
            return false;
        }
        bw5.ef0 ef0Var = (bw5.ef0) fVar;
        return n51.f.a(this.BaseRequest, ef0Var.BaseRequest) && n51.f.a(this.f26886d, ef0Var.f26886d) && n51.f.a(this.f26887e, ef0Var.f26887e) && n51.f.a(this.f26888f, ef0Var.f26888f) && n51.f.a(java.lang.Long.valueOf(this.f26889g), java.lang.Long.valueOf(ef0Var.f26889g));
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return hasFieldNumber(1) ? this.BaseRequest : new r45.he();
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f26890h.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ef0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.BaseRequest != null && hasFieldNumber(1)) {
                fVar.i(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            if (this.f26886d != null && hasFieldNumber(2)) {
                fVar.j(2, this.f26886d);
            }
            if (this.f26887e != null && hasFieldNumber(3)) {
                fVar.b(3, this.f26887e);
            }
            if (this.f26888f != null && hasFieldNumber(100001)) {
                fVar.j(100001, this.f26888f);
            }
            if (hasFieldNumber(100002)) {
                fVar.h(100002, this.f26889g);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.BaseRequest != null && hasFieldNumber(1)) {
                i18 = 0 + b36.f.i(1, this.BaseRequest.computeSize());
            }
            if (this.f26886d != null && hasFieldNumber(2)) {
                i18 += b36.f.j(2, this.f26886d);
            }
            if (this.f26887e != null && hasFieldNumber(3)) {
                i18 += b36.f.b(3, this.f26887e);
            }
            if (this.f26888f != null && hasFieldNumber(100001)) {
                i18 += b36.f.j(100001, this.f26888f);
            }
            return hasFieldNumber(100002) ? i18 + b36.f.h(100002, this.f26889g) : i18;
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
        android.util.ArrayMap arrayMap = this.f26890h;
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar.parseFrom(bArr);
                }
                this.BaseRequest = heVar;
            }
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            this.f26886d = aVar2.k(intValue);
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3) {
            this.f26887e = aVar2.d(intValue);
            arrayMap.put(3, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 100001:
                this.f26888f = aVar2.k(intValue);
                arrayMap.put(100001, java.lang.Boolean.TRUE);
                return 0;
            case 100002:
                this.f26889g = aVar2.i(intValue);
                arrayMap.put(100002, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.ef0) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f26890h.put(1, java.lang.Boolean.TRUE);
        return this;
    }
}
