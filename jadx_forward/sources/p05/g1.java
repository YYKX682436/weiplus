package p05;

/* loaded from: classes14.dex */
public abstract class g1 implements p05.v0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f432057a;

    /* renamed from: b, reason: collision with root package name */
    public rh0.d0 f432058b;

    /* renamed from: c, reason: collision with root package name */
    public long f432059c;

    /* renamed from: d, reason: collision with root package name */
    public int f432060d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f432061e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public long f432062f;

    @Override // p05.e2
    public int a() {
        return this.f432060d;
    }

    @Override // p05.e2
    public void b(rh0.d0 d0Var) {
        if (this.f432057a && d0Var != null && ((p05.l4) d0Var).f432126f != this.f432059c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MakeUpSuitEffect", "Cannot attach twice!");
            return;
        }
        rh0.d0 d0Var2 = this.f432058b;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).u(this);
        }
        this.f432058b = d0Var;
        if (d0Var != null) {
            ((p05.l4) d0Var).f(this);
        }
        if (d0Var == null) {
            c("", "");
            this.f432059c = 0L;
            this.f432057a = false;
        } else {
            long j17 = ((p05.l4) d0Var).f432126f;
            this.f432059c = j17;
            if (j17 == 0) {
                return;
            }
            this.f432057a = true;
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83725xffa3acc7(j17, true);
        }
    }

    public abstract void c(java.lang.String str, java.lang.String str2);
}
