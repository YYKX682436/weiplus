package qt2;

/* loaded from: classes2.dex */
public final class o extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qt2.u f448138a;

    public o(qt2.u uVar) {
        this.f448138a = uVar;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            return;
        }
        qt2.u uVar = this.f448138a;
        wu5.c cVar = uVar.f448155r;
        if (cVar != null) {
            cVar.cancel(false);
        }
        uVar.f448155r = null;
    }
}
