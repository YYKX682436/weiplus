package bw5;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.b f24943d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f24944e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f24945f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f24946g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24947h;

    /* renamed from: i, reason: collision with root package name */
    public int f24948i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f24949m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.c f24950n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f24951o = new boolean[9];

    static {
        new bw5.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a)) {
            return false;
        }
        bw5.a aVar = (bw5.a) fVar;
        return n51.f.a(this.f24943d, aVar.f24943d) && n51.f.a(this.f24944e, aVar.f24944e) && n51.f.a(this.f24945f, aVar.f24945f) && n51.f.a(this.f24946g, aVar.f24946g) && n51.f.a(java.lang.Boolean.valueOf(this.f24947h), java.lang.Boolean.valueOf(aVar.f24947h)) && n51.f.a(java.lang.Integer.valueOf(this.f24948i), java.lang.Integer.valueOf(aVar.f24948i)) && n51.f.a(this.f24949m, aVar.f24949m) && n51.f.a(this.f24950n, aVar.f24950n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f24951o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.b bVar = this.f24943d;
            if (bVar != null && zArr[1]) {
                fVar.e(1, bVar.f25467d);
            }
            java.lang.String str = this.f24944e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f24945f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f24946g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.a(5, this.f24947h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f24948i);
            }
            java.lang.String str4 = this.f24949m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            bw5.c cVar = this.f24950n;
            if (cVar != null && zArr[8]) {
                fVar.i(8, cVar.computeSize());
                this.f24950n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.b bVar2 = this.f24943d;
            if (bVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, bVar2.f25467d);
            }
            java.lang.String str5 = this.f24944e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f24945f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f24946g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f24947h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f24948i);
            }
            java.lang.String str8 = this.f24949m;
            if (str8 != null && zArr[7]) {
                i18 += b36.f.j(7, str8);
            }
            bw5.c cVar2 = this.f24950n;
            return (cVar2 == null || !zArr[8]) ? i18 : i18 + b36.f.i(8, cVar2.computeSize());
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
        switch (intValue) {
            case 1:
                int g17 = aVar2.g(intValue);
                this.f24943d = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.b.AI_CHAT_ASR_RESULT_TYPE_LLM_POLLING_KEY : bw5.b.AI_CHAT_ASR_RESULT_TYPE_TEXT : bw5.b.AI_CHAT_ASR_RESULT_TYPE_UNKNOWN;
                zArr[1] = true;
                return 0;
            case 2:
                this.f24944e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f24945f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f24946g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f24947h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f24948i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f24949m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.c cVar3 = new bw5.c();
                    if (bArr != null && bArr.length > 0) {
                        cVar3.parseFrom(bArr);
                    }
                    this.f24950n = cVar3;
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.a) super.parseFrom(bArr);
    }
}
