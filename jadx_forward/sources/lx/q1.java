package lx;

/* loaded from: classes.dex */
public final class q1 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lx.r1 f403452b;

    public q1(yz5.l lVar, lx.r1 r1Var) {
        this.f403451a = lVar;
        this.f403452b = r1Var;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public final void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iArr);
        boolean z17 = ((iArr.length == 0) ^ true) && iArr[0] == 0;
        yz5.l lVar = this.f403451a;
        lx.r1 r1Var = this.f403452b;
        if (z17) {
            r1Var.d(new lx.p1(lVar));
            return;
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
        r1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", "requestLocationWithSystemAuth system permission denied");
    }
}
