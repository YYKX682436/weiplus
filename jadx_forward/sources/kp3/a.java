package kp3;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.f f392494d;

    public a(kp3.f fVar) {
        this.f392494d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kp3.f fVar = this.f392494d;
        p012xc85e97e9.p062xff91adb5.p063xd1075a44.C1055x35d85f5 c1055x35d85f5 = fVar.f392515s;
        int width = c1055x35d85f5 != null ? c1055x35d85f5.getWidth() : 0;
        if (width > 0) {
            int i17 = (int) (width / 1.77f);
            p012xc85e97e9.p062xff91adb5.p063xd1075a44.C1055x35d85f5 c1055x35d85f52 = fVar.f392515s;
            android.view.ViewGroup.LayoutParams layoutParams = c1055x35d85f52 != null ? c1055x35d85f52.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.height = i17;
            }
            p012xc85e97e9.p062xff91adb5.p063xd1075a44.C1055x35d85f5 c1055x35d85f53 = fVar.f392515s;
            if (c1055x35d85f53 != null) {
                c1055x35d85f53.requestLayout();
            }
        }
    }
}
