package c34;

@j95.b
/* loaded from: classes4.dex */
public final class b0 extends i95.w implements yd0.j {
    public void wi(android.content.Context context, android.content.Intent intent, boolean z17) {
        if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi()) {
            boolean z18 = true;
            if (z17 && intent != null) {
                intent.putExtra("shake_music", true);
            }
            if (!z17) {
                if (!(intent != null ? intent.getBooleanExtra("shake_music", false) : false)) {
                    z18 = false;
                }
            }
            if (!z18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ShakeUIService", "startShakeUI enableTingDiscoverEntry not shake music, ignore");
                return;
            }
        }
        j45.l.j(context, "shake", ".ui.ShakeReportUI", intent, null);
    }
}
