package bw5;

/* loaded from: classes2.dex */
public class ch extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26083e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26084f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f26082d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f26085g = new boolean[4];

    static {
        new bw5.ch();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ch parseFrom(byte[] bArr) {
        return (bw5.ch) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ch)) {
            return false;
        }
        bw5.ch chVar = (bw5.ch) fVar;
        return n51.f.a(this.f26082d, chVar.f26082d) && n51.f.a(this.f26083e, chVar.f26083e) && n51.f.a(this.f26084f, chVar.f26084f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ch();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f26082d;
        boolean[] zArr = this.f26085g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f26083e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f26084f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str3 = this.f26083e;
            if (str3 != null && zArr[2]) {
                g17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f26084f;
            return (str4 == null || !zArr[3]) ? g17 : g17 + b36.f.j(3, str4);
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f26083e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f26084f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.bh bhVar = new bw5.bh();
            if (bArr != null && bArr.length > 0) {
                bhVar.parseFrom(bArr);
            }
            linkedList.add(bhVar);
        }
        zArr[1] = true;
        return 0;
    }
}
