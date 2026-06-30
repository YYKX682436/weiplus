package androidx.camera.extensions;

/* loaded from: classes14.dex */
public final class ExtensionsManager {
    private static final java.lang.Object EXTENSIONS_LOCK = new java.lang.Object();
    private static final java.lang.String TAG = "ExtensionsManager";
    private static wa.a sDeinitializeFuture;
    private static androidx.camera.extensions.ExtensionsManager sExtensionsManager;
    private static wa.a sInitializeFuture;
    private final androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability mExtensionsAvailability;
    private final androidx.camera.extensions.ExtensionsInfo mExtensionsInfo;

    /* loaded from: classes14.dex */
    public enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    private ExtensionsManager(androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability extensionsAvailability, androidx.camera.core.CameraProvider cameraProvider) {
        this.mExtensionsAvailability = extensionsAvailability;
        this.mExtensionsInfo = new androidx.camera.extensions.ExtensionsInfo(cameraProvider);
    }

    public static wa.a getInstanceAsync(android.content.Context context, androidx.camera.core.CameraProvider cameraProvider) {
        return getInstanceAsync(context, cameraProvider, androidx.camera.extensions.internal.ClientVersion.getCurrentVersion());
    }

    public static androidx.camera.extensions.ExtensionsManager getOrCreateExtensionsManager(androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability extensionsAvailability, androidx.camera.core.CameraProvider cameraProvider) {
        synchronized (EXTENSIONS_LOCK) {
            androidx.camera.extensions.ExtensionsManager extensionsManager = sExtensionsManager;
            if (extensionsManager != null) {
                return extensionsManager;
            }
            androidx.camera.extensions.ExtensionsManager extensionsManager2 = new androidx.camera.extensions.ExtensionsManager(extensionsAvailability, cameraProvider);
            sExtensionsManager = extensionsManager2;
            return extensionsManager2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object lambda$getInstanceAsync$0(androidx.camera.extensions.internal.ClientVersion clientVersion, android.content.Context context, final androidx.camera.core.CameraProvider cameraProvider, final t2.k kVar) {
        try {
            androidx.camera.extensions.impl.InitializerImpl.init(clientVersion.toVersionString(), androidx.camera.core.impl.utils.ContextUtil.getApplicationContext(context), new androidx.camera.extensions.impl.InitializerImpl.OnExtensionsInitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.1
                public void onFailure(int i17) {
                    androidx.camera.core.Logger.e(androidx.camera.extensions.ExtensionsManager.TAG, "Failed to initialize extensions");
                    t2.k.this.a(androidx.camera.extensions.ExtensionsManager.getOrCreateExtensionsManager(androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cameraProvider));
                }

                public void onSuccess() {
                    androidx.camera.core.Logger.d(androidx.camera.extensions.ExtensionsManager.TAG, "Successfully initialized extensions");
                    t2.k.this.a(androidx.camera.extensions.ExtensionsManager.getOrCreateExtensionsManager(androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_AVAILABLE, cameraProvider));
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            return "Initialize extensions";
        } catch (java.lang.AbstractMethodError e17) {
            e = e17;
            androidx.camera.core.Logger.e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            kVar.a(getOrCreateExtensionsManager(androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider));
            return "Initialize extensions";
        } catch (java.lang.NoClassDefFoundError e18) {
            e = e18;
            androidx.camera.core.Logger.e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            kVar.a(getOrCreateExtensionsManager(androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider));
            return "Initialize extensions";
        } catch (java.lang.NoSuchMethodError e19) {
            e = e19;
            androidx.camera.core.Logger.e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            kVar.a(getOrCreateExtensionsManager(androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider));
            return "Initialize extensions";
        } catch (java.lang.RuntimeException e27) {
            androidx.camera.core.Logger.e(TAG, "Failed to initialize extensions. Something wents wrong when initializing the vendor library. " + e27);
            kVar.a(getOrCreateExtensionsManager(androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cameraProvider));
            return "Initialize extensions";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$shutdown$1(final t2.k kVar) {
        try {
            androidx.camera.extensions.impl.InitializerImpl.deinit(new androidx.camera.extensions.impl.InitializerImpl.OnExtensionsDeinitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.2
                public void onFailure(int i17) {
                    kVar.b(new java.lang.Exception("Failed to deinitialize extensions."));
                }

                public void onSuccess() {
                    kVar.a(null);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            return null;
        } catch (java.lang.NoClassDefFoundError | java.lang.NoSuchMethodError e17) {
            kVar.b(e17);
            return null;
        }
    }

    public androidx.camera.extensions.CameraExtensionsControl getCameraExtensionsControl(androidx.camera.core.CameraControl cameraControl) {
        return androidx.camera.extensions.CameraExtensionsControls.from(cameraControl);
    }

    public androidx.camera.extensions.CameraExtensionsInfo getCameraExtensionsInfo(androidx.camera.core.CameraInfo cameraInfo) {
        return androidx.camera.extensions.CameraExtensionsInfos.from(cameraInfo);
    }

    public android.util.Range<java.lang.Long> getEstimatedCaptureLatencyRange(androidx.camera.core.CameraSelector cameraSelector, int i17) {
        if (i17 == 0 || this.mExtensionsAvailability != androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return null;
        }
        return this.mExtensionsInfo.getEstimatedCaptureLatencyRange(cameraSelector, i17, null);
    }

    public androidx.camera.core.CameraSelector getExtensionEnabledCameraSelector(androidx.camera.core.CameraSelector cameraSelector, int i17) {
        if (i17 == 0) {
            return cameraSelector;
        }
        if (this.mExtensionsAvailability == androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return this.mExtensionsInfo.getExtensionCameraSelectorAndInjectCameraConfig(cameraSelector, i17);
        }
        throw new java.lang.IllegalArgumentException("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
    }

    public androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability getExtensionsAvailability() {
        return this.mExtensionsAvailability;
    }

    public boolean isExtensionAvailable(androidx.camera.core.CameraSelector cameraSelector, int i17) {
        if (i17 == 0) {
            return true;
        }
        if (this.mExtensionsAvailability != androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.mExtensionsInfo.isExtensionAvailable(cameraSelector, i17);
    }

    public boolean isImageAnalysisSupported(androidx.camera.core.CameraSelector cameraSelector, int i17) {
        if (i17 == 0) {
            return true;
        }
        if (this.mExtensionsAvailability != androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.mExtensionsInfo.isImageAnalysisSupported(cameraSelector, i17);
    }

    public void setVendorExtenderFactory(androidx.camera.extensions.VendorExtenderFactory vendorExtenderFactory) {
        this.mExtensionsInfo.setVendorExtenderFactory(vendorExtenderFactory);
    }

    public wa.a shutdown() {
        synchronized (EXTENSIONS_LOCK) {
            if (androidx.camera.extensions.internal.ExtensionVersion.getRuntimeVersion() == null) {
                sInitializeFuture = null;
                sExtensionsManager = null;
                androidx.camera.extensions.internal.ExtensionVersion.injectInstance(null);
                return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
            }
            androidx.camera.extensions.internal.ExtensionVersion.injectInstance(null);
            wa.a aVar = sInitializeFuture;
            if (aVar == null) {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
            }
            wa.a aVar2 = sDeinitializeFuture;
            if (aVar2 != null) {
                return aVar2;
            }
            try {
                aVar.get();
                sInitializeFuture = null;
                androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability extensionsAvailability = sExtensionsManager.mExtensionsAvailability;
                sExtensionsManager = null;
                if (extensionsAvailability == androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_AVAILABLE) {
                    androidx.camera.core.impl.ExtendedCameraConfigProviderStore.clear();
                    sDeinitializeFuture = t2.p.a(new t2.m() { // from class: androidx.camera.extensions.ExtensionsManager$$a
                        @Override // t2.m
                        public final java.lang.Object attachCompleter(t2.k kVar) {
                            java.lang.Object lambda$shutdown$1;
                            lambda$shutdown$1 = androidx.camera.extensions.ExtensionsManager.this.lambda$shutdown$1(kVar);
                            return lambda$shutdown$1;
                        }
                    });
                } else {
                    sDeinitializeFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
                }
                return sDeinitializeFuture;
            } catch (java.lang.InterruptedException e17) {
                e = e17;
                wa.a immediateFailedFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(e);
                sDeinitializeFuture = immediateFailedFuture;
                return immediateFailedFuture;
            } catch (java.util.concurrent.ExecutionException e18) {
                e = e18;
                wa.a immediateFailedFuture2 = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(e);
                sDeinitializeFuture = immediateFailedFuture2;
                return immediateFailedFuture2;
            }
        }
    }

    public static wa.a getInstanceAsync(android.content.Context context, androidx.camera.core.CameraProvider cameraProvider, java.lang.String str) {
        androidx.camera.extensions.internal.ClientVersion clientVersion = new androidx.camera.extensions.internal.ClientVersion(str);
        androidx.camera.extensions.internal.ClientVersion.setCurrentVersion(clientVersion);
        return getInstanceAsync(context, cameraProvider, clientVersion);
    }

    public static wa.a getInstanceAsync(final android.content.Context context, final androidx.camera.core.CameraProvider cameraProvider, final androidx.camera.extensions.internal.ClientVersion clientVersion) {
        synchronized (EXTENSIONS_LOCK) {
            wa.a aVar = sDeinitializeFuture;
            if (aVar != null && !aVar.isDone()) {
                throw new java.lang.IllegalStateException("Not yet done deinitializing extensions");
            }
            sDeinitializeFuture = null;
            if (androidx.camera.extensions.internal.ExtensionVersion.getRuntimeVersion() == null) {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(getOrCreateExtensionsManager(androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.NONE, cameraProvider));
            }
            androidx.camera.extensions.internal.Version version = androidx.camera.extensions.internal.Version.VERSION_1_0;
            if (!androidx.camera.extensions.internal.ClientVersion.isMaximumCompatibleVersion(version) && !androidx.camera.extensions.internal.ExtensionVersion.isMaximumCompatibleVersion(version)) {
                if (sInitializeFuture == null) {
                    sInitializeFuture = t2.p.a(new t2.m() { // from class: androidx.camera.extensions.ExtensionsManager$$b
                        @Override // t2.m
                        public final java.lang.Object attachCompleter(t2.k kVar) {
                            java.lang.Object lambda$getInstanceAsync$0;
                            lambda$getInstanceAsync$0 = androidx.camera.extensions.ExtensionsManager.lambda$getInstanceAsync$0(androidx.camera.extensions.internal.ClientVersion.this, context, cameraProvider, kVar);
                            return lambda$getInstanceAsync$0;
                        }
                    });
                }
                return sInitializeFuture;
            }
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(getOrCreateExtensionsManager(androidx.camera.extensions.ExtensionsManager.ExtensionsAvailability.LIBRARY_AVAILABLE, cameraProvider));
        }
    }
}
