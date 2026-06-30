package rq4;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f480467a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f480468b;

    /* renamed from: c, reason: collision with root package name */
    public android.util.Size f480469c;

    /* renamed from: d, reason: collision with root package name */
    public int f480470d;

    public a(int i17) {
        this.f480467a = i17;
        java.lang.String[] strArr = new java.lang.String[2];
        for (int i18 = 0; i18 < 2; i18++) {
            strArr[i18] = "";
        }
        this.f480468b = strArr;
    }

    /* renamed from: hashCode */
    public int m162922x8cdac1b() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return (int) java.lang.System.currentTimeMillis();
    }

    /* renamed from: toString */
    public java.lang.String m162923x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("apiLevel ");
        sb6.append(this.f480470d);
        sb6.append(",cameraid: ");
        sb6.append(this.f480467a);
        sb6.append(" and preview size is");
        android.util.Size size = this.f480469c;
        sb6.append(size != null ? java.lang.Integer.valueOf(size.getWidth()) : null);
        sb6.append('*');
        android.util.Size size2 = this.f480469c;
        sb6.append(size2 != null ? java.lang.Integer.valueOf(size2.getHeight()) : null);
        return sb6.toString();
    }
}
