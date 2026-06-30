package av1;

/* loaded from: classes3.dex */
public final class h implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cast.ui.ScreenCastActivity f14181d;

    public h(com.tencent.mm.plugin.cast.ui.ScreenCastActivity screenCastActivity) {
        this.f14181d = screenCastActivity;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.cast.ui.ScreenCastActivity screenCastActivity = this.f14181d;
        g4Var.d(0, screenCastActivity.getResources().getColor(com.tencent.mm.R.color.a2y), screenCastActivity.getResources().getString(com.tencent.mm.R.string.jlc));
    }
}
