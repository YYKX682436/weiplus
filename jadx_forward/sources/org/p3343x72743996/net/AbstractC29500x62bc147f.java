package org.p3343x72743996.net;

/* renamed from: org.chromium.net.CronetEngine */
/* loaded from: classes16.dex */
public abstract class AbstractC29500x62bc147f {

    /* renamed from: ACTIVE_REQUEST_COUNT_UNKNOWN */
    public static final int f73768xf97cc691 = -1;

    /* renamed from: CONNECTION_METRIC_UNKNOWN */
    public static final int f73769x828441c = -1;

    /* renamed from: EFFECTIVE_CONNECTION_TYPE_2G */
    public static final int f73770x2a7eaed1 = 3;

    /* renamed from: EFFECTIVE_CONNECTION_TYPE_3G */
    public static final int f73771x2a7eaef0 = 4;

    /* renamed from: EFFECTIVE_CONNECTION_TYPE_4G */
    public static final int f73772x2a7eaf0f = 5;

    /* renamed from: EFFECTIVE_CONNECTION_TYPE_OFFLINE */
    public static final int f73773x480dec7 = 1;

    /* renamed from: EFFECTIVE_CONNECTION_TYPE_SLOW_2G */
    public static final int f73774xe2db0257 = 2;

    /* renamed from: EFFECTIVE_CONNECTION_TYPE_UNKNOWN */
    public static final int f73775x4fd47d2e = 0;
    private static final java.lang.String TAG = "CronetEngine";

    /* renamed from: UNBIND_NETWORK_HANDLE */
    public static final long f73776x5706b282 = -1;

    /* renamed from: org.chromium.net.CronetEngine$Builder */
    /* loaded from: classes16.dex */
    public static class Builder {

        /* renamed from: HTTP_CACHE_DISABLED */
        public static final int f73777x51a61f50 = 0;

        /* renamed from: HTTP_CACHE_DISK */
        public static final int f73778x6e3d8471 = 3;

        /* renamed from: HTTP_CACHE_DISK_NO_HTTP */
        public static final int f73779xd38fca78 = 2;

        /* renamed from: HTTP_CACHE_IN_MEMORY */
        public static final int f73780x5f49a707 = 1;
        private static final java.lang.String TAG = "CronetEngine.Builder";

        /* renamed from: mBuilderDelegate */
        protected final org.p3343x72743996.net.AbstractC29520xf01d5733 f73781x48329613;

        /* renamed from: org.chromium.net.CronetEngine$Builder$LibraryLoader */
        /* loaded from: classes13.dex */
        public static abstract class LibraryLoader {
            /* renamed from: loadLibrary */
            public abstract void mo153193xeb57c8f5(java.lang.String str);
        }

        public Builder(android.content.Context context) {
            this(m153168x6d53e5a4(context));
        }

        /* renamed from: compareVersions */
        public static int m153167xda6b6aa0(java.lang.String str, java.lang.String str2) {
            if (str == null || str2 == null) {
                throw new java.lang.IllegalArgumentException("The input values cannot be null");
            }
            java.lang.String[] split = str.split("\\.");
            java.lang.String[] split2 = str2.split("\\.");
            for (int i17 = 0; i17 < split.length && i17 < split2.length; i17++) {
                try {
                    int parseInt = java.lang.Integer.parseInt(split[i17]);
                    int parseInt2 = java.lang.Integer.parseInt(split2[i17]);
                    if (parseInt != parseInt2) {
                        return java.lang.Integer.signum(parseInt - parseInt2);
                    }
                } catch (java.lang.NumberFormatException e17) {
                    throw new java.lang.IllegalArgumentException("Unable to convert version segments into integers: " + split[i17] + " & " + split2[i17], e17);
                }
            }
            return java.lang.Integer.signum(split.length - split2.length);
        }

        /* renamed from: createBuilderDelegate */
        private static org.p3343x72743996.net.AbstractC29520xf01d5733 m153168x6d53e5a4(android.content.Context context) {
            org.p3343x72743996.net.AbstractC29502xfcaa84ee abstractC29502xfcaa84ee = m153169xdc06fada(context, new java.util.ArrayList(org.p3343x72743996.net.AbstractC29502xfcaa84ee.m153196x81883677(context))).get(0);
            if (android.util.Log.isLoggable(TAG, 3)) {
                java.lang.String.format("Using '%s' provider for creating CronetEngine.Builder.", abstractC29502xfcaa84ee);
            }
            return abstractC29502xfcaa84ee.mo153198x93ab12ff().f73781x48329613;
        }

