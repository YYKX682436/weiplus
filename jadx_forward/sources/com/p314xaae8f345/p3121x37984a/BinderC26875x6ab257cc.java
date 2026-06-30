package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.CursorToBulkCursorAdaptor */
/* loaded from: classes12.dex */
public final class BinderC26875x6ab257cc extends com.p314xaae8f345.p3121x37984a.AbstractBinderC26867xca7dd55f implements android.os.IBinder.DeathRecipient {
    private static final java.lang.String TAG = "Cursor";

    /* renamed from: mCursor */
    private com.p314xaae8f345.p3121x37984a.InterfaceC26870x63710a65 f57748xff023a23;

    /* renamed from: mFilledWindow */
    private com.p314xaae8f345.p3121x37984a.C26876xa70fd706 f57749x963b7cff;

    /* renamed from: mLock */
    private final java.lang.Object f57750x6243b38;

    /* renamed from: mObserver */
    private com.p314xaae8f345.p3121x37984a.BinderC26875x6ab257cc.ContentObserverProxy f57751x39c4fa63;

    /* renamed from: mProviderName */
    private final java.lang.String f57752x7e97ad29;

    /* renamed from: com.tencent.wcdb.CursorToBulkCursorAdaptor$ContentObserverProxy */
    /* loaded from: classes12.dex */
    public static final class ContentObserverProxy extends android.database.ContentObserver {

        /* renamed from: mRemote */
        protected com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6 f57753x17b71f13;

        public ContentObserverProxy(com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6 interfaceC26886xbc685ee6, android.os.IBinder.DeathRecipient deathRecipient) {
            super(null);
            this.f57753x17b71f13 = interfaceC26886xbc685ee6;
            try {
                interfaceC26886xbc685ee6.asBinder().linkToDeath(deathRecipient, 0);
            } catch (android.os.RemoteException unused) {
            }
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return false;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z17, android.net.Uri uri) {
            try {
                this.f57753x17b71f13.mo106313x3dcbea6f(z17, uri);
            } catch (android.os.RemoteException unused) {
            }
        }

        /* renamed from: unlinkToDeath */
        public boolean m106169x903a4b26(android.os.IBinder.DeathRecipient deathRecipient) {
            return this.f57753x17b71f13.asBinder().unlinkToDeath(deathRecipient, 0);
        }
    }

    public BinderC26875x6ab257cc(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76, com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6 interfaceC26886xbc685ee6, java.lang.String str) {
        java.lang.Object obj = new java.lang.Object();
        this.f57750x6243b38 = obj;
        if (interfaceC26872x78faff76 instanceof com.p314xaae8f345.p3121x37984a.InterfaceC26870x63710a65) {
            this.f57748xff023a23 = (com.p314xaae8f345.p3121x37984a.InterfaceC26870x63710a65) interfaceC26872x78faff76;
        } else {
            this.f57748xff023a23 = new com.p314xaae8f345.p3121x37984a.C26871x9558866e(interfaceC26872x78faff76);
        }
        this.f57752x7e97ad29 = str;
        synchronized (obj) {
            m106164xf80fd684(interfaceC26886xbc685ee6);
        }
    }

    /* renamed from: closeFilledWindowLocked */
    private void m106163x44a51b4() {
        com.p314xaae8f345.p3121x37984a.C26876xa70fd706 c26876xa70fd706 = this.f57749x963b7cff;
        if (c26876xa70fd706 != null) {
            c26876xa70fd706.close();
            this.f57749x963b7cff = null;
        }
    }

    /* renamed from: createAndRegisterObserverProxyLocked */
    private void m106164xf80fd684(com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6 interfaceC26886xbc685ee6) {
        if (this.f57751x39c4fa63 != null) {
            throw new java.lang.IllegalStateException("an observer is already registered");
        }
        com.p314xaae8f345.p3121x37984a.BinderC26875x6ab257cc.ContentObserverProxy contentObserverProxy = new com.p314xaae8f345.p3121x37984a.BinderC26875x6ab257cc.ContentObserverProxy(interfaceC26886xbc685ee6, this);
        this.f57751x39c4fa63 = contentObserverProxy;
        this.f57748xff023a23.registerContentObserver(contentObserverProxy);
    }

    /* renamed from: disposeLocked */
    private void m106165x708cf209() {
        if (this.f57748xff023a23 != null) {
            m106167xfcc12486();
            this.f57748xff023a23.close();
            this.f57748xff023a23 = null;
        }
        m106163x44a51b4();
    }

    /* renamed from: throwIfCursorIsClosed */
    private void m106166x7b5e162f() {
        if (this.f57748xff023a23 == null) {
            throw new com.p314xaae8f345.p3121x37984a.C26894xe1ef88cc("Attempted to access a cursor after it has been closed.");
        }
    }

