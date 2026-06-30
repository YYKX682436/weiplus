package bw5;

/* loaded from: classes4.dex */
public class q30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31917d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31918e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.x7 f31919f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31920g = new boolean[4];

    static {
        new bw5.q30();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q30)) {
            return false;
        }
        bw5.q30 q30Var = (bw5.q30) fVar;
        return n51.f.a(this.f31917d, q30Var.f31917d) && n51.f.a(this.f31918e, q30Var.f31918e) && n51.f.a(this.f31919f, q30Var.f31919f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.q30();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31920g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31917d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f31918e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.x7 x7Var = this.f31919f;
            if (x7Var != null && zArr[3]) {
                fVar.i(3, x7Var.computeSize());
                this.f31919f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f31917d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f31918e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            bw5.x7 x7Var2 = this.f31919f;
            return (x7Var2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, x7Var2.computeSize());
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
            this.f31917d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31918e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr != null && bArr.length > 0) {
                x7Var3.parseFrom(bArr);
            }
            this.f31919f = x7Var3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.q30) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f31917d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "presenter_wording", str, false);
            eVar.d(jSONObject, "jump_wording", this.f31918e, false);
            eVar.d(jSONObject, "jump_info", this.f31919f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
