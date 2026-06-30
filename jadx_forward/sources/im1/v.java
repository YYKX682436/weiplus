package im1;

/* loaded from: classes14.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf.r f373749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ im1.x f373751f;

    public v(im1.x xVar, yf.r rVar, java.lang.String str) {
        this.f373751f = xVar;
        this.f373749d = rVar;
        this.f373750e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        im1.x xVar = this.f373751f;
        if (xVar.f373754c) {
            int ordinal = this.f373749d.ordinal();
            java.lang.String str = this.f373750e;
            if (ordinal == 0) {
                long j17 = xVar.f373763l;
                if (j17 != 0) {
                    ((p05.l4) xVar.f373753b).t(j17);
                    xVar.f373763l = 0L;
                }
                ((p05.l4) xVar.f373753b).s(14, true);
                xVar.f373763l = ((p05.l4) xVar.f373753b).m(0, str);
                return;
            }
            if (ordinal == 1) {
                long j18 = xVar.f373764m;
                if (j18 != 0) {
                    ((p05.l4) xVar.f373753b).t(j18);
                    xVar.f373764m = 0L;
                }
                ((p05.l4) xVar.f373753b).s(15, true);
                xVar.f373764m = ((p05.l4) xVar.f373753b).m(1, str);
                return;
            }
            if (ordinal == 2) {
                long j19 = xVar.f373765n;
                if (j19 != 0) {
                    ((p05.l4) xVar.f373753b).t(j19);
                    xVar.f373765n = 0L;
                }
                ((p05.l4) xVar.f373753b).s(16, true);
                xVar.f373765n = ((p05.l4) xVar.f373753b).m(2, str);
                return;
            }
            if (ordinal == 3) {
                long j27 = xVar.f373766o;
                if (j27 != 0) {
                    ((p05.l4) xVar.f373753b).t(j27);
                    xVar.f373766o = 0L;
                }
                ((p05.l4) xVar.f373753b).s(17, true);
                xVar.f373766o = ((p05.l4) xVar.f373753b).m(3, str);
                return;
            }
            if (ordinal != 4) {
                return;
            }
            long j28 = xVar.f373767p;
            if (j28 != 0) {
                ((p05.l4) xVar.f373753b).t(j28);
                xVar.f373767p = 0L;
            }
            ((p05.l4) xVar.f373753b).s(18, true);
            xVar.f373767p = ((p05.l4) xVar.f373753b).m(4, str);
        }
    }
}
