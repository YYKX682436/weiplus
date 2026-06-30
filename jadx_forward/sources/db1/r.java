package db1;

/* loaded from: classes9.dex */
public final class r implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db1.u f309404d;

    public r(db1.u uVar) {
        this.f309404d = uVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int abs = java.lang.Math.abs(i27 - i18);
        db1.u uVar = this.f309404d;
        int i39 = uVar.f309409f;
        if (abs <= i39 || i39 < uVar.f309408e) {
            return;
        }
        uVar.f309412i.post(new db1.q(uVar));
    }
}