        /* renamed from: getEnabledCronetProviders */
        public static java.util.List<org.p3343x72743996.net.AbstractC29502xfcaa84ee> m153169xdc06fada(android.content.Context context, java.util.List<org.p3343x72743996.net.AbstractC29502xfcaa84ee> list) {
            if (list.isEmpty()) {
                throw new java.lang.RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
            }
            java.util.Iterator<org.p3343x72743996.net.AbstractC29502xfcaa84ee> it = list.iterator();
            while (it.hasNext()) {
                if (!it.next().mo153201x7d80d2b7()) {
                    it.remove();
                }
            }
            if (list.isEmpty()) {
                throw new java.lang.RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            java.util.Collections.sort(list, new java.util.Comparator<org.p3343x72743996.net.AbstractC29502xfcaa84ee>() { // from class: org.chromium.net.CronetEngine.Builder.1
                @Override // java.util.Comparator
                public int compare(org.p3343x72743996.net.AbstractC29502xfcaa84ee abstractC29502xfcaa84ee, org.p3343x72743996.net.AbstractC29502xfcaa84ee abstractC29502xfcaa84ee2) {
                    if (org.p3343x72743996.net.AbstractC29502xfcaa84ee.f73787x279d1048.equals(abstractC29502xfcaa84ee.mo153199xfb82e301())) {
                        return 1;
                    }
                    if (org.p3343x72743996.net.AbstractC29502xfcaa84ee.f73787x279d1048.equals(abstractC29502xfcaa84ee2.mo153199xfb82e301())) {
                        return -1;
                    }
                    return -org.p3343x72743996.net.AbstractC29500x62bc147f.Builder.m153167xda6b6aa0(abstractC29502xfcaa84ee.mo153200x52c258a2(), abstractC29502xfcaa84ee2.mo153200x52c258a2());
                }
            });
            return list;
        }

        /* renamed from: getImplementationApiLevel */
        private int m153170xb3502652() {
            try {
                return ((java.lang.Integer) this.f73781x48329613.getClass().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion").getMethod("getApiLevel", new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).intValue();
            } catch (java.lang.Exception unused) {
                return -1;
            }
        }

        /* renamed from: getMaximumApiLevel */
        private int m153171x19a53d94() {
            return org.p3343x72743996.net.C29491xf81f657e.m153095x9bdaa6a9();
        }

        /* renamed from: addPublicKeyPins */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153172x1709deb3(java.lang.String str, java.util.Set<byte[]> set, boolean z17, java.util.Date date) {
            this.f73781x48329613.mo153244x1709deb3(str, set, z17, date);
            return this;
        }

        /* renamed from: addQuicHint */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153173x864dd1a6(java.lang.String str, int i17, int i18) {
            this.f73781x48329613.mo153245x864dd1a6(str, i17, i18);
            return this;
        }

        /* renamed from: build */
        public org.p3343x72743996.net.AbstractC29500x62bc147f mo153174x59bc66e() {
            if (m153170xb3502652() != -1) {
                m153171x19a53d94();
            }
            return this.f73781x48329613.mo153246x59bc66e();
        }

        /* renamed from: enableBrotli */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder m153175x7e503dd5(boolean z17) {
            this.f73781x48329613.mo153247x7e503dd5(z17);
            return this;
        }

        /* renamed from: enableHttp2 */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153176xa991ece7(boolean z17) {
            this.f73781x48329613.mo153248xa991ece7(z17);
            return this;
        }

        /* renamed from: enableHttpCache */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153177x84904997(int i17, long j17) {
            this.f73781x48329613.mo153249x84904997(i17, j17);
            return this;
        }

        /* renamed from: enableNetworkQualityEstimator */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153178xedb7408c(boolean z17) {
            this.f73781x48329613.mo153250xedb7408c(z17);
            return this;
        }

        /* renamed from: enablePublicKeyPinningBypassForLocalTrustAnchors */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153179xa4501926(boolean z17) {
            this.f73781x48329613.mo153251xa4501926(z17);
            return this;
        }

        /* renamed from: enableQuic */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153180x70d74261(boolean z17) {
            this.f73781x48329613.mo153252x70d74261(z17);
            return this;
        }

        @java.lang.Deprecated
        /* renamed from: enableSdch */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153181x70d7ea99(boolean z17) {
            return this;
        }

        /* renamed from: getDefaultUserAgent */
        public java.lang.String m153182x265d382f() {
            return this.f73781x48329613.mo153254x265d382f();
        }

        /* renamed from: setConnectionMigrationOptions */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153184xaf3aff0(org.p3343x72743996.net.C29497x80dc8a0e c29497x80dc8a0e) {
            this.f73781x48329613.mo153257xaf3aff0(c29497x80dc8a0e);
            return this;
        }

        /* renamed from: setDnsOptions */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153186x1632f37(org.p3343x72743996.net.C29503x5bd00555 c29503x5bd00555) {
            this.f73781x48329613.mo153258x1632f37(c29503x5bd00555);
            return this;
        }

        /* renamed from: setLibraryLoader */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153187xd89aab6c(org.p3343x72743996.net.AbstractC29500x62bc147f.Builder.LibraryLoader libraryLoader) {
            this.f73781x48329613.mo153260xd89aab6c(libraryLoader);
            return this;
        }

        /* renamed from: setQuicOptions */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153189xe3a454be(org.p3343x72743996.net.C29548xd6d24260 c29548xd6d24260) {
            this.f73781x48329613.mo153261xe3a454be(c29548xd6d24260);
            return this;
        }

        /* renamed from: setStoragePath */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153190x50e61f7e(java.lang.String str) {
            this.f73781x48329613.mo153262x50e61f7e(str);
            return this;
        }

        /* renamed from: setThreadPriority */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153191x589076d0(int i17) {
            this.f73781x48329613.mo153263x589076d0(i17);
            return this;
        }

        /* renamed from: setUserAgent */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder mo153192x6e513fb8(java.lang.String str) {
            this.f73781x48329613.mo153264x6e513fb8(str);
            return this;
        }

        public Builder(org.p3343x72743996.net.AbstractC29520xf01d5733 abstractC29520xf01d5733) {
            if (abstractC29520xf01d5733 instanceof org.p3343x72743996.net.C29508xee2877c7) {
                this.f73781x48329613 = abstractC29520xf01d5733;
            } else {
                this.f73781x48329613 = new org.p3343x72743996.net.C29508xee2877c7(abstractC29520xf01d5733);
            }
        }

        /* renamed from: setConnectionMigrationOptions */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder m153183xaf3aff0(org.p3343x72743996.net.C29497x80dc8a0e.Builder builder) {
            return mo153184xaf3aff0(builder.m153135x59bc66e());
        }

        /* renamed from: setDnsOptions */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder m153185x1632f37(org.p3343x72743996.net.C29503x5bd00555.Builder builder) {
            return mo153186x1632f37(builder.m153210x59bc66e());
        }

        /* renamed from: setQuicOptions */
        public org.p3343x72743996.net.AbstractC29500x62bc147f.Builder m153188xe3a454be(org.p3343x72743996.net.C29548xd6d24260.Builder builder) {
            return mo153189xe3a454be(builder.m153497x59bc66e());
        }
    }

    /* renamed from: addRequestFinishedListener */
    public void mo153144x41aca14(org.p3343x72743996.net.AbstractC29554xec05c04f.Listener listener) {
    }

    /* renamed from: addRttListener */
    public void mo153145xa73e81e5(org.p3343x72743996.net.AbstractC29537x1d237975 abstractC29537x1d237975) {
    }

    /* renamed from: addThroughputListener */
    public void mo153146xe3ab837f(org.p3343x72743996.net.AbstractC29538x763be9ef abstractC29538x763be9ef) {
    }

    /* renamed from: bindToNetwork */
    public void mo153147x5f2b2376(long j17) {
    }

    /* renamed from: configureNetworkQualityEstimatorForTesting */
    public void mo153148x1bbc11b0(boolean z17, boolean z18, boolean z19) {
    }

    /* renamed from: createURLStreamHandlerFactory */
    public abstract java.net.URLStreamHandlerFactory mo153149x1f54973();

    /* renamed from: getActiveRequestCount */
    public int mo153150x5d448bdc() {
        return -1;
    }

    /* renamed from: getDownstreamThroughputKbps */
    public int mo153151x8561f39c() {
        return -1;
    }

    /* renamed from: getEffectiveConnectionType */
    public int mo153152x4419d089() {
        return 0;
    }

    /* renamed from: getGlobalMetricsDeltas */
    public abstract byte[] mo153153xeeadd445();

    /* renamed from: getHttpRttMs */
    public int mo153154x96e7d5a() {
        return -1;
    }

    /* renamed from: getTransportRttMs */
    public int mo153155x60c7e705() {
        return -1;
    }

    /* renamed from: getVersionString */
    public abstract java.lang.String mo153156xeb8c2353();

    /* renamed from: newBidirectionalStreamBuilder */
    public org.p3343x72743996.net.AbstractC29492x7b0c4683.Builder mo153157xd26a5938(java.lang.String str, org.p3343x72743996.net.AbstractC29492x7b0c4683.Callback callback, java.util.concurrent.Executor executor) {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    /* renamed from: newUrlRequestBuilder */
    public abstract org.p3343x72743996.net.AbstractC29563x9a627640.Builder mo153158x92e7539b(java.lang.String str, org.p3343x72743996.net.AbstractC29563x9a627640.Callback callback, java.util.concurrent.Executor executor);

    /* renamed from: openConnection */
    public abstract java.net.URLConnection mo153159x946eacc8(java.net.URL url);

    /* renamed from: removeRequestFinishedListener */
    public void mo153160x34f41ad1(org.p3343x72743996.net.AbstractC29554xec05c04f.Listener listener) {
    }

    /* renamed from: removeRttListener */
    public void mo153161xfae54622(org.p3343x72743996.net.AbstractC29537x1d237975 abstractC29537x1d237975) {
    }

    /* renamed from: removeThroughputListener */
    public void mo153162x7047f0a2(org.p3343x72743996.net.AbstractC29538x763be9ef abstractC29538x763be9ef) {
    }

    /* renamed from: shutdown */
    public abstract void mo153163xf5e80656();

    /* renamed from: startNetLogToDisk */
    public void mo153164xdb787381(java.lang.String str, boolean z17, int i17) {
    }

    /* renamed from: startNetLogToFile */
    public abstract void mo153165xdb795b60(java.lang.String str, boolean z17);

    /* renamed from: stopNetLog */
    public abstract void mo153166xa63bab09();
}
