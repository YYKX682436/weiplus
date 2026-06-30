package bw5;

/* loaded from: classes10.dex */
public class sb extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ub f114407d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114408e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.tb f114409f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114410g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.tb f114411h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f114412i = new boolean[6];

    static {
        new bw5.sb();
    }

    public java.lang.String b() {
        return this.f114412i[2] ? this.f114408e : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.sb mo11468x92b714fd(byte[] bArr) {
        return (bw5.sb) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sb)) {
            return false;
        }
        bw5.sb sbVar = (bw5.sb) fVar;
        return n51.f.a(this.f114407d, sbVar.f114407d) && n51.f.a(this.f114408e, sbVar.f114408e) && n51.f.a(this.f114409f, sbVar.f114409f) && n51.f.a(this.f114410g, sbVar.f114410g) && n51.f.a(this.f114411h, sbVar.f114411h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.sb();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f114412i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ub ubVar = this.f114407d;
            if (ubVar != null && zArr[1]) {
                fVar.e(1, ubVar.f115367d);
            }
            java.lang.String str = this.f114408e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.tb tbVar = this.f114409f;
            if (tbVar != null && zArr[3]) {
                fVar.i(3, tbVar.mo75928xcd1e8d8());
                this.f114409f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f114410g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            bw5.tb tbVar2 = this.f114411h;
            if (tbVar2 != null && zArr[5]) {
                fVar.i(5, tbVar2.mo75928xcd1e8d8());
                this.f114411h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ub ubVar2 = this.f114407d;
            if (ubVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, ubVar2.f115367d);
            }
            java.lang.String str3 = this.f114408e;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            bw5.tb tbVar3 = this.f114409f;
            if (tbVar3 != null && zArr[3]) {
                i18 += b36.f.i(3, tbVar3.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f114410g;
            if (str4 != null && zArr[4]) {
                i18 += b36.f.j(4, str4);
            }
            bw5.tb tbVar4 = this.f114411h;
            return (tbVar4 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, tbVar4.mo75928xcd1e8d8());
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
            this.f114407d = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.ub.LivePhoto : bw5.ub.Video : bw5.ub.Image;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f114408e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.tb tbVar5 = new bw5.tb();
                if (bArr != null && bArr.length > 0) {
                    tbVar5.mo11468x92b714fd(bArr);
                }
                this.f114409f = tbVar5;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f114410g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.tb tbVar6 = new bw5.tb();
            if (bArr2 != null && bArr2.length > 0) {
                tbVar6.mo11468x92b714fd(bArr2);
            }
            this.f114411h = tbVar6;
        }
        zArr[5] = true;
        return 0;
    }
}
