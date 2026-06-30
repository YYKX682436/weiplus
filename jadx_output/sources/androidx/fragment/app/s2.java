package androidx.fragment.app;

/* loaded from: classes14.dex */
public class s2 extends android.transition.Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f11474a;

    public s2(androidx.fragment.app.x2 x2Var, android.graphics.Rect rect) {
        this.f11474a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public android.graphics.Rect onGetEpicenter(android.transition.Transition transition) {
        return this.f11474a;
    }
}
