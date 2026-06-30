package com.google.android.gms.common.sqlite;

/* loaded from: classes12.dex */
public class CursorWrapper extends android.database.CursorWrapper implements android.database.CrossProcessCursor {
    private android.database.AbstractWindowedCursor zza;

    public CursorWrapper(android.database.Cursor cursor) {
        super(cursor);
        for (int i17 = 0; i17 < 10 && (cursor instanceof android.database.CursorWrapper); i17++) {
            cursor = ((android.database.CursorWrapper) cursor).getWrappedCursor();
        }
        if (!(cursor instanceof android.database.AbstractWindowedCursor)) {
            throw new java.lang.IllegalArgumentException("Unknown type: ".concat(cursor.getClass().getName()));
        }
        this.zza = (android.database.AbstractWindowedCursor) cursor;
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int i17, android.database.CursorWindow cursorWindow) {
        this.zza.fillWindow(i17, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public android.database.CursorWindow getWindow() {
        return this.zza.getWindow();
    }

    @Override // android.database.CursorWrapper
    public final /* synthetic */ android.database.Cursor getWrappedCursor() {
        return this.zza;
    }

    @Override // android.database.CrossProcessCursor
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean onMove(int i17, int i18) {
        return this.zza.onMove(i17, i18);
    }

    public void setWindow(android.database.CursorWindow cursorWindow) {
        this.zza.setWindow(cursorWindow);
    }
}
