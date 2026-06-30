package fo5;

/* loaded from: classes14.dex */
public final class q0 implements com.p314xaae8f345.mm.ui.p2740x696c9db.kd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f346601a;

    public q0(fo5.r0 r0Var) {
        this.f346601a = r0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.kd
    /* renamed from: onKeyDown */
    public boolean mo67037x1f03f0c2(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        fo5.r0 r0Var = this.f346601a;
        if (!r0Var.r() || r0Var.A) {
            return false;
        }
        if (i17 != 24 && i17 != 25) {
            return false;
        }
        gp5.e eVar = r0Var.f346622h;
        if (!eVar.f355997e) {
            return true;
        }
        eVar.b();
        return true;
    }
}
