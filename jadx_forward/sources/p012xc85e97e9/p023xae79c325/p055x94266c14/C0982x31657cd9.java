package p012xc85e97e9.p023xae79c325.p055x94266c14;

/* renamed from: androidx.camera.extensions.ExtensionsManager */
/* loaded from: classes14.dex */
public final class C0982x31657cd9 {

    /* renamed from: EXTENSIONS_LOCK */
    private static final java.lang.Object f2391xcae60a76 = new java.lang.Object();
    private static final java.lang.String TAG = "ExtensionsManager";

    /* renamed from: sDeinitializeFuture */
    private static wa.a f2392x9591e9c7;

    /* renamed from: sExtensionsManager */
    private static p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9 f2393x7eee10c6;

    /* renamed from: sInitializeFuture */
    private static wa.a f2394x32565806;

    /* renamed from: mExtensionsAvailability */
    private final p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability f2395xbb63445c;

    /* renamed from: mExtensionsInfo */
    private final p012xc85e97e9.p023xae79c325.p055x94266c14.C0979xc893e702 f2396xb0024af;

    /* renamed from: androidx.camera.extensions.ExtensionsManager$ExtensionsAvailability */
    /* loaded from: classes14.dex */
    public enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    private C0982x31657cd9(p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability extensionsAvailability, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0474x41300456 interfaceC0474x41300456) {
        this.f2395xbb63445c = extensionsAvailability;
        this.f2396xb0024af = new p012xc85e97e9.p023xae79c325.p055x94266c14.C0979xc893e702(interfaceC0474x41300456);
    }

    /* renamed from: getInstanceAsync */
    public static wa.a m6639x6951cf31(android.content.Context context, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0474x41300456 interfaceC0474x41300456) {
        return m6640x6951cf31(context, interfaceC0474x41300456, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6688xa4c95a15());
    }

