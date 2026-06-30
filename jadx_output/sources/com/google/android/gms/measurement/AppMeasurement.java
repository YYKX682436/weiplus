package com.google.android.gms.measurement;

@java.lang.Deprecated
/* loaded from: classes16.dex */
public class AppMeasurement {
    public static final java.lang.String CRASH_ORIGIN = "crash";
    public static final java.lang.String FCM_ORIGIN = "fcm";
    private final com.google.android.gms.internal.measurement.zzgl zzacw;

    /* loaded from: classes16.dex */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public java.lang.String mAppId;
        public long mCreationTimestamp;
        public java.lang.String mExpiredEventName;
        public android.os.Bundle mExpiredEventParams;
        public java.lang.String mName;
        public java.lang.String mOrigin;
        public long mTimeToLive;
        public java.lang.String mTimedOutEventName;
        public android.os.Bundle mTimedOutEventParams;
        public java.lang.String mTriggerEventName;
        public long mTriggerTimeout;
        public java.lang.String mTriggeredEventName;
        public android.os.Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public java.lang.Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            java.lang.Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                java.lang.Object zzf = com.google.android.gms.internal.measurement.zzka.zzf(obj);
                this.mValue = zzf;
                if (zzf == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new android.os.Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new android.os.Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new android.os.Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    /* loaded from: classes16.dex */
    public static final class Event extends ya.a {
        public static final java.lang.String[] zzacx = {"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "ad_reward", "screen_view", "ga_extra_parameter"};
        public static final java.lang.String APP_EXCEPTION = "_ae";
        public static final java.lang.String AD_REWARD = "_ar";
        public static final java.lang.String[] zzacy = {"_cd", APP_EXCEPTION, "_ui", "_ug", "_in", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", AD_REWARD, "_vs", "_ep"};

        private Event() {
        }

        public static java.lang.String zzak(java.lang.String str) {
            return com.google.android.gms.internal.measurement.zzka.zza(str, zzacx, zzacy);
        }
    }

    /* loaded from: classes16.dex */
    public interface EventInterceptor {
        void interceptEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j17);
    }

    /* loaded from: classes16.dex */
    public interface OnEventListener {
        void onEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j17);
    }

    /* loaded from: classes16.dex */
    public static final class Param extends ya.b {
        public static final java.lang.String FATAL = "fatal";
        public static final java.lang.String TIMESTAMP = "timestamp";
        public static final java.lang.String TYPE = "type";
        public static final java.lang.String[] zzacz = {"firebase_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "message_device_time", "message_id", "message_name", "message_time", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "deferred_analytics_collection"};
        public static final java.lang.String[] zzada = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_ndt", "_nmid", "_nmn", "_nmt", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_dac"};

        private Param() {
        }

        public static java.lang.String zzak(java.lang.String str) {
            return com.google.android.gms.internal.measurement.zzka.zza(str, zzacz, zzada);
        }
    }

    /* loaded from: classes16.dex */
    public static final class UserProperty extends ya.c {
        public static final java.lang.String[] zzadb = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "first_open_after_install", "lifetime_user_engagement"};
        public static final java.lang.String FIREBASE_LAST_NOTIFICATION = "_ln";
        public static final java.lang.String[] zzadc = {FIREBASE_LAST_NOTIFICATION, "_fot", "_fvt", "_ldl", "_id", "_fi", "_lte"};

        private UserProperty() {
        }

        public static java.lang.String zzak(java.lang.String str) {
            return com.google.android.gms.internal.measurement.zzka.zza(str, zzadb, zzadc);
        }
    }

