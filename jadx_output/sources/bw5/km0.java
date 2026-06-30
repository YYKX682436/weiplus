package bw5;

/* loaded from: classes2.dex */
public class km0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29423d;

    /* renamed from: e, reason: collision with root package name */
    public long f29424e;

    /* renamed from: h, reason: collision with root package name */
    public int f29427h;

    /* renamed from: i, reason: collision with root package name */
    public int f29428i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f29429m;

    /* renamed from: n, reason: collision with root package name */
    public int f29430n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f29432p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f29433q;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f29425f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f29426g = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f29431o = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f29434r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f29435s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f29436t = new boolean[15];

    static {
        new bw5.km0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.km0 parseFrom(byte[] bArr) {
        return (bw5.km0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.km0)) {
            return false;
        }
        bw5.km0 km0Var = (bw5.km0) fVar;
        return n51.f.a(this.f29423d, km0Var.f29423d) && n51.f.a(java.lang.Long.valueOf(this.f29424e), java.lang.Long.valueOf(km0Var.f29424e)) && n51.f.a(this.f29425f, km0Var.f29425f) && n51.f.a(this.f29426g, km0Var.f29426g) && n51.f.a(java.lang.Integer.valueOf(this.f29427h), java.lang.Integer.valueOf(km0Var.f29427h)) && n51.f.a(java.lang.Integer.valueOf(this.f29428i), java.lang.Integer.valueOf(km0Var.f29428i)) && n51.f.a(this.f29429m, km0Var.f29429m) && n51.f.a(java.lang.Integer.valueOf(this.f29430n), java.lang.Integer.valueOf(km0Var.f29430n)) && n51.f.a(this.f29431o, km0Var.f29431o) && n51.f.a(this.f29432p, km0Var.f29432p) && n51.f.a(this.f29433q, km0Var.f29433q) && n51.f.a(this.f29434r, km0Var.f29434r) && n51.f.a(this.f29435s, km0Var.f29435s);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.km0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29435s;
        java.util.LinkedList linkedList2 = this.f29434r;
        java.util.LinkedList linkedList3 = this.f29431o;
        java.util.LinkedList linkedList4 = this.f29426g;
        java.util.LinkedList linkedList5 = this.f29425f;
        int i18 = 0;
        boolean[] zArr = this.f29436t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29423d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f29424e);
            }
            fVar.g(3, 8, linkedList5);
            fVar.g(4, 8, linkedList4);
            if (zArr[5]) {
                fVar.e(5, this.f29427h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f29428i);
            }
            java.lang.String str2 = this.f29429m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            if (zArr[8]) {
                fVar.e(8, this.f29430n);
            }
            fVar.g(9, 8, linkedList3);
            java.lang.String str3 = this.f29432p;
            if (str3 != null && zArr[10]) {
                fVar.j(10, str3);
            }
            java.lang.String str4 = this.f29433q;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            fVar.g(13, 8, linkedList2);
            fVar.g(14, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f29423d;
            if (str5 != null && zArr[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f29424e);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList5) + b36.f.g(4, 8, linkedList4);
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f29427h);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f29428i);
            }
            java.lang.String str6 = this.f29429m;
            if (str6 != null && zArr[7]) {
                g17 += b36.f.j(7, str6);
            }
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f29430n);
            }
            int g18 = g17 + b36.f.g(9, 8, linkedList3);
            java.lang.String str7 = this.f29432p;
            if (str7 != null && zArr[10]) {
                g18 += b36.f.j(10, str7);
            }
            java.lang.String str8 = this.f29433q;
            if (str8 != null && zArr[11]) {
                g18 += b36.f.j(11, str8);
            }
            return g18 + b36.f.g(13, 8, linkedList2) + b36.f.g(14, 8, linkedList);
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
                this.f29423d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29424e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.im0 im0Var = new bw5.im0();
                    if (bArr != null && bArr.length > 0) {
                        im0Var.parseFrom(bArr);
                    }
                    linkedList5.add(im0Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.im0 im0Var2 = new bw5.im0();
                    if (bArr2 != null && bArr2.length > 0) {
                        im0Var2.parseFrom(bArr2);
                    }
                    linkedList4.add(im0Var2);
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f29427h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29428i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29429m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f29430n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.im0 im0Var3 = new bw5.im0();
                    if (bArr3 != null && bArr3.length > 0) {
                        im0Var3.parseFrom(bArr3);
                    }
                    linkedList3.add(im0Var3);
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f29432p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f29433q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
            default:
                return -1;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.im0 im0Var4 = new bw5.im0();
                    if (bArr4 != null && bArr4.length > 0) {
                        im0Var4.parseFrom(bArr4);
                    }
                    linkedList2.add(im0Var4);
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.im0 im0Var5 = new bw5.im0();
                    if (bArr5 != null && bArr5.length > 0) {
                        im0Var5.parseFrom(bArr5);
                    }
                    linkedList.add(im0Var5);
                }
                zArr[14] = true;
                return 0;
        }
    }
}
