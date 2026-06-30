package n4;

/* loaded from: classes12.dex */
public abstract class b {
    public static android.database.Cursor a(l4.q qVar, p4.h hVar, boolean z17, android.os.CancellationSignal cancellationSignal) {
        android.database.Cursor g17 = qVar.g(hVar, cancellationSignal);
        if (z17 && (g17 instanceof android.database.AbstractWindowedCursor)) {
            android.database.AbstractWindowedCursor abstractWindowedCursor = (android.database.AbstractWindowedCursor) g17;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                    while (abstractWindowedCursor.moveToNext()) {
                        java.lang.Object[] objArr = new java.lang.Object[abstractWindowedCursor.getColumnCount()];
                        for (int i17 = 0; i17 < abstractWindowedCursor.getColumnCount(); i17++) {
                            int type = abstractWindowedCursor.getType(i17);
                            if (type == 0) {
                                objArr[i17] = null;
                            } else if (type == 1) {
                                objArr[i17] = java.lang.Long.valueOf(abstractWindowedCursor.getLong(i17));
                            } else if (type == 2) {
                                objArr[i17] = java.lang.Double.valueOf(abstractWindowedCursor.getDouble(i17));
                            } else if (type == 3) {
                                objArr[i17] = abstractWindowedCursor.getString(i17);
                            } else {
                                if (type != 4) {
                                    throw new java.lang.IllegalStateException();
                                }
                                objArr[i17] = abstractWindowedCursor.getBlob(i17);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    return matrixCursor;
                } finally {
                    abstractWindowedCursor.close();
                }
            }
        }
        return g17;
    }
}
