package hr3;

/* loaded from: classes11.dex */
public class l9 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.t9 f365287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f365288e;

    public l9(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a, hr3.t9 t9Var, java.lang.CharSequence charSequence) {
        this.f365287d = t9Var;
        this.f365288e = charSequence;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f365287d.mo133979x765074af(this.f365288e);
    }
}
