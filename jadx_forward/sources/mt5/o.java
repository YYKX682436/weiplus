package mt5;

/* loaded from: classes8.dex */
public class o implements lt5.a {

    /* renamed from: a, reason: collision with root package name */
    public int f412856a = -1;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f412857b = "";

    /* renamed from: c, reason: collision with root package name */
    public lt5.f f412858c;

    @Override // lt5.a
    public lt5.f a(android.content.Context context) {
        lt5.f fVar = this.f412858c;
        if (fVar != null && fVar.f402837b == 0) {
            return fVar;
        }
        try {
            java.lang.Object invoke = java.lang.Class.forName("android.tencent.sdid.TencentIdentifierManager").getMethod(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c6.f33970x24728b, android.content.Context.class).invoke(context.getSystemService("tencent_identifier"), context);
            if (invoke != null) {
                this.f412857b = (java.lang.String) invoke;
            }
            if (android.text.TextUtils.isEmpty(this.f412857b)) {
                this.f412856a = -305;
            } else {
                this.f412856a = 0;
            }
        } catch (java.lang.Throwable unused) {
            this.f412856a = -306;
        }
        lt5.f fVar2 = new lt5.f(this.f412857b, this.f412856a);
        this.f412858c = fVar2;
        return fVar2;
    }
}
