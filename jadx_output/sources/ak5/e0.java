package ak5;

/* loaded from: classes8.dex */
public final class e0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ak5.g0 f5668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.db f5670f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f5671g;

    public e0(ak5.g0 g0Var, int i17, com.tencent.mm.storage.db dbVar, android.content.Context context) {
        this.f5668d = g0Var;
        this.f5669e = i17;
        this.f5670f = dbVar;
        this.f5671g = context;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        int i19;
        java.lang.Object obj;
        android.app.ProgressDialog progressDialog;
        kotlin.jvm.internal.o.g(scene, "scene");
        gm0.j1.d().p(scene.getType(), this);
        gm0.j1.d().q(scene.getType(), this);
        ak5.g0 g0Var = this.f5668d;
        java.lang.ref.WeakReference weakReference = g0Var.f5676e;
        if (weakReference != null && (progressDialog = (android.app.ProgressDialog) weakReference.get()) != null) {
            progressDialog.dismiss();
        }
        android.content.Context context = this.f5671g;
        if (i17 != 0 || i18 != 0) {
            db5.t7.i(context, context.getString(com.tencent.mm.R.string.hbv), com.tencent.mm.R.raw.icons_outlined_info);
            return;
        }
        if (this.f5669e == 2) {
            com.tencent.mm.storage.db dbVar = this.f5670f;
            if (dbVar != null) {
                java.lang.String t07 = dbVar.t0();
                kotlin.jvm.internal.o.f(t07, "getChatRoomName(...)");
                int u07 = dbVar.u0();
                g0Var.getClass();
                ak5.v Bi = g0Var.Bi(t07);
                if (Bi != null) {
                    java.util.Iterator it = Bi.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (((com.tencent.mm.storage.db) obj).u0() == u07) {
                                break;
                            }
                        }
                    }
                    com.tencent.mm.storage.db dbVar2 = (com.tencent.mm.storage.db) obj;
                    if (dbVar2 != null) {
                        dbVar2.deleteFromDB(ak5.v.f5694d.a().Q4(), true);
                        Bi.b().remove(dbVar2);
                    }
                }
            }
            i19 = com.tencent.mm.R.string.f493415k32;
        } else {
            i19 = com.tencent.mm.R.string.f492977ij1;
        }
        db5.t7.i(context, context.getString(i19), com.tencent.mm.R.raw.icons_outlined_done);
    }
}
