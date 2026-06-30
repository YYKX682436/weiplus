package pk2;

/* loaded from: classes3.dex */
public final class m7 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f437540d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f437541e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f437542f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f437543g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f437544h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f437545i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f437546m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f437540d = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f437541e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) itemView.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        this.f437542f = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.f566821h62);
        this.f437543g = itemView.findViewById(com.p314xaae8f345.mm.R.id.k_2);
        this.f437544h = itemView.findViewById(com.p314xaae8f345.mm.R.id.lqk);
    }

    public final void i() {
        android.widget.ImageView imageView;
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f437545i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f437545i = null;
        java.lang.Runnable runnable = this.f437546m;
        if (runnable != null && (imageView = this.f437542f) != null) {
            imageView.removeCallbacks(runnable);
        }
        this.f437546m = null;
    }
}
