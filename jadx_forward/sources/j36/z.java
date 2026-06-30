package j36;

/* loaded from: classes13.dex */
public class z extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f379081f = 0;

    public z() {
        this.f379073e = 312;
    }

    @Override // j36.m0
    public java.lang.Boolean h() {
        if (this.f379071c < 4) {
            return java.lang.Boolean.FALSE;
        }
        int g17 = p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.g(this.f379072d, 4);
        this.f379081f = g17;
        return this.f379071c < (g17 * 10) + 4 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }

    public int i() {
        for (int i17 = 0; i17 < this.f379081f; i17++) {
            int i18 = 8 + (i17 * 10);
            if (p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.f(this.f379072d, i18) == 266) {
                return p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.g(this.f379072d, i18 + 2);
            }
        }
        return 0;
    }
}
