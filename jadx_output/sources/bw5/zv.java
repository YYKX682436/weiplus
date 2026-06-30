package bw5;

/* loaded from: classes4.dex */
public class zv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f36187d;

    /* renamed from: f, reason: collision with root package name */
    public bw5.x7 f36189f;

    /* renamed from: g, reason: collision with root package name */
    public long f36190g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f36191h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f36192i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f36188e = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f36193m = new boolean[7];

    static {
        new bw5.zv();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zv)) {
            return false;
        }
        bw5.zv zvVar = (bw5.zv) fVar;
        return n51.f.a(this.f36187d, zvVar.f36187d) && n51.f.a(this.f36188e, zvVar.f36188e) && n51.f.a(this.f36189f, zvVar.f36189f) && n51.f.a(java.lang.Long.valueOf(this.f36190g), java.lang.Long.valueOf(zvVar.f36190g)) && n51.f.a(this.f36191h, zvVar.f36191h) && n51.f.a(this.f36192i, zvVar.f36192i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zv();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f36188e;
        int i18 = 0;
        boolean[] zArr = this.f36193m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36187d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            bw5.x7 x7Var = this.f36189f;
            if (x7Var != null && zArr[3]) {
                fVar.i(3, x7Var.computeSize());
                this.f36189f.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.h(4, this.f36190g);
            }
            java.lang.String str2 = this.f36191h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f36192i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f36187d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            bw5.x7 x7Var2 = this.f36189f;
            if (x7Var2 != null && zArr[3]) {
                g17 += b36.f.i(3, x7Var2.computeSize());
            }
            if (zArr[4]) {
                g17 += b36.f.h(4, this.f36190g);
            }
            java.lang.String str5 = this.f36191h;
            if (str5 != null && zArr[5]) {
                g17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f36192i;
            return (str6 == null || !zArr[6]) ? g17 : g17 + b36.f.j(6, str6);
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
        switch (intValue) {
            case 1:
                this.f36187d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.yv yvVar = new bw5.yv();
                    if (bArr != null && bArr.length > 0) {
                        yvVar.parseFrom(bArr);
                    }
                    linkedList.add(yvVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.x7 x7Var3 = new bw5.x7();
                    if (bArr2 != null && bArr2.length > 0) {
                        x7Var3.parseFrom(bArr2);
                    }
                    this.f36189f = x7Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f36190g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f36191h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f36192i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.zv) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f36187d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "background_color", str, false);
            eVar.d(jSONObject, ya.b.ITEM_LIST, this.f36188e, false);
            eVar.d(jSONObject, "jump_info", this.f36189f, false);
            eVar.d(jSONObject, "top_guide_bar_id", java.lang.Long.valueOf(this.f36190g), false);
            eVar.d(jSONObject, "extra_report_json", this.f36191h, false);
            eVar.d(jSONObject, "bar_background_color", this.f36192i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
