package bw5;

/* loaded from: classes2.dex */
public class ug0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f33888d;

    /* renamed from: e, reason: collision with root package name */
    public int f33889e;

    /* renamed from: f, reason: collision with root package name */
    public int f33890f;

    /* renamed from: g, reason: collision with root package name */
    public int f33891g;

    /* renamed from: h, reason: collision with root package name */
    public int f33892h;

    /* renamed from: i, reason: collision with root package name */
    public int f33893i;

    /* renamed from: m, reason: collision with root package name */
    public int f33894m;

    /* renamed from: n, reason: collision with root package name */
    public long f33895n;

    /* renamed from: o, reason: collision with root package name */
    public int f33896o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f33897p = new boolean[10];

    static {
        new bw5.ug0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ug0 parseFrom(byte[] bArr) {
        return (bw5.ug0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ug0)) {
            return false;
        }
        bw5.ug0 ug0Var = (bw5.ug0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f33888d), java.lang.Long.valueOf(ug0Var.f33888d)) && n51.f.a(java.lang.Integer.valueOf(this.f33889e), java.lang.Integer.valueOf(ug0Var.f33889e)) && n51.f.a(java.lang.Integer.valueOf(this.f33890f), java.lang.Integer.valueOf(ug0Var.f33890f)) && n51.f.a(java.lang.Integer.valueOf(this.f33891g), java.lang.Integer.valueOf(ug0Var.f33891g)) && n51.f.a(java.lang.Integer.valueOf(this.f33892h), java.lang.Integer.valueOf(ug0Var.f33892h)) && n51.f.a(java.lang.Integer.valueOf(this.f33893i), java.lang.Integer.valueOf(ug0Var.f33893i)) && n51.f.a(java.lang.Integer.valueOf(this.f33894m), java.lang.Integer.valueOf(ug0Var.f33894m)) && n51.f.a(java.lang.Long.valueOf(this.f33895n), java.lang.Long.valueOf(ug0Var.f33895n)) && n51.f.a(java.lang.Integer.valueOf(this.f33896o), java.lang.Integer.valueOf(ug0Var.f33896o));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ug0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33897p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f33888d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f33889e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33890f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f33891g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f33892h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f33893i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f33894m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f33895n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f33896o);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f33888d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f33889e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f33890f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f33891g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f33892h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f33893i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f33894m);
            }
            if (zArr[8]) {
                h17 += b36.f.h(8, this.f33895n);
            }
            return zArr[9] ? h17 + b36.f.e(9, this.f33896o) : h17;
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
                this.f33888d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33889e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33890f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33891g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33892h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33893i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33894m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33895n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33896o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
