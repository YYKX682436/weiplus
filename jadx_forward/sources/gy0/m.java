package gy0;

/* loaded from: classes5.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy0.q f359049d;

    public m(gy0.q qVar) {
        this.f359049d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gy0.q qVar = this.f359049d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView = qVar.f359055e.getRecyclerView();
        qVar.getClass();
        recyclerView.requestLayout();
        recyclerView.D0();
        recyclerView.invalidate();
    }
}
