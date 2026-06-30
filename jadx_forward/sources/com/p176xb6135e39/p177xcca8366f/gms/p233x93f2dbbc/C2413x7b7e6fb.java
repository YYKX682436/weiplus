package com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.measurement.AppMeasurement */
/* loaded from: classes16.dex */
public class C2413x7b7e6fb {

    /* renamed from: CRASH_ORIGIN */
    public static final java.lang.String f7335x31ce7ede = "crash";

    /* renamed from: FCM_ORIGIN */
    public static final java.lang.String f7336x59d1b15 = "fcm";

    /* renamed from: zzacw */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 f7337x6f02155;

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty */
    /* loaded from: classes16.dex */
    public static class ConditionalUserProperty {

        /* renamed from: mActive */
        public boolean f7338xfa9ba5d3;

        /* renamed from: mAppId */
        public java.lang.String f7339xbdc8caaf;

        /* renamed from: mCreationTimestamp */
        public long f7340x86d0ac0a;

        /* renamed from: mExpiredEventName */
        public java.lang.String f7341xf999012d;

        /* renamed from: mExpiredEventParams */
        public android.os.Bundle f7342xfac95fa8;

        /* renamed from: mName */
        public java.lang.String f7343x624f098;

        /* renamed from: mOrigin */
        public java.lang.String f7344x134dd5f3;

        /* renamed from: mTimeToLive */
        public long f7345xcd7a781;

        /* renamed from: mTimedOutEventName */
        public java.lang.String f7346xcfb71481;

        /* renamed from: mTimedOutEventParams */
        public android.os.Bundle f7347xc1afedfc;

        /* renamed from: mTriggerEventName */
        public java.lang.String f7348x134c07fa;

        /* renamed from: mTriggerTimeout */
        public long f7349xc5263a56;

        /* renamed from: mTriggeredEventName */
        public java.lang.String f7350xb46d1cfb;

        /* renamed from: mTriggeredEventParams */
        public android.os.Bundle f7351x5105bff6;

        /* renamed from: mTriggeredTimestamp */
        public long f7352xb5d9c1cc;

