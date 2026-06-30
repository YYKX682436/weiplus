package bw5;

/* loaded from: classes4.dex */
public class ic0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28523d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28524e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28525f;

    /* renamed from: g, reason: collision with root package name */
    public long f28526g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28527h;

    /* renamed from: i, reason: collision with root package name */
    public long f28528i;

    /* renamed from: m, reason: collision with root package name */
    public int f28529m;

    /* renamed from: n, reason: collision with root package name */
    public int f28530n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.gc0 f28531o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f28532p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.hc0 f28533q;

    /* renamed from: r, reason: collision with root package name */
    public final android.util.ArrayMap f28534r = new android.util.ArrayMap();

    static {
        new bw5.ic0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ic0 parseFrom(byte[] bArr) {
        return (bw5.ic0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ic0)) {
            return false;
        }
        bw5.ic0 ic0Var = (bw5.ic0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28523d), java.lang.Integer.valueOf(ic0Var.f28523d)) && n51.f.a(this.f28524e, ic0Var.f28524e) && n51.f.a(this.f28525f, ic0Var.f28525f) && n51.f.a(java.lang.Long.valueOf(this.f28526g), java.lang.Long.valueOf(ic0Var.f28526g)) && n51.f.a(this.f28527h, ic0Var.f28527h) && n51.f.a(java.lang.Long.valueOf(this.f28528i), java.lang.Long.valueOf(ic0Var.f28528i)) && n51.f.a(java.lang.Integer.valueOf(this.f28529m), java.lang.Integer.valueOf(ic0Var.f28529m)) && n51.f.a(java.lang.Integer.valueOf(this.f28530n), java.lang.Integer.valueOf(ic0Var.f28530n)) && n51.f.a(this.f28531o, ic0Var.f28531o) && n51.f.a(this.f28532p, ic0Var.f28532p) && n51.f.a(this.f28533q, ic0Var.f28533q);
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f28534r.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ic0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (hasFieldNumber(5)) {
                fVar.e(5, this.f28523d);
            }
            if (this.f28524e != null && hasFieldNumber(1)) {
                fVar.j(1, this.f28524e);
            }
            if (this.f28525f != null && hasFieldNumber(4)) {
                fVar.j(4, this.f28525f);
            }
            if (hasFieldNumber(2)) {
                fVar.h(2, this.f28526g);
            }
            if (this.f28527h != null && hasFieldNumber(3)) {
                fVar.j(3, this.f28527h);
            }
            if (hasFieldNumber(6)) {
                fVar.h(6, this.f28528i);
            }
            if (hasFieldNumber(7)) {
                fVar.e(7, this.f28529m);
            }
            if (hasFieldNumber(8)) {
                fVar.e(8, this.f28530n);
            }
            if (this.f28531o != null && hasFieldNumber(100)) {
                fVar.i(100, this.f28531o.computeSize());
                this.f28531o.writeFields(fVar);
            }
            if (this.f28532p != null && hasFieldNumber(101)) {
                fVar.b(101, this.f28532p);
            }
            if (this.f28533q != null && hasFieldNumber(200)) {
                fVar.i(200, this.f28533q.computeSize());
                this.f28533q.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = hasFieldNumber(5) ? 0 + b36.f.e(5, this.f28523d) : 0;
            if (this.f28524e != null && hasFieldNumber(1)) {
                e17 += b36.f.j(1, this.f28524e);
            }
            if (this.f28525f != null && hasFieldNumber(4)) {
                e17 += b36.f.j(4, this.f28525f);
            }
            if (hasFieldNumber(2)) {
                e17 += b36.f.h(2, this.f28526g);
            }
            if (this.f28527h != null && hasFieldNumber(3)) {
                e17 += b36.f.j(3, this.f28527h);
            }
            if (hasFieldNumber(6)) {
                e17 += b36.f.h(6, this.f28528i);
            }
            if (hasFieldNumber(7)) {
                e17 += b36.f.e(7, this.f28529m);
            }
            if (hasFieldNumber(8)) {
                e17 += b36.f.e(8, this.f28530n);
            }
            if (this.f28531o != null && hasFieldNumber(100)) {
                e17 += b36.f.i(100, this.f28531o.computeSize());
            }
            if (this.f28532p != null && hasFieldNumber(101)) {
                e17 += b36.f.b(101, this.f28532p);
            }
            return (this.f28533q == null || !hasFieldNumber(200)) ? e17 : e17 + b36.f.i(200, this.f28533q.computeSize());
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
        android.util.ArrayMap arrayMap = this.f28534r;
        if (intValue == 100) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.gc0 gc0Var = new bw5.gc0();
                if (bArr != null && bArr.length > 0) {
                    gc0Var.parseFrom(bArr);
                }
                this.f28531o = gc0Var;
            }
            arrayMap.put(100, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 101) {
            this.f28532p = aVar2.d(intValue);
            arrayMap.put(101, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 200) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.hc0 hc0Var = new bw5.hc0();
                if (bArr2 != null && bArr2.length > 0) {
                    hc0Var.parseFrom(bArr2);
                }
                this.f28533q = hc0Var;
            }
            arrayMap.put(200, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f28524e = aVar2.k(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f28526g = aVar2.i(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f28527h = aVar2.k(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f28525f = aVar2.k(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f28523d = aVar2.g(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f28528i = aVar2.i(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f28529m = aVar2.g(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f28530n = aVar2.g(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
