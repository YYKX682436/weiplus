package org.p3343x72743996.net.p3359x113d858d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.urlconnection.CronetOutputStream */
/* loaded from: classes13.dex */
public abstract class AbstractC29644xfa3f885e extends java.io.OutputStream {

    /* renamed from: mClosed */
    private boolean f74920xfe820839;

    /* renamed from: mException */
    private java.io.IOException f74921xd3071a62;

    /* renamed from: mRequestCompleted */
    private boolean f74922x82525f09;

    /* renamed from: checkNoException */
    public void m154324x66409966() {
        java.io.IOException iOException = this.f74921xd3071a62;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* renamed from: checkNotClosed */
    public void m154325x9e8331f7() {
        if (this.f74922x82525f09) {
            m154324x66409966();
            throw new java.io.IOException("Writing after request completed.");
        }
        if (this.f74920xfe820839) {
            throw new java.io.IOException("Stream has been closed.");
        }
    }

    /* renamed from: checkReceivedEnoughContent */
    public abstract void mo154291x45140060();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f74920xfe820839 = true;
    }

    /* renamed from: getUploadDataProvider */
    public abstract org.p3343x72743996.net.AbstractC29560x8cb1347c mo154292x3249da52();

    /* renamed from: setConnected */
    public abstract void mo154293x393b24c7();

    /* renamed from: setRequestCompleted */
    public void m154326xa80f90fe(java.io.IOException iOException) {
        this.f74921xd3071a62 = iOException;
        this.f74922x82525f09 = true;
    }
}
