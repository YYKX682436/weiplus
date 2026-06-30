package oz4;

/* loaded from: classes12.dex */
public class o extends mz4.t {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f431826f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f431827g;

    public o(int i17, int i18, boolean z17, boolean z18) {
        super(i17, i18);
        this.f431826f = z17;
        this.f431827g = z18;
    }

    public int c() {
        return java.lang.Math.abs(this.f414884e - this.f414883d);
    }

    public boolean d(mz4.t tVar) {
        if (tVar == null) {
            return false;
        }
        if (!tVar.a()) {
            return java.lang.Math.max(this.f414883d, tVar.f414883d) < java.lang.Math.min(this.f414884e, tVar.f414884e);
        }
        int i17 = tVar.f414883d;
        int i18 = this.f414883d;
        return (i17 >= i18 && tVar.f414884e < this.f414884e) || ((i17 >= i18 && tVar.f414884e <= this.f414884e) && this.f431827g);
    }
}
