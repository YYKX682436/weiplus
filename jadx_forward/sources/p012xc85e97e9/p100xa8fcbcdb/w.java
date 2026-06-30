package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public int f93376a;

    /* renamed from: b, reason: collision with root package name */
    public int f93377b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f93378c;

    public w(p012xc85e97e9.p100xa8fcbcdb.w wVar) {
        this.f93376a = wVar.f93376a;
        this.f93377b = wVar.f93377b;
        this.f93378c = wVar.f93378c;
    }

    /* renamed from: equals */
    public boolean m7904xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof p012xc85e97e9.p100xa8fcbcdb.w)) {
            return false;
        }
        p012xc85e97e9.p100xa8fcbcdb.w wVar = (p012xc85e97e9.p100xa8fcbcdb.w) obj;
        return this.f93376a == wVar.f93376a && this.f93377b == wVar.f93377b && android.text.TextUtils.equals(this.f93378c, wVar.f93378c);
    }

    /* renamed from: hashCode */
    public int m7905x8cdac1b() {
        return ((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + this.f93376a) * 31) + this.f93377b) * 31) + this.f93378c.hashCode();
    }
}
