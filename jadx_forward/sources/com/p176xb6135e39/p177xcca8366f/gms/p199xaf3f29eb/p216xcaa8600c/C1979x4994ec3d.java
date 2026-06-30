package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p216xcaa8600c;

/* renamed from: com.google.android.gms.common.sqlite.CursorWrapper */
/* loaded from: classes12.dex */
public class C1979x4994ec3d extends android.database.CursorWrapper implements android.database.CrossProcessCursor {
    private android.database.AbstractWindowedCursor zza;

    public C1979x4994ec3d(android.database.Cursor cursor) {
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

    /* renamed from: setWindow */
    public void m18491x295832f2(android.database.CursorWindow cursorWindow) {
        this.zza.setWindow(cursorWindow);
    }
}
