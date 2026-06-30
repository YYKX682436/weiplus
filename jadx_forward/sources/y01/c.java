package y01;

/* loaded from: classes9.dex */
public final class c extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f540119b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f540120c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f540121d;

    public /* synthetic */ c(java.lang.String str, java.lang.String str2, byte[] bArr, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, (i17 & 4) != 0 ? null : bArr);
    }

    public c(java.lang.String imageKey, java.lang.String tempCachePath, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageKey, "imageKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempCachePath, "tempCachePath");
        this.f540119b = imageKey;
        this.f540120c = tempCachePath;
        this.f540121d = bArr;
    }
}
