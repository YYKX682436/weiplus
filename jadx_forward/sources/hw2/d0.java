package hw2;

/* loaded from: classes10.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.e0 f367044d;

    public d0(hw2.e0 e0Var) {
        this.f367044d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hw2.e0 e0Var = this.f367044d;
        java.util.Iterator it = e0Var.f367058d.iterator();
        while (it.hasNext()) {
            dw3.c0.f325715a.A((java.lang.String) it.next());
        }
        e0Var.f367058d.clear();
    }
}
