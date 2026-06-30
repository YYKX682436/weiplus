package w21;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg0.e f523960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f523961e;

    public m(w21.k kVar, dg0.e eVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f523960d = eVar;
        this.f523961e = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0) this.f523960d).p(this.f523961e);
    }
}
