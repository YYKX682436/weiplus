package bw5;

/* loaded from: classes2.dex */
public class gm extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27905d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27906e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27907f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27908g;

    /* renamed from: h, reason: collision with root package name */
    public int f27909h;

    /* renamed from: i, reason: collision with root package name */
    public int f27910i;

    /* renamed from: m, reason: collision with root package name */
    public int f27911m;

    /* renamed from: n, reason: collision with root package name */
    public long f27912n;

    /* renamed from: o, reason: collision with root package name */
    public long f27913o;

    /* renamed from: p, reason: collision with root package name */
    public long f27914p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.ao f27915q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f27916r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f27917s = new boolean[13];

    static {
        new bw5.gm();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gm parseFrom(byte[] bArr) {
        return (bw5.gm) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gm)) {
            return false;
        }
        bw5.gm gmVar = (bw5.gm) fVar;
        return n51.f.a(this.f27905d, gmVar.f27905d) && n51.f.a(this.f27906e, gmVar.f27906e) && n51.f.a(this.f27907f, gmVar.f27907f) && n51.f.a(this.f27908g, gmVar.f27908g) && n51.f.a(java.lang.Integer.valueOf(this.f27909h), java.lang.Integer.valueOf(gmVar.f27909h)) && n51.f.a(java.lang.Integer.valueOf(this.f27910i), java.lang.Integer.valueOf(gmVar.f27910i)) && n51.f.a(java.lang.Integer.valueOf(this.f27911m), java.lang.Integer.valueOf(gmVar.f27911m)) && n51.f.a(java.lang.Long.valueOf(this.f27912n), java.lang.Long.valueOf(gmVar.f27912n)) && n51.f.a(java.lang.Long.valueOf(this.f27913o), java.lang.Long.valueOf(gmVar.f27913o)) && n51.f.a(java.lang.Long.valueOf(this.f27914p), java.lang.Long.valueOf(gmVar.f27914p)) && n51.f.a(this.f27915q, gmVar.f27915q) && n51.f.a(this.f27916r, gmVar.f27916r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gm();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27917s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27905d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f27906e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f27907f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.f27908g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f27909h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f27910i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f27911m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f27912n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f27913o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f27914p);
            }
            bw5.ao aoVar = this.f27915q;
            if (aoVar != null && zArr[11]) {
                fVar.i(11, aoVar.computeSize());
                this.f27915q.writeFields(fVar);
            }
            java.lang.String str4 = this.f27916r;
            if (str4 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str4);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f27905d;
            int j17 = (str5 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str5);
            java.lang.String str6 = this.f27906e;
            if (str6 != null && zArr[2]) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f27907f;
            if (str7 != null && zArr[3]) {
                j17 += b36.f.j(3, str7);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27908g;
            if (gVar2 != null && zArr[4]) {
                j17 += b36.f.b(4, gVar2);
            }
            if (zArr[5]) {
                j17 += b36.f.e(5, this.f27909h);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f27910i);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f27911m);
            }
            if (zArr[8]) {
                j17 += b36.f.h(8, this.f27912n);
            }
            if (zArr[9]) {
                j17 += b36.f.h(9, this.f27913o);
            }
            if (zArr[10]) {
                j17 += b36.f.h(10, this.f27914p);
            }
            bw5.ao aoVar2 = this.f27915q;
            if (aoVar2 != null && zArr[11]) {
                j17 += b36.f.i(11, aoVar2.computeSize());
            }
            java.lang.String str8 = this.f27916r;
            return (str8 == null || !zArr[12]) ? j17 : j17 + b36.f.j(12, str8);
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
                this.f27905d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27906e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27907f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27908g = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27909h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27910i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27911m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27912n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f27913o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f27914p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.ao aoVar3 = new bw5.ao();
                    if (bArr != null && bArr.length > 0) {
                        aoVar3.parseFrom(bArr);
                    }
                    this.f27915q = aoVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f27916r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
