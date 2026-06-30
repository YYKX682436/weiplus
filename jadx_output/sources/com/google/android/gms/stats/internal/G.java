package com.google.android.gms.stats.internal;

/* loaded from: classes6.dex */
public final class G {

    /* loaded from: classes13.dex */
    public static final class netStats {
        public static final com.google.android.gms.common.config.GservicesValue<java.lang.Boolean> enabled = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:enabled", true);
        public static final com.google.android.gms.common.config.GservicesValue<java.lang.Long> recordIntervalSecs = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:record_interval_secs", java.lang.Long.valueOf(java.util.concurrent.TimeUnit.DAYS.toSeconds(1)));
        public static final com.google.android.gms.common.config.GservicesValue<java.lang.Long> dataSourcePollIntervalMillis = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:data_source_poll_millis", java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MINUTES.toMillis(30)));

        /* loaded from: classes13.dex */
        public static final class patterns {
            public static final com.google.android.gms.common.config.GservicesValue<java.lang.String> IDENTS = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:pattern:idents", com.google.android.gms.stats.netstats.NetstatsParserPatterns.IDENTS_PATTERN);
            public static final com.google.android.gms.common.config.GservicesValue<java.lang.String> IDENT = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:pattern:ident", com.google.android.gms.stats.netstats.NetstatsParserPatterns.IDENT_PATTERN);
            public static final com.google.android.gms.common.config.GservicesValue<java.lang.String> HISTORY = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:pattern:history", com.google.android.gms.stats.netstats.NetstatsParserPatterns.HISTORY_PATTERN);
            public static final com.google.android.gms.common.config.GservicesValue<java.lang.String> BUCKET = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:pattern:bucket", com.google.android.gms.stats.netstats.NetstatsParserPatterns.BUCKET_PATTERN);
            public static final com.google.android.gms.common.config.GservicesValue<java.lang.String> UID_STATS_START = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:pattern:uid_start", com.google.android.gms.stats.netstats.NetstatsParserPatterns.UID_STATS_START_PATTERN);
            public static final com.google.android.gms.common.config.GservicesValue<java.lang.String> UID_TAG_STATS_START = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:pattern:uid_tag_start", com.google.android.gms.stats.netstats.NetstatsParserPatterns.UID_TAG_STATS_START_PATTERN);
            public static final com.google.android.gms.common.config.GservicesValue<java.lang.String> TYPE_BOTH = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:pattern:type_both", com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BOTH_PATTERN);
            public static final com.google.android.gms.common.config.GservicesValue<java.lang.String> TYPE_BACKGROUND = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:pattern:type_background", com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN);
            public static final com.google.android.gms.common.config.GservicesValue<java.lang.String> TYPE_FOREGROUND = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:pattern:type_foreground", com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_FOREGROUND_PATTERN);
            public static final com.google.android.gms.common.config.GservicesValue<java.lang.String> TYPE_DEBUG_VPN_IN_PATTERN = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:pattern:type_debug_vpn_in_pattern", com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_DEBUG_VPN_IN_PATTERN);
            public static final com.google.android.gms.common.config.GservicesValue<java.lang.String> TYPE_DEBUG_VPN_OUT_PATTERN = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:pattern:type_debug_vpn_out_pattern", com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_DEBUG_VPN_OUT_PATTERN);
            public static final com.google.android.gms.common.config.GservicesValue<java.lang.Integer> TAG_RADIX = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:pattern:tag_radix", (java.lang.Integer) 16);
            public static final com.google.android.gms.common.config.GservicesValue<java.lang.Integer> TS_TO_MILLIS = com.google.android.gms.common.config.GservicesValue.value("gms:stats:netstats:pattern:ts_to_millis", java.lang.Integer.valueOf(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TS_TO_MILLIS));

            private patterns() {
            }
        }

        private netStats() {
        }
    }
}
