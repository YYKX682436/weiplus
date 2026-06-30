package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c;

/* renamed from: androidx.camera.core.streamsharing.StreamSharing */
/* loaded from: classes14.dex */
public class C0959xc642f91c extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 {
    private static final java.lang.String TAG = "StreamSharing";

    /* renamed from: mCameraEdge */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea f2333x643c82cf;

    /* renamed from: mCloseableErrorListener */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener f2334xb6dbcd77;

    /* renamed from: mDefaultConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0963xbe37237e f2335x7982d976;

    /* renamed from: mDualSharingNode */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3 f2336x2a7bfeb5;

    /* renamed from: mEffectNode */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27 f2337x4274a380;

    /* renamed from: mLayoutSettings */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d f2338xffa5b3a;

    /* renamed from: mSecondaryCameraEdge */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea f2339xde44a569;

    /* renamed from: mSecondaryLayoutSettings */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d f2340x2d9ba0d4;

    /* renamed from: mSecondarySessionConfigBuilder */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder f2341x4cc62d2a;

    /* renamed from: mSecondarySharingInputEdge */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea f2342x4a61bcd2;

    /* renamed from: mSessionConfigBuilder */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder f2343xcb6d0310;

    /* renamed from: mSharingInputEdge */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea f2344xffb75b8;

    /* renamed from: mSharingNode */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27 f2345xaec75651;

    /* renamed from: mVirtualCameraAdapter */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0965x4cf2e33f f2346xaa136b2c;

    /* renamed from: androidx.camera.core.streamsharing.StreamSharing$Control */
    /* loaded from: classes14.dex */
    public interface Control {
        /* renamed from: jpegSnapshot */
        wa.a mo6580x70f4324c(int i17, int i18);
    }

