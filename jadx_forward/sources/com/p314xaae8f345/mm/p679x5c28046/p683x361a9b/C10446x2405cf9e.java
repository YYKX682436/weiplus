package com.p314xaae8f345.mm.p679x5c28046.p683x361a9b;

/* renamed from: com.tencent.mm.emoji.sync.EmojiUpdateReceiver */
/* loaded from: classes12.dex */
public class C10446x2405cf9e extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f146463a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        pr.q0 q0Var;
        java.lang.String action = intent.getAction();
        if ("com.tencent.mm.Emoji_Update".equals(action)) {
            java.lang.String stringExtra = intent.getStringExtra("type");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiUpdateReceiver", "receive %s, %s", action, stringExtra);
            if ("update_all_custom_emoji".equals(stringExtra)) {
                gr.t.g().l(false);
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5897xc57a522().e();
                return;
            }
            if ("update_download_custom_emoji".equals(stringExtra)) {
                gr.t.g().n(false);
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5897xc57a522().e();
                return;
            }
            if ("update_store_emoji".equals(stringExtra)) {
                gr.t.g().f356217c = true;
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5897xc57a522().e();
                return;
            }
            if ("update_group_info".equals(stringExtra)) {
                gr.t.g().o(false);
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5897xc57a522().e();
                return;
            }
            if ("update_capture_emoji".equals(stringExtra)) {
                gr.t.g().m(false);
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5897xc57a522().e();
                return;
            }
            if ("TYPE_UPDATE_EMOJI_SYNC".equals(stringExtra)) {
                com.p314xaae8f345.mm.p679x5c28046.p683x361a9b.C10444x1291fbaf c10444x1291fbaf = (com.p314xaae8f345.mm.p679x5c28046.p683x361a9b.C10444x1291fbaf) intent.getParcelableExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                pr.z zVar = pr.k0.f439256q;
                if (c10444x1291fbaf == null) {
                    return;
                }
                if (c10444x1291fbaf.f146458d == 1) {
                    pr.b1 a17 = zVar.a(false);
                    q0Var = a17 instanceof pr.q0 ? (pr.q0) a17 : null;
                    if (q0Var != null) {
                        q0Var.h(c10444x1291fbaf);
                        return;
                    }
                    return;
                }
                pr.b1 b17 = zVar.b(false);
                q0Var = b17 instanceof pr.q0 ? (pr.q0) b17 : null;
                if (q0Var != null) {
                    q0Var.h(c10444x1291fbaf);
                }
            }
        }
    }
}
