package bs5;

/* loaded from: classes13.dex */
public final class q implements tr5.n {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f24056b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f24057c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f24058d;

    public q(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("bizId".concat(" can not be empty"));
        }
        this.f24056b = str;
        this.f24057c = str2;
        this.f24058d = str3;
    }

    public java.lang.String toString() {
        return "LookupExtra{bizId='" + this.f24056b + "', bizKey='" + this.f24057c + "', token='" + this.f24058d + "'}";
    }
}