    public C0959xc642f91c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5222, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d2, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> set, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 interfaceC0769xb8476771) {
        super(m6564xdbd48d2d(set));
        this.f2335x7982d976 = m6564xdbd48d2d(set);
        this.f2338xffa5b3a = c0543xcd8e1d8d;
        this.f2340x2d9ba0d4 = c0543xcd8e1d8d2;
        this.f2346xaa136b2c = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0965x4cf2e33f(interfaceC0677x9e0bc522, interfaceC0677x9e0bc5222, set, interfaceC0769xb8476771, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.Control() { // from class: androidx.camera.core.streamsharing.StreamSharing$$a
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.Control
            /* renamed from: jpegSnapshot */
            public final wa.a mo6580x70f4324c(int i17, int i18) {
                wa.a m6572x51ef5f0f;
                m6572x51ef5f0f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.this.m6572x51ef5f0f(i17, i18);
                return m6572x51ef5f0f;
            }
        });
    }

    /* renamed from: addCameraErrorListener */
    private void m6554xe8cd0556(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder builder, final java.lang.String str, final java.lang.String str2, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b2) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener closeableErrorListener = this.f2334xb6dbcd77;
        if (closeableErrorListener != null) {
            closeableErrorListener.m5633x5a5ddf8();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener closeableErrorListener2 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener() { // from class: androidx.camera.core.streamsharing.StreamSharing$$b
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener
            /* renamed from: onError */
            public final void mo3491xaf8aa769(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.SessionError sessionError) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.this.m6571x72198aa0(str, str2, interfaceC0768x83509b59, abstractC0756x2f9ad77b, abstractC0756x2f9ad77b2, c0750xb915958, sessionError);
            }
        });
        this.f2334xb6dbcd77 = closeableErrorListener2;
        builder.m5624x6b43959a(closeableErrorListener2);
    }

    /* renamed from: clearPipeline */
    private void m6555xbdd2280f() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener closeableErrorListener = this.f2334xb6dbcd77;
        if (closeableErrorListener != null) {
            closeableErrorListener.m5633x5a5ddf8();
            this.f2334xb6dbcd77 = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea = this.f2333x643c82cf;
        if (c0905xfc457ea != null) {
            c0905xfc457ea.m6329x5a5ddf8();
            this.f2333x643c82cf = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea2 = this.f2339xde44a569;
        if (c0905xfc457ea2 != null) {
            c0905xfc457ea2.m6329x5a5ddf8();
            this.f2339xde44a569 = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea3 = this.f2344xffb75b8;
        if (c0905xfc457ea3 != null) {
            c0905xfc457ea3.m6329x5a5ddf8();
            this.f2344xffb75b8 = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea4 = this.f2342x4a61bcd2;
        if (c0905xfc457ea4 != null) {
            c0905xfc457ea4.m6329x5a5ddf8();
            this.f2342x4a61bcd2 = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27 c0920xc7a30e27 = this.f2345xaec75651;
        if (c0920xc7a30e27 != null) {
            c0920xc7a30e27.mo4945x41012807();
            this.f2345xaec75651 = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3 c0943xe9eb54c3 = this.f2336x2a7bfeb5;
        if (c0943xe9eb54c3 != null) {
            c0943xe9eb54c3.mo4945x41012807();
            this.f2336x2a7bfeb5 = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27 c0920xc7a30e272 = this.f2337x4274a380;
        if (c0920xc7a30e272 != null) {
            c0920xc7a30e272.mo4945x41012807();
            this.f2337x4274a380 = null;
        }
    }

    /* renamed from: createPipelineAndUpdateChildrenSpecs */
    private java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958> m6556xcf3fb517(java.lang.String str, java.lang.String str2, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b2) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (abstractC0756x2f9ad77b2 == null) {
            m6557x2515bc2b(str, str2, interfaceC0768x83509b59, abstractC0756x2f9ad77b, null);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b = m4811x1390e61b();
            java.util.Objects.requireNonNull(m4811x1390e61b);
            this.f2345xaec75651 = m6569xde908bc8(m4811x1390e61b, abstractC0756x2f9ad77b);
            java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10> m6598x92670398 = this.f2346xaa136b2c.m6598x92670398(this.f2344xffb75b8, m4828x68e8c702(), m4829xe80fd2f0() != null);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.Out mo4948x3ebe6b6c = this.f2345xaec75651.mo4948x3ebe6b6c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.In.of(this.f2344xffb75b8, new java.util.ArrayList(m6598x92670398.values())));
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.util.Map.Entry<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10> entry : m6598x92670398.entrySet()) {
                hashMap.put(entry.getKey(), mo4948x3ebe6b6c.get(entry.getValue()));
            }
            this.f2346xaa136b2c.m6605x995d0655(hashMap);
            java.lang.Object[] objArr = {this.f2343xcb6d0310.m5619x59bc66e()};
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            java.lang.Object obj = objArr[0];
            java.util.Objects.requireNonNull(obj);
            arrayList.add(obj);
            return java.util.Collections.unmodifiableList(arrayList);
        }
        m6557x2515bc2b(str, str2, interfaceC0768x83509b59, abstractC0756x2f9ad77b, abstractC0756x2f9ad77b2);
        m6558x516cb91d(str, str2, interfaceC0768x83509b59, abstractC0756x2f9ad77b, abstractC0756x2f9ad77b2);
        this.f2336x2a7bfeb5 = m6565x3f2fa0ac(m4811x1390e61b(), m4822x40ff0b83(), abstractC0756x2f9ad77b, this.f2338xffa5b3a, this.f2340x2d9ba0d4);
        java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4> m6599x92670398 = this.f2346xaa136b2c.m6599x92670398(this.f2344xffb75b8, this.f2342x4a61bcd2, m4828x68e8c702(), m4829xe80fd2f0() != null);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.Out mo4948x3ebe6b6c2 = this.f2336x2a7bfeb5.mo4948x3ebe6b6c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.In.of(this.f2344xffb75b8, this.f2342x4a61bcd2, new java.util.ArrayList(m6599x92670398.values())));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (java.util.Map.Entry<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4> entry2 : m6599x92670398.entrySet()) {
            hashMap2.put(entry2.getKey(), mo4948x3ebe6b6c2.get(entry2.getValue()));
        }
        this.f2346xaa136b2c.m6605x995d0655(hashMap2);
        java.lang.Object[] objArr2 = {this.f2343xcb6d0310.m5619x59bc66e(), this.f2341x4cc62d2a.m5619x59bc66e()};
        java.util.ArrayList arrayList2 = new java.util.ArrayList(2);
        for (int i17 = 0; i17 < 2; i17++) {
            java.lang.Object obj2 = objArr2[i17];
            java.util.Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return java.util.Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: createPrimaryCamera */
    private void m6557x2515bc2b(java.lang.String str, java.lang.String str2, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b2) {
        android.graphics.Matrix m4825xa4435162 = m4825xa4435162();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b = m4811x1390e61b();
        java.util.Objects.requireNonNull(m4811x1390e61b);
        boolean mo5289x5ef3d868 = m4811x1390e61b.mo5289x5ef3d868();
        android.graphics.Rect m6562xfa2ffe0a = m6562xfa2ffe0a(abstractC0756x2f9ad77b.mo5191x8ee230a2());
        java.util.Objects.requireNonNull(m6562xfa2ffe0a);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b2 = m4811x1390e61b();
        java.util.Objects.requireNonNull(m4811x1390e61b2);
        int m4820xe02e49e0 = m4820xe02e49e0(m4811x1390e61b2);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b3 = m4811x1390e61b();
        java.util.Objects.requireNonNull(m4811x1390e61b3);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea(3, 34, abstractC0756x2f9ad77b, m4825xa4435162, mo5289x5ef3d868, m6562xfa2ffe0a, m4820xe02e49e0, -1, m4832x7e0b2878(m4811x1390e61b3));
        this.f2333x643c82cf = c0905xfc457ea;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b4 = m4811x1390e61b();
        java.util.Objects.requireNonNull(m4811x1390e61b4);
        this.f2344xffb75b8 = m6568x91bc12a1(c0905xfc457ea, m4811x1390e61b4);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m6559x7933c61f = m6559x7933c61f(this.f2333x643c82cf, interfaceC0768x83509b59, abstractC0756x2f9ad77b);
        this.f2343xcb6d0310 = m6559x7933c61f;
        m6554xe8cd0556(m6559x7933c61f, str, str2, interfaceC0768x83509b59, abstractC0756x2f9ad77b, abstractC0756x2f9ad77b2);
    }

    /* renamed from: createSecondaryCamera */
    private void m6558x516cb91d(java.lang.String str, java.lang.String str2, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b2) {
        android.graphics.Matrix m4825xa4435162 = m4825xa4435162();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4822x40ff0b83 = m4822x40ff0b83();
        java.util.Objects.requireNonNull(m4822x40ff0b83);
        boolean mo5289x5ef3d868 = m4822x40ff0b83.mo5289x5ef3d868();
        android.graphics.Rect m6562xfa2ffe0a = m6562xfa2ffe0a(abstractC0756x2f9ad77b2.mo5191x8ee230a2());
        java.util.Objects.requireNonNull(m6562xfa2ffe0a);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4822x40ff0b832 = m4822x40ff0b83();
        java.util.Objects.requireNonNull(m4822x40ff0b832);
        int m4820xe02e49e0 = m4820xe02e49e0(m4822x40ff0b832);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4822x40ff0b833 = m4822x40ff0b83();
        java.util.Objects.requireNonNull(m4822x40ff0b833);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea(3, 34, abstractC0756x2f9ad77b2, m4825xa4435162, mo5289x5ef3d868, m6562xfa2ffe0a, m4820xe02e49e0, -1, m4832x7e0b2878(m4822x40ff0b833));
        this.f2339xde44a569 = c0905xfc457ea;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4822x40ff0b834 = m4822x40ff0b83();
        java.util.Objects.requireNonNull(m4822x40ff0b834);
        this.f2342x4a61bcd2 = m6568x91bc12a1(c0905xfc457ea, m4822x40ff0b834);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m6559x7933c61f = m6559x7933c61f(this.f2339xde44a569, interfaceC0768x83509b59, abstractC0756x2f9ad77b2);
        this.f2341x4cc62d2a = m6559x7933c61f;
        m6554xe8cd0556(m6559x7933c61f, str, str2, interfaceC0768x83509b59, abstractC0756x2f9ad77b, abstractC0756x2f9ad77b2);
    }

    /* renamed from: createSessionConfigBuilder */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m6559x7933c61f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5603x51964ec6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder.m5603x51964ec6(interfaceC0768x83509b59, abstractC0756x2f9ad77b.mo5191x8ee230a2());
        m6574xc6d828e2(m5603x51964ec6);
        m6573xbc8443b8(abstractC0756x2f9ad77b.mo5191x8ee230a2(), m5603x51964ec6);
        m5603x51964ec6.m5617x34744cc(c0905xfc457ea.m6335xcdba49fd(), abstractC0756x2f9ad77b.mo5188x82dbcab4(), null, -1);
        m5603x51964ec6.m5614x503be6a0(this.f2346xaa136b2c.m6600xa1a49054());
        if (abstractC0756x2f9ad77b.mo5190xca0018d6() != null) {
            m5603x51964ec6.m5610x2f697c6b(abstractC0756x2f9ad77b.mo5190xca0018d6());
        }
        return m5603x51964ec6;
    }

    /* renamed from: getCaptureTypes */
    public static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> m6560x8e12cf49(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (m6570x17e32032(abstractC0580x5a5e3137)) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> it = ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c) abstractC0580x5a5e3137).m6576xdec49b75().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m4814x27802a65().mo3493xe38cfe6a());
            }
        } else {
            arrayList.add(abstractC0580x5a5e3137.m4814x27802a65().mo3493xe38cfe6a());
        }
        return arrayList;
    }

    /* renamed from: getChildTemplate */
    private static int m6561xdad00600(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        return abstractC0580x5a5e3137.m4814x27802a65().m5746x9405312d().m5602x26c6954a();
    }

    /* renamed from: getCropRect */
    private android.graphics.Rect m6562xfa2ffe0a(android.util.Size size) {
        return m4829xe80fd2f0() != null ? m4829xe80fd2f0() : new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
    }

    /* renamed from: getCropRectAppliedByEffect */
    private android.graphics.Rect m6563xe7b740fb(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36 m4815x173ddc87 = m4815x173ddc87();
        m4815x173ddc87.getClass();
        return m4815x173ddc87.m4265x8afcdfff() == 1 ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5967x82ce2e60(c0905xfc457ea.m6340xa709b351().mo5191x8ee230a2()) : c0905xfc457ea.m6334xfa2ffe0a();
    }

    /* renamed from: getDefaultConfig */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0963xbe37237e m6564xdbd48d2d(java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> set) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 mo2889xc37a2e52 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0962xddc056df().mo2889xc37a2e52();
        mo2889xc37a2e52.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1687x12b109b6, 34);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : set) {
            if (abstractC0580x5a5e3137.m4814x27802a65().mo5374xdccd9774(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1829x7803883d)) {
                arrayList.add(abstractC0580x5a5e3137.m4814x27802a65().mo3493xe38cfe6a());
            }
        }
        mo2889xc37a2e52.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0963xbe37237e.f2349x886d7fb6, arrayList);
        mo2889xc37a2e52.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1693xd5f15d59, 2);
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0963xbe37237e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.m5538x3017aa(mo2889xc37a2e52));
    }

    /* renamed from: getDualSharingNode */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3 m6565x3f2fa0ac(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5222, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d2) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3(interfaceC0677x9e0bc522, interfaceC0677x9e0bc5222, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0932xef42ab21.Factory.m6416x6bff0255(abstractC0756x2f9ad77b.mo5188x82dbcab4(), c0543xcd8e1d8d, c0543xcd8e1d8d2));
    }

    /* renamed from: getMirroringAppliedByEffect */
    private boolean m6566x5a37e798() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36 m4815x173ddc87 = m4815x173ddc87();
        m4815x173ddc87.getClass();
        if (m4815x173ddc87.m4265x8afcdfff() != 1) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b = m4811x1390e61b();
        m4811x1390e61b.getClass();
        return m4811x1390e61b.m5290x298133d9() && m4811x1390e61b.mo5289x5ef3d868();
    }

    /* renamed from: getRotationAppliedByEffect */
    private int m6567x3b0300d1() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36 m4815x173ddc87 = m4815x173ddc87();
        m4815x173ddc87.getClass();
        if (m4815x173ddc87.m4265x8afcdfff() != 1) {
            return 0;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b = m4811x1390e61b();
        m4811x1390e61b.getClass();
        return m4820xe02e49e0(m4811x1390e61b);
    }

    /* renamed from: getSharingInputEdge */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea m6568x91bc12a1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522) {
        if (m4815x173ddc87() == null || m4815x173ddc87().m4265x8afcdfff() == 2 || m4815x173ddc87().m4262x52229b4c() == 1) {
            return c0905xfc457ea;
        }
        this.f2337x4274a380 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27(interfaceC0677x9e0bc522, m4815x173ddc87().m4258x44d9f95e());
        int m6567x3b0300d1 = m6567x3b0300d1();
        android.graphics.Rect m6563xe7b740fb = m6563xe7b740fb(c0905xfc457ea);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 of6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10.of(c0905xfc457ea.m6341xe21cfccc(), c0905xfc457ea.m6337x19771aed(), m6563xe7b740fb, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5953x492f0cd4(m6563xe7b740fb, m6567x3b0300d1), m6567x3b0300d1, m6566x5a37e798(), true);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea2 = this.f2337x4274a380.mo4948x3ebe6b6c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.In.of(c0905xfc457ea, java.util.Collections.singletonList(of6))).get(of6);
        java.util.Objects.requireNonNull(c0905xfc457ea2);
        return c0905xfc457ea2;
    }

    /* renamed from: getSharingNode */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27 m6569xde908bc8(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b) {
        if (m4815x173ddc87() != null && m4815x173ddc87().m4262x52229b4c() == 1) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27 c0920xc7a30e27 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27(interfaceC0677x9e0bc522, m4815x173ddc87().m4258x44d9f95e());
            this.f2337x4274a380 = c0920xc7a30e27;
            return c0920xc7a30e27;
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27(interfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0878xf10cc2a6.Factory.m6292x6bff0255(abstractC0756x2f9ad77b.mo5188x82dbcab4()));
    }

    /* renamed from: isStreamSharing */
    public static boolean m6570x17e32032(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        return abstractC0580x5a5e3137 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addCameraErrorListener$1 */
    public /* synthetic */ void m6571x72198aa0(java.lang.String str, java.lang.String str2, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59 interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b2, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.SessionError sessionError) {
        if (m4811x1390e61b() == null) {
            return;
        }
        m6555xbdd2280f();
        m4844xd8cf6f2f(m6556xcf3fb517(str, str2, interfaceC0768x83509b59, abstractC0756x2f9ad77b, abstractC0756x2f9ad77b2));
        m4836x9763bb86();
        this.f2346xaa136b2c.m6604x18ec206e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public /* synthetic */ wa.a m6572x51ef5f0f(int i17, int i18) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27 c0920xc7a30e27 = this.f2345xaec75651;
        return c0920xc7a30e27 != null ? c0920xc7a30e27.m6376xc08ad9db().mo6290x10fad5c4(i17, i18) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.lang.Exception("Failed to take picture: pipeline is not ready."));
    }

    /* renamed from: propagateChildrenCamera2Interop */
    private void m6573xbc8443b8(android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder builder) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> it = m6576xdec49b75().iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m5619x59bc66e = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder.m5603x51964ec6(it.next().m4814x27802a65(), size).m5619x59bc66e();
            builder.m5606x4b7c5954(m5619x59bc66e.m5596x26db407e());
            builder.m5604xc7f822cd(m5619x59bc66e.m5600xcb685e4b());
            builder.m5607x1158c613(m5619x59bc66e.m5598x92ecb9bd());
            builder.m5605x3e1c093(m5619x59bc66e.m5589xf78bafa9());
            builder.m5610x2f697c6b(m5619x59bc66e.m5592xca0018d6());
        }
    }

    /* renamed from: propagateChildrenTemplate */
    private void m6574xc6d828e2(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder builder) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> it = m6576xdec49b75().iterator();
        int i17 = -1;
        while (it.hasNext()) {
            i17 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.m5588x52ddc6fd(i17, m6561xdad00600(it.next()));
        }
        if (i17 != -1) {
            builder.m5631x5d0f9056(i17);
        }
    }

    /* renamed from: getCameraEdge */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea m6575x764b4278() {
        return this.f2333x643c82cf;
    }

    /* renamed from: getChildren */
    public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> m6576xdec49b75() {
        return this.f2346xaa136b2c.m6597xdec49b75();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: getSupportedEffectTargets */
    public java.util.Set<java.lang.Integer> mo4537x748d4719() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: getUseCaseConfigBuilder */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<?, ?, ?> mo4427xa926ae58(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0962xddc056df(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa(interfaceC0692x78a46f62));
    }

    /* renamed from: getVirtualCameraAdapter */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0965x4cf2e33f m6579xeef96b95() {
        return this.f2346xaa136b2c;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onBind */
    public void mo4429xc3979ebc() {
        super.mo4429xc3979ebc();
        this.f2346xaa136b2c.m6595x4cdd595c();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onMergeConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> mo4430xc74923b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<?, ?, ?> builder) {
        this.f2346xaa136b2c.m6601xc8e74f1a(builder.mo2889xc37a2e52());
        return builder.mo4446x111127c3();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onStateAttached */
    public void mo4839x934f69b6() {
        super.mo4839x934f69b6();
        this.f2346xaa136b2c.m6602xcb63fc8c();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onStateDetached */
    public void mo4544xb1757784() {
        super.mo4544xb1757784();
        this.f2346xaa136b2c.m6603xe98a0a5a();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onSuggestedStreamSpecImplementationOptionsUpdated */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b mo4431x6f6af6ae(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        this.f2343xcb6d0310.m5610x2f697c6b(interfaceC0692x78a46f62);
        java.lang.Object[] objArr = {this.f2343xcb6d0310.m5619x59bc66e()};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4844xd8cf6f2f(java.util.Collections.unmodifiableList(arrayList));
        return m4809xfdddfa15().mo5194xaaa148a0().mo5199x9a12cb4a(interfaceC0692x78a46f62).mo5196x59bc66e();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onSuggestedStreamSpecUpdated */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b mo4432x35ddf13c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b2) {
        m4844xd8cf6f2f(m6556xcf3fb517(m4813x72efd496(), m4823xfd6a3ffe(), m4814x27802a65(), abstractC0756x2f9ad77b, abstractC0756x2f9ad77b2));
        m4834x37f5a7af();
        return abstractC0756x2f9ad77b;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onUnbind */
    public void mo4433x5cd81515() {
        super.mo4433x5cd81515();
        m6555xbdd2280f();
        this.f2346xaa136b2c.m6606x3874a75();
    }

    /* renamed from: getSharingNode */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27 m6578xde908bc8() {
        return this.f2345xaec75651;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: getDefaultConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> mo4420xdbd48d2d(boolean z17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 interfaceC0769xb8476771) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo3297x1456a638 = interfaceC0769xb8476771.mo3297x1456a638(this.f2335x7982d976.mo3493xe38cfe6a(), 1);
        if (z17) {
            mo3297x1456a638 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.m5372xcdb2a19(mo3297x1456a638, this.f2335x7982d976.mo3494x1456a638());
        }
        if (mo3297x1456a638 == null) {
            return null;
        }
        return mo4427xa926ae58(mo3297x1456a638).mo4446x111127c3();
    }

    /* renamed from: getSharingInputEdge */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea m6577x91bc12a1() {
        return this.f2344xffb75b8;
    }
}
