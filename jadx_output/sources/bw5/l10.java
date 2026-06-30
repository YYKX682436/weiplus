package bw5;

/* loaded from: classes2.dex */
public class l10 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f29603e;

    /* renamed from: f, reason: collision with root package name */
    public long f29604f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f29602d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f29605g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f29606h = new boolean[6];

    static {
        new bw5.l10();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.l10 parseFrom(byte[] bArr) {
        return (bw5.l10) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l10)) {
            return false;
        }
        bw5.l10 l10Var = (bw5.l10) fVar;
        return n51.f.a(this.f29602d, l10Var.f29602d) && n51.f.a(java.lang.Integer.valueOf(this.f29603e), java.lang.Integer.valueOf(l10Var.f29603e)) && n51.f.a(java.lang.Long.valueOf(this.f29604f), java.lang.Long.valueOf(l10Var.f29604f)) && n51.f.a(this.f29605g, l10Var.f29605g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.l10();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29605g;
        java.util.LinkedList linkedList2 = this.f29602d;
        boolean[] zArr = this.f29606h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            if (zArr[2]) {
                fVar.e(2, this.f29603e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f29604f);
            }
            fVar.g(5, 3, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            if (zArr[2]) {
                g17 += b36.f.e(2, this.f29603e);
            }
            if (zArr[3]) {
                g17 += b36.f.h(3, this.f29604f);
            }
            return g17 + b36.f.g(5, 3, linkedList);
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f29603e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f29604f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            linkedList.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.k10 k10Var = new bw5.k10();
            if (bArr != null && bArr.length > 0) {
                k10Var.parseFrom(bArr);
            }
            linkedList2.add(k10Var);
        }
        zArr[1] = true;
        return 0;
    }
}
