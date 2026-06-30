package wz1;

/* loaded from: classes12.dex */
public class j implements com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.Callback {

    /* renamed from: a, reason: collision with root package name */
    public int f532290a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f532291b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f532292c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f532293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wz1.i f532294e;

    public j(wz1.i iVar, int[] iArr) {
        this.f532294e = iVar;
        this.f532293d = iArr;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.Callback
    /* renamed from: onProgress */
    public int mo107986x696ee52c(java.lang.String str, int i17, android.database.Cursor cursor) {
        int i18 = this.f532290a;
        wz1.i iVar = this.f532294e;
        if (i18 == 0) {
            if (!str.equalsIgnoreCase(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
                return 0;
            }
            this.f532290a = i17;
        } else if (i18 != i17) {
            if (!this.f532292c) {
                this.f532292c = true;
                iVar.publishProgress(3);
            }
            return 0;
        }
        int i19 = this.f532291b;
        this.f532291b = i19 + 1;
        if (i19 % 1000 == 0) {
            iVar.publishProgress(2, java.lang.Integer.valueOf(this.f532291b - 1), java.lang.Integer.valueOf(iVar.f532258q));
        }
        int[] iArr = this.f532293d;
        iArr[0] = iArr[0] + 1;
        return 0;
    }
}
