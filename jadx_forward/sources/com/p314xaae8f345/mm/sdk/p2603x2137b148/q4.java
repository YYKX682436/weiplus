package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public final class q4 extends android.database.MatrixCursor {

    /* renamed from: d, reason: collision with root package name */
    public android.os.Bundle f274475d;

    public q4(android.os.Bundle bundle) {
        super(new java.lang.String[0], 0);
        this.f274475d = bundle;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public android.os.Bundle getExtras() {
        return this.f274475d;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        this.f274475d = bundle;
        return bundle;
    }
}
