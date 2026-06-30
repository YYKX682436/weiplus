package ph1;

/* loaded from: classes7.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f435884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f435885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ph1.e0 f435886f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f435887g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ph1.g0 f435888h;

    public v(ph1.g0 g0Var, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, ik1.b0 b0Var, ph1.e0 e0Var, ik1.b0 b0Var2) {
        this.f435888h = g0Var;
        this.f435884d = c19762x487075a;
        this.f435885e = b0Var;
        this.f435886f = e0Var;
        this.f435887g = b0Var2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f435884d.f38859x6ac9171) {
            return;
        }
        ph1.l lVar = new ph1.l();
        ph1.t tVar = new ph1.t(this);
        lVar.f435874h = tVar;
        fl1.a2 a2Var = lVar.f435872f;
        if (a2Var != null) {
            ((fl1.g1) a2Var).setOnCancelListener(tVar);
        }
        lVar.f435870d = new ph1.u(this);
        lVar.b(this.f435888h.f435862f, this.f435886f.f435850b);
        this.f435887g.f373357a = lVar;
    }
}
