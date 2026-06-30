package wu;

/* loaded from: classes9.dex */
public final class g1 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f531113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f531114e;

    public g1(android.widget.TextView textView, android.text.SpannableString spannableString) {
        this.f531113d = textView;
        this.f531114e = spannableString;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f531113d.setText(this.f531114e);
    }
}
