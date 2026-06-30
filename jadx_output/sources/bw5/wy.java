package bw5;

/* loaded from: classes2.dex */
public class wy extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34871e;

    /* renamed from: f, reason: collision with root package name */
    public int f34872f;

    /* renamed from: g, reason: collision with root package name */
    public int f34873g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.mu f34874h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f34875i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.ju f34876m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f34870d = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f34877n = new boolean[9];

    static {
        new bw5.wy();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wy parseFrom(byte[] bArr) {
        return (bw5.wy) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wy)) {
            return false;
        }
        bw5.wy wyVar = (bw5.wy) fVar;
        return n51.f.a(this.BaseResponse, wyVar.BaseResponse) && n51.f.a(this.f34870d, wyVar.f34870d) && n51.f.a(this.f34871e, wyVar.f34871e) && n51.f.a(java.lang.Integer.valueOf(this.f34872f), java.lang.Integer.valueOf(wyVar.f34872f)) && n51.f.a(java.lang.Integer.valueOf(this.f34873g), java.lang.Integer.valueOf(wyVar.f34873g)) && n51.f.a(this.f34874h, wyVar.f34874h) && n51.f.a(this.f34875i, wyVar.f34875i) && n51.f.a(this.f34876m, wyVar.f34876m);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f34877n[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wy();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34870d;
        int i18 = 0;
        boolean[] zArr = this.f34877n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f34871e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34872f);
            }
            if (zArr[5]) {
                fVar.e(5, this.f34873g);
            }
            bw5.mu muVar = this.f34874h;
            if (muVar != null && zArr[6]) {
                fVar.i(6, muVar.computeSize());
                this.f34874h.writeFields(fVar);
            }
            java.lang.String str = this.f34875i;
            if (str != null && zArr[7]) {
                fVar.j(7, str);
            }
            bw5.ju juVar = this.f34876m;
            if (juVar != null && zArr[8]) {
                fVar.i(8, juVar.computeSize());
                this.f34876m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f34871e;
            if (gVar2 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar2);
            }
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f34872f);
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f34873g);
            }
            bw5.mu muVar2 = this.f34874h;
            if (muVar2 != null && zArr[6]) {
                g17 += b36.f.i(6, muVar2.computeSize());
            }
            java.lang.String str2 = this.f34875i;
            if (str2 != null && zArr[7]) {
                g17 += b36.f.j(7, str2);
            }
            bw5.ju juVar2 = this.f34876m;
            return (juVar2 == null || !zArr[8]) ? g17 : g17 + b36.f.i(8, juVar2.computeSize());
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
                    bw5.yr yrVar = new bw5.yr();
                    if (bArr2 != null && bArr2.length > 0) {
                        yrVar.parseFrom(bArr2);
                    }
                    linkedList.add(yrVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f34871e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34872f = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34873g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.mu muVar3 = new bw5.mu();
                    if (bArr3 != null && bArr3.length > 0) {
                        muVar3.parseFrom(bArr3);
                    }
                    this.f34874h = muVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f34875i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.ju juVar3 = new bw5.ju();
                    if (bArr4 != null && bArr4.length > 0) {
                        juVar3.parseFrom(bArr4);
                    }
                    this.f34876m = juVar3;
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f34877n[1] = true;
        return this;
    }
}
