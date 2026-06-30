package eg2;

/* loaded from: classes3.dex */
public final class r implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg2.x f334152d;

    public r(eg2.x xVar) {
        this.f334152d = xVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        hk0.o oVar = (hk0.o) obj;
        android.widget.TextView textView = this.f334152d.f334178h;
        if (textView == null) {
            return;
        }
        textView.setVisibility(oVar.f363316b ? 4 : 0);
    }
}
