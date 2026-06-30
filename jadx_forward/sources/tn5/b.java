package tn5;

/* loaded from: classes15.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public float f502387d;

    /* renamed from: e, reason: collision with root package name */
    public final int f502388e;

    /* renamed from: f, reason: collision with root package name */
    public int f502389f;

    /* renamed from: g, reason: collision with root package name */
    public long f502390g = android.view.animation.AnimationUtils.currentAnimationTimeMillis();

    /* renamed from: h, reason: collision with root package name */
    public float f502391h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tn5.f f502392i;

    public b(tn5.f fVar, float f17, int i17) {
        this.f502392i = fVar;
        this.f502387d = f17;
        this.f502388e = i17;
        fVar.f502401a.getF295283w().mo50297x7c4d7ca2(this, 10);
        float f18 = this.f502387d;
        tn5.a aVar = fVar.f502402b;
        if (f18 > 0.0f) {
            aVar.e(sn5.b.f491692r);
        } else {
            aVar.e(sn5.b.f491694t);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        double pow;
        tn5.f fVar = this.f502392i;
        if (fVar.f502404d != this || fVar.f502402b.f502384b.f491705h) {
            return;
        }
        float f17 = this.f502387d;
        mn5.b bVar = fVar.f502403c;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cValues");
            throw null;
        }
        int abs = java.lang.Math.abs(bVar.f411742b);
        int i17 = this.f502388e;
        if (abs < java.lang.Math.abs(i17)) {
            this.f502389f = this.f502389f + 1;
            pow = java.lang.Math.pow(0.95d, r2 * 2);
        } else if (i17 != 0) {
            this.f502389f = this.f502389f + 1;
            pow = java.lang.Math.pow(0.45d, r2 * 2);
        } else {
            this.f502389f = this.f502389f + 1;
            pow = java.lang.Math.pow(0.85d, r2 * 2);
        }
        this.f502387d = f17 * ((float) pow);
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        float f18 = this.f502387d * ((((float) (currentAnimationTimeMillis - this.f502390g)) * 1.0f) / 1000);
        if (java.lang.Math.abs(f18) >= 1.0f) {
            this.f502390g = currentAnimationTimeMillis;
            float f19 = this.f502391h + f18;
            this.f502391h = f19;
            fVar.f502401a.u(f19);
            fVar.f502401a.getF295283w().mo50297x7c4d7ca2(this, 10);
            return;
        }
        tn5.a aVar = fVar.f502402b;
        sn5.b bVar2 = aVar.f502385c;
        boolean z17 = bVar2.f491703f;
        if (z17 && bVar2.f491701d) {
            aVar.e(sn5.b.f491691q);
        } else if (z17 && bVar2.f491702e) {
            aVar.e(sn5.b.f491693s);
        }
        fVar.f502404d = null;
        mn5.b bVar3 = fVar.f502403c;
        if (bVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cValues");
            throw null;
        }
        if (java.lang.Math.abs(bVar3.f411742b) >= java.lang.Math.abs(i17)) {
            android.content.Context context = fVar.f502401a.getContext();
            if (fVar.f502403c == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cValues");
                throw null;
            }
            fVar.a(i17, 0, fVar.f502401a.m82921xdde4db3d(), 10 * java.lang.Math.min(java.lang.Math.max((int) ym5.x.b(context, java.lang.Math.abs(r2.f411742b - i17)), 30), 100));
        }
    }
}
