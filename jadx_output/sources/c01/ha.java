package c01;

/* loaded from: classes9.dex */
public class ha {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f37234a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f37235b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f37236c = 0;

    public boolean a() {
        return !(c01.e2.a0() || (this.f37235b & 1) == 0) || this.f37236c >= 2;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SecurityData{tipsUrl='");
        sb6.append(this.f37234a);
        sb6.append("', secCtrlFlag=");
        sb6.append(this.f37235b);
        sb6.append(", repaireValue=");
        sb6.append(this.f37236c);
        sb6.append(", showDialog=");
        boolean z17 = true;
        if (android.text.TextUtils.isEmpty(this.f37234a) && this.f37236c < 1) {
            z17 = false;
        }
        sb6.append(z17);
        sb6.append(", showRumorImg=");
        sb6.append(a());
        sb6.append('}');
        return sb6.toString();
    }
}
