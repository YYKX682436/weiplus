package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f12308d;

    public z1(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f12308d = recyclerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f12308d;
        if (!recyclerView.f11913z || recyclerView.isLayoutRequested()) {
            return;
        }
        if (!recyclerView.f11907x) {
            recyclerView.requestLayout();
        } else if (recyclerView.C) {
            recyclerView.B = true;
        } else {
            recyclerView.U();
        }
    }
}
