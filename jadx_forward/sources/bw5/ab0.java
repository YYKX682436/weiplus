package bw5;

/* loaded from: classes8.dex */
public class ab0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.za0 f106652d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f106653e;

    /* renamed from: f, reason: collision with root package name */
    public int f106654f;

    /* renamed from: g, reason: collision with root package name */
    public int f106655g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f106656h = new boolean[5];

    static {
        new bw5.ab0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ab0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ab0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ab0)) {
            return false;
        }
        bw5.ab0 ab0Var = (bw5.ab0) fVar;
        return n51.f.a(this.f106652d, ab0Var.f106652d) && n51.f.a(this.f106653e, ab0Var.f106653e) && n51.f.a(java.lang.Integer.valueOf(this.f106654f), java.lang.Integer.valueOf(ab0Var.f106654f)) && n51.f.a(java.lang.Integer.valueOf(this.f106655g), java.lang.Integer.valueOf(ab0Var.f106655g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ab0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.za0 za0Var;
        int i18 = 0;
        boolean[] zArr = this.f106656h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.za0 za0Var2 = this.f106652d;
            if (za0Var2 != null && zArr[1]) {
                fVar.e(1, za0Var2.f117458d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f106653e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f106654f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f106655g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.za0 za0Var3 = this.f106652d;
            if (za0Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, za0Var3.f117458d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f106653e;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f106654f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f106655g) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
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
                this.f106653e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f106654f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f106655g = aVar2.g(intValue);
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
        this.f106652d = za0Var;
        zArr[1] = true;
        return 0;
    }
}
