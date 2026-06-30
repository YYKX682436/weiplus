package im1;

/* loaded from: classes14.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im1.x f373748d;

    public u(im1.x xVar) {
        this.f373748d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        im1.x xVar = this.f373748d;
        if (xVar.f373754c) {
            ((p05.l4) xVar.f373753b).t(xVar.f373761j);
            ((p05.l4) xVar.f373753b).s(12, false);
            ((p05.l4) xVar.f373753b).t(xVar.f373762k);
            ((p05.l4) xVar.f373753b).s(13, false);
            ((p05.l4) xVar.f373753b).t(xVar.f373760i);
            ((p05.l4) xVar.f373753b).s(11, false);
            ((p05.l4) xVar.f373753b).H(false);
            xVar.f373761j = 0L;
            xVar.f373762k = 0L;
            xVar.f373760i = 0L;
        }
    }
}
