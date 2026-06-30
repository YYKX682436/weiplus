package im1;

/* loaded from: classes14.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf.s f373746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ im1.x f373747f;

    public t(im1.x xVar, java.lang.String str, yf.s sVar) {
        this.f373747f = xVar;
        this.f373745d = str;
        this.f373746e = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f373745d;
        im1.x xVar = this.f373747f;
        if (xVar.f373754c) {
            t85.f fVar = new t85.f();
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                fVar.f498001d = str;
                fVar.a(new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(str.concat("/config.json"))));
                int ordinal = this.f373746e.ordinal();
                if (ordinal == 0) {
                    long j17 = xVar.f373761j;
                    if (j17 != 0) {
                        ((p05.l4) xVar.f373753b).t(j17);
                        xVar.f373761j = 0L;
                    }
                    ((p05.l4) xVar.f373753b).s(12, true);
                    xVar.f373761j = ((p05.l4) xVar.f373753b).n(fVar);
                    ((p05.l4) xVar.f373753b).H(true);
                    return;
                }
                if (ordinal == 1) {
                    long j18 = xVar.f373762k;
                    if (j18 != 0) {
                        ((p05.l4) xVar.f373753b).t(j18);
                        xVar.f373762k = 0L;
                    }
                    ((p05.l4) xVar.f373753b).s(13, true);
                    xVar.f373762k = ((p05.l4) xVar.f373753b).n(fVar);
                    return;
                }
                if (ordinal != 2) {
                    return;
                }
                long j19 = xVar.f373760i;
                if (j19 != 0) {
                    ((p05.l4) xVar.f373753b).t(j19);
                    xVar.f373760i = 0L;
                }
                ((p05.l4) xVar.f373753b).s(11, true);
                xVar.f373760i = ((p05.l4) xVar.f373753b).n(fVar);
            } catch (java.io.IOException | org.json.JSONException unused) {
            }
        }
    }
}
