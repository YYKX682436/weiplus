package v62;

/* loaded from: classes12.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f515043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f515044b;

    /* renamed from: c, reason: collision with root package name */
    public final int f515045c;

    /* renamed from: d, reason: collision with root package name */
    public final int f515046d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f515047e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f515048f;

    public i(byte[] bArr, int i17, int i18, int i19, android.graphics.Rect rect, java.lang.String str) {
        this.f515043a = bArr;
        this.f515044b = i17;
        this.f515045c = i18;
        this.f515046d = i19;
        this.f515047e = rect;
        this.f515048f = str;
    }

    /* renamed from: toString */
    public java.lang.String m171195x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("RetrieveResult{yuvDataLength=");
        byte[] bArr = this.f515043a;
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : "null");
        sb6.append(", previewWidth=");
        sb6.append(this.f515044b);
        sb6.append(", previewHeight=");
        sb6.append(this.f515045c);
        sb6.append(", rotate=");
        sb6.append(this.f515046d);
        sb6.append(", scanRect=");
        sb6.append(this.f515047e);
        sb6.append(", md5=");
        sb6.append(this.f515048f);
        sb6.append('}');
        return sb6.toString();
    }
}
