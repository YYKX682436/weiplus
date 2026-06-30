package rh;

/* loaded from: classes12.dex */
public class e extends rh.o2 {
    public e(rh.f fVar, rh.f fVar2, rh.f fVar3) {
        super(fVar2, fVar3);
    }

    @Override // rh.o2
    public rh.d3 a() {
        int i17;
        int i18;
        rh.f fVar = new rh.f();
        rh.f fVar2 = (rh.f) this.f477018b;
        fVar.f476907d = fVar2.f476907d;
        fVar.f476908e = fVar2.f476908e;
        long j17 = fVar2.f476909f;
        rh.f fVar3 = (rh.f) this.f477017a;
        fVar.f476909f = j17 - fVar3.f476909f;
        fVar.f476910g = rh.p2.a(fVar3.f476910g, fVar2.f476910g);
        fVar.f476914k = fVar2.f476914k;
        int i19 = fVar3.f476911h;
        if (i19 == 1 || (i18 = fVar2.f476911h) == 1) {
            fVar.f476911h = 1;
        } else if (i19 == 3 && i18 == 3) {
            fVar.f476911h = 3;
        } else {
            fVar.f476911h = 2;
        }
        int i27 = fVar3.f476912i;
        if (i27 == 1 || (i17 = fVar2.f476912i) == 1) {
            fVar.f476912i = 1;
        } else if (i27 == 3 && i17 == 3) {
            fVar.f476912i = 3;
        } else if (i27 == 4 && i17 == 4) {
            fVar.f476912i = 3;
        } else {
            fVar.f476912i = 2;
        }
        fVar.f476913j = fVar2.f476913j;
        return fVar;
    }
}
