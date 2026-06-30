package bw5;

/* loaded from: classes4.dex */
public class kj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29399d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.x7 f29400e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29401f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f29402g = new boolean[4];

    static {
        new bw5.kj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kj0 parseFrom(byte[] bArr) {
        return (bw5.kj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kj0)) {
            return false;
        }
        bw5.kj0 kj0Var = (bw5.kj0) fVar;
        return n51.f.a(this.f29399d, kj0Var.f29399d) && n51.f.a(this.f29400e, kj0Var.f29400e) && n51.f.a(this.f29401f, kj0Var.f29401f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.kj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29402g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29399d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.x7 x7Var = this.f29400e;
            if (x7Var != null && zArr[2]) {
                fVar.i(2, x7Var.computeSize());
                this.f29400e.writeFields(fVar);
            }
            java.lang.String str2 = this.f29401f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f29399d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            bw5.x7 x7Var2 = this.f29400e;
            if (x7Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, x7Var2.computeSize());
            }
            java.lang.String str4 = this.f29401f;
            return (str4 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str4);
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
            this.f29399d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f29401f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr != null && bArr.length > 0) {
                x7Var3.parseFrom(bArr);
            }
            this.f29400e = x7Var3;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f29399d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "entrance_wording", str, false);
            eVar.d(jSONObject, "jump_info", this.f29400e, false);
            eVar.d(jSONObject, "extra_report_json", this.f29401f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
