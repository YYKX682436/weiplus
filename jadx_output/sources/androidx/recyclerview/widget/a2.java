package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f11956d;

    public a2(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f11956d = recyclerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f11956d;
        androidx.recyclerview.widget.n2 n2Var = recyclerView.S;
        if (n2Var != null) {
            n2Var.s();
        }
        recyclerView.L1 = false;
    }
}
