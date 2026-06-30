package bn5;

/* loaded from: classes10.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn5.f f22924d;

    public a(bn5.f fVar) {
        this.f22924d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bn5.f fVar = this.f22924d;
        if (((l45.n) fVar.getPresenter()).f316460a.f463360w) {
            ((l45.n) fVar.getPresenter()).f316460a.setFooterVisible(false);
            ((l45.n) fVar.getPresenter()).f316460a.setActionBarVisible(false);
        } else {
            ((l45.n) fVar.getPresenter()).f316460a.setFooterVisible(true);
            ((l45.n) fVar.getPresenter()).f316460a.setActionBarVisible(true);
        }
    }
}
