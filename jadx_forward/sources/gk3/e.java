package gk3;

/* loaded from: classes8.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk3.m f354028d;

    public e(gk3.m mVar) {
        this.f354028d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gk3.m mVar = this.f354028d;
        kk3.d dVar = mVar.f354062e;
        if (dVar != null) {
            ek3.e eVar = mVar.f354061d;
            dVar.b(eVar != null ? eVar.m127794x8c4fcf52() : null, 3);
        }
        ek3.e eVar2 = mVar.f354061d;
        if (eVar2 != null) {
            if ((eVar2 != null ? eVar2.getParent() : null) != null) {
                ek3.e eVar3 = mVar.f354061d;
                android.view.ViewParent parent = eVar3 != null ? eVar3.getParent() : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).removeView(mVar.f354061d);
            }
        }
    }
}
