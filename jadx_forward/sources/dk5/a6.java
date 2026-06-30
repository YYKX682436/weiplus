package dk5;

/* loaded from: classes2.dex */
public class a6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f316030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f316031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk5.b6 f316032f;

    public a6(dk5.b6 b6Var, boolean z17, boolean z18) {
        this.f316032f = b6Var;
        this.f316030d = z17;
        this.f316031e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        tg3.y0 y0Var = this.f316032f.f316064e;
        boolean z17 = this.f316030d && this.f316031e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n4 n4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n4) y0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i4 i4Var = n4Var.f183933a;
        i4Var.f183795l = !z17;
        n4Var.f183934b.mo146xb9724478(i4Var);
    }
}
