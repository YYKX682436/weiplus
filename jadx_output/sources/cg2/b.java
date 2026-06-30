package cg2;

/* loaded from: classes3.dex */
public final class b implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f41079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Resources f41080e;

    public b(dk2.zf zfVar, android.content.res.Resources resources) {
        this.f41079d = zfVar;
        this.f41080e = resources;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean booleanValue = ((java.lang.Boolean) t70Var.Q().r()).booleanValue();
        android.content.res.Resources resources = this.f41080e;
        if (booleanValue) {
            if (this.f41079d.getType() == 1) {
                g4Var.f(4, resources.getString(com.tencent.mm.R.string.f491683dx2));
            }
        }
        if (((java.lang.Boolean) t70Var.Q().r()).booleanValue()) {
            g4Var.f(3, resources.getString(com.tencent.mm.R.string.gyu));
        }
        g4Var.f(1, resources.getString(com.tencent.mm.R.string.f491699dy4));
    }
}
