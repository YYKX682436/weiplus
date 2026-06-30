package bw5;

/* loaded from: classes4.dex */
public class xv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f35271d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35272e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35273f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.x7 f35274g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f35275h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35276i = new boolean[6];

    static {
        new bw5.xv();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xv)) {
            return false;
        }
        bw5.xv xvVar = (bw5.xv) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f35271d), java.lang.Integer.valueOf(xvVar.f35271d)) && n51.f.a(this.f35272e, xvVar.f35272e) && n51.f.a(this.f35273f, xvVar.f35273f) && n51.f.a(this.f35274g, xvVar.f35274g) && n51.f.a(java.lang.Boolean.valueOf(this.f35275h), java.lang.Boolean.valueOf(xvVar.f35275h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xv();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35276i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f35271d);
            }
            java.lang.String str = this.f35272e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f35273f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.x7 x7Var = this.f35274g;
            if (x7Var != null && zArr[4]) {
                fVar.i(4, x7Var.computeSize());
                this.f35274g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.a(5, this.f35275h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f35271d) : 0;
            java.lang.String str3 = this.f35272e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f35273f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            bw5.x7 x7Var2 = this.f35274g;
            if (x7Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, x7Var2.computeSize());
            }
            return zArr[5] ? e17 + b36.f.a(5, this.f35275h) : e17;
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
            this.f35271d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35272e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f35273f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f35275h = aVar2.c(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr != null && bArr.length > 0) {
                x7Var3.parseFrom(bArr);
            }
            this.f35274g = x7Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.xv) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f35271d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "business_type", valueOf, false);
            eVar.d(jSONObject, "wording", this.f35272e, false);
            eVar.d(jSONObject, "sub_wording", this.f35273f, false);
            eVar.d(jSONObject, "jump_info", this.f35274g, false);
            eVar.d(jSONObject, "need_refresh_when_exit", java.lang.Boolean.valueOf(this.f35275h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
