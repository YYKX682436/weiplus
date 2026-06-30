package gk4;

/* loaded from: classes10.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f354081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f354082e;

    public e0(gk4.h0 h0Var, android.graphics.Bitmap bitmap) {
        this.f354081d = h0Var;
        this.f354082e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f354081d.G;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f354082e);
        }
    }
}
