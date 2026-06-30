package zv;

/* loaded from: classes.dex */
public final class i4 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f557528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d f557529b;

    public i4(yz5.l lVar, com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d) {
        this.f557528a = lVar;
        this.f557529b = c10465x1b7ee7d;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public final void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iArr);
        boolean z17 = ((iArr.length == 0) ^ true) && iArr[0] == 0;
        yz5.l lVar = this.f557528a;
        com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d = this.f557529b;
        if (z17) {
            zv.h4 h4Var = new zv.h4(lVar);
            f06.v[] vVarArr = com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d.B;
            c10465x1b7ee7d.e(h4Var);
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c10465x1b7ee7d.f146722d, "requestLocationWithSystemAuth system permission denied");
        }
    }
}
