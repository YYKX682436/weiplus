package ae2;

/* loaded from: classes.dex */
public final class lh extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.lh f4007d = new ae2.lh();

    public lh() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        com.tencent.mm.sdk.platformtools.o4.L().putBoolean("MMKVFinderLiveInputPluginLocationGuideShow", false);
        if (activity != null) {
            db5.t7.makeText(activity, "已清除，可重新测试", 0).show();
        }
        return jz5.f0.f302826a;
    }
}
