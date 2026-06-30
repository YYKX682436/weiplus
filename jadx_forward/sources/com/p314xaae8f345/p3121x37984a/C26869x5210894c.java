package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.BulkCursorToCursorAdaptor */
/* loaded from: classes12.dex */
public final class C26869x5210894c extends com.p314xaae8f345.p3121x37984a.AbstractC26865x49c349a7 {
    private static final java.lang.String TAG = "BulkCursor";

    /* renamed from: mBulkCursor */
    private com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031 f57726x8bcab355;

    /* renamed from: mColumns */
    private java.lang.String[] f57727xd6b44ab0;

    /* renamed from: mCount */
    private int f57728xbde49ca2;

    /* renamed from: mObserverBridge */
    private com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38.SelfContentObserver f57729x98c1f3cc = new com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38.SelfContentObserver(this);

    /* renamed from: mWantsAllOnMoveCalls */
    private boolean f57730x13f5ce9a;

    /* renamed from: throwIfCursorIsClosed */
    private void m106151x7b5e162f() {
        if (this.f57726x8bcab355 == null) {
            throw new com.p314xaae8f345.p3121x37984a.C26894xe1ef88cc("Attempted to access a cursor after it has been closed.");
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031 interfaceC26885x9ba19031 = this.f57726x8bcab355;
        if (interfaceC26885x9ba19031 != null) {
            try {
                try {
                    interfaceC26885x9ba19031.mo106144x5a5ddf8();
                } catch (android.os.RemoteException unused) {
                    com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.w(TAG, "Remote process exception when closing");
                }
            } finally {
                this.f57726x8bcab355 = null;
            }
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26865x49c349a7, com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void copyStringToBuffer(int i17, android.database.CharArrayBuffer charArrayBuffer) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031 interfaceC26885x9ba19031 = this.f57726x8bcab355;
        if (interfaceC26885x9ba19031 != null) {
            try {
                interfaceC26885x9ba19031.mo106145x88fbd074();
            } catch (android.os.RemoteException unused) {
                com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.w(TAG, "Remote process exception when deactivating");
            }
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        m106151x7b5e162f();
        return this.f57727xd6b44ab0;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public int getCount() {
        m106151x7b5e162f();
        return this.f57728xbde49ca2;
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public android.os.Bundle getExtras() {
        m106151x7b5e162f();
        try {
            return this.f57726x8bcab355.mo106146x18421159();
        } catch (android.os.RemoteException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* renamed from: getObserver */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6 m106152x90a1904c() {
        try {
            return (com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6) this.f57729x98c1f3cc.getClass().getMethod("getContentObserver", new java.lang.Class[0]).invoke(this.f57729x98c1f3cc, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: initialize */
    public void m106153x33ebcb90(com.p314xaae8f345.p3121x37984a.C26866x1d4c74b7 c26866x1d4c74b7) {
        this.f57726x8bcab355 = c26866x1d4c74b7.f57721xaf961356;
        java.lang.String[] strArr = c26866x1d4c74b7.f57719xcd46b992;
        this.f57727xd6b44ab0 = strArr;
        this.f57711xc27989d4 = com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106259x88d6720(strArr);
        this.f57730x13f5ce9a = c26866x1d4c74b7.f57722x2959c047;
        this.f57728xbde49ca2 = c26866x1d4c74b7.f57720x5a7510f;
        com.p314xaae8f345.p3121x37984a.C26876xa70fd706 c26876xa70fd706 = c26866x1d4c74b7.f57723xd10bdbf0;
        if (c26876xa70fd706 != null) {
            mo106139x295832f2(c26876xa70fd706);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[RETURN] */
    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26870x63710a65
    /* renamed from: onMove */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo106131xc39cb650(int r3, int r4) {
        /*
            r2 = this;
            r2.m106151x7b5e162f()
            r3 = 0
            com.tencent.wcdb.CursorWindow r0 = r2.f57717x207802bd     // Catch: android.os.RemoteException -> L38
            if (r0 == 0) goto L28
            int r0 = r0.m106205xf185fbf5()     // Catch: android.os.RemoteException -> L38
            if (r4 < r0) goto L28
            com.tencent.wcdb.CursorWindow r0 = r2.f57717x207802bd     // Catch: android.os.RemoteException -> L38
            int r0 = r0.m106205xf185fbf5()     // Catch: android.os.RemoteException -> L38
            com.tencent.wcdb.CursorWindow r1 = r2.f57717x207802bd     // Catch: android.os.RemoteException -> L38
            int r1 = r1.m106203xc688aa49()     // Catch: android.os.RemoteException -> L38
            int r0 = r0 + r1
            if (r4 < r0) goto L1e
            goto L28
        L1e:
            boolean r0 = r2.f57730x13f5ce9a     // Catch: android.os.RemoteException -> L38
            if (r0 == 0) goto L31
            com.tencent.wcdb.IBulkCursor r0 = r2.f57726x8bcab355     // Catch: android.os.RemoteException -> L38
            r0.mo106148xc39cb650(r4)     // Catch: android.os.RemoteException -> L38
            goto L31
        L28:
            com.tencent.wcdb.IBulkCursor r0 = r2.f57726x8bcab355     // Catch: android.os.RemoteException -> L38
            com.tencent.wcdb.CursorWindow r4 = r0.mo106147x3622fee6(r4)     // Catch: android.os.RemoteException -> L38
            r2.mo106139x295832f2(r4)     // Catch: android.os.RemoteException -> L38
        L31:
            com.tencent.wcdb.CursorWindow r4 = r2.f57717x207802bd
            if (r4 != 0) goto L36
            return r3
        L36:
            r3 = 1
            return r3
        L38:
            java.lang.String r4 = "BulkCursor"
            java.lang.String r0 = "Unable to get window because the remote process is dead"
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3121x37984a.C26869x5210894c.mo106131xc39cb650(int, int):boolean");
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public boolean requery() {
        m106151x7b5e162f();
        try {
            int mo106149x414ef275 = this.f57726x8bcab355.mo106149x414ef275(m106152x90a1904c());
            this.f57728xbde49ca2 = mo106149x414ef275;
            if (mo106149x414ef275 == -1) {
                deactivate();
                return false;
            }
            this.f57710x32c6a7 = -1;
            m106133x10864c08();
            super.requery();
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.e(TAG, "Unable to requery because the remote process exception " + e17.getMessage());
            deactivate();
            return false;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        m106151x7b5e162f();
        try {
            return this.f57726x8bcab355.mo106150x41690095(bundle);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.w(TAG, "respond() threw RemoteException, returning an empty bundle.", e17);
            return android.os.Bundle.EMPTY;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38, com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }
}
