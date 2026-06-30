package xc2;

/* loaded from: classes2.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f534752a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.CharSequence f534753b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f534754c;

    /* renamed from: d, reason: collision with root package name */
    public int f534755d = com.p314xaae8f345.mm.R.raw.f79775xc850a312;

    /* renamed from: e, reason: collision with root package name */
    public int f534756e = com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m;

    public boolean a() {
        java.lang.CharSequence charSequence = this.f534752a;
        if (!(charSequence == null || charSequence.length() == 0)) {
            return false;
        }
        java.lang.CharSequence charSequence2 = this.f534753b;
        return charSequence2 == null || charSequence2.length() == 0;
    }

    public final void b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        java.lang.CharSequence charSequence = this.f534752a;
        if (charSequence == null || charSequence.length() == 0) {
            java.lang.CharSequence charSequence2 = this.f534753b;
            if (charSequence2 == null || charSequence2.length() == 0) {
                java.lang.String m76523x98b23862 = jumpInfo.m76523x98b23862();
                if (!(m76523x98b23862 == null || m76523x98b23862.length() == 0)) {
                    this.f534752a = jumpInfo.m76523x98b23862();
                }
            }
        }
        java.lang.String str = this.f534754c;
        if (str == null || str.length() == 0) {
            java.lang.String m76497x4fe38a1f = jumpInfo.m76497x4fe38a1f();
            if (m76497x4fe38a1f == null || m76497x4fe38a1f.length() == 0) {
                return;
            }
            this.f534754c = jumpInfo.m76497x4fe38a1f();
        }
    }
}
