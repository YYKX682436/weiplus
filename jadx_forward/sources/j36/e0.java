package j36;

/* loaded from: classes13.dex */
public class e0 extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f379066f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f379067g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f379068h = 0;

    public e0() {
        this.f379073e = 326;
    }

    @Override // j36.m0
    public java.lang.Boolean h() {
        if (this.f379071c < 12) {
            return java.lang.Boolean.FALSE;
        }
        int f17 = p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.f(this.f379072d, 8);
        if (this.f379071c < f17 + 12) {
            return java.lang.Boolean.FALSE;
        }
        this.f379066f = f17;
        int f18 = p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.f(this.f379072d, 10 + f17);
        int i17 = this.f379071c;
        int i18 = this.f379066f;
        if (i17 < i18 + 12 + f18) {
            return java.lang.Boolean.FALSE;
        }
        this.f379067g = f18;
        int f19 = p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.f(this.f379072d, 14 + i18 + f18);
        if (this.f379071c < this.f379066f + 12 + this.f379067g + f19) {
            return java.lang.Boolean.FALSE;
        }
        this.f379068h = f19;
        return java.lang.Boolean.TRUE;
    }
}
