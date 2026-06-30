package d45;

/* loaded from: classes10.dex */
public final class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f307984d;

    public n(android.view.View view) {
        this.f307984d = view;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialog, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        android.view.View view = this.f307984d;
        if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22625xc06c7fec) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22625xc06c7fec) view).setChecked(false);
        }
    }
}
