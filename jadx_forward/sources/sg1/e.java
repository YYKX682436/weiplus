package sg1;

/* loaded from: classes7.dex */
public class e extends r45.vb5 {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f489411h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f489412i;

    /* renamed from: m, reason: collision with root package name */
    public long f489413m;

    public final void b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new java.io.IOException("Invalid bytes");
        }
        super.mo11468x92b714fd(bArr);
    }

    public final byte[] c() {
        return super.mo14344x5f01b1f6();
    }

    /* renamed from: toString */
    public java.lang.String m164532x9616526c() {
        return "PrefetchPkgDownloadInfo{packageMD5='" + this.f489411h + "', packageURL='" + this.f489412i + "', urlLifespan=" + this.f489413m + ", appId='" + this.f469606d + "', packageKey='" + this.f469607e + "', packageType=" + this.f469608f + ", packageVersion=" + this.f469609g + '}';
    }
}
