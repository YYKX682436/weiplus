package m34;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m34.j f404887d;

    public i(m34.j jVar) {
        this.f404887d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        m34.j jVar = this.f404887d;
        jVar.f404888d.f404893e.setVisibility(0);
        m34.n nVar = jVar.f404888d;
        nVar.f404893e.startAnimation(android.view.animation.AnimationUtils.loadAnimation(nVar.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc));
    }
}
