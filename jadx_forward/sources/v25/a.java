package v25;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f514503a = {"retCode", "url"};

    public static android.database.MatrixCursor a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtCommonUtils", "returnMatrix = " + i17);
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(r62.a.f474537a);
        matrixCursor.addRow(new java.lang.Object[]{java.lang.Integer.valueOf(i17)});
        return matrixCursor;
    }

    public static android.database.MatrixCursor b(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtCommonUtils", "returnMatrix = " + i17);
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(f514503a);
        matrixCursor.addRow(new java.lang.Object[]{java.lang.Integer.valueOf(i17), str});
        return matrixCursor;
    }
}
