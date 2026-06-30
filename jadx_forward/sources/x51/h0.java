package x51;

/* loaded from: classes12.dex */
public class h0 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zb0.a0 f533547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533549c;

    public h0(zb0.a0 a0Var, java.lang.String str, java.lang.String str2) {
        this.f533547a = a0Var;
        this.f533548b = str;
        this.f533549c = str2;
    }

    @Override // m3.a
    /* renamed from: accept */
    public void mo3938xab27b508(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        zb0.a0 a0Var = this.f533547a;
        if (a0Var != null) {
            boolean isEmpty = android.text.TextUtils.isEmpty(str);
            java.lang.String str2 = this.f533548b;
            if (isEmpty) {
                a0Var.b(str2, this.f533549c);
            } else {
                a0Var.a(str2, str);
            }
        }
    }
}
