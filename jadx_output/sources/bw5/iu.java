package bw5;

/* loaded from: classes2.dex */
public class iu extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28703e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28704f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.sp f28705g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.ps f28706h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f28702d = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f28707i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f28708m = new boolean[7];

    static {
        new bw5.iu();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.iu parseFrom(byte[] bArr) {
        return (bw5.iu) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.iu)) {
            return false;
        }
        bw5.iu iuVar = (bw5.iu) fVar;
        return n51.f.a(this.f28702d, iuVar.f28702d) && n51.f.a(this.f28703e, iuVar.f28703e) && n51.f.a(this.f28704f, iuVar.f28704f) && n51.f.a(this.f28705g, iuVar.f28705g) && n51.f.a(this.f28706h, iuVar.f28706h) && n51.f.a(this.f28707i, iuVar.f28707i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.iu();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28707i;
        java.util.LinkedList linkedList2 = this.f28702d;
        boolean[] zArr = this.f28708m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList2);
            java.lang.String str = this.f28703e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f28704f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.sp spVar = this.f28705g;
            if (spVar != null && zArr[4]) {
                fVar.i(4, spVar.computeSize());
                this.f28705g.writeFields(fVar);
            }
            bw5.ps psVar = this.f28706h;
            if (psVar != null && zArr[5]) {
                fVar.i(5, psVar.computeSize());
                this.f28706h.writeFields(fVar);
            }
            fVar.g(6, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, linkedList2) + 0;
            java.lang.String str3 = this.f28703e;
            if (str3 != null && zArr[2]) {
                g17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f28704f;
            if (str4 != null && zArr[3]) {
                g17 += b36.f.j(3, str4);
            }
            bw5.sp spVar2 = this.f28705g;
            if (spVar2 != null && zArr[4]) {
                g17 += b36.f.i(4, spVar2.computeSize());
            }
            bw5.ps psVar2 = this.f28706h;
            if (psVar2 != null && zArr[5]) {
                g17 += b36.f.i(5, psVar2.computeSize());
            }
            return g17 + b36.f.g(6, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
                linkedList2.add(aVar2.k(intValue));
                zArr[1] = true;
                return 0;
            case 2:
                this.f28703e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28704f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.sp spVar3 = new bw5.sp();
                    if (bArr != null && bArr.length > 0) {
                        spVar3.parseFrom(bArr);
                    }
                    this.f28705g = spVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.ps psVar3 = new bw5.ps();
                    if (bArr2 != null && bArr2.length > 0) {
                        psVar3.parseFrom(bArr2);
                    }
                    this.f28706h = psVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                linkedList.add(aVar2.k(intValue));
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
