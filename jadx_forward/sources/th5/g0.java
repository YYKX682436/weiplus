package th5;

/* loaded from: classes12.dex */
public final class g0 extends tf3.b {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f500914g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f500914g = new java.util.LinkedHashMap();
    }

    @Override // tf3.b
    public void V6() {
        java.util.Map map = this.f500914g;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
        while (it.hasNext()) {
            p3325xe03a0797.p3326xc267989b.p2.a((p3325xe03a0797.p3326xc267989b.r2) it.next(), null, 1, null);
        }
        ((java.util.LinkedHashMap) map).clear();
    }

    @Override // tf3.b, sf3.f
    public void W4(mf3.k mediaInfo, sf3.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        super.W4(mediaInfo, listener);
        if (mediaInfo.mo2109xfb85f7b0() != mf3.u.f407656e) {
            return;
        }
        th5.o oVar = mediaInfo instanceof th5.o ? (th5.o) mediaInfo : null;
        if (oVar == null) {
            return;
        }
        X6(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6(th5.o r18) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: th5.g0.X6(th5.o):void");
    }
}