    public AppMeasurement(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzglVar);
        this.zzacw = zzglVar;
    }

    @java.lang.Deprecated
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context context) {
        return com.google.android.gms.internal.measurement.zzgl.zzg(context).zzjr();
    }

    public void beginAdUnitExposure(java.lang.String str) {
        this.zzacw.zzft().beginAdUnitExposure(str);
    }

    public void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zzacw.zzfu().clearConditionalUserProperty(str, str2, bundle);
    }

    public void clearConditionalUserPropertyAs(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        this.zzacw.zzfu().clearConditionalUserPropertyAs(str, str2, str3, bundle);
    }

    public void endAdUnitExposure(java.lang.String str) {
        this.zzacw.zzft().endAdUnitExposure(str);
    }

    public long generateEventId() {
        return this.zzacw.zzgb().zzlb();
    }

    public java.lang.String getAppInstanceId() {
        return this.zzacw.zzfu().zzja();
    }

    public java.lang.Boolean getBoolean() {
        return this.zzacw.zzfu().zzjx();
    }

    public java.util.List<com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty> getConditionalUserProperties(java.lang.String str, java.lang.String str2) {
        return this.zzacw.zzfu().getConditionalUserProperties(str, str2);
    }

    public java.util.List<com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty> getConditionalUserPropertiesAs(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.zzacw.zzfu().getConditionalUserPropertiesAs(str, str2, str3);
    }

    public java.lang.String getCurrentScreenClass() {
        com.google.android.gms.internal.measurement.zzie zzkd = this.zzacw.zzfy().zzkd();
        if (zzkd != null) {
            return zzkd.zzaoi;
        }
        return null;
    }

    public java.lang.String getCurrentScreenName() {
        com.google.android.gms.internal.measurement.zzie zzkd = this.zzacw.zzfy().zzkd();
        if (zzkd != null) {
            return zzkd.zzul;
        }
        return null;
    }

    public java.lang.Double getDouble() {
        return this.zzacw.zzfu().zzka();
    }

    public java.lang.String getGmpAppId() {
        try {
            return com.google.android.gms.common.api.internal.GoogleServices.getGoogleAppId();
        } catch (java.lang.IllegalStateException e17) {
            this.zzacw.zzge().zzim().zzg("getGoogleAppId failed with exception", e17);
            return null;
        }
    }

    public java.lang.Integer getInteger() {
        return this.zzacw.zzfu().zzjz();
    }

    public java.lang.Long getLong() {
        return this.zzacw.zzfu().zzjy();
    }

    public int getMaxUserProperties(java.lang.String str) {
        this.zzacw.zzfu();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        return 25;
    }

    public java.lang.String getString() {
        return this.zzacw.zzfu().zzhm();
    }

    public java.util.Map<java.lang.String, java.lang.Object> getUserProperties(java.lang.String str, java.lang.String str2, boolean z17) {
        return this.zzacw.zzfu().getUserProperties(str, str2, z17);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getUserPropertiesAs(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        return this.zzacw.zzfu().getUserPropertiesAs(str, str2, str3, z17);
    }

    public final void logEvent(java.lang.String str, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        this.zzacw.zzfu().zza("app", str, bundle, true);
    }

    public void logEventInternal(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        this.zzacw.zzfu().logEvent(str, str2, bundle);
    }

    public void logEventInternalNoInterceptor(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j17) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        this.zzacw.zzfu().zza(str, str2, bundle, j17);
    }

    public void registerOnMeasurementEventListener(com.google.android.gms.measurement.AppMeasurement.OnEventListener onEventListener) {
        this.zzacw.zzfu().registerOnMeasurementEventListener(onEventListener);
    }

    public void setConditionalUserProperty(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        this.zzacw.zzfu().setConditionalUserProperty(conditionalUserProperty);
    }

    public void setConditionalUserPropertyAs(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        this.zzacw.zzfu().setConditionalUserPropertyAs(conditionalUserProperty);
    }

    public void setEventInterceptor(com.google.android.gms.measurement.AppMeasurement.EventInterceptor eventInterceptor) {
        this.zzacw.zzfu().setEventInterceptor(eventInterceptor);
    }

    @java.lang.Deprecated
    public void setMeasurementEnabled(boolean z17) {
        this.zzacw.zzfu().setMeasurementEnabled(z17);
    }

    public final void setMinimumSessionDuration(long j17) {
        this.zzacw.zzfu().setMinimumSessionDuration(j17);
    }

    public final void setSessionTimeoutDuration(long j17) {
        this.zzacw.zzfu().setSessionTimeoutDuration(j17);
    }

    public final void setUserProperty(java.lang.String str, java.lang.String str2) {
        int zzce = this.zzacw.zzgb().zzce(str);
        if (zzce == 0) {
            setUserPropertyInternal("app", str, str2);
        } else {
            this.zzacw.zzgb();
            this.zzacw.zzgb().zza(zzce, "_ev", com.google.android.gms.internal.measurement.zzka.zza(str, 24, true), str != null ? str.length() : 0);
        }
    }

    public void setUserPropertyInternal(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this.zzacw.zzfu().setUserProperty(str, str2, obj);
    }

    public void unregisterOnMeasurementEventListener(com.google.android.gms.measurement.AppMeasurement.OnEventListener onEventListener) {
        this.zzacw.zzfu().unregisterOnMeasurementEventListener(onEventListener);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getUserProperties(boolean z17) {
        java.util.List<com.google.android.gms.internal.measurement.zzjx> zzj = this.zzacw.zzfu().zzj(z17);
        x.b bVar = new x.b(zzj.size());
        for (com.google.android.gms.internal.measurement.zzjx zzjxVar : zzj) {
            bVar.put(zzjxVar.name, zzjxVar.getValue());
        }
        return bVar;
    }
}
