package ak5;

/* loaded from: classes8.dex */
public final class e0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ak5.g0 f87201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f87202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.db f87203f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f87204g;

    public e0(ak5.g0 g0Var, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.db dbVar, android.content.Context context) {
        this.f87201d = g0Var;
        this.f87202e = i17;
        this.f87203f = dbVar;
        this.f87204g = context;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        int i19;
        java.lang.Object obj;
        android.app.ProgressDialog progressDialog;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        gm0.j1.d().p(scene.mo808xfb85f7b0(), this);
        gm0.j1.d().q(scene.mo808xfb85f7b0(), this);
        ak5.g0 g0Var = this.f87201d;
        java.lang.ref.WeakReference weakReference = g0Var.f87209e;
        if (weakReference != null && (progressDialog = (android.app.ProgressDialog) weakReference.get()) != null) {
            progressDialog.dismiss();
        }
        android.content.Context context = this.f87204g;
        if (i17 != 0 || i18 != 0) {
            db5.t7.i(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbv), com.p314xaae8f345.mm.R.raw.f80141xebd5ba06);
            return;
        }
        if (this.f87202e == 2) {
            com.p314xaae8f345.mm.p2621x8fb0427b.db dbVar = this.f87203f;
            if (dbVar != null) {
                java.lang.String t07 = dbVar.t0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t07, "getChatRoomName(...)");
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
                            if (((com.p314xaae8f345.mm.p2621x8fb0427b.db) obj).u0() == u07) {
                                break;
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.db dbVar2 = (com.p314xaae8f345.mm.p2621x8fb0427b.db) obj;
                    if (dbVar2 != null) {
                        dbVar2.m125181xbc662333(ak5.v.f87227d.a().Q4(), true);
                        Bi.b().remove(dbVar2);
                    }
                }
            }
            i19 = com.p314xaae8f345.mm.R.C30867xcad56011.f574948k32;
        } else {
            i19 = com.p314xaae8f345.mm.R.C30867xcad56011.f574510ij1;
        }
        db5.t7.i(context, context.getString(i19), com.p314xaae8f345.mm.R.raw.f80084xebd378da);
    }
}
