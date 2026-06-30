package c90;

@j95.b
/* loaded from: classes4.dex */
public final class e extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (z65.c.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushDemoFeatureService", "MagicBrushDemoFeatureService onCreate");
            com.tencent.mars.xlog.Log.i("MagicBrushProcessorCommand", "register");
            q25.b.b(new xc3.a(), "//mb");
        }
    }
}