    /* renamed from: getOrCreateExtensionsManager */
    public static p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9 m6642x5a83eb44(p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability extensionsAvailability, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0474x41300456 interfaceC0474x41300456) {
        synchronized (f2391xcae60a76) {
            p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9 c0982x31657cd9 = f2393x7eee10c6;
            if (c0982x31657cd9 != null) {
                return c0982x31657cd9;
            }
            p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9 c0982x31657cd92 = new p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9(extensionsAvailability, interfaceC0474x41300456);
            f2393x7eee10c6 = c0982x31657cd92;
            return c0982x31657cd92;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getInstanceAsync$0 */
    public static /* synthetic */ java.lang.Object m6643x4f69fb7a(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d c0990x5da1266d, android.content.Context context, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0474x41300456 interfaceC0474x41300456, final t2.k kVar) {
        try {
            androidx.camera.extensions.impl.InitializerImpl.init(c0990x5da1266d.m6693x462284e(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0784x5d48d231.m5816x6e669035(context), new androidx.camera.extensions.impl.InitializerImpl.OnExtensionsInitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.1
                /* renamed from: onFailure */
                public void m6654xee232ab(int i17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.TAG, "Failed to initialize extensions");
                    t2.k.this.a(p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.m6642x5a83eb44(p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, interfaceC0474x41300456));
                }

                /* renamed from: onSuccess */
                public void m6655xe05b4124() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.TAG, "Successfully initialized extensions");
                    t2.k.this.a(p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.m6642x5a83eb44(p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability.LIBRARY_AVAILABLE, interfaceC0474x41300456));
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
            return "Initialize extensions";
        } catch (java.lang.AbstractMethodError e17) {
            e = e17;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            kVar.a(m6642x5a83eb44(p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, interfaceC0474x41300456));
            return "Initialize extensions";
        } catch (java.lang.NoClassDefFoundError e18) {
            e = e18;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            kVar.a(m6642x5a83eb44(p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, interfaceC0474x41300456));
            return "Initialize extensions";
        } catch (java.lang.NoSuchMethodError e19) {
            e = e19;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            kVar.a(m6642x5a83eb44(p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, interfaceC0474x41300456));
            return "Initialize extensions";
        } catch (java.lang.RuntimeException e27) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to initialize extensions. Something wents wrong when initializing the vendor library. " + e27);
            kVar.a(m6642x5a83eb44(p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, interfaceC0474x41300456));
            return "Initialize extensions";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$shutdown$1 */
    public /* synthetic */ java.lang.Object m6644x5ae94a60(final t2.k kVar) {
        try {
            androidx.camera.extensions.impl.InitializerImpl.deinit(new androidx.camera.extensions.impl.InitializerImpl.OnExtensionsDeinitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.2
                /* renamed from: onFailure */
                public void m6656xee232ab(int i17) {
                    kVar.b(new java.lang.Exception("Failed to deinitialize extensions."));
                }

                /* renamed from: onSuccess */
                public void m6657xe05b4124() {
                    kVar.a(null);
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
            return null;
        } catch (java.lang.NoClassDefFoundError | java.lang.NoSuchMethodError e17) {
            kVar.b(e17);
            return null;
        }
    }

    /* renamed from: getCameraExtensionsControl */
    public p012xc85e97e9.p023xae79c325.p055x94266c14.InterfaceC0972x6d1af5e4 m6645x834e85ce(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658 interfaceC0467x1baf8658) {
        return p012xc85e97e9.p023xae79c325.p055x94266c14.C0973x3643c70f.m6614x3017aa(interfaceC0467x1baf8658);
    }

    /* renamed from: getCameraExtensionsInfo */
    public p012xc85e97e9.p023xae79c325.p055x94266c14.InterfaceC0974x59b7f987 m6646xfbbe81dd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93) {
        return p012xc85e97e9.p023xae79c325.p055x94266c14.C0975xdd4737cc.m6620x3017aa(interfaceC0472xfede5d93);
    }

    /* renamed from: getEstimatedCaptureLatencyRange */
    public android.util.Range<java.lang.Long> m6647x4b4b39df(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244, int i17) {
        if (i17 == 0 || this.f2395xbb63445c != p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return null;
        }
        return this.f2396xb0024af.m6632x4b4b39df(c0475xc311f244, i17, null);
    }

    /* renamed from: getExtensionEnabledCameraSelector */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 m6648x9dd9f9bc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244, int i17) {
        if (i17 == 0) {
            return c0475xc311f244;
        }
        if (this.f2395xbb63445c == p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return this.f2396xb0024af.m6633xe0686b22(c0475xc311f244, i17);
        }
        throw new java.lang.IllegalArgumentException("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
    }

    /* renamed from: getExtensionsAvailability */
    public p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability m6649x5ecace85() {
        return this.f2395xbb63445c;
    }

    /* renamed from: isExtensionAvailable */
    public boolean m6650x5f77814(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244, int i17) {
        if (i17 == 0) {
            return true;
        }
        if (this.f2395xbb63445c != p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.f2396xb0024af.m6634x5f77814(c0475xc311f244, i17);
    }

    /* renamed from: isImageAnalysisSupported */
    public boolean m6651xaee96ee1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 c0475xc311f244, int i17) {
        if (i17 == 0) {
            return true;
        }
        if (this.f2395xbb63445c != p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.f2396xb0024af.m6635xaee96ee1(c0475xc311f244, i17);
    }

    /* renamed from: setVendorExtenderFactory */
    public void m6652x20d58c19(p012xc85e97e9.p023xae79c325.p055x94266c14.InterfaceC0985xb1f8573b interfaceC0985xb1f8573b) {
        this.f2396xb0024af.m6636x20d58c19(interfaceC0985xb1f8573b);
    }

    /* renamed from: shutdown */
    public wa.a m6653xf5e80656() {
        synchronized (f2391xcae60a76) {
            if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6695x127aaed6() == null) {
                f2394x32565806 = null;
                f2393x7eee10c6 = null;
                p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6696xda678146(null);
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
            }
            p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6696xda678146(null);
            wa.a aVar = f2394x32565806;
            if (aVar == null) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
            }
            wa.a aVar2 = f2392x9591e9c7;
            if (aVar2 != null) {
                return aVar2;
            }
            try {
                aVar.get();
                f2394x32565806 = null;
                p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability extensionsAvailability = f2393x7eee10c6.f2395xbb63445c;
                f2393x7eee10c6 = null;
                if (extensionsAvailability == p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability.LIBRARY_AVAILABLE) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0708x43324e90.m5437x5a5b64d();
                    f2392x9591e9c7 = t2.p.a(new t2.m() { // from class: androidx.camera.extensions.ExtensionsManager$$a
                        @Override // t2.m
                        /* renamed from: attachCompleter */
                        public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                            java.lang.Object m6644x5ae94a60;
                            m6644x5ae94a60 = p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.this.m6644x5ae94a60(kVar);
                            return m6644x5ae94a60;
                        }
                    });
                } else {
                    f2392x9591e9c7 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(null);
                }
                return f2392x9591e9c7;
            } catch (java.lang.InterruptedException e17) {
                e = e17;
                wa.a m6011xd75b36b1 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(e);
                f2392x9591e9c7 = m6011xd75b36b1;
                return m6011xd75b36b1;
            } catch (java.util.concurrent.ExecutionException e18) {
                e = e18;
                wa.a m6011xd75b36b12 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(e);
                f2392x9591e9c7 = m6011xd75b36b12;
                return m6011xd75b36b12;
            }
        }
    }

    /* renamed from: getInstanceAsync */
    public static wa.a m6641x6951cf31(android.content.Context context, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0474x41300456 interfaceC0474x41300456, java.lang.String str) {
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d c0990x5da1266d = new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d(str);
        p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6691x6cbfc221(c0990x5da1266d);
        return m6640x6951cf31(context, interfaceC0474x41300456, c0990x5da1266d);
    }

    /* renamed from: getInstanceAsync */
    public static wa.a m6640x6951cf31(final android.content.Context context, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0474x41300456 interfaceC0474x41300456, final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d c0990x5da1266d) {
        synchronized (f2391xcae60a76) {
            wa.a aVar = f2392x9591e9c7;
            if (aVar != null && !aVar.isDone()) {
                throw new java.lang.IllegalStateException("Not yet done deinitializing extensions");
            }
            f2392x9591e9c7 = null;
            if (p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6695x127aaed6() == null) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(m6642x5a83eb44(p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability.NONE, interfaceC0474x41300456));
            }
            p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8 abstractC1001x782db4b8 = p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC1001x782db4b8.f2439xa9797f9b;
            if (!p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.m6689x884246e(abstractC1001x782db4b8) && !p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.AbstractC0991x252767b9.m6699x884246e(abstractC1001x782db4b8)) {
                if (f2394x32565806 == null) {
                    f2394x32565806 = t2.p.a(new t2.m() { // from class: androidx.camera.extensions.ExtensionsManager$$b
                        @Override // t2.m
                        /* renamed from: attachCompleter */
                        public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                            java.lang.Object m6643x4f69fb7a;
                            m6643x4f69fb7a = p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.m6643x4f69fb7a(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0990x5da1266d.this, context, interfaceC0474x41300456, kVar);
                            return m6643x4f69fb7a;
                        }
                    });
                }
                return f2394x32565806;
            }
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(m6642x5a83eb44(p012xc85e97e9.p023xae79c325.p055x94266c14.C0982x31657cd9.ExtensionsAvailability.LIBRARY_AVAILABLE, interfaceC0474x41300456));
        }
    }
}
