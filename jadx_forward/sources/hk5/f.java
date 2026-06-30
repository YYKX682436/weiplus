package hk5;

/* loaded from: classes5.dex */
public final class f implements fl5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f363536a;

    public f(android.view.View.OnClickListener onClickListener) {
        this.f363536a = onClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fl5.g
    public final boolean a(fl5.i iVar, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return false;
        }
        this.f363536a.onClick((android.view.View) iVar);
        return true;
    }
}
