package bo1;

/* loaded from: classes2.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f22995d;

    /* renamed from: e, reason: collision with root package name */
    public int f22996e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f22997f;

    /* renamed from: g, reason: collision with root package name */
    public bo1.q f22998g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f22999h;

    /* renamed from: i, reason: collision with root package name */
    public bo1.n f23000i;

    /* renamed from: m, reason: collision with root package name */
    public int f23001m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f23002n;

    /* renamed from: o, reason: collision with root package name */
    public bo1.i f23003o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bo1.h)) {
            return false;
        }
        bo1.h hVar = (bo1.h) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f22995d), java.lang.Long.valueOf(hVar.f22995d)) && n51.f.a(java.lang.Integer.valueOf(this.f22996e), java.lang.Integer.valueOf(hVar.f22996e)) && n51.f.a(this.f22997f, hVar.f22997f) && n51.f.a(this.f22998g, hVar.f22998g) && n51.f.a(this.f22999h, hVar.f22999h) && n51.f.a(this.f23000i, hVar.f23000i) && n51.f.a(java.lang.Integer.valueOf(this.f23001m), java.lang.Integer.valueOf(hVar.f23001m)) && n51.f.a(this.f23002n, hVar.f23002n) && n51.f.a(this.f23003o, hVar.f23003o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f22995d);
            fVar.e(2, this.f22996e);
            java.lang.String str = this.f22997f;
            if (str != null) {
                fVar.j(3, str);
            }
            bo1.q qVar = this.f22998g;
            if (qVar != null) {
                fVar.i(4, qVar.computeSize());
                this.f22998g.writeFields(fVar);
            }
            java.lang.String str2 = this.f22999h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            bo1.n nVar = this.f23000i;
            if (nVar != null) {
                fVar.i(6, nVar.computeSize());
                this.f23000i.writeFields(fVar);
            }
            fVar.e(7, this.f23001m);
            java.lang.String str3 = this.f23002n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            bo1.i iVar = this.f23003o;
            if (iVar != null) {
                fVar.i(10, iVar.computeSize());
                this.f23003o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f22995d) + 0 + b36.f.e(2, this.f22996e);
            java.lang.String str4 = this.f22997f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            bo1.q qVar2 = this.f22998g;
            if (qVar2 != null) {
                h17 += b36.f.i(4, qVar2.computeSize());
            }
            java.lang.String str5 = this.f22999h;
            if (str5 != null) {
                h17 += b36.f.j(5, str5);
            }
            bo1.n nVar2 = this.f23000i;
            if (nVar2 != null) {
                h17 += b36.f.i(6, nVar2.computeSize());
            }
            int e17 = h17 + b36.f.e(7, this.f23001m);
            java.lang.String str6 = this.f23002n;
            if (str6 != null) {
                e17 += b36.f.j(8, str6);
            }
            bo1.i iVar2 = this.f23003o;
            return iVar2 != null ? e17 + b36.f.i(10, iVar2.computeSize()) : e17;
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
        bo1.h hVar = (bo1.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hVar.f22995d = aVar2.i(intValue);
                return 0;
            case 2:
                hVar.f22996e = aVar2.g(intValue);
                return 0;
            case 3:
                hVar.f22997f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bo1.q qVar3 = new bo1.q();
                    if (bArr != null && bArr.length > 0) {
                        qVar3.parseFrom(bArr);
                    }
                    hVar.f22998g = qVar3;
                }
                return 0;
            case 5:
                hVar.f22999h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bo1.n nVar3 = new bo1.n();
                    if (bArr2 != null && bArr2.length > 0) {
                        nVar3.parseFrom(bArr2);
                    }
                    hVar.f23000i = nVar3;
                }
                return 0;
            case 7:
                hVar.f23001m = aVar2.g(intValue);
                return 0;
            case 8:
                hVar.f23002n = aVar2.k(intValue);
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bo1.i iVar3 = new bo1.i();
                    if (bArr3 != null && bArr3.length > 0) {
                        iVar3.parseFrom(bArr3);
                    }
                    hVar.f23003o = iVar3;
                }
                return 0;
        }
    }
}
