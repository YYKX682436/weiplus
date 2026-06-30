package bw5;

/* loaded from: classes12.dex */
public class r9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32442d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32443e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32444f;

    /* renamed from: g, reason: collision with root package name */
    public int f32445g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.x7 f32446h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.l9 f32447i;

    /* renamed from: m, reason: collision with root package name */
    public long f32448m;

    /* renamed from: n, reason: collision with root package name */
    public final android.util.ArrayMap f32449n = new android.util.ArrayMap();

    static {
        new bw5.r9();
    }

    public bw5.l9 b() {
        return hasFieldNumber(6) ? this.f32447i : new bw5.l9();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.r9 parseFrom(byte[] bArr) {
        return (bw5.r9) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r9)) {
            return false;
        }
        bw5.r9 r9Var = (bw5.r9) fVar;
        return n51.f.a(this.f32442d, r9Var.f32442d) && n51.f.a(this.f32443e, r9Var.f32443e) && n51.f.a(this.f32444f, r9Var.f32444f) && n51.f.a(java.lang.Integer.valueOf(this.f32445g), java.lang.Integer.valueOf(r9Var.f32445g)) && n51.f.a(this.f32446h, r9Var.f32446h) && n51.f.a(this.f32447i, r9Var.f32447i) && n51.f.a(java.lang.Long.valueOf(this.f32448m), java.lang.Long.valueOf(r9Var.f32448m));
    }

    public java.lang.String getAppid() {
        return hasFieldNumber(1) ? this.f32442d : "";
    }

    public java.lang.String getName() {
        return hasFieldNumber(2) ? this.f32443e : "";
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f32449n.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.r9();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f32442d != null && hasFieldNumber(1)) {
                fVar.j(1, this.f32442d);
            }
            if (this.f32443e != null && hasFieldNumber(2)) {
                fVar.j(2, this.f32443e);
            }
            if (this.f32444f != null && hasFieldNumber(3)) {
                fVar.j(3, this.f32444f);
            }
            if (hasFieldNumber(4)) {
                fVar.e(4, this.f32445g);
            }
            if (this.f32446h != null && hasFieldNumber(5)) {
                fVar.i(5, this.f32446h.computeSize());
                this.f32446h.writeFields(fVar);
            }
            if (this.f32447i != null && hasFieldNumber(6)) {
                fVar.i(6, this.f32447i.computeSize());
                this.f32447i.writeFields(fVar);
            }
            if (hasFieldNumber(100)) {
                fVar.h(100, this.f32448m);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f32442d != null && hasFieldNumber(1)) {
                i18 = 0 + b36.f.j(1, this.f32442d);
            }
            if (this.f32443e != null && hasFieldNumber(2)) {
                i18 += b36.f.j(2, this.f32443e);
            }
            if (this.f32444f != null && hasFieldNumber(3)) {
                i18 += b36.f.j(3, this.f32444f);
            }
            if (hasFieldNumber(4)) {
                i18 += b36.f.e(4, this.f32445g);
            }
            if (this.f32446h != null && hasFieldNumber(5)) {
                i18 += b36.f.i(5, this.f32446h.computeSize());
            }
            if (this.f32447i != null && hasFieldNumber(6)) {
                i18 += b36.f.i(6, this.f32447i.computeSize());
            }
            return hasFieldNumber(100) ? i18 + b36.f.h(100, this.f32448m) : i18;
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
        android.util.ArrayMap arrayMap = this.f32449n;
        if (intValue == 100) {
            this.f32448m = aVar2.i(intValue);
            arrayMap.put(100, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f32442d = aVar2.k(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f32443e = aVar2.k(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f32444f = aVar2.k(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f32445g = aVar2.g(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.x7 x7Var = new bw5.x7();
                    if (bArr != null && bArr.length > 0) {
                        x7Var.parseFrom(bArr);
                    }
                    this.f32446h = x7Var;
                }
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.l9 l9Var = new bw5.l9();
                    if (bArr2 != null && bArr2.length > 0) {
                        l9Var.parseFrom(bArr2);
                    }
                    this.f32447i = l9Var;
                }
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
