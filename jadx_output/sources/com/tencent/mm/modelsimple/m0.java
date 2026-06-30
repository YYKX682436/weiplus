package com.tencent.mm.modelsimple;

/* loaded from: classes8.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.NetSceneGetDisasterInfo$1$1 f71371d;

    public m0(com.tencent.mm.modelsimple.NetSceneGetDisasterInfo$1$1 netSceneGetDisasterInfo$1$1) {
        this.f71371d = netSceneGetDisasterInfo$1$1;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdize NetSceneGetDisasterInfo onGYNetEnd manualauthSucc showtony[%b]", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.x2.f193073c));
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.modelsimple.NetSceneGetDisasterInfo$1$1 netSceneGetDisasterInfo$1$1 = this.f71371d;
        intent.putExtra("key_disaster_content", netSceneGetDisasterInfo$1$1.f71279d);
        intent.putExtra("key_disaster_url", netSceneGetDisasterInfo$1$1.f71280e);
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.account.ui.DisasterUI.class).addFlags(268435456);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/modelsimple/NetSceneGetDisasterInfo$1$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/modelsimple/NetSceneGetDisasterInfo$1$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
