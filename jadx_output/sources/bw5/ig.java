package bw5;

/* loaded from: classes2.dex */
public class ig extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public int f28572e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f28573f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f28574g;

    /* renamed from: h, reason: collision with root package name */
    public int f28575h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f28571d = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f28576i = new boolean[7];

    static {
        new bw5.ig();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ig)) {
            return false;
        }
        bw5.ig igVar = (bw5.ig) fVar;
        return n51.f.a(this.BaseResponse, igVar.BaseResponse) && n51.f.a(this.f28571d, igVar.f28571d) && n51.f.a(java.lang.Integer.valueOf(this.f28572e), java.lang.Integer.valueOf(igVar.f28572e)) && n51.f.a(this.f28573f, igVar.f28573f) && n51.f.a(this.f28574g, igVar.f28574g) && n51.f.a(java.lang.Integer.valueOf(this.f28575h), java.lang.Integer.valueOf(igVar.f28575h));
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f28576i[1] ? this.BaseResponse : new r45.ie();
    }

    public com.tencent.mm.protobuf.g getLastBuffer() {
        return this.f28576i[4] ? this.f28573f : com.tencent.mm.protobuf.g.f192155b;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ig();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28571d;
        int i18 = 0;
        boolean[] zArr = this.f28576i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f28572e);
            }
            com.tencent.mm.protobuf.g gVar = this.f28573f;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            java.lang.String str = this.f28574g;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            if (zArr[6]) {
                fVar.e(6, this.f28575h);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f28572e);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f28573f;
            if (gVar2 != null && zArr[4]) {
                g17 += b36.f.b(4, gVar2);
            }
            java.lang.String str2 = this.f28574g;
            if (str2 != null && zArr[5]) {
                g17 += b36.f.j(5, str2);
            }
            return zArr[6] ? g17 + b36.f.e(6, this.f28575h) : g17;
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
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.hg hgVar = new bw5.hg();
                    if (bArr2 != null && bArr2.length > 0) {
                        hgVar.parseFrom(bArr2);
                    }
                    linkedList.add(hgVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f28572e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28573f = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28574g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28575h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.ig) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f28576i[1] = true;
        return this;
    }
}
