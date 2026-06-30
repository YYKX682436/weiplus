package gk4;

/* loaded from: classes10.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f354066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f354067e;

    public a0(yz5.l lVar, gk4.h0 h0Var) {
        this.f354066d = lVar;
        this.f354067e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f354066d;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f354067e.f354103o);
        }
    }
}
