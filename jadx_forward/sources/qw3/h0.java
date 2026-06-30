package qw3;

/* loaded from: classes5.dex */
public class h0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f448696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 f448697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qw3.k0 f448698f;

    public h0(qw3.k0 k0Var, android.widget.TextView textView, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359) {
        this.f448698f = k0Var;
        this.f448696d = textView;
        this.f448697e = c28001xdd2bb359;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) ((android.view.View) obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.widget.TextView textView = this.f448696d;
        if (textView != null) {
            sb6.append(((java.lang.Object) textView.getText()) + ",");
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f448697e;
        if (c28001xdd2bb359 != null) {
            sb6.append(((java.lang.Object) c28001xdd2bb359.getText()) + ",");
        }
        qw3.k0 k0Var = this.f448698f;
        sb6.append(k0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.aeh));
        if (!viewOnFocusChangeListenerC22907xe18534c2.isClickable()) {
            sb6.append(k0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.l1k));
        }
        return sb6.toString();
    }
}
