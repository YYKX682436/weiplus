package bw5;

/* loaded from: classes12.dex */
public class u0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f33671d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33672e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33673f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33674g;

    /* renamed from: h, reason: collision with root package name */
    public long f33675h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f33676i;

    /* renamed from: m, reason: collision with root package name */
    public long f33677m;

    /* renamed from: n, reason: collision with root package name */
    public long f33678n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f33679o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f33680p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f33681q;

    /* renamed from: r, reason: collision with root package name */
    public int f33682r;

    /* renamed from: s, reason: collision with root package name */
    public int f33683s;

    static {
        new bw5.u0();
    }

    public long b() {
        return this.f33677m;
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.u0 parseFrom(byte[] bArr) {
        return (bw5.u0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u0)) {
            return false;
        }
        bw5.u0 u0Var = (bw5.u0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f33671d), java.lang.Integer.valueOf(u0Var.f33671d)) && n51.f.a(this.f33672e, u0Var.f33672e) && n51.f.a(this.f33673f, u0Var.f33673f) && n51.f.a(this.f33674g, u0Var.f33674g) && n51.f.a(java.lang.Long.valueOf(this.f33675h), java.lang.Long.valueOf(u0Var.f33675h)) && n51.f.a(this.f33676i, u0Var.f33676i) && n51.f.a(java.lang.Long.valueOf(this.f33677m), java.lang.Long.valueOf(u0Var.f33677m)) && n51.f.a(java.lang.Long.valueOf(this.f33678n), java.lang.Long.valueOf(u0Var.f33678n)) && n51.f.a(this.f33679o, u0Var.f33679o) && n51.f.a(this.f33680p, u0Var.f33680p) && n51.f.a(this.f33681q, u0Var.f33681q) && n51.f.a(java.lang.Integer.valueOf(this.f33682r), java.lang.Integer.valueOf(u0Var.f33682r)) && n51.f.a(java.lang.Integer.valueOf(this.f33683s), java.lang.Integer.valueOf(u0Var.f33683s));
    }

    public long getCreateTime() {
        return this.f33675h;
    }

    public java.lang.String getFromUsername() {
        return this.f33672e;
    }

    public java.lang.String getToUsername() {
        return this.f33673f;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.u0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f33680p;
        java.util.LinkedList linkedList2 = this.f33679o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f33671d);
            java.lang.String str = this.f33672e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f33673f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f33674g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.h(5, this.f33675h);
            java.lang.String str4 = this.f33676i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.h(7, this.f33677m);
            fVar.h(8, this.f33678n);
            fVar.g(9, 1, linkedList2);
            fVar.g(10, 2, linkedList);
            java.lang.String str5 = this.f33681q;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            fVar.e(12, this.f33682r);
            fVar.e(13, this.f33683s);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f33671d) + 0;
            java.lang.String str6 = this.f33672e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f33673f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f33674g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            int h17 = e17 + b36.f.h(5, this.f33675h);
            java.lang.String str9 = this.f33676i;
            if (str9 != null) {
                h17 += b36.f.j(6, str9);
            }
            int h18 = h17 + b36.f.h(7, this.f33677m) + b36.f.h(8, this.f33678n) + b36.f.g(9, 1, linkedList2) + b36.f.g(10, 2, linkedList);
            java.lang.String str10 = this.f33681q;
            if (str10 != null) {
                h18 += b36.f.j(11, str10);
            }
            return h18 + b36.f.e(12, this.f33682r) + b36.f.e(13, this.f33683s);
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
        switch (intValue) {
            case 1:
                this.f33671d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f33672e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f33673f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f33674g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f33675h = aVar2.i(intValue);
                return 0;
            case 6:
                this.f33676i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f33677m = aVar2.i(intValue);
                return 0;
            case 8:
                this.f33678n = aVar2.i(intValue);
                return 0;
            case 9:
                linkedList2.add(aVar2.k(intValue));
                return 0;
            case 10:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 11:
                this.f33681q = aVar2.k(intValue);
                return 0;
            case 12:
                this.f33682r = aVar2.g(intValue);
                return 0;
            case 13:
                this.f33683s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
