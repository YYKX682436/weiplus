package androidx.fragment.app;

/* loaded from: classes14.dex */
public class w2 extends android.transition.Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f11509a;

    public w2(androidx.fragment.app.x2 x2Var, android.graphics.Rect rect) {
        this.f11509a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public android.graphics.Rect onGetEpicenter(android.transition.Transition transition) {
        android.graphics.Rect rect = this.f11509a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
