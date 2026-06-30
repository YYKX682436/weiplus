package rh;

/* loaded from: classes12.dex */
public abstract class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final rh.d3 f477017a;

    /* renamed from: b, reason: collision with root package name */
    public final rh.d3 f477018b;

    /* renamed from: c, reason: collision with root package name */
    public final rh.d3 f477019c;

    /* renamed from: d, reason: collision with root package name */
    public final long f477020d;

    public o2(rh.d3 d3Var, rh.d3 d3Var2) {
        this.f477017a = d3Var;
        this.f477018b = d3Var2;
        this.f477020d = d3Var2.f476896a - d3Var.f476896a;
        rh.d3 a17 = a();
        this.f477019c = a17;
        a17.f476897b = true;
    }

    public abstract rh.d3 a();

    public boolean b() {
        return this.f477017a.f476898c && this.f477018b.f476898c;
    }

    public o2(rh.d3 d3Var, rh.d3 d3Var2, rh.d3 d3Var3) {
        this.f477017a = d3Var;
        this.f477018b = d3Var2;
        this.f477020d = d3Var2.f476896a - d3Var.f476896a;
        this.f477019c = d3Var3;
        d3Var3.f476897b = true;
    }
}
