package nk2;

/* loaded from: classes3.dex */
public final class b extends com.p314xaae8f345.mm.app.d {
    @Override // com.p314xaae8f345.mm.app.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (nk2.c.f419495c) {
            java.lang.String simpleName = activity.getClass().getSimpleName();
            ((java.util.ArrayList) nk2.c.f419494b).add(simpleName);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExitLiveEventRecorder", "#onActivityCreated name=".concat(simpleName));
        }
    }
}
