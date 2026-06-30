package bw5;

/* loaded from: classes4.dex */
public class lg0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f29774d;

    /* renamed from: f, reason: collision with root package name */
    public int f29776f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.kj0 f29777g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f29775e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f29778h = new boolean[5];

    static {
        new bw5.lg0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lg0 parseFrom(byte[] bArr) {
        return (bw5.lg0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lg0)) {
            return false;
        }
        bw5.lg0 lg0Var = (bw5.lg0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29774d), java.lang.Integer.valueOf(lg0Var.f29774d)) && n51.f.a(this.f29775e, lg0Var.f29775e) && n51.f.a(java.lang.Integer.valueOf(this.f29776f), java.lang.Integer.valueOf(lg0Var.f29776f)) && n51.f.a(this.f29777g, lg0Var.f29777g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lg0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29775e;
        boolean[] zArr = this.f29778h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29774d);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f29776f);
            }
            bw5.kj0 kj0Var = this.f29777g;
            if (kj0Var != null && zArr[4]) {
                fVar.i(4, kj0Var.computeSize());
                this.f29777g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f29774d) : 0) + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f29776f);
            }
            bw5.kj0 kj0Var2 = this.f29777g;
            return (kj0Var2 == null || !zArr[4]) ? e17 : e17 + b36.f.i(4, kj0Var2.computeSize());
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
            this.f29774d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.g10 g10Var = new bw5.g10();
                if (bArr != null && bArr.length > 0) {
                    g10Var.parseFrom(bArr);
                }
                linkedList.add(g10Var);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f29776f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.kj0 kj0Var3 = new bw5.kj0();
            if (bArr2 != null && bArr2.length > 0) {
                kj0Var3.parseFrom(bArr2);
            }
            this.f29777g = kj0Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f29774d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "type", valueOf, false);
            eVar.d(jSONObject, "product_infos", this.f29775e, false);
            eVar.d(jSONObject, "condition", java.lang.Integer.valueOf(this.f29776f), false);
            eVar.d(jSONObject, "shelf_message_entrance_info", this.f29777g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
