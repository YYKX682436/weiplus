package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* loaded from: classes7.dex */
public final class j implements m31.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor f82344a;

    public j(com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor getSubscribeMsgListExecutor) {
        this.f82344a = getSubscribeMsgListExecutor;
    }

    public void a(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = z17 ? com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.jnj) : com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.jnk);
        kotlin.jvm.internal.o.d(string);
        ul1.j jVar = this.f82344a.f82302n;
        if (jVar != null) {
            jVar.dismiss();
        }
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = this.f82344a;
        ul1.j jVar2 = new ul1.j(context, false);
        jVar2.a(string);
        jVar2.setFocusable(false);
        jVar2.b(1500L);
        getSubscribeMsgListExecutor.f82302n = jVar2;
    }
}
