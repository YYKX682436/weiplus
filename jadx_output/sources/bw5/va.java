package bw5;

/* loaded from: classes4.dex */
public class va extends com.tencent.mm.protobuf.f {

    /* renamed from: w, reason: collision with root package name */
    public static final bw5.va f34243w = new bw5.va();

    /* renamed from: d, reason: collision with root package name */
    public int f34244d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34245e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34246f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f34247g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f34248h = 0;

    /* renamed from: i, reason: collision with root package name */
    public bw5.z9 f34249i = new bw5.z9();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f34250m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f34251n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f34252o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f34253p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f34254q = false;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f34255r = "";

    /* renamed from: s, reason: collision with root package name */
    public boolean f34256s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f34257t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f34258u = false;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f34259v = "";

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.va)) {
            return false;
        }
        bw5.va vaVar = (bw5.va) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34244d), java.lang.Integer.valueOf(vaVar.f34244d)) && n51.f.a(this.f34245e, vaVar.f34245e) && n51.f.a(this.f34246f, vaVar.f34246f) && n51.f.a(java.lang.Integer.valueOf(this.f34247g), java.lang.Integer.valueOf(vaVar.f34247g)) && n51.f.a(java.lang.Integer.valueOf(this.f34248h), java.lang.Integer.valueOf(vaVar.f34248h)) && n51.f.a(this.f34249i, vaVar.f34249i) && n51.f.a(this.f34250m, vaVar.f34250m) && n51.f.a(java.lang.Integer.valueOf(this.f34251n), java.lang.Integer.valueOf(vaVar.f34251n)) && n51.f.a(java.lang.Boolean.valueOf(this.f34252o), java.lang.Boolean.valueOf(vaVar.f34252o)) && n51.f.a(java.lang.Boolean.valueOf(this.f34253p), java.lang.Boolean.valueOf(vaVar.f34253p)) && n51.f.a(java.lang.Boolean.valueOf(this.f34254q), java.lang.Boolean.valueOf(vaVar.f34254q)) && n51.f.a(this.f34255r, vaVar.f34255r) && n51.f.a(java.lang.Boolean.valueOf(this.f34256s), java.lang.Boolean.valueOf(vaVar.f34256s)) && n51.f.a(java.lang.Boolean.valueOf(this.f34257t), java.lang.Boolean.valueOf(vaVar.f34257t)) && n51.f.a(java.lang.Boolean.valueOf(this.f34258u), java.lang.Boolean.valueOf(vaVar.f34258u)) && n51.f.a(this.f34259v, vaVar.f34259v);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.va();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f34244d);
            java.lang.String str = this.f34245e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f34246f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f34247g);
            fVar.e(5, this.f34248h);
            bw5.z9 z9Var = this.f34249i;
            if (z9Var != null) {
                fVar.i(6, z9Var.computeSize());
                this.f34249i.writeFields(fVar);
            }
            java.lang.String str3 = this.f34250m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f34251n);
            fVar.a(9, this.f34252o);
            fVar.a(10, this.f34253p);
            fVar.a(11, this.f34254q);
            java.lang.String str4 = this.f34255r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.a(13, this.f34256s);
            fVar.a(14, this.f34257t);
            fVar.a(15, this.f34258u);
            java.lang.String str5 = this.f34259v;
            if (str5 != null) {
                fVar.j(16, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f34244d) + 0;
            java.lang.String str6 = this.f34245e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f34246f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            int e18 = e17 + b36.f.e(4, this.f34247g) + b36.f.e(5, this.f34248h);
            bw5.z9 z9Var2 = this.f34249i;
            if (z9Var2 != null) {
                e18 += b36.f.i(6, z9Var2.computeSize());
            }
            java.lang.String str8 = this.f34250m;
            if (str8 != null) {
                e18 += b36.f.j(7, str8);
            }
            int e19 = e18 + b36.f.e(8, this.f34251n) + b36.f.a(9, this.f34252o) + b36.f.a(10, this.f34253p) + b36.f.a(11, this.f34254q);
            java.lang.String str9 = this.f34255r;
            if (str9 != null) {
                e19 += b36.f.j(12, str9);
            }
            int a17 = e19 + b36.f.a(13, this.f34256s) + b36.f.a(14, this.f34257t) + b36.f.a(15, this.f34258u);
            java.lang.String str10 = this.f34259v;
            return str10 != null ? a17 + b36.f.j(16, str10) : a17;
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
                this.f34244d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f34245e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f34246f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f34247g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f34248h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.z9 z9Var3 = new bw5.z9();
                    if (bArr != null && bArr.length > 0) {
                        z9Var3.parseFrom(bArr);
                    }
                    this.f34249i = z9Var3;
                }
                return 0;
            case 7:
                this.f34250m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f34251n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f34252o = aVar2.c(intValue);
                return 0;
            case 10:
                this.f34253p = aVar2.c(intValue);
                return 0;
            case 11:
                this.f34254q = aVar2.c(intValue);
                return 0;
            case 12:
                this.f34255r = aVar2.k(intValue);
                return 0;
            case 13:
                this.f34256s = aVar2.c(intValue);
                return 0;
            case 14:
                this.f34257t = aVar2.c(intValue);
                return 0;
            case 15:
                this.f34258u = aVar2.c(intValue);
                return 0;
            case 16:
                this.f34259v = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.va) super.parseFrom(bArr);
    }
}
