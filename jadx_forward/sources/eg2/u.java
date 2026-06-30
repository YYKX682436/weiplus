package eg2;

/* loaded from: classes3.dex */
public final class u implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg2.x f334171d;

    public u(eg2.x xVar) {
        this.f334171d = xVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        hk0.c1 c1Var = (hk0.c1) obj;
        android.widget.TextView textView = this.f334171d.f334178h;
        if (textView == null) {
            return;
        }
        textView.setVisibility(c1Var.f363245b ? 0 : 4);
    }
}
