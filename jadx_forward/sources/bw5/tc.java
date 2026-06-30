package bw5;

/* loaded from: classes2.dex */
public class tc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f114898d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.wc f114899e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.l00 f114900f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.av f114901g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.wc f114902h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.fw f114903i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f114904m = new boolean[7];

    static {
        new bw5.tc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tc mo11468x92b714fd(byte[] bArr) {
        return (bw5.tc) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tc)) {
            return false;
        }
        bw5.tc tcVar = (bw5.tc) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f114898d), java.lang.Integer.valueOf(tcVar.f114898d)) && n51.f.a(this.f114899e, tcVar.f114899e) && n51.f.a(this.f114900f, tcVar.f114900f) && n51.f.a(this.f114901g, tcVar.f114901g) && n51.f.a(this.f114902h, tcVar.f114902h) && n51.f.a(this.f114903i, tcVar.f114903i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114904m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f114898d);
            }
            bw5.wc wcVar = this.f114899e;
            if (wcVar != null && zArr[2]) {
                fVar.i(2, wcVar.mo75928xcd1e8d8());
                this.f114899e.mo75956x3d5d1f78(fVar);
            }
            bw5.l00 l00Var = this.f114900f;
            if (l00Var != null && zArr[3]) {
                fVar.i(3, l00Var.mo75928xcd1e8d8());
                this.f114900f.mo75956x3d5d1f78(fVar);
            }
            bw5.av avVar = this.f114901g;
            if (avVar != null && zArr[4]) {
                fVar.i(4, avVar.mo75928xcd1e8d8());
                this.f114901g.mo75956x3d5d1f78(fVar);
            }
            bw5.wc wcVar2 = this.f114902h;
            if (wcVar2 != null && zArr[5]) {
                fVar.i(5, wcVar2.mo75928xcd1e8d8());
                this.f114902h.mo75956x3d5d1f78(fVar);
            }
            bw5.fw fwVar = this.f114903i;
            if (fwVar != null && zArr[6]) {
                fVar.i(6, fwVar.mo75928xcd1e8d8());
                this.f114903i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f114898d) : 0;
            bw5.wc wcVar3 = this.f114899e;
            if (wcVar3 != null && zArr[2]) {
                e17 += b36.f.i(2, wcVar3.mo75928xcd1e8d8());
            }
            bw5.l00 l00Var2 = this.f114900f;
            if (l00Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, l00Var2.mo75928xcd1e8d8());
            }
            bw5.av avVar2 = this.f114901g;
            if (avVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, avVar2.mo75928xcd1e8d8());
            }
            bw5.wc wcVar4 = this.f114902h;
            if (wcVar4 != null && zArr[5]) {
                e17 += b36.f.i(5, wcVar4.mo75928xcd1e8d8());
            }
            bw5.fw fwVar2 = this.f114903i;
            return (fwVar2 == null || !zArr[6]) ? e17 : e17 + b36.f.i(6, fwVar2.mo75928xcd1e8d8());
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
                this.f114898d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.wc wcVar5 = new bw5.wc();
                    if (bArr != null && bArr.length > 0) {
                        wcVar5.mo11468x92b714fd(bArr);
                    }
                    this.f114899e = wcVar5;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.l00 l00Var3 = new bw5.l00();
                    if (bArr2 != null && bArr2.length > 0) {
                        l00Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f114900f = l00Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.av avVar3 = new bw5.av();
                    if (bArr3 != null && bArr3.length > 0) {
                        avVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f114901g = avVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.wc wcVar6 = new bw5.wc();
                    if (bArr4 != null && bArr4.length > 0) {
                        wcVar6.mo11468x92b714fd(bArr4);
                    }
                    this.f114902h = wcVar6;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.fw fwVar3 = new bw5.fw();
                    if (bArr5 != null && bArr5.length > 0) {
                        fwVar3.mo11468x92b714fd(bArr5);
                    }
                    this.f114903i = fwVar3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
