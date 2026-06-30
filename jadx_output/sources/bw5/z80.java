package bw5;

/* loaded from: classes2.dex */
public class z80 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35855d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35856e;

    /* renamed from: f, reason: collision with root package name */
    public int f35857f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.v70 f35858g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f35859h = new boolean[6];

    static {
        new bw5.z80();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z80)) {
            return false;
        }
        bw5.z80 z80Var = (bw5.z80) fVar;
        return n51.f.a(this.BaseRequest, z80Var.BaseRequest) && n51.f.a(this.f35855d, z80Var.f35855d) && n51.f.a(java.lang.Boolean.valueOf(this.f35856e), java.lang.Boolean.valueOf(z80Var.f35856e)) && n51.f.a(java.lang.Integer.valueOf(this.f35857f), java.lang.Integer.valueOf(z80Var.f35857f)) && n51.f.a(this.f35858g, z80Var.f35858g);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f35859h[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.z80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35859h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f35855d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f35856e);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35857f);
            }
            bw5.v70 v70Var = this.f35858g;
            if (v70Var != null && zArr[5]) {
                fVar.i(5, v70Var.computeSize());
                this.f35858g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.computeSize());
            }
            java.lang.String str2 = this.f35855d;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f35856e);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f35857f);
            }
            bw5.v70 v70Var2 = this.f35858g;
            return (v70Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, v70Var2.computeSize());
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                this.BaseRequest = heVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35855d = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f35856e = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f35857f = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.v70 v70Var3 = new bw5.v70();
            if (bArr2 != null && bArr2.length > 0) {
                v70Var3.parseFrom(bArr2);
            }
            this.f35858g = v70Var3;
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.z80) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f35859h[1] = true;
        return this;
    }
}
