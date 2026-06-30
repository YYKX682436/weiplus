package bg2;

/* loaded from: classes10.dex */
public final class j implements xi2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg2.k f20179a;

    public j(bg2.k kVar) {
        this.f20179a = kVar;
    }

    @Override // xi2.f
    public void onAnimationEnd() {
        bg2.k kVar = this.f20179a;
        kotlinx.coroutines.y0 y0Var = kVar.f417141d.f417147g;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new bg2.h(kVar, null), 3, null);
        }
    }

    @Override // xi2.f
    public void onAnimationStart() {
        bg2.k kVar = this.f20179a;
        com.tencent.mars.xlog.Log.i(kVar.f20221e, "onAnimationStart status:" + kVar.f20229p);
        kotlinx.coroutines.y0 y0Var = kVar.f417141d.f417147g;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new bg2.i(kVar, null), 3, null);
        }
    }
}
