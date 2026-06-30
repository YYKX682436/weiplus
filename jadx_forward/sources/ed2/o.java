package ed2;

/* loaded from: classes2.dex */
public abstract class o extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public ed2.j f332813b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f332814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f332814c = jz5.h.b(new ed2.n(this));
    }

    @Override // db5.d5, android.widget.PopupWindow
    public void dismiss() {
        if (isShowing()) {
            ((ed2.m) ((jz5.n) this.f332814c).mo141623x754a37bb()).P6(this.f332813b, false);
        }
        super.dismiss();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i17, int i18, int i19) {
        if (!isShowing()) {
            ((ed2.m) ((jz5.n) this.f332814c).mo141623x754a37bb()).P6(this.f332813b, true);
        }
        super.showAsDropDown(view, i17, i18, i19);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(android.view.View view, int i17, int i18, int i19) {
        if (!isShowing()) {
            ((ed2.m) ((jz5.n) this.f332814c).mo141623x754a37bb()).P6(this.f332813b, true);
        }
        super.showAtLocation(view, i17, i18, i19);
    }
}
