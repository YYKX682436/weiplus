package zk3;

/* loaded from: classes8.dex */
public final class o0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zk3.w0 f555019a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(zk3.w0 w0Var, android.os.Looper looper) {
        super(looper);
        this.f555019a = w0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int i17 = msg.what;
        zk3.w0 w0Var = this.f555019a;
        if (i17 == w0Var.f555053g) {
            ((android.widget.ProgressBar) w0Var.m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.ui_)).setVisibility(0);
            return;
        }
        w0Var.getClass();
        if (i17 == 0) {
            w0Var.X6();
            w0Var.W6();
            android.content.Context context = w0Var.m80380x71e92c1d().getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).T6(true);
        }
    }
}
