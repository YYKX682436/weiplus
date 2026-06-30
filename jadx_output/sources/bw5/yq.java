package bw5;

/* loaded from: classes2.dex */
public class yq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.cc f35608d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35610f;

    /* renamed from: g, reason: collision with root package name */
    public int f35611g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35612h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f35609e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35613i = new boolean[6];

    static {
        new bw5.yq();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yq parseFrom(byte[] bArr) {
        return (bw5.yq) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yq)) {
            return false;
        }
        bw5.yq yqVar = (bw5.yq) fVar;
        return n51.f.a(this.f35608d, yqVar.f35608d) && n51.f.a(this.f35609e, yqVar.f35609e) && n51.f.a(this.f35610f, yqVar.f35610f) && n51.f.a(java.lang.Integer.valueOf(this.f35611g), java.lang.Integer.valueOf(yqVar.f35611g)) && n51.f.a(this.f35612h, yqVar.f35612h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f35609e;
        boolean[] zArr = this.f35613i;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.cc ccVar = this.f35608d;
            if (ccVar != null && zArr[1]) {
                fVar.i(1, ccVar.computeSize());
                this.f35608d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f35610f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35611g);
            }
            java.lang.String str2 = this.f35612h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.cc ccVar2 = this.f35608d;
            if (ccVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ccVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            java.lang.String str3 = this.f35610f;
            if (str3 != null && zArr[3]) {
                g17 += b36.f.j(3, str3);
            }
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f35611g);
            }
            java.lang.String str4 = this.f35612h;
            return (str4 == null || !zArr[5]) ? g17 : g17 + b36.f.j(5, str4);
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.cc ccVar3 = new bw5.cc();
                if (bArr != null && bArr.length > 0) {
                    ccVar3.parseFrom(bArr);
                }
                this.f35608d = ccVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f35610f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f35611g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f35612h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.cc ccVar4 = new bw5.cc();
            if (bArr2 != null && bArr2.length > 0) {
                ccVar4.parseFrom(bArr2);
            }
            linkedList.add(ccVar4);
        }
        zArr[2] = true;
        return 0;
    }
}
