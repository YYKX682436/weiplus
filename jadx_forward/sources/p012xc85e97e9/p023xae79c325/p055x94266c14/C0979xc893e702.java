package p012xc85e97e9.p023xae79c325.p055x94266c14;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.extensions.ExtensionsInfo */
/* loaded from: classes14.dex */
public final class C0979xc893e702 {

    /* renamed from: EXTENDED_CAMERA_CONFIG_PROVIDER_ID_PREFIX */
    private static final java.lang.String f2388x6de2cf31 = ":camera:camera-extensions-";

    /* renamed from: mCameraProvider */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0474x41300456 f2389x839c4203;

    /* renamed from: mVendorExtenderFactory */
    private p012xc85e97e9.p023xae79c325.p055x94266c14.InterfaceC0985xb1f8573b f2390xf8e8ccee = new p012xc85e97e9.p023xae79c325.p055x94266c14.C0980x73902d9f();

    /* renamed from: androidx.camera.extensions.ExtensionsInfo$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public class AnonymousClass1 implements p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf {
    }

    public C0979xc893e702(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0474x41300456 interfaceC0474x41300456) {
        this.f2389x839c4203 = interfaceC0474x41300456;
    }

    /* renamed from: getExtendedCameraConfigProviderId */
    private static java.lang.String m6625x7465c2a2(int i17) {
        if (i17 == 0) {
            return ":camera:camera-extensions-EXTENSION_MODE_NONE";
        }
        if (i17 == 1) {
            return ":camera:camera-extensions-EXTENSION_MODE_BOKEH";
        }
        if (i17 == 2) {
            return ":camera:camera-extensions-EXTENSION_MODE_HDR";
        }
        if (i17 == 3) {
            return ":camera:camera-extensions-EXTENSION_MODE_NIGHT";
        }
        if (i17 == 4) {
            return ":camera:camera-extensions-EXTENSION_MODE_FACE_RETOUCH";
        }
        if (i17 == 5) {
            return ":camera:camera-extensions-EXTENSION_MODE_AUTO";
        }
        throw new java.lang.IllegalArgumentException("Invalid extension mode!");
    }

    /* renamed from: getFilter */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d m6626x191fee6e(int i17) {
        return new p012xc85e97e9.p023xae79c325.p055x94266c14.C0976xb72e24bc(m6625x7465c2a2(i17), this.f2390xf8e8ccee.mo6637xec8bb2cb(i17));
    }

    /* renamed from: getVendorExtender */
    public static p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf m6627x25d27ba5(int i17) {
        return m6629x36c5fd1b() ? new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0986x81ffab91(i17) : new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0988xfdb22e5d(i17);
    }