        /* renamed from: mValue */
        public java.lang.Object f7353xbee9dd04;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty conditionalUserProperty) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(conditionalUserProperty);
            this.f7339xbdc8caaf = conditionalUserProperty.f7339xbdc8caaf;
            this.f7344x134dd5f3 = conditionalUserProperty.f7344x134dd5f3;
            this.f7340x86d0ac0a = conditionalUserProperty.f7340x86d0ac0a;
            this.f7343x624f098 = conditionalUserProperty.f7343x624f098;
            java.lang.Object obj = conditionalUserProperty.f7353xbee9dd04;
            if (obj != null) {
                java.lang.Object zzf = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzf(obj);
                this.f7353xbee9dd04 = zzf;
                if (zzf == null) {
                    this.f7353xbee9dd04 = conditionalUserProperty.f7353xbee9dd04;
                }
            }
            this.f7338xfa9ba5d3 = conditionalUserProperty.f7338xfa9ba5d3;
            this.f7348x134c07fa = conditionalUserProperty.f7348x134c07fa;
            this.f7349xc5263a56 = conditionalUserProperty.f7349xc5263a56;
            this.f7346xcfb71481 = conditionalUserProperty.f7346xcfb71481;
            if (conditionalUserProperty.f7347xc1afedfc != null) {
                this.f7347xc1afedfc = new android.os.Bundle(conditionalUserProperty.f7347xc1afedfc);
            }
            this.f7350xb46d1cfb = conditionalUserProperty.f7350xb46d1cfb;
            if (conditionalUserProperty.f7351x5105bff6 != null) {
                this.f7351x5105bff6 = new android.os.Bundle(conditionalUserProperty.f7351x5105bff6);
            }
            this.f7352xb5d9c1cc = conditionalUserProperty.f7352xb5d9c1cc;
            this.f7345xcd7a781 = conditionalUserProperty.f7345xcd7a781;
            this.f7341xf999012d = conditionalUserProperty.f7341xf999012d;
            if (conditionalUserProperty.f7342xfac95fa8 != null) {
                this.f7342xfac95fa8 = new android.os.Bundle(conditionalUserProperty.f7342xfac95fa8);
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$Event */
    /* loaded from: classes16.dex */
    public static final class Event extends ya.a {

        /* renamed from: zzacx */
        public static final java.lang.String[] f7356x6f02156 = {"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "ad_reward", "screen_view", "ga_extra_parameter"};

        /* renamed from: APP_EXCEPTION */
        public static final java.lang.String f7355x23e90b71 = "_ae";

        /* renamed from: AD_REWARD */
        public static final java.lang.String f7354x6e825acb = "_ar";

        /* renamed from: zzacy */
        public static final java.lang.String[] f7357x6f02157 = {"_cd", f7355x23e90b71, "_ui", "_ug", "_in", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", f7354x6e825acb, "_vs", "_ep"};

        private Event() {
        }

        /* renamed from: zzak */
        public static java.lang.String m19499x394b6a(java.lang.String str) {
            return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zza(str, f7356x6f02156, f7357x6f02157);
        }
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$EventInterceptor */
    /* loaded from: classes16.dex */
    public interface EventInterceptor {
        /* renamed from: interceptEvent */
        void m19500x64af8af8(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j17);
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$OnEventListener */
    /* loaded from: classes16.dex */
    public interface OnEventListener {
        /* renamed from: onEvent */
        void m19501xaf8c47fb(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j17);
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$Param */
    /* loaded from: classes16.dex */
    public static final class Param extends ya.b {

        /* renamed from: FATAL */
        public static final java.lang.String f7358x3f93ce4 = "fatal";

        /* renamed from: TIMESTAMP */
        public static final java.lang.String f7359xa96138f6 = "timestamp";

        /* renamed from: TYPE */
        public static final java.lang.String f7360x27873a = "type";

        /* renamed from: zzacz */
        public static final java.lang.String[] f7361x6f02158 = {"firebase_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "message_device_time", "message_id", "message_name", "message_time", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "deferred_analytics_collection"};

        /* renamed from: zzada */
        public static final java.lang.String[] f7362x6f0215e = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_ndt", "_nmid", "_nmn", "_nmt", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_dac"};

        private Param() {
        }

        /* renamed from: zzak */
        public static java.lang.String m19503x394b6a(java.lang.String str) {
            return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zza(str, f7361x6f02158, f7362x6f0215e);
        }
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$UserProperty */
    /* loaded from: classes16.dex */
    public static final class UserProperty extends ya.c {

        /* renamed from: zzadb */
        public static final java.lang.String[] f7364x6f0215f = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "first_open_after_install", "lifetime_user_engagement"};

        /* renamed from: FIREBASE_LAST_NOTIFICATION */
        public static final java.lang.String f7363xee82abbc = "_ln";

        /* renamed from: zzadc */
        public static final java.lang.String[] f7365x6f02160 = {f7363xee82abbc, "_fot", "_fvt", "_ldl", "_id", "_fi", "_lte"};

        private UserProperty() {
        }

        /* renamed from: zzak */
        public static java.lang.String m19505x394b6a(java.lang.String str) {
            return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zza(str, f7364x6f0215f, f7365x6f02160);
        }
    }

    public C2413x7b7e6fb(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2247x394c25);
        this.f7337x6f02155 = c2247x394c25;
    }

    @java.lang.Deprecated
    /* renamed from: getInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb m19464x9cf0d20b(android.content.Context context) {
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25.zzg(context).m19180x394c88();
    }

    /* renamed from: beginAdUnitExposure */
    public void m19465xdd2aa377(java.lang.String str) {
        this.f7337x6f02155.m19165x394c0e().m18958xdd2aa377(str);
    }

    /* renamed from: clearConditionalUserProperty */
    public void m19466xbf00e759(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.f7337x6f02155.m19166x394c0f().m19188xbf00e759(str, str2, bundle);
    }

    /* renamed from: clearConditionalUserPropertyAs */
    public void m19467x2647d6b(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        this.f7337x6f02155.m19166x394c0f().m19189x2647d6b(str, str2, str3, bundle);
    }

    /* renamed from: endAdUnitExposure */
    public void m19468xd8567429(java.lang.String str) {
        this.f7337x6f02155.m19165x394c0e().m18959xd8567429(str);
    }

    /* renamed from: generateEventId */
    public long m19469xe2dca220() {
        return this.f7337x6f02155.mo19173x394c1b().m19290x394cb6();
    }

    /* renamed from: getAppInstanceId */
    public java.lang.String m19470x4b6169db() {
        return this.f7337x6f02155.m19166x394c0f().m19209x394c77();
    }

    /* renamed from: getBoolean */
    public java.lang.Boolean m19471x41a8a7f2() {
        return this.f7337x6f02155.m19166x394c0f().m19210x394c8e();
    }

    /* renamed from: getConditionalUserProperties */
    public java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty> m19472x1c8278ce(java.lang.String str, java.lang.String str2) {
        return this.f7337x6f02155.m19166x394c0f().m19191x1c8278ce(str, str2);
    }

    /* renamed from: getConditionalUserPropertiesAs */
    public java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty> m19473x5c785a0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.f7337x6f02155.m19166x394c0f().m19192x5c785a0(str, str2, str3);
    }

    /* renamed from: getCurrentScreenClass */
    public java.lang.String m19474xe0a9b329() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c m19223x394c99 = this.f7337x6f02155.m19170x394c13().m19223x394c99();
        if (m19223x394c99 != null) {
            return m19223x394c99.f6878x6f022bb;
        }
        return null;
    }

    /* renamed from: getCurrentScreenName */
    public java.lang.String m19475x729ef6ba() {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c m19223x394c99 = this.f7337x6f02155.m19170x394c13().m19223x394c99();
        if (m19223x394c99 != null) {
            return m19223x394c99.f6881x394dd7;
        }
        return null;
    }

    /* renamed from: getDouble */
    public java.lang.Double m19476x160e9ec7() {
        return this.f7337x6f02155.m19166x394c0f().m19213x394c96();
    }

    /* renamed from: getGmpAppId */
    public java.lang.String m19477x9061da68() {
        try {
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1776x316855d7.m17894xc43a732d();
        } catch (java.lang.IllegalStateException e17) {
            this.f7337x6f02155.mo18976x394c1e().m19108x394c64().zzg("getGoogleAppId failed with exception", e17);
            return null;
        }
    }

    /* renamed from: getInteger */
    public java.lang.Integer m19478xb282bd08() {
        return this.f7337x6f02155.m19166x394c0f().m19212x394c90();
    }

    /* renamed from: getLong */
    public java.lang.Long m19479xfb822ef2() {
        return this.f7337x6f02155.m19166x394c0f().m19211x394c8f();
    }

    /* renamed from: getMaxUserProperties */
    public int m19480xfcb40d2c(java.lang.String str) {
        this.f7337x6f02155.m19166x394c0f();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        return 25;
    }

    /* renamed from: getString */
    public java.lang.String m19481x2fec8307() {
        return this.f7337x6f02155.m19166x394c0f().m19208x394c45();
    }

    /* renamed from: getUserProperties */
    public java.util.Map<java.lang.String, java.lang.Object> m19482xe45e2054(java.lang.String str, java.lang.String str2, boolean z17) {
        return this.f7337x6f02155.m19166x394c0f().m19193xe45e2054(str, str2, z17);
    }

    /* renamed from: getUserPropertiesAs */
    public java.util.Map<java.lang.String, java.lang.Object> m19484x455763a6(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        return this.f7337x6f02155.m19166x394c0f().m19194x455763a6(str, str2, str3, z17);
    }

    /* renamed from: logEvent */
    public final void m19485x769949b6(java.lang.String str, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        this.f7337x6f02155.m19166x394c0f().zza("app", str, bundle, true);
    }

    /* renamed from: logEventInternal */
    public void m19486xdfc15e93(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        this.f7337x6f02155.m19166x394c0f().m19195x769949b6(str, str2, bundle);
    }

    /* renamed from: logEventInternalNoInterceptor */
    public void m19487x7b0d85d1(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j17) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        this.f7337x6f02155.m19166x394c0f().zza(str, str2, bundle, j17);
    }

    /* renamed from: registerOnMeasurementEventListener */
    public void m19488x37dae114(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.OnEventListener onEventListener) {
        this.f7337x6f02155.m19166x394c0f().m19196x37dae114(onEventListener);
    }

    /* renamed from: setConditionalUserProperty */
    public void m19489x929ed9a4(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty conditionalUserProperty) {
        this.f7337x6f02155.m19166x394c0f().m19198x929ed9a4(conditionalUserProperty);
    }

    /* renamed from: setConditionalUserPropertyAs */
    public void m19490x664f08f6(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.ConditionalUserProperty conditionalUserProperty) {
        this.f7337x6f02155.m19166x394c0f().m19199x664f08f6(conditionalUserProperty);
    }

    /* renamed from: setEventInterceptor */
    public void m19491x9fa973ad(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.EventInterceptor eventInterceptor) {
        this.f7337x6f02155.m19166x394c0f().m19200x9fa973ad(eventInterceptor);
    }

    @java.lang.Deprecated
    /* renamed from: setMeasurementEnabled */
    public void m19492x105dbfe7(boolean z17) {
        this.f7337x6f02155.m19166x394c0f().m19201x105dbfe7(z17);
    }

    /* renamed from: setMinimumSessionDuration */
    public final void m19493xa37f9b5e(long j17) {
        this.f7337x6f02155.m19166x394c0f().m19202xa37f9b5e(j17);
    }

    /* renamed from: setSessionTimeoutDuration */
    public final void m19494xa19717a1(long j17) {
        this.f7337x6f02155.m19166x394c0f().m19203xa19717a1(j17);
    }

    /* renamed from: setUserProperty */
    public final void m19495x2e43c042(java.lang.String str, java.lang.String str2) {
        int m19286x394ba2 = this.f7337x6f02155.mo19173x394c1b().m19286x394ba2(str);
        if (m19286x394ba2 == 0) {
            m19496xee02891f("app", str, str2);
        } else {
            this.f7337x6f02155.mo19173x394c1b();
            this.f7337x6f02155.mo19173x394c1b().zza(m19286x394ba2, "_ev", com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zza(str, 24, true), str != null ? str.length() : 0);
        }
    }

    /* renamed from: setUserPropertyInternal */
    public void m19496xee02891f(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this.f7337x6f02155.m19166x394c0f().m19204x2e43c042(str, str2, obj);
    }

    /* renamed from: unregisterOnMeasurementEventListener */
    public void m19497x89e2096d(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.OnEventListener onEventListener) {
        this.f7337x6f02155.m19166x394c0f().m19205x89e2096d(onEventListener);
    }

    /* renamed from: getUserProperties */
    public java.util.Map<java.lang.String, java.lang.Object> m19483xe45e2054(boolean z17) {
        java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e> zzj = this.f7337x6f02155.m19166x394c0f().zzj(z17);
        x.b bVar = new x.b(zzj.size());
        for (com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2337x394c8e c2337x394c8e : zzj) {
            bVar.put(c2337x394c8e.f7021x337a8b, c2337x394c8e.m19277x754a37bb());
        }
        return bVar;
    }
}
