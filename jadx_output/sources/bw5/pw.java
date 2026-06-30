package bw5;

/* loaded from: classes2.dex */
public class pw extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f31856e;

    /* renamed from: f, reason: collision with root package name */
    public int f31857f;

    /* renamed from: g, reason: collision with root package name */
    public int f31858g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f31855d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f31859h = new boolean[5];

    static {
        new bw5.pw();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pw parseFrom(byte[] bArr) {
        return (bw5.pw) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pw)) {
            return false;
        }
        bw5.pw pwVar = (bw5.pw) fVar;
        return n51.f.a(this.f31855d, pwVar.f31855d) && n51.f.a(java.lang.Integer.valueOf(this.f31856e), java.lang.Integer.valueOf(pwVar.f31856e)) && n51.f.a(java.lang.Integer.valueOf(this.f31857f), java.lang.Integer.valueOf(pwVar.f31857f)) && n51.f.a(java.lang.Integer.valueOf(this.f31858g), java.lang.Integer.valueOf(pwVar.f31858g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pw();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f31855d;
        boolean[] zArr = this.f31859h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.e(2, this.f31856e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f31857f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f31858g);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.e(2, this.f31856e);
            }
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f31857f);
            }
            return zArr[4] ? g17 + b36.f.e(4, this.f31858g) : g17;
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
                this.f31856e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f31857f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f31858g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.ow owVar = new bw5.ow();
            if (bArr != null && bArr.length > 0) {
                owVar.parseFrom(bArr);
            }
            linkedList.add(owVar);
        }
        zArr[1] = true;
        return 0;
    }
}
