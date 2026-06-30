package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public class TelemetryLogging {
    private TelemetryLogging() {
    }

    public static com.google.android.gms.common.internal.TelemetryLoggingClient getClient(android.content.Context context) {
        return getClient(context, com.google.android.gms.common.internal.TelemetryLoggingOptions.zaa);
    }

    public static com.google.android.gms.common.internal.TelemetryLoggingClient getClient(android.content.Context context, com.google.android.gms.common.internal.TelemetryLoggingOptions telemetryLoggingOptions) {
        return new com.google.android.gms.common.internal.service.zao(context, telemetryLoggingOptions);
    }
}
