package bw5;

/* loaded from: classes2.dex */
public class wr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f34833d;

    /* renamed from: f, reason: collision with root package name */
    public long f34835f;

    /* renamed from: g, reason: collision with root package name */
    public long f34836g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f34834e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f34837h = new boolean[6];

    static {
        new bw5.wr();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wr parseFrom(byte[] bArr) {
        return (bw5.wr) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wr)) {
            return false;
        }
        bw5.wr wrVar = (bw5.wr) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f34833d), java.lang.Long.valueOf(wrVar.f34833d)) && n51.f.a(this.f34834e, wrVar.f34834e) && n51.f.a(java.lang.Long.valueOf(this.f34835f), java.lang.Long.valueOf(wrVar.f34835f)) && n51.f.a(java.lang.Long.valueOf(this.f34836g), java.lang.Long.valueOf(wrVar.f34836g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wr();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34834e;
        boolean[] zArr = this.f34837h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f34833d);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.h(3, this.f34835f);
            }
            if (zArr[5]) {
                fVar.h(5, this.f34836g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = (zArr[1] ? 0 + b36.f.h(1, this.f34833d) : 0) + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f34835f);
            }
            return zArr[5] ? h17 + b36.f.h(5, this.f34836g) : h17;
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
            this.f34833d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f34835f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f34836g = aVar2.i(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.xr xrVar = new bw5.xr();
            if (bArr != null && bArr.length > 0) {
                xrVar.parseFrom(bArr);
            }
            linkedList.add(xrVar);
        }
        zArr[2] = true;
        return 0;
    }
}
