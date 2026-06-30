package bw5;

/* loaded from: classes9.dex */
public class q9 extends com.tencent.mm.protobuf.f {

    /* renamed from: v, reason: collision with root package name */
    public static final bw5.q9 f31998v = new bw5.q9();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31999d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32000e;

    /* renamed from: f, reason: collision with root package name */
    public long f32001f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32002g;

    /* renamed from: h, reason: collision with root package name */
    public int f32003h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f32004i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32005m;

    /* renamed from: n, reason: collision with root package name */
    public long f32006n;

    /* renamed from: o, reason: collision with root package name */
    public long f32007o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f32008p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f32009q;

    /* renamed from: r, reason: collision with root package name */
    public int f32010r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f32011s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f32012t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f32013u = new boolean[19];

    public bw5.q9 b(int i17) {
        this.f32003h = i17;
        this.f32013u[5] = true;
        return this;
    }

    public bw5.q9 c(long j17) {
        this.f32006n = j17;
        this.f32013u[9] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q9)) {
            return false;
        }
        bw5.q9 q9Var = (bw5.q9) fVar;
        return n51.f.a(this.f31999d, q9Var.f31999d) && n51.f.a(this.f32000e, q9Var.f32000e) && n51.f.a(java.lang.Long.valueOf(this.f32001f), java.lang.Long.valueOf(q9Var.f32001f)) && n51.f.a(this.f32002g, q9Var.f32002g) && n51.f.a(java.lang.Integer.valueOf(this.f32003h), java.lang.Integer.valueOf(q9Var.f32003h)) && n51.f.a(this.f32004i, q9Var.f32004i) && n51.f.a(java.lang.Boolean.valueOf(this.f32005m), java.lang.Boolean.valueOf(q9Var.f32005m)) && n51.f.a(java.lang.Long.valueOf(this.f32006n), java.lang.Long.valueOf(q9Var.f32006n)) && n51.f.a(java.lang.Long.valueOf(this.f32007o), java.lang.Long.valueOf(q9Var.f32007o)) && n51.f.a(this.f32008p, q9Var.f32008p) && n51.f.a(this.f32009q, q9Var.f32009q) && n51.f.a(java.lang.Integer.valueOf(this.f32010r), java.lang.Integer.valueOf(q9Var.f32010r)) && n51.f.a(this.f32011s, q9Var.f32011s) && n51.f.a(this.f32012t, q9Var.f32012t);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.q9();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32012t;
        java.util.LinkedList linkedList2 = this.f32011s;
        int i18 = 0;
        boolean[] zArr = this.f32013u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31999d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f32000e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.h(3, this.f32001f);
            }
            java.lang.String str3 = this.f32002g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f32003h);
            }
            java.lang.String str4 = this.f32004i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.a(7, this.f32005m);
            }
            if (zArr[9]) {
                fVar.h(9, this.f32006n);
            }
            if (zArr[10]) {
                fVar.h(10, this.f32007o);
            }
            java.lang.String str5 = this.f32008p;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f32009q;
            if (str6 != null && zArr[12]) {
                fVar.j(12, str6);
            }
            if (zArr[16]) {
                fVar.e(16, this.f32010r);
            }
            fVar.g(17, 1, linkedList2);
            fVar.g(18, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f31999d;
            if (str7 != null && zArr[1]) {
                i18 = b36.f.j(1, str7) + 0;
            }
            java.lang.String str8 = this.f32000e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f32001f);
            }
            java.lang.String str9 = this.f32002g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f32003h);
            }
            java.lang.String str10 = this.f32004i;
            if (str10 != null && zArr[6]) {
                i18 += b36.f.j(6, str10);
            }
            if (zArr[7]) {
                i18 += b36.f.a(7, this.f32005m);
            }
            if (zArr[9]) {
                i18 += b36.f.h(9, this.f32006n);
            }
            if (zArr[10]) {
                i18 += b36.f.h(10, this.f32007o);
            }
            java.lang.String str11 = this.f32008p;
            if (str11 != null && zArr[11]) {
                i18 += b36.f.j(11, str11);
            }
            java.lang.String str12 = this.f32009q;
            if (str12 != null && zArr[12]) {
                i18 += b36.f.j(12, str12);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f32010r);
            }
            return i18 + b36.f.g(17, 1, linkedList2) + b36.f.g(18, 1, linkedList);
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
                this.f31999d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32000e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32001f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32002g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32003h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32004i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32005m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
            case 13:
            case 14:
            case 15:
            default:
                return -1;
            case 9:
                this.f32006n = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f32007o = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f32008p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f32009q = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 16:
                this.f32010r = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                linkedList2.add(aVar2.k(intValue));
                zArr[17] = true;
                return 0;
            case 18:
                linkedList.add(aVar2.k(intValue));
                zArr[18] = true;
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.q9) super.parseFrom(bArr);
    }
}
