package zi;

/* loaded from: classes15.dex */
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(2, 0),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN(4, 1),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR(5, 2),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT(6, 4),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE(7, 8),
    /* JADX INFO: Fake field, exist only in values array */
    BYTE(8, 1),
    /* JADX INFO: Fake field, exist only in values array */
    SHORT(9, 2),
    /* JADX INFO: Fake field, exist only in values array */
    INT(10, 4),
    /* JADX INFO: Fake field, exist only in values array */
    LONG(11, 8);


    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f554610f = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f554612d;

    /* renamed from: e, reason: collision with root package name */
    public final int f554613e;

    static {
        for (zi.c cVar : m179018xcee59d22()) {
            ((java.util.HashMap) f554610f).put(java.lang.Integer.valueOf(cVar.f554612d), cVar);
        }
    }

    c(int i17, int i18) {
        this.f554612d = i17;
        this.f554613e = i18;
    }

    public static zi.c a(int i17) {
        return (zi.c) ((java.util.HashMap) f554610f).get(java.lang.Integer.valueOf(i17));
    }
}
