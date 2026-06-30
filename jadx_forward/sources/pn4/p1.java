package pn4;

/* loaded from: classes4.dex */
public class p1 {

    /* renamed from: n, reason: collision with root package name */
    public static int f438703n;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f438704a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f438705b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f438706c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f438707d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f438708e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f438709f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f438710g;

    /* renamed from: h, reason: collision with root package name */
    public int f438711h;

    /* renamed from: i, reason: collision with root package name */
    public final int f438712i;

    /* renamed from: j, reason: collision with root package name */
    public final int f438713j;

    /* renamed from: k, reason: collision with root package name */
    public int f438714k;

    /* renamed from: l, reason: collision with root package name */
    public final int f438715l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f438716m;

    public p1(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4, byte[] bArr) {
        int t17;
        java.lang.String trim;
        this.f438704a = str;
        this.f438705b = str2;
        this.f438707d = str3;
        this.f438712i = i17;
        this.f438715l = i18;
        this.f438708e = str4;
        this.f438710g = bArr;
        if (f438703n == Integer.MAX_VALUE) {
            f438703n = 0;
        }
        int i19 = f438703n + 1;
        f438703n = i19;
        this.f438713j = i19;
        if (i17 != 1 || (t17 = c01.w9.t(str)) == -1 || (trim = str.substring(0, t17).trim()) == null || trim.length() <= 0) {
            return;
        }
        this.f438716m = trim;
        this.f438704a = str.substring(t17 + 1).trim();
    }
}
