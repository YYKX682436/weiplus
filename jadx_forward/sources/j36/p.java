package j36;

/* loaded from: classes13.dex */
public class p extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f379075f = 0;

    public p() {
        this.f379073e = 282;
    }

    @Override // j36.m0
    public java.lang.Boolean h() {
        int i17 = this.f379071c;
        if (i17 < 5) {
            return java.lang.Boolean.FALSE;
        }
        int i18 = this.f379072d[8] & 255;
        if (i17 < i18 + 5) {
            return java.lang.Boolean.FALSE;
        }
        this.f379075f = i18;
        return java.lang.Boolean.TRUE;
    }
}
