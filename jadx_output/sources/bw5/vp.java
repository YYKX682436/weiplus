package bw5;

/* loaded from: classes2.dex */
public class vp extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.sc f34442d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34443e;

    /* renamed from: f, reason: collision with root package name */
    public float f34444f;

    /* renamed from: g, reason: collision with root package name */
    public float f34445g;

    /* renamed from: h, reason: collision with root package name */
    public int f34446h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.hd f34447i;

    /* renamed from: m, reason: collision with root package name */
    public long f34448m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34449n;

    /* renamed from: o, reason: collision with root package name */
    public int f34450o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34451p;

    /* renamed from: q, reason: collision with root package name */
    public int f34452q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34453r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f34454s = new boolean[14];

    static {
        new bw5.vp();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vp)) {
            return false;
        }
        bw5.vp vpVar = (bw5.vp) fVar;
        return n51.f.a(this.BaseRequest, vpVar.BaseRequest) && n51.f.a(this.f34442d, vpVar.f34442d) && n51.f.a(this.f34443e, vpVar.f34443e) && n51.f.a(java.lang.Float.valueOf(this.f34444f), java.lang.Float.valueOf(vpVar.f34444f)) && n51.f.a(java.lang.Float.valueOf(this.f34445g), java.lang.Float.valueOf(vpVar.f34445g)) && n51.f.a(java.lang.Integer.valueOf(this.f34446h), java.lang.Integer.valueOf(vpVar.f34446h)) && n51.f.a(this.f34447i, vpVar.f34447i) && n51.f.a(java.lang.Long.valueOf(this.f34448m), java.lang.Long.valueOf(vpVar.f34448m)) && n51.f.a(this.f34449n, vpVar.f34449n) && n51.f.a(java.lang.Integer.valueOf(this.f34450o), java.lang.Integer.valueOf(vpVar.f34450o)) && n51.f.a(this.f34451p, vpVar.f34451p) && n51.f.a(java.lang.Integer.valueOf(this.f34452q), java.lang.Integer.valueOf(vpVar.f34452q)) && n51.f.a(this.f34453r, vpVar.f34453r);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f34454s[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vp();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34454s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            bw5.sc scVar = this.f34442d;
            if (scVar != null && zArr[2]) {
                fVar.i(2, scVar.computeSize());
                this.f34442d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f34443e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.d(4, this.f34444f);
            }
            if (zArr[5]) {
                fVar.d(5, this.f34445g);
            }
            if (zArr[6]) {
                fVar.e(6, this.f34446h);
            }
            bw5.hd hdVar = this.f34447i;
            if (hdVar != null && zArr[7]) {
                fVar.i(7, hdVar.computeSize());
                this.f34447i.writeFields(fVar);
            }
            if (zArr[8]) {
                fVar.h(8, this.f34448m);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f34449n;
            if (gVar2 != null && zArr[9]) {
                fVar.b(9, gVar2);
            }
            if (zArr[10]) {
                fVar.e(10, this.f34450o);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f34451p;
            if (gVar3 != null && zArr[11]) {
                fVar.b(11, gVar3);
            }
            if (zArr[12]) {
                fVar.e(12, this.f34452q);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f34453r;
            if (gVar4 == null || !zArr[13]) {
                return 0;
            }
            fVar.b(13, gVar4);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 == null || !zArr[1]) ? 0 : 0 + b36.f.i(1, heVar2.computeSize());
            bw5.sc scVar2 = this.f34442d;
            if (scVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, scVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar5 = this.f34443e;
            if (gVar5 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar5);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f34444f);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f34445g);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f34446h);
            }
            bw5.hd hdVar2 = this.f34447i;
            if (hdVar2 != null && zArr[7]) {
                i18 += b36.f.i(7, hdVar2.computeSize());
            }
            if (zArr[8]) {
                i18 += b36.f.h(8, this.f34448m);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f34449n;
            if (gVar6 != null && zArr[9]) {
                i18 += b36.f.b(9, gVar6);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f34450o);
            }
            com.tencent.mm.protobuf.g gVar7 = this.f34451p;
            if (gVar7 != null && zArr[11]) {
                i18 += b36.f.b(11, gVar7);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f34452q);
            }
            com.tencent.mm.protobuf.g gVar8 = this.f34453r;
            return (gVar8 == null || !zArr[13]) ? i18 : i18 + b36.f.b(13, gVar8);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    this.BaseRequest = heVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.sc scVar3 = new bw5.sc();
                    if (bArr2 != null && bArr2.length > 0) {
                        scVar3.parseFrom(bArr2);
                    }
                    this.f34442d = scVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f34443e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34444f = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34445g = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34446h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.hd hdVar3 = new bw5.hd();
                    if (bArr3 != null && bArr3.length > 0) {
                        hdVar3.parseFrom(bArr3);
                    }
                    this.f34447i = hdVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f34448m = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34449n = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f34450o = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f34451p = aVar2.d(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f34452q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f34453r = aVar2.d(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.vp) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f34454s[1] = true;
        return this;
    }
}
