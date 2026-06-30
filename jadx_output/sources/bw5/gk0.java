package bw5;

/* loaded from: classes4.dex */
public class gk0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27883d;

    /* renamed from: f, reason: collision with root package name */
    public int f27885f;

    /* renamed from: h, reason: collision with root package name */
    public int f27887h;

    /* renamed from: m, reason: collision with root package name */
    public int f27889m;

    /* renamed from: o, reason: collision with root package name */
    public int f27891o;

    /* renamed from: p, reason: collision with root package name */
    public int f27892p;

    /* renamed from: r, reason: collision with root package name */
    public int f27894r;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f27884e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f27886g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f27888i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f27890n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f27893q = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f27895s = new boolean[13];

    static {
        new bw5.gk0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gk0)) {
            return false;
        }
        bw5.gk0 gk0Var = (bw5.gk0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27883d), java.lang.Integer.valueOf(gk0Var.f27883d)) && n51.f.a(this.f27884e, gk0Var.f27884e) && n51.f.a(java.lang.Integer.valueOf(this.f27885f), java.lang.Integer.valueOf(gk0Var.f27885f)) && n51.f.a(this.f27886g, gk0Var.f27886g) && n51.f.a(java.lang.Integer.valueOf(this.f27887h), java.lang.Integer.valueOf(gk0Var.f27887h)) && n51.f.a(this.f27888i, gk0Var.f27888i) && n51.f.a(java.lang.Integer.valueOf(this.f27889m), java.lang.Integer.valueOf(gk0Var.f27889m)) && n51.f.a(this.f27890n, gk0Var.f27890n) && n51.f.a(java.lang.Integer.valueOf(this.f27891o), java.lang.Integer.valueOf(gk0Var.f27891o)) && n51.f.a(java.lang.Integer.valueOf(this.f27892p), java.lang.Integer.valueOf(gk0Var.f27892p)) && n51.f.a(this.f27893q, gk0Var.f27893q) && n51.f.a(java.lang.Integer.valueOf(this.f27894r), java.lang.Integer.valueOf(gk0Var.f27894r));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gk0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27893q;
        java.util.LinkedList linkedList2 = this.f27890n;
        java.util.LinkedList linkedList3 = this.f27888i;
        java.util.LinkedList linkedList4 = this.f27886g;
        java.util.LinkedList linkedList5 = this.f27884e;
        boolean[] zArr = this.f27895s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27883d);
            }
            fVar.g(2, 8, linkedList5);
            if (zArr[3]) {
                fVar.e(3, this.f27885f);
            }
            fVar.g(4, 2, linkedList4);
            if (zArr[5]) {
                fVar.e(5, this.f27887h);
            }
            fVar.g(6, 8, linkedList3);
            if (zArr[7]) {
                fVar.e(7, this.f27889m);
            }
            fVar.g(8, 2, linkedList2);
            if (zArr[9]) {
                fVar.e(9, this.f27891o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f27892p);
            }
            fVar.g(11, 8, linkedList);
            if (zArr[12]) {
                fVar.e(12, this.f27894r);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? b36.f.e(1, this.f27883d) + 0 : 0) + b36.f.g(2, 8, linkedList5);
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f27885f);
            }
            int g17 = e17 + b36.f.g(4, 2, linkedList4);
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f27887h);
            }
            int g18 = g17 + b36.f.g(6, 8, linkedList3);
            if (zArr[7]) {
                g18 += b36.f.e(7, this.f27889m);
            }
            int g19 = g18 + b36.f.g(8, 2, linkedList2);
            if (zArr[9]) {
                g19 += b36.f.e(9, this.f27891o);
            }
            if (zArr[10]) {
                g19 += b36.f.e(10, this.f27892p);
            }
            int g27 = g19 + b36.f.g(11, 8, linkedList);
            return zArr[12] ? g27 + b36.f.e(12, this.f27894r) : g27;
        }
        if (i17 == 2) {
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
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
                this.f27883d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var.b(bArr);
                    }
                    linkedList5.add(du5Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f27885f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                linkedList4.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[4] = true;
                return 0;
            case 5:
                this.f27887h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var2.b(bArr2);
                    }
                    linkedList3.add(du5Var2);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f27889m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                linkedList2.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[8] = true;
                return 0;
            case 9:
                this.f27891o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f27892p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var3.b(bArr3);
                    }
                    linkedList.add(du5Var3);
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f27894r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.gk0) super.parseFrom(bArr);
    }
}
