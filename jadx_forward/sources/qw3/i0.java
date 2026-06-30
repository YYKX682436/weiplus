package qw3;

/* loaded from: classes5.dex */
public class i0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f448700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 f448701e;

    public i0(qw3.k0 k0Var, android.widget.TextView textView, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359) {
        this.f448700d = textView;
        this.f448701e = c28001xdd2bb359;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.widget.TextView textView = this.f448700d;
        if (textView != null) {
            sb6.append(((java.lang.Object) textView.getText()) + ",");
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f448701e;
        if (c28001xdd2bb359 != null) {
            sb6.append(((java.lang.Object) c28001xdd2bb359.getText()) + ",");
        }
        return sb6.toString();
    }
}
