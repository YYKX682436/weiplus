package s33;

/* loaded from: classes15.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s33.h0 f484025d;

    public g0(s33.h0 h0Var) {
        this.f484025d = h0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        s33.h0 h0Var = this.f484025d;
        u33.h hVar = (u33.h) h0Var.f484030d.get(h0Var.f484031e.f484036a);
        boolean z17 = s33.y.e(h0Var.f484031e.f484037b).f484023a;
        boolean z18 = s33.y.e(h0Var.f484031e.f484037b).f484024b;
        if (hVar == null || z17 || z18) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5237xbeff673c c5237xbeff673c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5237xbeff673c();
        y33.e eVar = (y33.e) hVar;
        java.lang.String str = eVar.f66967xdde069b;
        am.b2 b2Var = c5237xbeff673c.f135570g;
        b2Var.f87741a = str;
        b2Var.f87742b = eVar.f66960x21eb2633;
        c5237xbeff673c.e();
    }
}
