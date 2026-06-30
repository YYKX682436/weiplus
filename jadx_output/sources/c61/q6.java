package c61;

/* loaded from: classes2.dex */
public final class q6 implements j45.j {

    /* renamed from: a, reason: collision with root package name */
    public static final c61.q6 f39252a = new c61.q6();

    @Override // j45.j
    public final boolean a(android.content.Context context, android.app.Activity activity, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        android.content.ComponentName component;
        java.lang.String className;
        android.os.Bundle extras;
        if ((intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("key_context_id")) ? false : true) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "[onStartActivity] has set contextId, context=" + context.getClass().getName() + " intent=" + intent);
        } else {
            if ((intent == null || (component = intent.getComponent()) == null || (className = component.getClassName()) == null || !r26.n0.B(className, "Finder", true)) ? false : true) {
                com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "[onStartActivity] auto initIntentParams. context=" + context.getClass().getName() + " intent=" + intent);
                com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
                kotlin.jvm.internal.o.d(intent);
                com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            }
        }
        return false;
    }
}
