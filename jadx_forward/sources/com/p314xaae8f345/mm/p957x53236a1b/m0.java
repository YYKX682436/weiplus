package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes8.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.C11134x7f65bf70 f152904d;

    public m0(com.p314xaae8f345.mm.p957x53236a1b.C11134x7f65bf70 c11134x7f65bf70) {
        this.f152904d = c11134x7f65bf70;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetDisasterInfo", "summerdize NetSceneGetDisasterInfo onGYNetEnd manualauthSucc showtony[%b]", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274606c));
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p957x53236a1b.C11134x7f65bf70 c11134x7f65bf70 = this.f152904d;
        intent.putExtra("key_disaster_content", c11134x7f65bf70.f152812d);
        intent.putExtra("key_disaster_url", c11134x7f65bf70.f152813e);
        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11402x33c6c555.class).addFlags(268435456);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/modelsimple/NetSceneGetDisasterInfo$1$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/modelsimple/NetSceneGetDisasterInfo$1$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
