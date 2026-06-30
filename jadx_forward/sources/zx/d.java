package zx;

/* loaded from: classes14.dex */
public final class d implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f558477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx.t f558478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zx.u f558479f;

    public d(boolean z17, zx.t tVar, zx.u uVar) {
        this.f558477d = z17;
        this.f558478e = tVar;
        this.f558479f = uVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        if (this.f558477d) {
            return;
        }
        java.lang.String b17 = this.f558479f.f558505d.b();
        zx.t tVar = this.f558478e;
        if (b17 == null) {
            tVar.getClass();
            return;
        }
        if (android.text.TextUtils.equals(tVar.f558500f, b17)) {
            int x17 = tVar.x(b17);
            tVar.f558500f = null;
            if (x17 >= 0) {
                tVar.m8147xed6e4d18(x17);
            }
        }
    }
}
