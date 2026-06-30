package tj0;

/* loaded from: classes13.dex */
public enum b {
    INSTANCE;

    public final void a(long j17, tj0.a aVar) {
        if (aVar == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageReporter", "reportImageDecodeInfo sessionId: %d, from: %s, imageType: %d, w: %d, h: %d, fileSize: %d, orientation: %d, decodeResult: %d, decodeTime: %d, fullSampleSzie: %d, onlyDecodeTime: %d", java.lang.Long.valueOf(j17), aVar.f501210b, java.lang.Integer.valueOf(aVar.f501211c), java.lang.Integer.valueOf(aVar.f501212d), java.lang.Integer.valueOf(aVar.f501213e), java.lang.Integer.valueOf(aVar.f501214f), java.lang.Integer.valueOf(aVar.f501215g), java.lang.Integer.valueOf(aVar.f501216h), java.lang.Integer.valueOf(aVar.f501217i), java.lang.Integer.valueOf(aVar.f501218j), java.lang.Integer.valueOf(aVar.f501219k));
        jx3.f.INSTANCE.d(15467, java.lang.Long.valueOf(j17), aVar.f501210b, java.lang.Integer.valueOf(aVar.f501211c), java.lang.Integer.valueOf(aVar.f501212d), java.lang.Integer.valueOf(aVar.f501213e), java.lang.Integer.valueOf(aVar.f501214f), java.lang.Integer.valueOf(aVar.f501215g), java.lang.Integer.valueOf(aVar.f501216h), java.lang.Integer.valueOf(aVar.f501217i), java.lang.Integer.valueOf(aVar.f501218j), java.lang.Integer.valueOf(aVar.f501219k));
    }

    public void b(sj0.a aVar, sj0.c cVar) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (cVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageReporter", "reportPerformance sessionId: %d, fps.maxFps: %f, fps.minFps: %f, fps.averageFps: %f, memory.memoryUsedWhenInit: %f, memory.currentMaxUsedMemory: %f, memory.currentMinUsedMemory: %f, memory.averUsed: %f, memory.currentVarianceSum: %f", java.lang.Long.valueOf(currentTimeMillis), java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(cVar.f489875d), java.lang.Double.valueOf(cVar.f489876e), java.lang.Double.valueOf(cVar.f489877f), java.lang.Double.valueOf(cVar.f489879h), java.lang.Double.valueOf(cVar.f489878g));
            jx3.f.INSTANCE.d(15471, java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf((int) 0.0d), java.lang.Integer.valueOf((int) 0.0d), java.lang.Integer.valueOf((int) 0.0d), java.lang.Integer.valueOf((int) cVar.f489875d), java.lang.Integer.valueOf((int) cVar.f489876e), java.lang.Integer.valueOf((int) cVar.f489879h), java.lang.Integer.valueOf((int) cVar.f489878g), 1);
        }
    }
}
