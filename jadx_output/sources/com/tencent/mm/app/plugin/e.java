package com.tencent.mm.app.plugin;

/* loaded from: classes9.dex */
public class e implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.app.plugin.d f53643d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f53644e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f53646g;

    /* renamed from: h, reason: collision with root package name */
    public final int f53647h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f53648i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f53649m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f53650n;

    /* renamed from: p, reason: collision with root package name */
    public final android.os.Bundle f53652p;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f53651o = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f53645f = null;

    public e(android.content.Context context, int i17, java.lang.String str, android.os.Bundle bundle, com.tencent.mm.app.plugin.d dVar) {
        this.f53644e = context;
        this.f53643d = dVar;
        this.f53647h = i17;
        this.f53648i = str;
        this.f53652p = bundle;
    }

    public final void a(boolean z17, r45.nx5 nx5Var) {
        com.tencent.mm.app.plugin.d dVar = this.f53643d;
        if (dVar != null) {
            com.tencent.mm.app.plugin.q qVar = (com.tencent.mm.app.plugin.q) dVar;
            qVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandler", "finishCheckTag");
            r35.m3 m3Var = qVar.f53672a;
            com.tencent.mm.app.plugin.s sVar = qVar.f53676e;
            if (nx5Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandler", "handleSpanClick, response is null");
                ((java.util.concurrent.ConcurrentHashMap) sVar.f53679e).remove(m3Var.e());
                return;
            }
            android.content.Context context = this.f53644e;
            sVar.f53681g = context;
            sVar.f53680f.f53590a = context;
            sVar.f53678d.put(m3Var.e(), nx5Var);
            qVar.f53676e.c(nx5Var, (com.tencent.mm.app.plugin.URISpanHandlerSet.TopicSpanHandler) qVar.f53673b, qVar.f53674c, qVar.f53672a, qVar.f53675d);
            ((java.util.concurrent.ConcurrentHashMap) sVar.f53679e).remove(m3Var.e());
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof xk.a) || m1Var.getType() != 4790) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AddContact", "not expected scene,  type = " + m1Var.getType());
            return;
        }
        if (this.f53646g) {
            java.lang.Runnable runnable = this.f53650n;
            if (runnable != null) {
                com.tencent.mm.sdk.platformtools.u3.l(runnable);
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f53645f;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f53645f = null;
            }
        }
        com.tencent.mm.sdk.platformtools.u3.l(this.f53649m);
        gm0.j1.n().f273288b.q(4790, this);
        if (i17 != 0 || i18 != 0) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                db5.e1.s(this.f53644e, str, "");
            }
            a(false, null);
        } else {
            r45.nx5 nx5Var = (r45.nx5) ((xk.a) m1Var).f454918e.f70711b.f70700a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "[dealSuccess] disablePopups = " + nx5Var.f381733p);
            a(true, nx5Var);
        }
    }
}
