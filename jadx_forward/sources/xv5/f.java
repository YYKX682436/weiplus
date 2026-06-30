package xv5;

/* loaded from: classes11.dex */
public class f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f538997d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f538998e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f538999f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f539000g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f539001h;

    /* renamed from: i, reason: collision with root package name */
    public xv5.g f539002i;

    /* renamed from: m, reason: collision with root package name */
    public xv5.e f539003m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f539004n = new boolean[8];

    static {
        new xv5.f();
    }

    public xv5.e b() {
        return this.f539004n[7] ? this.f539003m : new xv5.e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public xv5.f mo11468x92b714fd(byte[] bArr) {
        return (xv5.f) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof xv5.f)) {
            return false;
        }
        xv5.f fVar2 = (xv5.f) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f538997d), java.lang.Long.valueOf(fVar2.f538997d)) && n51.f.a(java.lang.Boolean.valueOf(this.f538998e), java.lang.Boolean.valueOf(fVar2.f538998e)) && n51.f.a(java.lang.Boolean.valueOf(this.f538999f), java.lang.Boolean.valueOf(fVar2.f538999f)) && n51.f.a(java.lang.Boolean.valueOf(this.f539000g), java.lang.Boolean.valueOf(fVar2.f539000g)) && n51.f.a(java.lang.Boolean.valueOf(this.f539001h), java.lang.Boolean.valueOf(fVar2.f539001h)) && n51.f.a(this.f539002i, fVar2.f539002i) && n51.f.a(this.f539003m, fVar2.f539003m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new xv5.f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        xv5.g gVar;
        boolean[] zArr = this.f539004n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f538997d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f538998e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f538999f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f539000g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f539001h);
            }
            xv5.g gVar2 = this.f539002i;
            if (gVar2 != null && zArr[6]) {
                fVar.e(6, gVar2.f539013d);
            }
            xv5.e eVar = this.f539003m;
            if (eVar != null && zArr[7]) {
                fVar.i(7, eVar.mo75928xcd1e8d8());
                this.f539003m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f538997d) : 0;
            if (zArr[2]) {
                h17 += b36.f.a(2, this.f538998e);
            }
            if (zArr[3]) {
                h17 += b36.f.a(3, this.f538999f);
            }
            if (zArr[4]) {
                h17 += b36.f.a(4, this.f539000g);
            }
            if (zArr[5]) {
                h17 += b36.f.a(5, this.f539001h);
            }
            xv5.g gVar3 = this.f539002i;
            if (gVar3 != null && zArr[6]) {
                h17 += b36.f.e(6, gVar3.f539013d);
            }
            xv5.e eVar2 = this.f539003m;
            return (eVar2 == null || !zArr[7]) ? h17 : h17 + b36.f.i(7, eVar2.mo75928xcd1e8d8());
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
        switch (intValue) {
            case 1:
                this.f538997d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f538998e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f538999f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f539000g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f539001h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                switch (aVar2.g(intValue)) {
                    case 0:
                        gVar = xv5.g.CBTStreamTextHeadingLevel_None;
                        break;
                    case 1:
                        gVar = xv5.g.CBTStreamTextHeadingLevel_H1;
                        break;
                    case 2:
                        gVar = xv5.g.CBTStreamTextHeadingLevel_H2;
                        break;
                    case 3:
                        gVar = xv5.g.CBTStreamTextHeadingLevel_H3;
                        break;
                    case 4:
                        gVar = xv5.g.CBTStreamTextHeadingLevel_H4;
                        break;
                    case 5:
                        gVar = xv5.g.CBTStreamTextHeadingLevel_H5;
                        break;
                    case 6:
                        gVar = xv5.g.CBTStreamTextHeadingLevel_H6;
                        break;
                    default:
                        gVar = null;
                        break;
                }
                this.f539002i = gVar;
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    xv5.e eVar3 = new xv5.e();
                    if (bArr != null && bArr.length > 0) {
                        eVar3.mo11468x92b714fd(bArr);
                    }
                    this.f539003m = eVar3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
