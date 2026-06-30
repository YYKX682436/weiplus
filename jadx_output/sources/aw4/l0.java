package aw4;

/* loaded from: classes.dex */
public final class l0 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f14897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f14898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tg0.h1 f14899c;

    public l0(db5.g3 g3Var, kotlin.jvm.internal.c0 c0Var, tg0.h1 h1Var) {
        this.f14897a = g3Var;
        this.f14898b = c0Var;
        this.f14899c = h1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        db5.g3 g3Var = this.f14897a;
        if (g3Var.T || this.f14898b.f310112d) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("tophitory_show_init_dialog", false);
        tg0.h1 h1Var = this.f14899c;
        if (h1Var != null) {
            h1Var.a(g3Var.T);
        }
    }
}
