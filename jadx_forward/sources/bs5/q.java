package bs5;

/* loaded from: classes13.dex */
public final class q implements tr5.n {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f105589b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f105590c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f105591d;

    public q(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("bizId".concat(" can not be empty"));
        }
        this.f105589b = str;
        this.f105590c = str2;
        this.f105591d = str3;
    }

    /* renamed from: toString */
    public java.lang.String m11140x9616526c() {
        return "LookupExtra{bizId='" + this.f105589b + "', bizKey='" + this.f105590c + "', token='" + this.f105591d + "'}";
    }
}
