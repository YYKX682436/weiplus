package af1;

/* loaded from: classes7.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final cf1.a f86049a = new cf1.a();

    /* renamed from: b, reason: collision with root package name */
    public static final o8.f f86050b = new o8.f();

    public static r9.j a(android.content.Context context, java.util.Map map) {
        cf1.a aVar = f86049a;
        af1.b bVar = new af1.b(ye1.f0.a(context), aVar, 8000, 8000, true);
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoMediaPlayerUtils", "buildDefaultHttpDataSourceFactory, header: %s: %s", entry.getKey(), entry.getValue());
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.String str2 = (java.lang.String) entry.getValue();
                r9.z zVar = bVar.f474971a;
                synchronized (zVar) {
                    zVar.f474974b = null;
                    ((java.util.HashMap) zVar.f474973a).put(str, str2);
                }
            }
        }
        return new r9.r(context, aVar, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(int r21, java.lang.String r22, int r23) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: af1.z.b(int, java.lang.String, int):java.lang.String");
    }

    public static java.lang.String c(o8.f fVar) {
        if (fVar == null) {
            return java.lang.String.valueOf((char[]) null);
        }
        return "DecoderCounters{decoderInitCount=" + fVar.f425135a + ", decoderReleaseCount=" + fVar.f425136b + ", inputBufferCount=" + fVar.f425137c + ", renderedOutputBufferCount=" + fVar.f425138d + ", skippedOutputBufferCount=" + fVar.f425139e + ", droppedOutputBufferCount=" + fVar.f425140f + ", maxConsecutiveDroppedOutputBufferCount=" + fVar.f425141g + '}';
    }
}
