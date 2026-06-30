package x92;

/* loaded from: classes3.dex */
public class o extends x92.r {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f534247g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f534248h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f534249i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f534250m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f534247g = jz5.h.b(new x92.n(activity));
    }

    @Override // x92.r
    public void O6(int i17, java.lang.String str) {
        android.widget.FrameLayout V6 = V6();
        if (V6 != null) {
            V6.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = this.f534248h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo78514x143f1b92().O0(com.p314xaae8f345.mm.ui.bk.C());
    }

    @Override // x92.r
    public void P6(int i17, java.lang.String str) {
        android.widget.FrameLayout V6 = V6();
        if (V6 != null) {
            V6.setVisibility(0);
        }
        android.widget.ProgressBar progressBar = this.f534248h;
        if (progressBar == null) {
            return;
        }
        progressBar.setVisibility(8);
    }

    @Override // x92.r
    public void S6(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        super.S6(fVar);
        this.f534250m = true;
        android.widget.FrameLayout V6 = V6();
        if (V6 == null) {
            return;
        }
        V6.setVisibility(8);
    }

    public final android.widget.FrameLayout V6() {
        return (android.widget.FrameLayout) ((jz5.n) this.f534247g).mo141623x754a37bb();
    }

    public void W6() {
        android.widget.FrameLayout V6 = V6();
        this.f534248h = V6 != null ? (android.widget.ProgressBar) V6.findViewById(com.p314xaae8f345.mm.R.id.f564152ji) : null;
        android.widget.FrameLayout V62 = V6();
        this.f534249i = V62 != null ? (android.widget.TextView) V62.findViewById(com.p314xaae8f345.mm.R.id.dft) : null;
    }

    @Override // x92.r, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        W6();
        if (this.f534250m) {
            return;
        }
        android.widget.FrameLayout V6 = V6();
        if (V6 != null) {
            V6.setVisibility(0);
        }
        android.widget.ProgressBar progressBar = this.f534248h;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        android.widget.TextView textView = this.f534249i;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
