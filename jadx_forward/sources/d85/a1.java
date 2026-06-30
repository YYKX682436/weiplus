package d85;

/* loaded from: classes7.dex */
public final class a1 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d85.l0 f308667a;

    public a1(d85.l0 l0Var) {
        this.f308667a = l0Var;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        boolean z17 = true;
        if (iArr != null) {
            int length = iArr.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    break;
                }
                if (iArr[i18] == -1) {
                    z17 = false;
                    break;
                }
                i18++;
            }
        }
        d85.l0 l0Var = this.f308667a;
        if (z17) {
            l0Var.a(d85.h0.GRANTED);
        } else {
            l0Var.a(d85.h0.SYSTEM_REFUSE);
        }
    }
}
