package j36;

/* loaded from: classes13.dex */
public class v extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f379077f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f379078g = 0;

    public v() {
        this.f379073e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c0.f33779x366c91de;
    }

    @Override // j36.m0
    public java.lang.Boolean h() {
        if (this.f379071c < 2) {
            return java.lang.Boolean.FALSE;
        }
        int f17 = p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.f(this.f379072d, 4);
        this.f379077f = f17;
        if (this.f379071c < f17 + 2 + 2) {
            return java.lang.Boolean.FALSE;
        }
        this.f379078g = p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.f(this.f379072d, 6 + f17);
        return java.lang.Boolean.TRUE;
    }
}
