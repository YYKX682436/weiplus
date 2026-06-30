package com.tencent.mm.app.plugin;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.plugin.e f53639d;

    public a(com.tencent.mm.app.plugin.e eVar) {
        this.f53639d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "check short link timeout");
        com.tencent.mm.app.plugin.e eVar = this.f53639d;
        eVar.f53651o.set(true);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = eVar.f53645f;
        if (u3Var != null) {
            u3Var.dismiss();
            eVar.f53645f = null;
        }
        android.content.Context context = eVar.f53644e;
        db5.t7.makeText(context, context.getString(com.tencent.mm.R.string.f490561yj), 1).show();
        eVar.a(false, null);
    }
}
