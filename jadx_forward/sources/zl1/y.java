package zl1;

/* loaded from: classes7.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f555159a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f555160b;

    /* renamed from: c, reason: collision with root package name */
    public final zl1.w f555161c;

    /* renamed from: d, reason: collision with root package name */
    public zl1.x f555162d;

    /* renamed from: e, reason: collision with root package name */
    public int f555163e = -1;

    /* renamed from: f, reason: collision with root package name */
    public volatile zl1.z f555164f;

    public y(java.lang.String str, zl1.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        this.f555159a = str;
        this.f555160b = e9Var;
        this.f555161c = wVar;
    }

    public java.lang.String a() {
        java.lang.String str = this.f555159a;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public abstract void b();

    public y(java.lang.String str, zl1.w wVar) {
        this.f555159a = str;
        this.f555161c = wVar;
    }
}
