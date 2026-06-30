package r45;

/* loaded from: classes8.dex */
public class wa3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f470538d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470539e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vt4 f470540f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ni f470541g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470542h;

    /* renamed from: i, reason: collision with root package name */
    public float f470543i = 0.5f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wa3)) {
            return false;
        }
        r45.wa3 wa3Var = (r45.wa3) fVar;
        return n51.f.a(this.f76492x92037252, wa3Var.f76492x92037252) && n51.f.a(java.lang.Long.valueOf(this.f470538d), java.lang.Long.valueOf(wa3Var.f470538d)) && n51.f.a(this.f470539e, wa3Var.f470539e) && n51.f.a(this.f470540f, wa3Var.f470540f) && n51.f.a(this.f470541g, wa3Var.f470541g) && n51.f.a(this.f470542h, wa3Var.f470542h) && n51.f.a(java.lang.Float.valueOf(this.f470543i), java.lang.Float.valueOf(wa3Var.f470543i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.h(2, this.f470538d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470539e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            r45.vt4 vt4Var = this.f470540f;
            if (vt4Var != null) {
                fVar.i(4, vt4Var.mo75928xcd1e8d8());
                this.f470540f.mo75956x3d5d1f78(fVar);
            }
            r45.ni niVar = this.f470541g;
            if (niVar != null) {
                fVar.i(5, niVar.mo75928xcd1e8d8());
                this.f470541g.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470542h;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            fVar.d(7, this.f470543i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f470538d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f470539e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            r45.vt4 vt4Var2 = this.f470540f;
            if (vt4Var2 != null) {
                i18 += b36.f.i(4, vt4Var2.mo75928xcd1e8d8());
            }
            r45.ni niVar2 = this.f470541g;
            if (niVar2 != null) {
                i18 += b36.f.i(5, niVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f470542h;
            if (gVar4 != null) {
                i18 += b36.f.b(6, gVar4);
            }
            return i18 + b36.f.d(7, this.f470543i);
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
        r45.wa3 wa3Var = (r45.wa3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    wa3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                wa3Var.f470538d = aVar2.i(intValue);
                return 0;
            case 3:
                wa3Var.f470539e = aVar2.d(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.vt4 vt4Var3 = new r45.vt4();
                    if (bArr2 != null && bArr2.length > 0) {
                        vt4Var3.mo11468x92b714fd(bArr2);
                    }
                    wa3Var.f470540f = vt4Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ni niVar3 = new r45.ni();
                    if (bArr3 != null && bArr3.length > 0) {
                        niVar3.mo11468x92b714fd(bArr3);
                    }
                    wa3Var.f470541g = niVar3;
                }
                return 0;
            case 6:
                wa3Var.f470542h = aVar2.d(intValue);
                return 0;
            case 7:
                wa3Var.f470543i = aVar2.f(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
