package j36;

/* loaded from: classes13.dex */
public class e extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f379062f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f379063g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f379064h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f379065i = 0;

    public e() {
        this.f379073e = 261;
    }

    @Override // j36.m0
    public java.lang.Boolean h() {
        if (this.f379071c < 2) {
            return java.lang.Boolean.FALSE;
        }
        int f17 = p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.f(this.f379072d, 4);
        this.f379063g = f17;
        if (this.f379071c < f17 + 2 + 2) {
            return java.lang.Boolean.FALSE;
        }
        int f18 = p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.f(this.f379072d, f17 + 6);
        this.f379062f = f18;
        int i17 = this.f379071c;
        int i18 = this.f379063g + 2 + 2;
        if (i17 < f18 + i18) {
            return java.lang.Boolean.FALSE;
        }
        this.f379065i = 6;
        this.f379064h = i18 + 4;
        return java.lang.Boolean.TRUE;
    }
}
