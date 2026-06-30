package xw2;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f539257a;

    /* renamed from: b, reason: collision with root package name */
    public final int f539258b;

    /* renamed from: c, reason: collision with root package name */
    public final int f539259c;

    public t(int i17, int i18, int i19) {
        this.f539257a = i17;
        this.f539258b = i18;
        this.f539259c = i19;
    }

    /* renamed from: equals */
    public boolean m176120xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw2.t)) {
            return false;
        }
        xw2.t tVar = (xw2.t) obj;
        return this.f539257a == tVar.f539257a && this.f539258b == tVar.f539258b && this.f539259c == tVar.f539259c;
    }

    /* renamed from: hashCode */
    public int m176121x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f539257a) * 31) + java.lang.Integer.hashCode(this.f539258b)) * 31) + java.lang.Integer.hashCode(this.f539259c);
    }

    /* renamed from: toString */
    public java.lang.String m176122x9616526c() {
        return "RecyclerViewState(totalItemCount=" + this.f539257a + ", lastVisibleItemPosition=" + this.f539258b + ", curGroupCount=" + this.f539259c + ')';
    }
}
