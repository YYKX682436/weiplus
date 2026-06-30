package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public abstract class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f222901d;

    /* renamed from: e, reason: collision with root package name */
    public int f222902e;

    public e(android.content.Context context, int i17) {
        this.f222901d = context;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("context is null.");
        }
    }

    public int a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        if (e1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameMessageOnClickListener", "game message is null.");
            return 0;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f68449x28d45f97)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putCharSequence("game_app_id", e1Var.f68449x28d45f97);
            bundle.putInt("game_report_from_scene", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de);
            return r53.f.o(context, e1Var.f68449x28d45f97, null, bundle, 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameMessageOnClickListener", "message type : " + e1Var.f68469xc4aab016 + " ,message.field_appId is null.");
        return 0;
    }
}
