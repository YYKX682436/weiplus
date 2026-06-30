package com.p314xaae8f345.p3121x37984a.p3130x91727fcf;

/* renamed from: com.tencent.wcdb.support.CancellationSignal */
/* loaded from: classes12.dex */
public final class C26987xeef691ab {

    /* renamed from: mCancelInProgress */
    private boolean f58422xb7b5c319;

    /* renamed from: mIsCanceled */
    private boolean f58423xa5922430;

    /* renamed from: mOnCancelListener */
    private com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.OnCancelListener f58424x3205af9a;

    /* renamed from: mRemote */
    private com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4 f58425x17b71f13;

    /* renamed from: com.tencent.wcdb.support.CancellationSignal$OnCancelListener */
    /* loaded from: classes12.dex */
    public interface OnCancelListener {
        /* renamed from: onCancel */
        void mo82492x3d6f0539();
    }

    /* renamed from: com.tencent.wcdb.support.CancellationSignal$Transport */
    /* loaded from: classes12.dex */
    public static final class Transport extends com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4.Stub {

        /* renamed from: mCancellationSignal */
        final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f58426x808230d8;

        private Transport() {
            this.f58426x808230d8 = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
        }

        @Override // com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4
        /* renamed from: cancel */
        public void mo108012xae7a2e7a() {
            this.f58426x808230d8.m108007xae7a2e7a();
        }
    }

    /* renamed from: createTransport */
    public static com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4 m108004xe76ed18d() {
        return new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.Transport();
    }

    /* renamed from: fromTransport */
    public static com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab m108005xbdf3fe9f(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4 interfaceC26989x948c71b4) {
        if (interfaceC26989x948c71b4 instanceof com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.Transport) {
            return ((com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.Transport) interfaceC26989x948c71b4).f58426x808230d8;
        }
        return null;
    }

    /* renamed from: waitForCancelFinishedLocked */
    private void m108006x33ad546a() {
        while (this.f58422xb7b5c319) {
            try {
                wait();
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    /* renamed from: cancel */
    public void m108007xae7a2e7a() {
        synchronized (this) {
            if (this.f58423xa5922430) {
                return;
            }
            this.f58423xa5922430 = true;
            this.f58422xb7b5c319 = true;
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.OnCancelListener onCancelListener = this.f58424x3205af9a;
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4 interfaceC26989x948c71b4 = this.f58425x17b71f13;
            if (onCancelListener != null) {
                try {
                    onCancelListener.mo82492x3d6f0539();
                } catch (java.lang.Throwable th6) {
                    synchronized (this) {
                        this.f58422xb7b5c319 = false;
                        notifyAll();
                        throw th6;
                    }
                }
            }
            if (interfaceC26989x948c71b4 != null) {
                try {
                    interfaceC26989x948c71b4.mo108012xae7a2e7a();
                } catch (android.os.RemoteException unused) {
                }
            }
            synchronized (this) {
                this.f58422xb7b5c319 = false;
                notifyAll();
            }
        }
    }

    /* renamed from: isCanceled */
    public boolean m108008xc9602be3() {
        boolean z17;
        synchronized (this) {
            z17 = this.f58423xa5922430;
        }
        return z17;
    }

    /* renamed from: setOnCancelListener */
    public void m108009x57c2e18f(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.OnCancelListener onCancelListener) {
        synchronized (this) {
            m108006x33ad546a();
            if (this.f58424x3205af9a == onCancelListener) {
                return;
            }
            this.f58424x3205af9a = onCancelListener;
            if (this.f58423xa5922430 && onCancelListener != null) {
                onCancelListener.mo82492x3d6f0539();
            }
        }
    }

    /* renamed from: setRemote */
    public void m108010x20974f48(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4 interfaceC26989x948c71b4) {
        synchronized (this) {
            m108006x33ad546a();
            if (this.f58425x17b71f13 == interfaceC26989x948c71b4) {
                return;
            }
            this.f58425x17b71f13 = interfaceC26989x948c71b4;
            if (this.f58423xa5922430 && interfaceC26989x948c71b4 != null) {
                try {
                    interfaceC26989x948c71b4.mo108012xae7a2e7a();
                } catch (android.os.RemoteException unused) {
                }
            }
        }
    }

    /* renamed from: throwIfCanceled */
    public void m108011xf4ed245c() {
        if (m108008xc9602be3()) {
            throw new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f();
        }
    }
}
