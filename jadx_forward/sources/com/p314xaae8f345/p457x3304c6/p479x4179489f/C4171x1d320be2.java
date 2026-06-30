package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* renamed from: com.tencent.maas.moviecomposing.VideoThumbnailProvider */
/* loaded from: classes5.dex */
public class C4171x1d320be2 extends com.p314xaae8f345.p457x3304c6.p479x4179489f.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f129960a;

    /* renamed from: mHybridData */
    private final com.p166x1da19ac6.jni.C1545xd48843e6 f16150x39e86013;

    public C4171x1d320be2(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, android.util.Size size, boolean z17, int i17, int i18, int i19) {
        super(c4181x2248e1a3);
        this.f129960a = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f16150x39e86013 = m34266xfce9a72c(size.getWidth(), size.getHeight(), z17, i17, i18, i19);
        m34268xb9040701(c4181x2248e1a3.D(), c4181x2248e1a3.f130065a.m32425x6ac9171());
    }

    /* renamed from: initHybrid */
    private native com.p166x1da19ac6.jni.C1545xd48843e6 m34266xfce9a72c(int i17, int i18, boolean z17, int i19, int i27, int i28);

    /* renamed from: nativeCancelTask */
    private native void m34267x568e4696(int i17);

    /* renamed from: nativeOpen */
    private native int m34268xb9040701(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, java.lang.String str);

    /* renamed from: nativeReopen */
    private native int m34269x8ca671f4(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, java.lang.String str);

    /* renamed from: nativeRequestThumbnailAtTime */
    private native int m34270x8269414(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p479x4179489f.InterfaceC4151x7dc1508a interfaceC4151x7dc1508a);

    /* renamed from: nativeRequestThumbnailAtTimeRange */
    private native int m34271xd3a82189(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, com.p314xaae8f345.p457x3304c6.p479x4179489f.InterfaceC4151x7dc1508a interfaceC4151x7dc1508a);

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.o0
    public void a() {
        java.util.Iterator it = this.f129960a.iterator();
        while (it.hasNext()) {
            b((com.p314xaae8f345.p457x3304c6.p479x4179489f.m0) it.next());
        }
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.o0
    public void b(com.p314xaae8f345.p457x3304c6.p479x4179489f.m0 m0Var) {
        java.util.Set set = this.f129960a;
        if (set.contains(m0Var)) {
            m34267x568e4696(m0Var.f130046a);
            set.remove(m0Var);
        }
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.o0
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.m0 d(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, final com.p314xaae8f345.p457x3304c6.p479x4179489f.l0 l0Var) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.m0 m0Var = new com.p314xaae8f345.p457x3304c6.p479x4179489f.m0(m34271xd3a82189(c4129xdee64553, new com.p314xaae8f345.p457x3304c6.p479x4179489f.InterfaceC4151x7dc1508a() { // from class: com.tencent.maas.moviecomposing.VideoThumbnailProvider$$a
            @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.InterfaceC4151x7dc1508a
            /* renamed from: onThumbnailAvailable */
            public final void mo34072xb759537c(int i17, int i18, android.graphics.Bitmap bitmap, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i19) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.l0 l0Var2 = com.p314xaae8f345.p457x3304c6.p479x4179489f.l0.this;
                if (l0Var2 != null) {
                    l0Var2.a(new com.p314xaae8f345.p457x3304c6.p479x4179489f.m0(i17), i18, new com.p314xaae8f345.p457x3304c6.p479x4179489f.n0(bitmap, c4128x879fba0a, i19));
                }
            }
        }));
        if (!m0Var.m34362xb2c87fbf(com.p314xaae8f345.p457x3304c6.p479x4179489f.m0.f130045c) && !(!m0Var.m34362xb2c87fbf(com.p314xaae8f345.p457x3304c6.p479x4179489f.m0.f130044b))) {
            this.f129960a.add(m0Var);
        }
        return m0Var;
    }
}
