package aq1;

@j95.b
/* loaded from: classes5.dex */
public class m1 extends i95.w {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        boolean z17 = false;
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Global_EnableNotificationSoundToolFix_Int, 0);
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_notification_sound_pool_fix, 0) == 1;
        if (g17 == 0) {
            z17 = z18;
        } else if (g17 == 1) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginBigBallOfMud", "enableNotificationSoundPoolFix:%s, repairerConfig:%s", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(g17));
        com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Tool.Sound", "setUseFixedSoundTool:%s", java.lang.Boolean.valueOf(z17));
        qm.n.f364643c = z17;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        com.tencent.mm.sdk.platformtools.x2.n();
    }
}
