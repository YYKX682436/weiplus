package bw5;

/* loaded from: classes2.dex */
public class jb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28908d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f28909e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f28910f;

    /* renamed from: g, reason: collision with root package name */
    public int f28911g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28912h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f28913i;

    /* renamed from: o, reason: collision with root package name */
    public int f28916o;

    /* renamed from: p, reason: collision with root package name */
    public int f28917p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f28918q;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f28914m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f28915n = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f28919r = new boolean[12];

    static {
        new bw5.jb0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jb0 parseFrom(byte[] bArr) {
        return (bw5.jb0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jb0)) {
            return false;
        }
        bw5.jb0 jb0Var = (bw5.jb0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28908d), java.lang.Integer.valueOf(jb0Var.f28908d)) && n51.f.a(this.f28909e, jb0Var.f28909e) && n51.f.a(this.f28910f, jb0Var.f28910f) && n51.f.a(java.lang.Integer.valueOf(this.f28911g), java.lang.Integer.valueOf(jb0Var.f28911g)) && n51.f.a(this.f28912h, jb0Var.f28912h) && n51.f.a(this.f28913i, jb0Var.f28913i) && n51.f.a(this.f28914m, jb0Var.f28914m) && n51.f.a(this.f28915n, jb0Var.f28915n) && n51.f.a(java.lang.Integer.valueOf(this.f28916o), java.lang.Integer.valueOf(jb0Var.f28916o)) && n51.f.a(java.lang.Integer.valueOf(this.f28917p), java.lang.Integer.valueOf(jb0Var.f28917p)) && n51.f.a(this.f28918q, jb0Var.f28918q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28915n;
        java.util.LinkedList linkedList2 = this.f28914m;
        boolean[] zArr = this.f28919r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28908d);
            }
            com.tencent.mm.protobuf.g gVar = this.f28909e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f28910f;
            if (gVar2 != null && zArr[3]) {
                fVar.b(3, gVar2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f28911g);
            }
            java.lang.String str = this.f28912h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f28913i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            fVar.g(7, 1, linkedList2);
            fVar.g(8, 1, linkedList);
            if (zArr[9]) {
                fVar.e(9, this.f28916o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f28917p);
            }
            java.lang.String str3 = this.f28918q;
            if (str3 == null || !zArr[11]) {
                return 0;
            }
            fVar.j(11, str3);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28908d) : 0;
            com.tencent.mm.protobuf.g gVar3 = this.f28909e;
            if (gVar3 != null && zArr[2]) {
                e17 += b36.f.b(2, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f28910f;
            if (gVar4 != null && zArr[3]) {
                e17 += b36.f.b(3, gVar4);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f28911g);
            }
            java.lang.String str4 = this.f28912h;
            if (str4 != null && zArr[5]) {
                e17 += b36.f.j(5, str4);
            }
            java.lang.String str5 = this.f28913i;
            if (str5 != null && zArr[6]) {
                e17 += b36.f.j(6, str5);
            }
            int g17 = e17 + b36.f.g(7, 1, linkedList2) + b36.f.g(8, 1, linkedList);
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f28916o);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f28917p);
            }
            java.lang.String str6 = this.f28918q;
            return (str6 == null || !zArr[11]) ? g17 : g17 + b36.f.j(11, str6);
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
                this.f28908d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28909e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28910f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28911g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28912h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28913i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                linkedList2.add(aVar2.k(intValue));
                zArr[7] = true;
                return 0;
            case 8:
                linkedList.add(aVar2.k(intValue));
                zArr[8] = true;
                return 0;
            case 9:
                this.f28916o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f28917p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f28918q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
