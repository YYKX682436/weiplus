package aw4;

/* loaded from: classes.dex */
public final class i0 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f14885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f14886b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tg0.h1 f14887c;

    public i0(db5.g3 g3Var, kotlin.jvm.internal.c0 c0Var, tg0.h1 h1Var) {
        this.f14885a = g3Var;
        this.f14886b = c0Var;
        this.f14887c = h1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        db5.g3 g3Var = this.f14885a;
        if (g3Var.T || this.f14886b.f310112d) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("tophitory_show_comment_dialog", false);
        tg0.h1 h1Var = this.f14887c;
        if (h1Var != null) {
            h1Var.a(g3Var.T);
        }
    }
}
