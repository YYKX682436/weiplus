package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.SettingsChannel */
/* loaded from: classes15.dex */
public class C28670xb8d1b340 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f71479x7118e671 = false;

    /* renamed from: ALWAYS_USE_24_HOUR_FORMAT */
    private static final java.lang.String f71480x68bd3e3d = "alwaysUse24HourFormat";

    /* renamed from: BRIEFLY_SHOW_PASSWORD */
    private static final java.lang.String f71481x191332c5 = "brieflyShowPassword";

    /* renamed from: CHANNEL_NAME */
    public static final java.lang.String f71482x87093867 = "flutter/settings";

    /* renamed from: CONFIGURATION_ID */
    private static final java.lang.String f71483x2175a924 = "configurationId";

    /* renamed from: CONFIGURATION_QUEUE */
    private static final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.ConfigurationQueue f71484xbbc79848 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.ConfigurationQueue();

    /* renamed from: NATIVE_SPELL_CHECK_SERVICE_DEFINED */
    private static final java.lang.String f71485x973eccc9 = "nativeSpellCheckServiceDefined";

    /* renamed from: PLATFORM_BRIGHTNESS */
    private static final java.lang.String f71486x9fcd5f9d = "platformBrightness";
    private static final java.lang.String TAG = "SettingsChannel";

    /* renamed from: TEXT_SCALE_FACTOR */
    private static final java.lang.String f71487x6491d3d6 = "textScaleFactor";

    /* renamed from: channel */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa<java.lang.Object> f71488x2c0b7d03;

    /* renamed from: io.flutter.embedding.engine.systemchannels.SettingsChannel$ConfigurationQueue */
    /* loaded from: classes15.dex */
    public static class ConfigurationQueue {

        /* renamed from: currentConfiguration */
        private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.ConfigurationQueue.SentConfiguration f71489x9d3653fd;

        /* renamed from: previousEnqueuedConfiguration */
        private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.ConfigurationQueue.SentConfiguration f71490x61c6ac43;

        /* renamed from: sentQueue */
        private final java.util.concurrent.ConcurrentLinkedQueue<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.ConfigurationQueue.SentConfiguration> f71491x1c205859 = new java.util.concurrent.ConcurrentLinkedQueue<>();

        /* renamed from: io.flutter.embedding.engine.systemchannels.SettingsChannel$ConfigurationQueue$SentConfiguration */
        /* loaded from: classes15.dex */
        public static class SentConfiguration {

            /* renamed from: nextConfigGeneration */
            private static int f71494xad9e70d = Integer.MIN_VALUE;

            /* renamed from: displayMetrics */
            private final android.util.DisplayMetrics f71495x99c541a1;

            /* renamed from: generationNumber */
            public final int f71496x6a93e81;

            public SentConfiguration(android.util.DisplayMetrics displayMetrics) {
                int i17 = f71494xad9e70d;
                f71494xad9e70d = i17 + 1;
                this.f71496x6a93e81 = i17;
                this.f71495x99c541a1 = displayMetrics;
            }
        }

        /* renamed from: enqueueConfiguration */
        public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply m138333x333e23ce(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.ConfigurationQueue.SentConfiguration sentConfiguration) {
            this.f71491x1c205859.add(sentConfiguration);
            final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.ConfigurationQueue.SentConfiguration sentConfiguration2 = this.f71490x61c6ac43;
            this.f71490x61c6ac43 = sentConfiguration;
            if (sentConfiguration2 == null) {
                return null;
            }
            return new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.1
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                /* renamed from: reply */
                public void mo84787x67612ea(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.ConfigurationQueue.this.f71491x1c205859.remove(sentConfiguration2);
                    if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.ConfigurationQueue.this.f71491x1c205859.isEmpty()) {
                        return;
                    }
                    io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.TAG, "The queue becomes empty after removing config generation " + java.lang.String.valueOf(sentConfiguration2.f71496x6a93e81));
                }
            };
        }

        /* renamed from: getConfiguration */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.ConfigurationQueue.SentConfiguration m138334x30933140(int i17) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.ConfigurationQueue.SentConfiguration sentConfiguration;
            if (this.f71489x9d3653fd == null) {
                this.f71489x9d3653fd = this.f71491x1c205859.poll();
            }
            while (true) {
                sentConfiguration = this.f71489x9d3653fd;
                if (sentConfiguration == null || sentConfiguration.f71496x6a93e81 >= i17) {
                    break;
                }
                this.f71489x9d3653fd = this.f71491x1c205859.poll();
            }
            if (sentConfiguration == null) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.TAG, "Cannot find config with generation: " + java.lang.String.valueOf(i17) + ", after exhausting the queue.");
                return null;
            }
            if (sentConfiguration.f71496x6a93e81 == i17) {
                return sentConfiguration;
            }
            io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.TAG, "Cannot find config with generation: " + java.lang.String.valueOf(i17) + ", the oldest config is now: " + java.lang.String.valueOf(this.f71489x9d3653fd.f71496x6a93e81));
            return null;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder */
    /* loaded from: classes15.dex */
    public static class MessageBuilder {

        /* renamed from: channel */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa<java.lang.Object> f71497x2c0b7d03;

        /* renamed from: displayMetrics */
        private android.util.DisplayMetrics f71498x99c541a1;

        /* renamed from: message */
        private java.util.Map<java.lang.String, java.lang.Object> f71499x38eb0007 = new java.util.HashMap();

        public MessageBuilder(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa<java.lang.Object> c28677x2598ceaa) {
            this.f71497x2c0b7d03 = c28677x2598ceaa;
        }

        /* renamed from: send */
        public void m138336x35cf88() {
            io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.TAG, "Sending message: \ntextScaleFactor: " + this.f71499x38eb0007.get(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.f71487x6491d3d6) + "\nalwaysUse24HourFormat: " + this.f71499x38eb0007.get(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.f71480x68bd3e3d) + "\nplatformBrightness: " + this.f71499x38eb0007.get(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.f71486x9fcd5f9d));
            android.util.DisplayMetrics displayMetrics = this.f71498x99c541a1;
            if (!io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.m138330xabdae9ad() || displayMetrics == null) {
                this.f71497x2c0b7d03.m138402x35cf88(this.f71499x38eb0007);
                return;
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.ConfigurationQueue.SentConfiguration sentConfiguration = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.ConfigurationQueue.SentConfiguration(displayMetrics);
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> m138333x333e23ce = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.f71484xbbc79848.m138333x333e23ce(sentConfiguration);
            this.f71499x38eb0007.put(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.f71483x2175a924, java.lang.Integer.valueOf(sentConfiguration.f71496x6a93e81));
            this.f71497x2c0b7d03.m138403x35cf88(this.f71499x38eb0007, m138333x333e23ce);
        }

        /* renamed from: setBrieflyShowPassword */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.MessageBuilder m138337xf155ca1d(boolean z17) {
            this.f71499x38eb0007.put(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.f71481x191332c5, java.lang.Boolean.valueOf(z17));
            return this;
        }

        /* renamed from: setDisplayMetrics */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.MessageBuilder m138338x505376a3(android.util.DisplayMetrics displayMetrics) {
            this.f71498x99c541a1 = displayMetrics;
            return this;
        }

        /* renamed from: setNativeSpellCheckServiceDefined */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.MessageBuilder m138339x732162ad(boolean z17) {
            this.f71499x38eb0007.put(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.f71485x973eccc9, java.lang.Boolean.valueOf(z17));
            return this;
        }

        /* renamed from: setPlatformBrightness */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.MessageBuilder m138340xbad3a126(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.PlatformBrightness platformBrightness) {
            this.f71499x38eb0007.put(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.f71486x9fcd5f9d, platformBrightness.f71503x337a8b);
            return this;
        }

        /* renamed from: setTextScaleFactor */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.MessageBuilder m138341x54570f0a(float f17) {
            this.f71499x38eb0007.put(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.f71487x6491d3d6, java.lang.Float.valueOf(f17));
            return this;
        }

        /* renamed from: setUse24HourFormat */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.MessageBuilder m138342x827522(boolean z17) {
            this.f71499x38eb0007.put(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.f71480x68bd3e3d, java.lang.Boolean.valueOf(z17));
            return this;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness */
    /* loaded from: classes11.dex */
    public enum PlatformBrightness {
        light("light"),
        dark("dark");


        /* renamed from: name */
        public java.lang.String f71503x337a8b;

        PlatformBrightness(java.lang.String str) {
            this.f71503x337a8b = str;
        }
    }

    public C28670xb8d1b340(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        this.f71488x2c0b7d03 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa<>(c28604xeb2eb192, f71482x87093867, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28683x71412957.f71607x4fbc8495);
    }

    /* renamed from: getPastDisplayMetrics */
    public static android.util.DisplayMetrics m138329xd8b4c49(int i17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.ConfigurationQueue.SentConfiguration m138334x30933140 = f71484xbbc79848.m138334x30933140(i17);
        if (m138334x30933140 == null) {
            return null;
        }
        return m138334x30933140.f71495x99c541a1;
    }

    /* renamed from: hasNonlinearTextScalingSupport */
    public static boolean m138330xabdae9ad() {
        return android.os.Build.VERSION.SDK_INT >= 34;
    }

    /* renamed from: startMessage */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.MessageBuilder m138331x30e78145() {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28670xb8d1b340.MessageBuilder(this.f71488x2c0b7d03);
    }
}
