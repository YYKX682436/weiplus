package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.PeerConnectionDependencies */
/* loaded from: classes15.dex */
public final class C29835x275e1749 {

    /* renamed from: observer */
    private final org.p3371xd0ce3e8d.C29834x4e84c600.Observer f75774x14c752d6;

    /* renamed from: sslCertificateVerifier */
    private final org.p3371xd0ce3e8d.InterfaceC29853xc898c401 f75775x20a993e1;

    /* renamed from: org.webrtc.PeerConnectionDependencies$Builder */
    /* loaded from: classes15.dex */
    public static class Builder {

        /* renamed from: observer */
        private org.p3371xd0ce3e8d.C29834x4e84c600.Observer f75776x14c752d6;

        /* renamed from: sslCertificateVerifier */
        private org.p3371xd0ce3e8d.InterfaceC29853xc898c401 f75777x20a993e1;

        /* renamed from: createPeerConnectionDependencies */
        public org.p3371xd0ce3e8d.C29835x275e1749 m156121xc8c83545() {
            return new org.p3371xd0ce3e8d.C29835x275e1749(this.f75776x14c752d6, this.f75777x20a993e1);
        }

        /* renamed from: setSSLCertificateVerifier */
        public org.p3371xd0ce3e8d.C29835x275e1749.Builder m156122x35622ae3(org.p3371xd0ce3e8d.InterfaceC29853xc898c401 interfaceC29853xc898c401) {
            this.f75777x20a993e1 = interfaceC29853xc898c401;
            return this;
        }

        private Builder(org.p3371xd0ce3e8d.C29834x4e84c600.Observer observer) {
            this.f75776x14c752d6 = observer;
        }
    }

    /* renamed from: builder */
    public static org.p3371xd0ce3e8d.C29835x275e1749.Builder m156118xdc3ef9b(org.p3371xd0ce3e8d.C29834x4e84c600.Observer observer) {
        return new org.p3371xd0ce3e8d.C29835x275e1749.Builder(observer);
    }

    /* renamed from: getObserver */
    public org.p3371xd0ce3e8d.C29834x4e84c600.Observer m156119x90a1904c() {
        return this.f75774x14c752d6;
    }

    /* renamed from: getSSLCertificateVerifier */
    public org.p3371xd0ce3e8d.InterfaceC29853xc898c401 m156120x31e8ed7() {
        return this.f75775x20a993e1;
    }

    private C29835x275e1749(org.p3371xd0ce3e8d.C29834x4e84c600.Observer observer, org.p3371xd0ce3e8d.InterfaceC29853xc898c401 interfaceC29853xc898c401) {
        this.f75774x14c752d6 = observer;
        this.f75775x20a993e1 = interfaceC29853xc898c401;
    }
}
