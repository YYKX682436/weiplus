package bw5;

/* loaded from: classes2.dex */
public class py extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f31863d;

    /* renamed from: e, reason: collision with root package name */
    public int f31864e;

    /* renamed from: f, reason: collision with root package name */
    public int f31865f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31866g = new boolean[4];

    static {
        new bw5.py();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.py parseFrom(byte[] bArr) {
        return (bw5.py) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.py)) {
            return false;
        }
        bw5.py pyVar = (bw5.py) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f31863d), java.lang.Boolean.valueOf(pyVar.f31863d)) && n51.f.a(java.lang.Integer.valueOf(this.f31864e), java.lang.Integer.valueOf(pyVar.f31864e)) && n51.f.a(java.lang.Integer.valueOf(this.f31865f), java.lang.Integer.valueOf(pyVar.f31865f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.py();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31866g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f31863d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f31864e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f31865f);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f31863d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f31864e);
            }
            return zArr[3] ? a17 + b36.f.e(3, this.f31865f) : a17;
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
        if (intValue == 1) {
            this.f31863d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31864e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f31865f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
