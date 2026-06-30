package bw5;

/* loaded from: classes14.dex */
public class h20 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.i20 f28054d;

    /* renamed from: e, reason: collision with root package name */
    public long f28055e;

    /* renamed from: f, reason: collision with root package name */
    public float f28056f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28057g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28058h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f28059i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.g20 f28060m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f28061n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f28062o = new boolean[9];

    static {
        new bw5.h20();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.h20 parseFrom(byte[] bArr) {
        return (bw5.h20) super.parseFrom(bArr);
    }

    public bw5.h20 c(bw5.i20 i20Var) {
        this.f28054d = i20Var;
        this.f28062o[1] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h20)) {
            return false;
        }
        bw5.h20 h20Var = (bw5.h20) fVar;
        return n51.f.a(this.f28054d, h20Var.f28054d) && n51.f.a(java.lang.Long.valueOf(this.f28055e), java.lang.Long.valueOf(h20Var.f28055e)) && n51.f.a(java.lang.Float.valueOf(this.f28056f), java.lang.Float.valueOf(h20Var.f28056f)) && n51.f.a(java.lang.Boolean.valueOf(this.f28057g), java.lang.Boolean.valueOf(h20Var.f28057g)) && n51.f.a(this.f28058h, h20Var.f28058h) && n51.f.a(this.f28059i, h20Var.f28059i) && n51.f.a(this.f28060m, h20Var.f28060m) && n51.f.a(this.f28061n, h20Var.f28061n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.h20();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.i20 i20Var;
        int i18 = 0;
        boolean[] zArr = this.f28062o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.i20 i20Var2 = this.f28054d;
            if (i20Var2 != null && zArr[1]) {
                fVar.e(1, i20Var2.f28443d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f28055e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f28056f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f28057g);
            }
            java.lang.String str = this.f28058h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f28059i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            bw5.g20 g20Var = this.f28060m;
            if (g20Var != null && zArr[7]) {
                fVar.i(7, g20Var.computeSize());
                this.f28060m.writeFields(fVar);
            }
            fVar.g(8, 8, this.f28061n);
            return 0;
        }
        if (i17 == 1) {
            bw5.i20 i20Var3 = this.f28054d;
            if (i20Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, i20Var3.f28443d);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f28055e);
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f28056f);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f28057g);
            }
            java.lang.String str2 = this.f28058h;
            if (str2 != null && zArr[5]) {
                i18 += b36.f.j(5, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f28059i;
            if (gVar2 != null && zArr[6]) {
                i18 += b36.f.b(6, gVar2);
            }
            bw5.g20 g20Var2 = this.f28060m;
            if (g20Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, g20Var2.computeSize());
            }
            return i18 + b36.f.g(8, 8, this.f28061n);
        }
        if (i17 == 2) {
            this.f28061n.clear();
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
                switch (aVar2.g(intValue)) {
                    case 0:
                        i20Var = bw5.i20.nullType;
                        break;
                    case 1:
                        i20Var = bw5.i20.intType;
                        break;
                    case 2:
                        i20Var = bw5.i20.floatType;
                        break;
                    case 3:
                        i20Var = bw5.i20.boolType;
                        break;
                    case 4:
                        i20Var = bw5.i20.stringType;
                        break;
                    case 5:
                        i20Var = bw5.i20.bytesType;
                        break;
                    case 6:
                        i20Var = bw5.i20.mapType;
                        break;
                    case 7:
                        i20Var = bw5.i20.listType;
                        break;
                    default:
                        i20Var = null;
                        break;
                }
                this.f28054d = i20Var;
                zArr[1] = true;
                return 0;
            case 2:
                this.f28055e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28056f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28057g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28058h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28059i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.g20 g20Var3 = new bw5.g20();
                    if (bArr != null && bArr.length > 0) {
                        g20Var3.parseFrom(bArr);
                    }
                    this.f28060m = g20Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.h20 h20Var = new bw5.h20();
                    if (bArr2 != null && bArr2.length > 0) {
                        h20Var.parseFrom(bArr2);
                    }
                    this.f28061n.add(h20Var);
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
