package bw5;

/* loaded from: classes2.dex */
public class s30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f32782d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32783e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32784f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32785g;

    /* renamed from: h, reason: collision with root package name */
    public final android.util.ArrayMap f32786h = new android.util.ArrayMap();

    static {
        new bw5.s30();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.s30 parseFrom(byte[] bArr) {
        return (bw5.s30) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s30)) {
            return false;
        }
        bw5.s30 s30Var = (bw5.s30) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f32782d), java.lang.Boolean.valueOf(s30Var.f32782d)) && n51.f.a(java.lang.Boolean.valueOf(this.f32783e), java.lang.Boolean.valueOf(s30Var.f32783e)) && n51.f.a(java.lang.Boolean.valueOf(this.f32784f), java.lang.Boolean.valueOf(s30Var.f32784f)) && n51.f.a(java.lang.Boolean.valueOf(this.f32785g), java.lang.Boolean.valueOf(s30Var.f32785g));
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f32786h.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.s30();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (hasFieldNumber(1)) {
                fVar.a(1, this.f32782d);
            }
            if (hasFieldNumber(2)) {
                fVar.a(2, this.f32783e);
            }
            if (hasFieldNumber(3)) {
                fVar.a(3, this.f32784f);
            }
            if (hasFieldNumber(101)) {
                fVar.a(101, this.f32785g);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = hasFieldNumber(1) ? 0 + b36.f.a(1, this.f32782d) : 0;
            if (hasFieldNumber(2)) {
                a17 += b36.f.a(2, this.f32783e);
            }
            if (hasFieldNumber(3)) {
                a17 += b36.f.a(3, this.f32784f);
            }
            return hasFieldNumber(101) ? a17 + b36.f.a(101, this.f32785g) : a17;
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
        android.util.ArrayMap arrayMap = this.f32786h;
        if (intValue == 1) {
            this.f32782d = aVar2.c(intValue);
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            this.f32783e = aVar2.c(intValue);
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3) {
            this.f32784f = aVar2.c(intValue);
            arrayMap.put(3, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue != 101) {
            return -1;
        }
        this.f32785g = aVar2.c(intValue);
        arrayMap.put(101, java.lang.Boolean.TRUE);
        return 0;
    }
}