    /* renamed from: injectExtensionCameraConfig */
    private void m6628xce6a8795(final int i17) {
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9 m5439xaf65a0fc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9.m5439xaf65a0fc(m6625x7465c2a2(i17));
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0708x43324e90.m5438xf6475849(m5439xaf65a0fc) == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0666x5d1a69f8.f1553x3f08d2d) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0708x43324e90.m5436xe4772b43(m5439xaf65a0fc, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0666x5d1a69f8() { // from class: androidx.camera.extensions.ExtensionsInfo$$b
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0666x5d1a69f8
                /* renamed from: getConfig */
                public final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 mo5274x1456a638(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93, android.content.Context context) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 m6630x4b24dac5;
                    m6630x4b24dac5 = p012xc85e97e9.p023xae79c325.p055x94266c14.C0979xc893e702.this.m6630x4b24dac5(i17, m5439xaf65a0fc, interfaceC0472xfede5d93, context);
                    return m6630x4b24dac5;
                }
            });
        }
    }

    /* renamed from: isAdvancedExtenderSupported */
    private static boolean m6629x36c5fd1b() {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2440xa9797f9c;
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6689x884246e(abstractC1001x782db4b8) || p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6699x884246e(abstractC1001x782db4b8)) {
            return false;
        }
        return p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6697x36c5fd1b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$injectExtensionCameraConfig$1 */
    public /* synthetic */ p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 m6630x4b24dac5(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9 abstractC0711x165a88c9, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93, android.content.Context context) {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf mo6637xec8bb2cb = this.f2390xf8e8ccee.mo6637xec8bb2cb(i17);
        mo6637xec8bb2cb.mo6671x316510(interfaceC0472xfede5d93);
        p012xc85e97e9.p023xae79c325.p055x94266c14.C0978xe90ac096.Builder mo5269x583cbd55 = new p012xc85e97e9.p023xae79c325.p055x94266c14.C0978xe90ac096.Builder().m6624xb361b540(i17).mo5270xd4a11ed3((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771) new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0992x2b5d8da5(mo6637xec8bb2cb)).mo5266xd6aa9de9(abstractC0711x165a88c9).mo5271xc3162e2d(true).mo5267xd84ee2a7(mo6637xec8bb2cb.mo6676x1222f0fa()).mo5265xce9e6af6(mo6637xec8bb2cb.mo6672x9df7b749()).mo5269x583cbd55(1);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc mo6664xed7bdfb8 = mo6637xec8bb2cb.mo6664xed7bdfb8(context);
        if (mo6664xed7bdfb8 != null) {
            mo5269x583cbd55.mo5268x94306f1e(mo6664xed7bdfb8);
        }
        return mo5269x583cbd55.m6623x59bc66e();
    }

    /* renamed from: getEstimatedCaptureLatencyRange */
    public android.util.Range<java.lang.Long> m6632x4b4b39df(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244, int i17, android.util.Size size) {
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> m4280xb408cb78 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder.m4285xb67b25a9(c0475xc311f244).m4286x2d4fae3e(m6626x191fee6e(i17)).m4287x59bc66e().m4280xb408cb78(this.f2389x839c4203.mo4275x1781f4d());
        if (m4280xb408cb78.isEmpty()) {
            return null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93 = m4280xb408cb78.get(0);
        if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6695x127aaed6().compareTo(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2441xa9797f9d) < 0) {
            return null;
        }
        try {
            p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf mo6637xec8bb2cb = this.f2390xf8e8ccee.mo6637xec8bb2cb(i17);
            mo6637xec8bb2cb.mo6671x316510(interfaceC0472xfede5d93);
            return mo6637xec8bb2cb.mo6665x4b4b39df(size);
        } catch (java.lang.NoSuchMethodError unused) {
            return null;
        }
    }

    /* renamed from: getExtensionCameraSelectorAndInjectCameraConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 m6633xe0686b22(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244, int i17) {
        if (!m6634x5f77814(c0475xc311f244, i17)) {
            throw new java.lang.IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
        }
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d> it = c0475xc311f244.m4281xf0ba0def().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof p012xc85e97e9.p023xae79c325.p055x94266c14.C0976xb72e24bc) {
                throw new java.lang.IllegalArgumentException("An extension is already applied to the base CameraSelector.");
            }
        }
        m6628xce6a8795(i17);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder m4285xb67b25a9 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder.m4285xb67b25a9(c0475xc311f244);
        m4285xb67b25a9.m4286x2d4fae3e(m6626x191fee6e(i17));
        return m4285xb67b25a9.m4287x59bc66e();
    }

    /* renamed from: isExtensionAvailable */
    public boolean m6634x5f77814(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244, int i17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder.m4285xb67b25a9(c0475xc311f244).m4286x2d4fae3e(m6626x191fee6e(i17));
        return !r1.m4287x59bc66e().m4280xb408cb78(this.f2389x839c4203.mo4275x1781f4d()).isEmpty();
    }

    /* renamed from: isImageAnalysisSupported */
    public boolean m6635xaee96ee1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244, int i17) {
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> m4280xb408cb78 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder.m4285xb67b25a9(c0475xc311f244).m4286x2d4fae3e(m6626x191fee6e(i17)).m4287x59bc66e().m4280xb408cb78(this.f2389x839c4203.mo4275x1781f4d());
        if (m4280xb408cb78.isEmpty()) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93 = m4280xb408cb78.get(0);
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf mo6637xec8bb2cb = this.f2390xf8e8ccee.mo6637xec8bb2cb(i17);
        mo6637xec8bb2cb.mo6671x316510(interfaceC0472xfede5d93);
        android.util.Size[] mo6670x360a99a9 = mo6637xec8bb2cb.mo6670x360a99a9();
        return mo6670x360a99a9 != null && mo6670x360a99a9.length > 0;
    }

    /* renamed from: setVendorExtenderFactory */
    public void m6636x20d58c19(p012xc85e97e9.p023xae79c325.p055x94266c14.InterfaceC0985xb1f8573b interfaceC0985xb1f8573b) {
        this.f2390xf8e8ccee = interfaceC0985xb1f8573b;
    }
}
