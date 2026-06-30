package com.p314xaae8f345.p3006xb8ff1437.api;

/* renamed from: com.tencent.thumbplayer.api.TPSurface */
/* loaded from: classes16.dex */
public final class C26196x1194f691 extends com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26415xa2ae6b99 {

    /* renamed from: mITPSurfaceCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26402x76cd3755 f51026x93bd73fa;

    /* renamed from: mPlayerSurfaceListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26166x5cb2793c f51027x6546bcf3;

    public C26196x1194f691(android.graphics.SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.f51027x6546bcf3 = null;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26402x76cd3755 interfaceC26402x76cd3755 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26402x76cd3755() { // from class: com.tencent.thumbplayer.api.TPSurface.1
            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26402x76cd3755
            /* renamed from: onFlush */
            public void mo101175xaf961065() {
                com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26166x5cb2793c interfaceC26166x5cb2793c = com.p314xaae8f345.p3006xb8ff1437.api.C26196x1194f691.this.f51027x6546bcf3;
                if (interfaceC26166x5cb2793c != null) {
                    interfaceC26166x5cb2793c.m100993xaf961065();
                }
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26402x76cd3755
            /* renamed from: onRenderInfo */
            public void mo101176xe44bea3(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26417xf28cbbdd c26417xf28cbbdd) {
                com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26166x5cb2793c interfaceC26166x5cb2793c = com.p314xaae8f345.p3006xb8ff1437.api.C26196x1194f691.this.f51027x6546bcf3;
                if (interfaceC26166x5cb2793c != null) {
                    interfaceC26166x5cb2793c.m100994xe44bea3(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100791xf6ff28f5(c26417xf28cbbdd));
                }
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26402x76cd3755
            /* renamed from: onVideoPacket */
            public void mo101177x54874d84(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26336x45e43cc7 c26336x45e43cc7, long j17) {
                com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26166x5cb2793c interfaceC26166x5cb2793c = com.p314xaae8f345.p3006xb8ff1437.api.C26196x1194f691.this.f51027x6546bcf3;
                if (interfaceC26166x5cb2793c != null) {
                    interfaceC26166x5cb2793c.m100995x54874d84(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26152x782d9536.m100798xe416f0a8(c26336x45e43cc7), j17);
                }
            }
        };
        this.f51026x93bd73fa = interfaceC26402x76cd3755;
        super.m102740x389eadd4(interfaceC26402x76cd3755);
    }

    @Override // android.view.Surface
    public void finalize() {
        release();
        super.finalize();
    }

    /* renamed from: setSurfaceListener */
    public void m101174xb06c83bf(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26166x5cb2793c interfaceC26166x5cb2793c) {
        this.f51027x6546bcf3 = interfaceC26166x5cb2793c;
    }
}
