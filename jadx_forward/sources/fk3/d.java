package fk3;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk3.o f345081d;

    public d(fk3.o oVar) {
        this.f345081d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fk3.o oVar = this.f345081d;
        ek3.e eVar = oVar.f345121d;
        if (eVar != null) {
            if ((eVar != null ? eVar.getParent() : null) != null) {
                ek3.e eVar2 = oVar.f345121d;
                android.view.ViewParent parent = eVar2 != null ? eVar2.getParent() : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).removeView(oVar.f345121d);
            }
        }
    }
}
