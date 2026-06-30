package rg;

/* loaded from: classes5.dex */
public enum d {
    MP4(0),
    /* JADX INFO: Fake field, exist only in values array */
    MOV(1),
    /* JADX INFO: Fake field, exist only in values array */
    MP3(2),
    /* JADX INFO: Fake field, exist only in values array */
    M4A(3);


    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f476684f = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f476686d;

    static {
        for (rg.d dVar : m162308xcee59d22()) {
            ((java.util.HashMap) f476684f).put(java.lang.Integer.valueOf(dVar.f476686d), dVar);
        }
    }

    d(int i17) {
        this.f476686d = i17;
    }
}
