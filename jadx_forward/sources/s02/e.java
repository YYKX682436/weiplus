package s02;

/* loaded from: classes9.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s02.f f483482d;

    public e(s02.f fVar) {
        this.f483482d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        s02.f fVar = this.f483482d;
        fVar.f483486g.b();
        fVar.f483484e.dismiss();
        if (fVar.f483483d) {
            ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).getClass();
            java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.f178862a;
            android.os.Bundle bundleExtra = ((android.app.Activity) fVar.f483485f).getIntent().getBundleExtra("download_params");
            if (bundleExtra != null) {
                ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ri(fVar.f483485f, new android.content.Intent().putExtras(bundleExtra), null);
            }
        }
    }
}
