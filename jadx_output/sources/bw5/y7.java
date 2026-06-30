package bw5;

/* loaded from: classes4.dex */
public class y7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35389d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f35390e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35391f = new boolean[3];

    static {
        new bw5.y7();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y7)) {
            return false;
        }
        bw5.y7 y7Var = (bw5.y7) fVar;
        return n51.f.a(this.f35389d, y7Var.f35389d) && n51.f.a(this.f35390e, y7Var.f35390e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.y7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35391f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35389d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 3, this.f35390e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f35389d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            return i18 + b36.f.g(2, 3, this.f35390e);
        }
        if (i17 == 2) {
            this.f35390e.clear();
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
            this.f35389d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f35390e.add(java.lang.Long.valueOf(aVar2.i(intValue)));
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.y7) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f35389d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "anchor_finder_username", str, false);
            eVar.d(jSONObject, "added_product_ids", this.f35390e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
