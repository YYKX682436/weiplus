package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.FlutterActivityLaunchConfigs */
/* loaded from: classes11.dex */
public class C28542xca5fdcd3 {

    /* renamed from: DART_ENTRYPOINT_META_DATA_KEY */
    static final java.lang.String f70507xa658bbc3 = "io.flutter.Entrypoint";

    /* renamed from: DART_ENTRYPOINT_URI_META_DATA_KEY */
    static final java.lang.String f70508x46413a90 = "io.flutter.EntrypointUri";

    /* renamed from: DEFAULT_BACKGROUND_MODE */
    static final java.lang.String f70509x9d7e8bf6 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque.name();

    /* renamed from: DEFAULT_DART_ENTRYPOINT */
    static final java.lang.String f70510x184e1f00 = "main";

    /* renamed from: DEFAULT_INITIAL_ROUTE */
    static final java.lang.String f70511xf57e7bb0 = "/";

    /* renamed from: EXTRA_BACKGROUND_MODE */
    static final java.lang.String f70512x3a5d47c5 = "background_mode";

    /* renamed from: EXTRA_CACHED_ENGINE_GROUP_ID */
    static final java.lang.String f70513xf9e2e86a = "cached_engine_group_id";

    /* renamed from: EXTRA_CACHED_ENGINE_ID */
    static final java.lang.String f70514x6cf191ca = "cached_engine_id";

    /* renamed from: EXTRA_DART_ENTRYPOINT */
    static final java.lang.String f70515xb52cdacf = "dart_entrypoint";

    /* renamed from: EXTRA_DART_ENTRYPOINT_ARGS */
    static final java.lang.String f70516xd60104d = "dart_entrypoint_args";

    /* renamed from: EXTRA_DESTROY_ENGINE_WITH_ACTIVITY */
    static final java.lang.String f70517x13e3405f = "destroy_engine_with_activity";

    /* renamed from: EXTRA_ENABLE_STATE_RESTORATION */
    static final java.lang.String f70518x2d2d7b63 = "enable_state_restoration";

    /* renamed from: EXTRA_ENABLE_SWITCH_SURFACE */
    static final java.lang.String f70519x27325daf = "enable_switch_surface";

    /* renamed from: EXTRA_INITIAL_ROUTE */
    static final java.lang.String f70520x5727df3f = "route";

    /* renamed from: HANDLE_DEEPLINKING_META_DATA_KEY */
    static final java.lang.String f70521x517499ea = "flutter_deeplinking_enabled";

    /* renamed from: INITIAL_ROUTE_META_DATA_KEY */
    static final java.lang.String f70522xfd37f3f3 = "io.flutter.InitialRoute";

    /* renamed from: NORMAL_THEME_META_DATA_KEY */
    static final java.lang.String f70523xf4bbe5b6 = "io.flutter.embedding.android.NormalTheme";

    /* renamed from: io.flutter.embedding.android.FlutterActivityLaunchConfigs$BackgroundMode */
    /* loaded from: classes11.dex */
    public enum BackgroundMode {
        opaque,
        transparent
    }

    private C28542xca5fdcd3() {
    }

    /* renamed from: deepLinkEnabled */
    public static boolean m137090x3772055b(android.os.Bundle bundle) {
        if (bundle == null || !bundle.containsKey(f70521x517499ea)) {
            return true;
        }
        return bundle.getBoolean(f70521x517499ea);
    }
}
