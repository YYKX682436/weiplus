package y22;

/* loaded from: classes.dex */
public final class k implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13388xb8f672d4 f540629a;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13388xb8f672d4 activityC13388xb8f672d4) {
        this.f540629a = activityC13388xb8f672d4;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public final void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iArr);
        int length = iArr.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                z17 = false;
                break;
            }
            z17 = true;
            if (iArr[i18] != 0) {
                break;
            } else {
                i18++;
            }
        }
        if (z17) {
            java.lang.Integer S = kz5.z.S(iArr, 0);
            int i19 = (S != null && S.intValue() == 0) ? com.p314xaae8f345.mm.R.C30867xcad56011.hhn : com.p314xaae8f345.mm.R.C30867xcad56011.hh8;
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13388xb8f672d4 activityC13388xb8f672d4 = this.f540629a;
            db5.e1.k(activityC13388xb8f672d4.mo55332x76847179(), i19, com.p314xaae8f345.mm.R.C30867xcad56011.hht, com.p314xaae8f345.mm.R.C30867xcad56011.g6z, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg, false, new y22.i(activityC13388xb8f672d4), new y22.j(activityC13388xb8f672d4));
        }
    }
}
