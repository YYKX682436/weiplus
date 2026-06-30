package bw5;

/* loaded from: classes8.dex */
public class ab0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.za0 f25119d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f25120e;

    /* renamed from: f, reason: collision with root package name */
    public int f25121f;

    /* renamed from: g, reason: collision with root package name */
    public int f25122g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f25123h = new boolean[5];

    static {
        new bw5.ab0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ab0 parseFrom(byte[] bArr) {
        return (bw5.ab0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ab0)) {
            return false;
        }
        bw5.ab0 ab0Var = (bw5.ab0) fVar;
        return n51.f.a(this.f25119d, ab0Var.f25119d) && n51.f.a(this.f25120e, ab0Var.f25120e) && n51.f.a(java.lang.Integer.valueOf(this.f25121f), java.lang.Integer.valueOf(ab0Var.f25121f)) && n51.f.a(java.lang.Integer.valueOf(this.f25122g), java.lang.Integer.valueOf(ab0Var.f25122g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ab0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.za0 za0Var;
        int i18 = 0;
        boolean[] zArr = this.f25123h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.za0 za0Var2 = this.f25119d;
            if (za0Var2 != null && zArr[1]) {
                fVar.e(1, za0Var2.f35925d);
            }
            com.tencent.mm.protobuf.g gVar = this.f25120e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f25121f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f25122g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.za0 za0Var3 = this.f25119d;
            if (za0Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, za0Var3.f35925d);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f25120e;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f25121f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f25122g) : i18;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f25120e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f25121f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f25122g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        switch (aVar2.g(intValue)) {
            case 0:
                za0Var = bw5.za0.kUnknown;
                break;
            case 1:
                za0Var = bw5.za0.kMusicDiscoverPreLoad;
                break;
            case 2:
                za0Var = bw5.za0.kAudioDiscoverInsertion;
                break;
            case 3:
                za0Var = bw5.za0.kMusicRecentList;
                break;
            case 4:
                za0Var = bw5.za0.kMusicCategoryPreLoad;
                break;
            case 5:
                za0Var = bw5.za0.kMusicClientInsertion;
                break;
            case 6:
                za0Var = bw5.za0.kMusicClientInsertionSyncRecentList;
                break;
            case 7:
                za0Var = bw5.za0.kMusicRefreshDiscoverLine;
                break;
            default:
                za0Var = null;
                break;
        }
        this.f25119d = za0Var;
        zArr[1] = true;
        return 0;
    }
}
