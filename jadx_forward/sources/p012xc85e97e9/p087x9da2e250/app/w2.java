package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class w2 extends android.transition.Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f93042a;

    public w2(p012xc85e97e9.p087x9da2e250.app.x2 x2Var, android.graphics.Rect rect) {
        this.f93042a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public android.graphics.Rect onGetEpicenter(android.transition.Transition transition) {
        android.graphics.Rect rect = this.f93042a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
