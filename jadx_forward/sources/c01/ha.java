package c01;

/* loaded from: classes9.dex */
public class ha {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f118767a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f118768b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f118769c = 0;

    public boolean a() {
        return !(c01.e2.a0() || (this.f118768b & 1) == 0) || this.f118769c >= 2;
    }

    /* renamed from: toString */
    public java.lang.String m13838x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SecurityData{tipsUrl='");
        sb6.append(this.f118767a);
        sb6.append("', secCtrlFlag=");
        sb6.append(this.f118768b);
        sb6.append(", repaireValue=");
        sb6.append(this.f118769c);
        sb6.append(", showDialog=");
        boolean z17 = true;
        if (android.text.TextUtils.isEmpty(this.f118767a) && this.f118769c < 1) {
            z17 = false;
        }
        sb6.append(z17);
        sb6.append(", showRumorImg=");
        sb6.append(a());
        sb6.append('}');
        return sb6.toString();
    }
}
