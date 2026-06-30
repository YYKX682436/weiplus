package oj5;

/* loaded from: classes14.dex */
public final class j implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f427387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oj5.o f427388e;

    public j(android.view.View view, oj5.o oVar) {
        this.f427387d = view;
        this.f427388e = oVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        this.f427387d.removeOnAttachStateChangeListener(this);
        oj5.o oVar = this.f427388e;
        oj5.g gVar = oVar.f427406l;
        if (gVar != null && (atomicBoolean = gVar.f427383n) != null) {
            atomicBoolean.set(true);
        }
        oVar.f427400f.mo50302x6b17ad39(null);
    }
}
