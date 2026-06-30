package ym5;

/* loaded from: classes3.dex */
public class c implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f544759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae f544760e;

    public c(com.p314xaae8f345.mm.p2776x373aa5.C22779x313407ae c22779x313407ae, java.lang.Runnable runnable) {
        this.f544760e = c22779x313407ae;
        this.f544759d = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f544760e.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f544759d.run();
        return true;
    }
}