    /* renamed from: unregisterObserverProxyLocked */
    private void m106167xfcc12486() {
        com.p314xaae8f345.p3121x37984a.BinderC26875x6ab257cc.ContentObserverProxy contentObserverProxy = this.f57751x39c4fa63;
        if (contentObserverProxy != null) {
            this.f57748xff023a23.unregisterContentObserver(contentObserverProxy);
            this.f57751x39c4fa63.m106169x903a4b26(this);
            this.f57751x39c4fa63 = null;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        synchronized (this.f57750x6243b38) {
            m106165x708cf209();
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031
    /* renamed from: close */
    public void mo106144x5a5ddf8() {
        synchronized (this.f57750x6243b38) {
            m106165x708cf209();
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031
    /* renamed from: deactivate */
    public void mo106145x88fbd074() {
        synchronized (this.f57750x6243b38) {
            if (this.f57748xff023a23 != null) {
                m106167xfcc12486();
                this.f57748xff023a23.deactivate();
            }
            m106163x44a51b4();
        }
    }

    /* renamed from: getBulkCursorDescriptor */
    public com.p314xaae8f345.p3121x37984a.C26866x1d4c74b7 m106168xbf52fd0d() {
        com.p314xaae8f345.p3121x37984a.C26866x1d4c74b7 c26866x1d4c74b7;
        synchronized (this.f57750x6243b38) {
            m106166x7b5e162f();
            c26866x1d4c74b7 = new com.p314xaae8f345.p3121x37984a.C26866x1d4c74b7();
            c26866x1d4c74b7.f57721xaf961356 = this;
            c26866x1d4c74b7.f57719xcd46b992 = this.f57748xff023a23.getColumnNames();
            c26866x1d4c74b7.f57722x2959c047 = this.f57748xff023a23.getWantsAllOnMoveCalls();
            c26866x1d4c74b7.f57720x5a7510f = this.f57748xff023a23.getCount();
            com.p314xaae8f345.p3121x37984a.C26876xa70fd706 mo106127x3622fee6 = this.f57748xff023a23.mo106127x3622fee6();
            c26866x1d4c74b7.f57723xd10bdbf0 = mo106127x3622fee6;
            if (mo106127x3622fee6 != null) {
                mo106127x3622fee6.m107403x3e28f15();
            }
        }
        return c26866x1d4c74b7;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031
    /* renamed from: getExtras */
    public android.os.Bundle mo106146x18421159() {
        android.os.Bundle extras;
        synchronized (this.f57750x6243b38) {
            m106166x7b5e162f();
            extras = this.f57748xff023a23.getExtras();
        }
        return extras;
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031
    /* renamed from: getWindow */
    public com.p314xaae8f345.p3121x37984a.C26876xa70fd706 mo106147x3622fee6(int i17) {
        synchronized (this.f57750x6243b38) {
            m106166x7b5e162f();
            if (!this.f57748xff023a23.moveToPosition(i17)) {
                m106163x44a51b4();
                return null;
            }
            com.p314xaae8f345.p3121x37984a.C26876xa70fd706 mo106127x3622fee6 = this.f57748xff023a23.mo106127x3622fee6();
            if (mo106127x3622fee6 != null) {
                m106163x44a51b4();
            } else {
                mo106127x3622fee6 = this.f57749x963b7cff;
                if (mo106127x3622fee6 == null) {
                    mo106127x3622fee6 = new com.p314xaae8f345.p3121x37984a.C26876xa70fd706(this.f57752x7e97ad29);
                    this.f57749x963b7cff = mo106127x3622fee6;
                } else if (i17 < mo106127x3622fee6.m106205xf185fbf5() || i17 >= mo106127x3622fee6.m106205xf185fbf5() + mo106127x3622fee6.m106203xc688aa49()) {
                    mo106127x3622fee6.m106193x5a5b64d();
                }
                this.f57748xff023a23.mo106124xe3e54f53(i17, mo106127x3622fee6);
            }
            mo106127x3622fee6.m107403x3e28f15();
            return mo106127x3622fee6;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031
    /* renamed from: onMove */
    public void mo106148xc39cb650(int i17) {
        synchronized (this.f57750x6243b38) {
            m106166x7b5e162f();
            com.p314xaae8f345.p3121x37984a.InterfaceC26870x63710a65 interfaceC26870x63710a65 = this.f57748xff023a23;
            interfaceC26870x63710a65.mo106131xc39cb650(interfaceC26870x63710a65.getPosition(), i17);
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031
    /* renamed from: requery */
    public int mo106149x414ef275(com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6 interfaceC26886xbc685ee6) {
        synchronized (this.f57750x6243b38) {
            m106166x7b5e162f();
            m106163x44a51b4();
            try {
                if (!this.f57748xff023a23.requery()) {
                    return -1;
                }
                m106167xfcc12486();
                m106164xf80fd684(interfaceC26886xbc685ee6);
                return this.f57748xff023a23.getCount();
            } catch (java.lang.IllegalStateException e17) {
                throw new java.lang.IllegalStateException(this.f57752x7e97ad29 + " Requery misuse db, mCursor isClosed:" + this.f57748xff023a23.isClosed(), e17);
            }
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031
    /* renamed from: respond */
    public android.os.Bundle mo106150x41690095(android.os.Bundle bundle) {
        android.os.Bundle respond;
        synchronized (this.f57750x6243b38) {
            m106166x7b5e162f();
            respond = this.f57748xff023a23.respond(bundle);
        }
        return respond;
    }
}
