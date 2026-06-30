package com.tencent.mm.app.plugin;

/* loaded from: classes9.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.plugin.e f53641d;

    public c(com.tencent.mm.app.plugin.e eVar) {
        this.f53641d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AddContact", "startShowLoading");
        com.tencent.mm.app.plugin.e eVar = this.f53641d;
        android.content.Context context = eVar.f53644e;
        eVar.f53645f = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), eVar.f53644e.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.app.plugin.b(this));
    }
}
