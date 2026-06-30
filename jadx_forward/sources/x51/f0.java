package x51;

/* loaded from: classes12.dex */
public class f0 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zb0.a0 f533534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533536c;

    public f0(zb0.a0 a0Var, java.lang.String str, java.lang.String str2) {
        this.f533534a = a0Var;
        this.f533535b = str;
        this.f533536c = str2;
    }

    @Override // m3.a
    /* renamed from: accept */
    public void mo3938xab27b508(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        zb0.a0 a0Var = this.f533534a;
        if (a0Var != null) {
            boolean isEmpty = android.text.TextUtils.isEmpty(str);
            java.lang.String str2 = this.f533535b;
            if (isEmpty) {
                a0Var.b(str2, this.f533536c);
            } else {
                a0Var.a(str2, str);
            }
        }
    }
}
