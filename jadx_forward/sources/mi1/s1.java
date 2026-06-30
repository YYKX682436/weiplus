package mi1;

/* loaded from: classes7.dex */
public final class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f408219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f408220e;

    public s1(android.widget.TextView textView, int i17) {
        this.f408219d = textView;
        this.f408220e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mi1.t1.f408225a.c(this.f408219d, this.f408220e, true);
    }
}
