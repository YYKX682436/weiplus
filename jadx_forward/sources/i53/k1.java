package i53;

/* loaded from: classes8.dex */
public class k1 {

    /* renamed from: b, reason: collision with root package name */
    public static i53.k1 f370163b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f370164c = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.ContentResolver f370165a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver();

    public static i53.k1 b() {
        if (f370163b == null) {
            synchronized (f370164c) {
                if (f370163b == null) {
                    f370163b = new i53.k1();
                }
            }
        }
        return f370163b;
    }

    public int a(java.util.LinkedList linkedList, long j17, long j18) {
        android.database.Cursor query = this.f370165a.query(android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new java.lang.String[]{"_id"}, c(linkedList, j17, j18), null, null);
        if (query == null || !query.moveToNext()) {
            return 0;
        }
        int i17 = query.getInt(0);
        query.close();
        return i17;
    }

    public java.lang.String c(java.util.LinkedList linkedList, long j17, long j18) {
        int i17;
        java.lang.String sb6;
        java.lang.Object[] objArr = new java.lang.Object[6];
        int i18 = 0;
        objArr[0] = "bucket_display_name";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            sb6 = "()";
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("(");
            int size = linkedList.size();
            while (true) {
                i17 = size - 1;
                if (i18 >= i17) {
                    break;
                }
                sb7.append("'" + ((java.lang.String) linkedList.get(i18)) + "'");
                sb7.append(",");
                i18++;
            }
            sb7.append("'" + ((java.lang.String) linkedList.get(i17)) + "'");
            sb7.append(")");
            sb6 = sb7.toString();
        }
        objArr[1] = sb6;
        objArr[2] = "datetaken";
        objArr[3] = java.lang.Long.valueOf(j17);
        objArr[4] = "datetaken";
        objArr[5] = java.lang.Long.valueOf(j18);
        return java.lang.String.format("%s in %s and %s<=%d AND %s>=%d", objArr);
    }
}
