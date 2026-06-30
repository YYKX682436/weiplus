package bw5;

/* loaded from: classes2.dex */
public class fm0 extends r45.js5 {

    /* renamed from: i, reason: collision with root package name */
    public static final bw5.fm0 f27369i = new bw5.fm0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.mm0 f27370d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ul0 f27371e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.cn0 f27372f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f27373g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f27374h = new boolean[6];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fm0)) {
            return false;
        }
        bw5.fm0 fm0Var = (bw5.fm0) fVar;
        return n51.f.a(this.BaseResponse, fm0Var.BaseResponse) && n51.f.a(this.f27370d, fm0Var.f27370d) && n51.f.a(this.f27371e, fm0Var.f27371e) && n51.f.a(this.f27372f, fm0Var.f27372f) && n51.f.a(this.f27373g, fm0Var.f27373g);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f27374h[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27373g;
        boolean[] zArr = this.f27374h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            bw5.mm0 mm0Var = this.f27370d;
            if (mm0Var != null && zArr[2]) {
                fVar.i(2, mm0Var.computeSize());
                this.f27370d.writeFields(fVar);
            }
            bw5.ul0 ul0Var = this.f27371e;
            if (ul0Var != null && zArr[3]) {
                fVar.i(3, ul0Var.computeSize());
                this.f27371e.writeFields(fVar);
            }
            bw5.cn0 cn0Var = this.f27372f;
            if (cn0Var != null && zArr[4]) {
                fVar.i(4, cn0Var.computeSize());
                this.f27372f.writeFields(fVar);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            bw5.mm0 mm0Var2 = this.f27370d;
            if (mm0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, mm0Var2.computeSize());
            }
            bw5.ul0 ul0Var2 = this.f27371e;
            if (ul0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, ul0Var2.computeSize());
            }
            bw5.cn0 cn0Var2 = this.f27372f;
            if (cn0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, cn0Var2.computeSize());
            }
            return i18 + b36.f.g(5, 8, linkedList);
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                this.BaseResponse = ieVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.mm0 mm0Var3 = new bw5.mm0();
                if (bArr2 != null && bArr2.length > 0) {
                    mm0Var3.parseFrom(bArr2);
                }
                this.f27370d = mm0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                bw5.ul0 ul0Var3 = new bw5.ul0();
                if (bArr3 != null && bArr3.length > 0) {
                    ul0Var3.parseFrom(bArr3);
                }
                this.f27371e = ul0Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                bw5.cn0 cn0Var3 = new bw5.cn0();
                if (bArr4 != null && bArr4.length > 0) {
                    cn0Var3.parseFrom(bArr4);
                }
                this.f27372f = cn0Var3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            bw5.mm0 mm0Var4 = new bw5.mm0();
            if (bArr5 != null && bArr5.length > 0) {
                mm0Var4.parseFrom(bArr5);
            }
            linkedList.add(mm0Var4);
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.fm0) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f27374h[1] = true;
        return this;
    }
}
