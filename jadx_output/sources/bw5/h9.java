package bw5;

/* loaded from: classes8.dex */
public class h9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.j9 f28122d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28123e;

    /* renamed from: f, reason: collision with root package name */
    public int f28124f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28126h;

    /* renamed from: i, reason: collision with root package name */
    public long f28127i;

    /* renamed from: m, reason: collision with root package name */
    public int f28128m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f28129n;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f28125g = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final android.util.ArrayMap f28130o = new android.util.ArrayMap();

    static {
        new bw5.h9();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.h9 parseFrom(byte[] bArr) {
        return (bw5.h9) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h9)) {
            return false;
        }
        bw5.h9 h9Var = (bw5.h9) fVar;
        return n51.f.a(this.f28122d, h9Var.f28122d) && n51.f.a(this.f28123e, h9Var.f28123e) && n51.f.a(java.lang.Integer.valueOf(this.f28124f), java.lang.Integer.valueOf(h9Var.f28124f)) && n51.f.a(this.f28125g, h9Var.f28125g) && n51.f.a(java.lang.Boolean.valueOf(this.f28126h), java.lang.Boolean.valueOf(h9Var.f28126h)) && n51.f.a(java.lang.Long.valueOf(this.f28127i), java.lang.Long.valueOf(h9Var.f28127i)) && n51.f.a(java.lang.Integer.valueOf(this.f28128m), java.lang.Integer.valueOf(h9Var.f28128m)) && n51.f.a(this.f28129n, h9Var.f28129n);
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f28130o.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.h9();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28125g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f28122d != null && hasFieldNumber(1)) {
                fVar.e(1, this.f28122d.f28877d);
            }
            if (this.f28123e != null && hasFieldNumber(2)) {
                fVar.j(2, this.f28123e);
            }
            if (hasFieldNumber(3)) {
                fVar.e(3, this.f28124f);
            }
            fVar.g(4, 8, linkedList);
            if (hasFieldNumber(5)) {
                fVar.a(5, this.f28126h);
            }
            if (hasFieldNumber(6)) {
                fVar.h(6, this.f28127i);
            }
            if (hasFieldNumber(100)) {
                fVar.e(100, this.f28128m);
            }
            if (this.f28129n != null && hasFieldNumber(101)) {
                fVar.j(101, this.f28129n);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f28122d != null && hasFieldNumber(1)) {
                i18 = 0 + b36.f.e(1, this.f28122d.f28877d);
            }
            if (this.f28123e != null && hasFieldNumber(2)) {
                i18 += b36.f.j(2, this.f28123e);
            }
            if (hasFieldNumber(3)) {
                i18 += b36.f.e(3, this.f28124f);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList);
            if (hasFieldNumber(5)) {
                g17 += b36.f.a(5, this.f28126h);
            }
            if (hasFieldNumber(6)) {
                g17 += b36.f.h(6, this.f28127i);
            }
            if (hasFieldNumber(100)) {
                g17 += b36.f.e(100, this.f28128m);
            }
            return (this.f28129n == null || !hasFieldNumber(101)) ? g17 : g17 + b36.f.j(101, this.f28129n);
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
        android.util.ArrayMap arrayMap = this.f28130o;
        if (intValue == 100) {
            this.f28128m = aVar2.g(intValue);
            arrayMap.put(100, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 101) {
            this.f28129n = aVar2.k(intValue);
            arrayMap.put(101, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f28122d = bw5.j9.a(aVar2.g(intValue));
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f28123e = aVar2.k(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f28124f = aVar2.g(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
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
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f28126h = aVar2.c(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f28127i = aVar2.i(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
