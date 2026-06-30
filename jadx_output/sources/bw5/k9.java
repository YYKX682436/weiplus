package bw5;

/* loaded from: classes8.dex */
public class k9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.j9 f29296d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f29297e;

    /* renamed from: g, reason: collision with root package name */
    public int f29299g;

    /* renamed from: h, reason: collision with root package name */
    public int f29300h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f29298f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final android.util.ArrayMap f29301i = new android.util.ArrayMap();

    static {
        new bw5.k9();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.k9 parseFrom(byte[] bArr) {
        return (bw5.k9) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k9)) {
            return false;
        }
        bw5.k9 k9Var = (bw5.k9) fVar;
        return n51.f.a(this.f29296d, k9Var.f29296d) && n51.f.a(this.f29297e, k9Var.f29297e) && n51.f.a(this.f29298f, k9Var.f29298f) && n51.f.a(java.lang.Integer.valueOf(this.f29299g), java.lang.Integer.valueOf(k9Var.f29299g)) && n51.f.a(java.lang.Integer.valueOf(this.f29300h), java.lang.Integer.valueOf(k9Var.f29300h));
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f29301i.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.k9();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29298f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f29296d != null && hasFieldNumber(1)) {
                fVar.e(1, this.f29296d.f28877d);
            }
            if (this.f29297e != null && hasFieldNumber(2)) {
                fVar.b(2, this.f29297e);
            }
            fVar.g(3, 8, linkedList);
            if (hasFieldNumber(4)) {
                fVar.e(4, this.f29299g);
            }
            if (hasFieldNumber(100)) {
                fVar.e(100, this.f29300h);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f29296d != null && hasFieldNumber(1)) {
                i18 = 0 + b36.f.e(1, this.f29296d.f28877d);
            }
            if (this.f29297e != null && hasFieldNumber(2)) {
                i18 += b36.f.b(2, this.f29297e);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            if (hasFieldNumber(4)) {
                g17 += b36.f.e(4, this.f29299g);
            }
            return hasFieldNumber(100) ? g17 + b36.f.e(100, this.f29300h) : g17;
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
        android.util.ArrayMap arrayMap = this.f29301i;
        if (intValue == 1) {
            this.f29296d = bw5.j9.a(aVar2.g(intValue));
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            this.f29297e = aVar2.d(intValue);
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f29299g = aVar2.g(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            }
            if (intValue != 100) {
                return -1;
            }
            this.f29300h = aVar2.g(intValue);
            arrayMap.put(100, java.lang.Boolean.TRUE);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.m9 m9Var = new bw5.m9();
            if (bArr != null && bArr.length > 0) {
                m9Var.parseFrom(bArr);
            }
            linkedList.add(m9Var);
        }
        arrayMap.put(3, java.lang.Boolean.TRUE);
        return 0;
    }
}
