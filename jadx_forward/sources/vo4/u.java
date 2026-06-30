package vo4;

/* loaded from: classes10.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.x f520224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f520225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hs0.a f520226f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(vo4.x xVar, long j17, hs0.a aVar) {
        super(2);
        this.f520224d = xVar;
        this.f520225e = j17;
        this.f520226f = aVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.media.MediaFormat mediaFormat = (android.media.MediaFormat) obj;
        ls0.v checker = (ls0.v) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checker, "checker");
        if (mediaFormat != null) {
            boolean z17 = mediaFormat.containsKey("crop-left") || mediaFormat.containsKey("crop-top") || mediaFormat.containsKey("crop-right") || mediaFormat.containsKey("crop-bottom");
            vo4.x xVar = this.f520224d;
            if (z17) {
                xVar.f520142h = mediaFormat.containsKey("crop-left") ? mediaFormat.getInteger("crop-left") : 0;
                xVar.f520143i = mediaFormat.containsKey("crop-top") ? mediaFormat.getInteger("crop-top") : 0;
                xVar.f520144j = mediaFormat.containsKey("crop-right") ? mediaFormat.getInteger("crop-right") : 0;
                xVar.f520145k = mediaFormat.containsKey("crop-bottom") ? mediaFormat.getInteger("crop-bottom") : 0;
                if (mediaFormat.containsKey("width") & mediaFormat.containsKey("height")) {
                    xVar.f520140f = mediaFormat.getInteger("width");
                    xVar.f520141g = mediaFormat.getInteger("height");
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(xVar.hashCode());
                sb6.append(' ');
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var = xVar.f520138d;
                sb6.append(p0Var.f257243c);
                sb6.append(" finish check crop rect:[");
                sb6.append(xVar.f520142h);
                sb6.append(", ");
                sb6.append(xVar.f520143i);
                sb6.append(", ");
                sb6.append(xVar.f520144j);
                sb6.append(", ");
                sb6.append(xVar.f520145k);
                sb6.append("], width:");
                sb6.append(xVar.f520140f);
                sb6.append(", height:");
                sb6.append(xVar.f520141g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", sb6.toString());
                vo4.k kVar = vo4.k.f520182a;
                int i17 = xVar.f520140f;
                int i18 = xVar.f520141g;
                int i19 = xVar.f520142h;
                int i27 = xVar.f520143i;
                int i28 = xVar.f520144j;
                int i29 = xVar.f520145k;
                java.lang.String path = p0Var.f257243c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
                if (path.length() > 0) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = vo4.k.f520183b;
                    vo4.a aVar = (vo4.a) concurrentHashMap.get(path);
                    if (aVar != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogMaterialsInfoCache", "updateCache, path:" + path + ", width:" + i17 + ", height:height, rotate:-1, cropLeft:" + i19 + ", cropTop:" + i27 + ", cropRight:" + i28 + ", cropBottom:" + i29);
                        if (i17 > 0) {
                            aVar.f520128a = i17;
                        }
                        if (i18 > 0) {
                            aVar.f520129b = i18;
                        }
                        if (i19 >= 0) {
                            aVar.f520131d = i19;
                        }
                        if (i27 >= 0) {
                            aVar.f520132e = i27;
                        }
                        if (i28 >= 0) {
                            aVar.f520133f = i28;
                        }
                        if (i29 >= 0) {
                            aVar.f520134g = i29;
                        }
                        concurrentHashMap.put(path, aVar);
                    }
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(xVar.hashCode());
            sb7.append(' ');
            sb7.append(xVar.f520138d.f257243c);
            sb7.append(" finish check crop rect, notify all, cost:");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb7.append(android.os.SystemClock.elapsedRealtime() - this.f520225e);
            sb7.append("ms");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogVideoPlayer", sb7.toString());
            this.f520226f.d();
        }
        return jz5.f0.f384359a;
    }
}
