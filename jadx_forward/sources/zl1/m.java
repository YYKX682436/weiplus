package zl1;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zl1.t f555132d;

    public m(zl1.t tVar) {
        this.f555132d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        zl1.t tVar = this.f555132d;
        tVar.setVisibility(8);
        if (tVar.getParent() instanceof zl1.q) {
            ((zl1.q) tVar.getParent()).getClass();
        }
    }
}
