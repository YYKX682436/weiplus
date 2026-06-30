package at2;

/* loaded from: classes.dex */
public final class l0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f13701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f13702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f13703f;

    public l0(com.tencent.mm.ui.widget.dialog.k0 k0Var, o25.y1 y1Var, android.content.Context context) {
        this.f13701d = k0Var;
        this.f13702e = y1Var;
        this.f13703f = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f13701d;
        android.content.Context context = this.f13703f;
        kotlin.jvm.internal.o.d(g4Var);
        ((com.tencent.mm.pluginsdk.forward.m) this.f13702e).Ai(context, g4Var, k0Var, 2, at2.k0.f13698d);
    }
}
