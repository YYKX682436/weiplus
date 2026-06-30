package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.maas.moviecomposing.ImageThumbnailProvider */
/* loaded from: classes5.dex */
public class C4148xb187d302 extends com.p314xaae8f345.p457x3304c6.p479x4179489f.o0 {

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f16129x39e86013;

    public C4148xb187d302(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, android.util.Size size) {
        super(c4181x2248e1a3);
        this.f16129x39e86013 = m34068xfce9a72c(c4181x2248e1a3.D(), c4181x2248e1a3.f130065a.m32425x6ac9171(), size.getWidth(), size.getHeight());
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m34068xfce9a72c(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, java.lang.String str, int i17, int i18);

    /* renamed from: nativeCancelAllTasks */
    private native void m34069xc5630efe();

    /* renamed from: nativeCancelTask */
    private native void m34070x568e4696(int i17);

    /* renamed from: nativeRequestThumbnail */
    private native int m34071x1ed17554(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, com.p314xaae8f345.p457x3304c6.p479x4179489f.InterfaceC4151x7dc1508a interfaceC4151x7dc1508a);

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.o0
    public void a() {
        m34069xc5630efe();
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.o0
    public void b(com.p314xaae8f345.p457x3304c6.p479x4179489f.m0 m0Var) {
        m34070x568e4696(m0Var.f130046a);
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.o0
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.m0 d(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, final com.p314xaae8f345.p457x3304c6.p479x4179489f.l0 l0Var) {
        return new com.p314xaae8f345.p457x3304c6.p479x4179489f.m0(m34071x1ed17554(c4129xdee64553, new com.p314xaae8f345.p457x3304c6.p479x4179489f.InterfaceC4151x7dc1508a() { // from class: com.tencent.maas.moviecomposing.ImageThumbnailProvider$$a
            @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.InterfaceC4151x7dc1508a
            /* renamed from: onThumbnailAvailable */
            public final void mo34072xb759537c(int i17, int i18, android.graphics.Bitmap bitmap, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i19) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.l0 l0Var2 = com.p314xaae8f345.p457x3304c6.p479x4179489f.l0.this;
                if (l0Var2 != null) {
                    l0Var2.a(new com.p314xaae8f345.p457x3304c6.p479x4179489f.m0(i17), i18, new com.p314xaae8f345.p457x3304c6.p479x4179489f.n0(bitmap, c4128x879fba0a, i19));
                }
            }
        }));
    }
}
