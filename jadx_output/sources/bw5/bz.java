package bw5;

/* loaded from: classes2.dex */
public class bz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25861d;

    /* renamed from: e, reason: collision with root package name */
    public int f25862e;

    /* renamed from: f, reason: collision with root package name */
    public long f25863f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f25864g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f25865h = new boolean[5];

    static {
        new bw5.bz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bz parseFrom(byte[] bArr) {
        return (bw5.bz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bz)) {
            return false;
        }
        bw5.bz bzVar = (bw5.bz) fVar;
        return n51.f.a(this.f25861d, bzVar.f25861d) && n51.f.a(java.lang.Integer.valueOf(this.f25862e), java.lang.Integer.valueOf(bzVar.f25862e)) && n51.f.a(java.lang.Long.valueOf(this.f25863f), java.lang.Long.valueOf(bzVar.f25863f)) && n51.f.a(this.f25864g, bzVar.f25864g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25864g;
        boolean[] zArr = this.f25865h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25861d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f25862e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f25863f);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f25861d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f25862e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f25863f);
            }
            return i18 + b36.f.g(4, 8, linkedList);
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
            this.f25861d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25862e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f25863f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.az azVar = new bw5.az();
            if (bArr != null && bArr.length > 0) {
                azVar.parseFrom(bArr);
            }
            linkedList.add(azVar);
        }
        zArr[4] = true;
        return 0;
    }
}
