package bw5;

/* loaded from: classes2.dex */
public class bp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ap f107310d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ep f107311e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.cp f107312f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.zo f107313g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f107314h = new boolean[5];

    static {
        new bw5.bp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bp mo11468x92b714fd(byte[] bArr) {
        return (bw5.bp) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bp)) {
            return false;
        }
        bw5.bp bpVar = (bw5.bp) fVar;
        return n51.f.a(this.f107310d, bpVar.f107310d) && n51.f.a(this.f107311e, bpVar.f107311e) && n51.f.a(this.f107312f, bpVar.f107312f) && n51.f.a(this.f107313g, bpVar.f107313g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107314h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ap apVar = this.f107310d;
            if (apVar != null && zArr[1]) {
                fVar.e(1, apVar.f106831d);
            }
            bw5.ep epVar = this.f107311e;
            if (epVar != null && zArr[2]) {
                fVar.i(2, epVar.mo75928xcd1e8d8());
                this.f107311e.mo75956x3d5d1f78(fVar);
            }
            bw5.cp cpVar = this.f107312f;
            if (cpVar != null && zArr[3]) {
                fVar.i(3, cpVar.mo75928xcd1e8d8());
                this.f107312f.mo75956x3d5d1f78(fVar);
            }
            bw5.zo zoVar = this.f107313g;
            if (zoVar != null && zArr[4]) {
                fVar.i(4, zoVar.mo75928xcd1e8d8());
                this.f107313g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ap apVar2 = this.f107310d;
            if (apVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, apVar2.f106831d);
            }
            bw5.ep epVar2 = this.f107311e;
            if (epVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, epVar2.mo75928xcd1e8d8());
            }
            bw5.cp cpVar2 = this.f107312f;
            if (cpVar2 != null && zArr[3]) {
                i18 += b36.f.i(3, cpVar2.mo75928xcd1e8d8());
            }
            bw5.zo zoVar2 = this.f107313g;
            return (zoVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, zoVar2.mo75928xcd1e8d8());
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
        if (intValue == 1) {
            int g17 = aVar2.g(intValue);
            this.f107310d = g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? null : bw5.ap.KTV : bw5.ap.Game : bw5.ap.VoiceRoom : bw5.ap.PkBattle;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.ep epVar3 = new bw5.ep();
                if (bArr != null && bArr.length > 0) {
                    epVar3.mo11468x92b714fd(bArr);
                }
                this.f107311e = epVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.cp cpVar3 = new bw5.cp();
                if (bArr2 != null && bArr2.length > 0) {
                    cpVar3.mo11468x92b714fd(bArr2);
                }
                this.f107312f = cpVar3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.zo zoVar3 = new bw5.zo();
            if (bArr3 != null && bArr3.length > 0) {
                zoVar3.mo11468x92b714fd(bArr3);
            }
            this.f107313g = zoVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
