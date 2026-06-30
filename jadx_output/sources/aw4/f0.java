package aw4;

/* loaded from: classes.dex */
public final class f0 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f14872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f14873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14874c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tg0.h1 f14875d;

    public f0(kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2, java.lang.String str, tg0.h1 h1Var) {
        this.f14872a = c0Var;
        this.f14873b = c0Var2;
        this.f14874c = str;
        this.f14875d = h1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        kotlin.jvm.internal.c0 c0Var = this.f14872a;
        if (c0Var.f310112d || this.f14873b.f310112d) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean(this.f14874c, false);
        tg0.h1 h1Var = this.f14875d;
        if (h1Var != null) {
            h1Var.a(c0Var.f310112d);
        }
    }
}
