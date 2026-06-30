package com.tencent.matrix.battery.accumulate;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 X2\u00020\u0001:\u0006YZ[\\]^B\u0011\u0012\b\u0010V\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bW\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0006\u0010\t\u001a\u00020\u0007R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u001b\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\"\u0010!\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\"\u0010$\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\"\u0010'\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\"\u0010*\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0013\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R(\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u00105\u001a\b\u0012\u0004\u0012\u00020.0-8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R:\u00109\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020.08088F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R:\u0010@\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020?08088F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R:\u0010C\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001108088F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010:\u001a\u0004\bD\u0010<\"\u0004\bE\u0010>R@\u0010F\u001a \u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020-08088F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010:\u001a\u0004\bG\u0010<\"\u0004\bH\u0010>R:\u0010I\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001108088F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010:\u001a\u0004\bJ\u0010<\"\u0004\bK\u0010>R.\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011088F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010:\u001a\u0004\bM\u0010<\"\u0004\bN\u0010>R.\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011088F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010:\u001a\u0004\bP\u0010<\"\u0004\bQ\u0010>R.\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020R088F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010:\u001a\u0004\bT\u0010<\"\u0004\bU\u0010>¨\u0006_"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/AccPowerStats;", "Lcom/tencent/matrix/battery/accumulate/persist/FlattParcelable;", "", "getCurrVer", "getSize", "Lgi/w0;", "monitors", "Ljz5/f0;", "acc", "dump", "", "accName", "Ljava/lang/String;", "getAccName", "()Ljava/lang/String;", "setAccName", "(Ljava/lang/String;)V", "", "accBeginStampMs", "J", "getAccBeginStampMs", "()J", "setAccBeginStampMs", "(J)V", "accCount", "getAccCount", "setAccCount", "accDuringMs", "getAccDuringMs", "setAccDuringMs", "accPeriodMs", "getAccPeriodMs", "setAccPeriodMs", "accAppBgMs", "getAccAppBgMs", "setAccAppBgMs", "accDevChargeMs", "getAccDevChargeMs", "setAccDevChargeMs", "accPidJiffies", "getAccPidJiffies", "setAccPidJiffies", "accUidJiffies", "getAccUidJiffies", "setAccUidJiffies", "", "", "accBattCurr", "Ljava/util/List;", "getAccBattCurr", "()Ljava/util/List;", "setAccBattCurr", "(Ljava/util/List;)V", "accBattTemp", "getAccBattTemp", "setAccBattTemp", "", "accPowerStats", "Ljava/util/Map;", "getAccPowerStats", "()Ljava/util/Map;", "setAccPowerStats", "(Ljava/util/Map;)V", "", "accPowerExtra", "getAccPowerExtra", "setAccPowerExtra", "accJiffyStats", "getAccJiffyStats", "setAccJiffyStats", "accTidStats", "getAccTidStats", "setAccTidStats", "accTaskStats", "getAccTaskStats", "setAccTaskStats", "accWakeLockPartialStats", "getAccWakeLockPartialStats", "setAccWakeLockPartialStats", "accWakeLockFullStats", "getAccWakeLockFullStats", "setAccWakeLockFullStats", "Lcom/tencent/matrix/battery/accumulate/AccProcessStats;", "accProcStats", "getAccProcStats", "setAccProcStats", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "<init>", "Companion", "lh/b", "NestedLongMap", "NestedPowerExtraMap", "NestedPowerStatsMap", "NestedTidMap", "ProcessStatsMap", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class AccPowerStats extends com.tencent.matrix.battery.accumulate.persist.FlattParcelable {
    private static final int ACC_FIELD_COUNT = 19;
    private static final java.lang.String TAG = "MicroMsg.PowerAccMonitor";
    private static final int VERSION = 20;

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 6, type = long.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private long accAppBgMs;

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 3, type = long.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private long accCount;

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 7, type = long.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private long accDevChargeMs;

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 4, type = long.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private long accDuringMs;

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 1, type = java.lang.String.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private java.lang.String accName;

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 5, type = long.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private long accPeriodMs;

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 8, type = long.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private long accPidJiffies;

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 9, type = long.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private long accUidJiffies;
    public static final lh.b Companion = new lh.b(null);
    public static final android.os.Parcelable.Creator<com.tencent.matrix.battery.accumulate.AccPowerStats> CREATOR = new lh.a();

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 10, type = java.util.List.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private java.util.List<java.lang.Double> accBattCurr = new java.util.ArrayList();

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 11, type = java.util.List.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private java.util.List<java.lang.Double> accBattTemp = new java.util.ArrayList();

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 12, type = com.tencent.matrix.battery.accumulate.AccPowerStats.NestedPowerStatsMap.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Double>> accPowerStats = new java.util.LinkedHashMap();

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 13, type = com.tencent.matrix.battery.accumulate.AccPowerStats.NestedPowerExtraMap.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> accPowerExtra = new java.util.LinkedHashMap();

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 14, type = com.tencent.matrix.battery.accumulate.AccPowerStats.NestedLongMap.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Long>> accJiffyStats = new java.util.LinkedHashMap();

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 15, type = com.tencent.matrix.battery.accumulate.AccPowerStats.NestedTidMap.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.util.List<java.lang.Integer>>> accTidStats = new java.util.LinkedHashMap();

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 16, type = com.tencent.matrix.battery.accumulate.AccPowerStats.NestedLongMap.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Long>> accTaskStats = new java.util.LinkedHashMap();

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 17, type = java.util.Map.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private java.util.Map<java.lang.String, java.lang.Long> accWakeLockPartialStats = new java.util.LinkedHashMap();

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 18, type = java.util.Map.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private java.util.Map<java.lang.String, java.lang.Long> accWakeLockFullStats = new java.util.LinkedHashMap();

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 19, type = com.tencent.matrix.battery.accumulate.AccPowerStats.ProcessStatsMap.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private java.util.Map<java.lang.String, com.tencent.matrix.battery.accumulate.AccProcessStats> accProcStats = new java.util.LinkedHashMap();

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 2, type = long.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)
    private long accBeginStampMs = java.lang.System.currentTimeMillis();

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/AccPowerStats$NestedLongMap;", "Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$TypedMap;", "Lf06/d;", "", "keyType", "Lcom/tencent/matrix/battery/accumulate/AccPowerStats$NestedLongMap$StringLongMap;", "valueType", "<init>", "()V", "StringLongMap", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes12.dex */
    public static final class NestedLongMap extends com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap {

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/AccPowerStats$NestedLongMap$StringLongMap;", "Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$TypedMap;", "Lf06/d;", "", "keyType", "", "valueType", "<init>", "()V", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes12.dex */
        public static final class StringLongMap extends com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap {
            @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
            public f06.d keyType() {
                return kotlin.jvm.internal.i0.a(java.lang.String.class);
            }

            @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
            public f06.d valueType() {
                return kotlin.jvm.internal.i0.a(java.lang.Long.TYPE);
            }
        }

        @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
        public f06.d keyType() {
            return kotlin.jvm.internal.i0.a(java.lang.String.class);
        }

        @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
        public f06.d valueType() {
            return kotlin.jvm.internal.i0.a(com.tencent.matrix.battery.accumulate.AccPowerStats.NestedLongMap.StringLongMap.class);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00050\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/AccPowerStats$NestedPowerExtraMap;", "Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$TypedMap;", "Lf06/d;", "", "keyType", "", "valueType", "<init>", "()V", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes12.dex */
    public static final class NestedPowerExtraMap extends com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap {
        @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
        public f06.d keyType() {
            return kotlin.jvm.internal.i0.a(java.lang.String.class);
        }

        @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
        public f06.d valueType() {
            return kotlin.jvm.internal.i0.a(java.util.Map.class);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/AccPowerStats$NestedPowerStatsMap;", "Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$TypedMap;", "Lf06/d;", "", "keyType", "Lcom/tencent/matrix/battery/accumulate/AccPowerStats$NestedPowerStatsMap$StringDoubleMap;", "valueType", "<init>", "()V", "StringDoubleMap", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes12.dex */
    public static final class NestedPowerStatsMap extends com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap {

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/AccPowerStats$NestedPowerStatsMap$StringDoubleMap;", "Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$TypedMap;", "Lf06/d;", "", "keyType", "", "valueType", "<init>", "()V", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes12.dex */
        public static final class StringDoubleMap extends com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap {
            @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
            public f06.d keyType() {
                return kotlin.jvm.internal.i0.a(java.lang.String.class);
            }

            @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
            public f06.d valueType() {
                return kotlin.jvm.internal.i0.a(java.lang.Double.TYPE);
            }
        }

        @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
        public f06.d keyType() {
            return kotlin.jvm.internal.i0.a(java.lang.String.class);
        }

        @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
        public f06.d valueType() {
            return kotlin.jvm.internal.i0.a(com.tencent.matrix.battery.accumulate.AccPowerStats.NestedPowerStatsMap.StringDoubleMap.class);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/AccPowerStats$NestedTidMap;", "Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$TypedMap;", "Lf06/d;", "", "keyType", "Lcom/tencent/matrix/battery/accumulate/AccPowerStats$NestedTidMap$IntListMap;", "valueType", "<init>", "()V", "IntListMap", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes12.dex */
    public static final class NestedTidMap extends com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap {

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/AccPowerStats$NestedTidMap$IntListMap;", "Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$TypedMap;", "Lf06/d;", "", "keyType", "Lcom/tencent/matrix/battery/accumulate/AccPowerStats$NestedTidMap$IntListMap$IntList;", "valueType", "<init>", "()V", "IntList", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes12.dex */
        public static final class IntListMap extends com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap {

            @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/AccPowerStats$NestedTidMap$IntListMap$IntList;", "Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$TypedList;", "Lf06/d;", "", "itemType", "<init>", "()V", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes12.dex */
            public static final class IntList extends com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedList {
                @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedList
                public f06.d itemType() {
                    return kotlin.jvm.internal.i0.a(java.lang.Integer.TYPE);
                }
            }

            @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
            public f06.d keyType() {
                return kotlin.jvm.internal.i0.a(java.lang.String.class);
            }

            @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
            public f06.d valueType() {
                return kotlin.jvm.internal.i0.a(com.tencent.matrix.battery.accumulate.AccPowerStats.NestedTidMap.IntListMap.IntList.class);
            }
        }

        @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
        public f06.d keyType() {
            return kotlin.jvm.internal.i0.a(java.lang.String.class);
        }

        @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
        public f06.d valueType() {
            return kotlin.jvm.internal.i0.a(com.tencent.matrix.battery.accumulate.AccPowerStats.NestedTidMap.IntListMap.class);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/AccPowerStats$ProcessStatsMap;", "Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$TypedMap;", "Lf06/d;", "", "keyType", "Lcom/tencent/matrix/battery/accumulate/AccProcessStats;", "valueType", "<init>", "()V", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes12.dex */
    public static final class ProcessStatsMap extends com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap {
        @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
        public f06.d keyType() {
            return kotlin.jvm.internal.i0.a(java.lang.String.class);
        }

        @Override // com.tencent.matrix.battery.accumulate.persist.FlattProperty.TypedMap
        public f06.d valueType() {
            return kotlin.jvm.internal.i0.a(com.tencent.matrix.battery.accumulate.AccProcessStats.class);
        }
    }

    public AccPowerStats(java.lang.String str) {
        this.accName = "";
        this.accName = java.lang.String.valueOf(str);
    }

    public final void acc(gi.w0 monitors) {
        rh.k1 k1Var;
        rh.o2 t17;
        wh.n1 n1Var;
        kotlin.jvm.internal.o.g(monitors, "monitors");
        qh.b bVar = monitors.f395330l;
        if (bVar == null || (k1Var = (rh.k1) monitors.w(rh.k1.class)) == null || (t17 = monitors.t(uh.g.class)) == null || (n1Var = k1Var.f395435k) == null || !n1Var.l()) {
            return;
        }
        lock(new lh.f(t17, bVar, this, monitors, n1Var));
    }

    public final void dump() {
        lock(new lh.g(this));
    }

    public final long getAccAppBgMs() {
        return this.accAppBgMs;
    }

    public final java.util.List<java.lang.Double> getAccBattCurr() {
        return safe(this.accBattCurr);
    }

    public final java.util.List<java.lang.Double> getAccBattTemp() {
        return safe(this.accBattTemp);
    }

    public final long getAccBeginStampMs() {
        return this.accBeginStampMs;
    }

    public final long getAccCount() {
        return this.accCount;
    }

    public final long getAccDevChargeMs() {
        return this.accDevChargeMs;
    }

    public final long getAccDuringMs() {
        return this.accDuringMs;
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> getAccJiffyStats() {
        return safe(this.accJiffyStats);
    }

    public final java.lang.String getAccName() {
        return this.accName;
    }

    public final long getAccPeriodMs() {
        return this.accPeriodMs;
    }

    public final long getAccPidJiffies() {
        return this.accPidJiffies;
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> getAccPowerExtra() {
        return safe(this.accPowerExtra);
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Double>> getAccPowerStats() {
        return safe(this.accPowerStats);
    }

    public final java.util.Map<java.lang.String, com.tencent.matrix.battery.accumulate.AccProcessStats> getAccProcStats() {
        return safe(this.accProcStats);
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> getAccTaskStats() {
        return safe(this.accTaskStats);
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.Integer>>> getAccTidStats() {
        return safe(this.accTidStats);
    }

    public final long getAccUidJiffies() {
        return this.accUidJiffies;
    }

    public final java.util.Map<java.lang.String, java.lang.Long> getAccWakeLockFullStats() {
        return safe(this.accWakeLockFullStats);
    }

    public final java.util.Map<java.lang.String, java.lang.Long> getAccWakeLockPartialStats() {
        return safe(this.accWakeLockPartialStats);
    }

    @Override // com.tencent.matrix.battery.accumulate.persist.FlattParcelable
    public int getCurrVer() {
        return 20;
    }

    @Override // com.tencent.matrix.battery.accumulate.persist.FlattParcelable
    public int getSize() {
        return 19;
    }

    public final void setAccAppBgMs(long j17) {
        this.accAppBgMs = j17;
    }

    public final void setAccBattCurr(java.util.List<java.lang.Double> list) {
        kotlin.jvm.internal.o.g(list, "<set-?>");
        this.accBattCurr = list;
    }

    public final void setAccBattTemp(java.util.List<java.lang.Double> list) {
        kotlin.jvm.internal.o.g(list, "<set-?>");
        this.accBattTemp = list;
    }

    public final void setAccBeginStampMs(long j17) {
        this.accBeginStampMs = j17;
    }

    public final void setAccCount(long j17) {
        this.accCount = j17;
    }

    public final void setAccDevChargeMs(long j17) {
        this.accDevChargeMs = j17;
    }

    public final void setAccDuringMs(long j17) {
        this.accDuringMs = j17;
    }

    public final void setAccJiffyStats(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Long>> map) {
        kotlin.jvm.internal.o.g(map, "<set-?>");
        this.accJiffyStats = map;
    }

    public final void setAccName(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.accName = str;
    }

    public final void setAccPeriodMs(long j17) {
        this.accPeriodMs = j17;
    }

    public final void setAccPidJiffies(long j17) {
        this.accPidJiffies = j17;
    }

    public final void setAccPowerExtra(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> map) {
        kotlin.jvm.internal.o.g(map, "<set-?>");
        this.accPowerExtra = map;
    }

    public final void setAccPowerStats(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Double>> map) {
        kotlin.jvm.internal.o.g(map, "<set-?>");
        this.accPowerStats = map;
    }

    public final void setAccProcStats(java.util.Map<java.lang.String, com.tencent.matrix.battery.accumulate.AccProcessStats> map) {
        kotlin.jvm.internal.o.g(map, "<set-?>");
        this.accProcStats = map;
    }

    public final void setAccTaskStats(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Long>> map) {
        kotlin.jvm.internal.o.g(map, "<set-?>");
        this.accTaskStats = map;
    }

    public final void setAccTidStats(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.util.List<java.lang.Integer>>> map) {
        kotlin.jvm.internal.o.g(map, "<set-?>");
        this.accTidStats = map;
    }

    public final void setAccUidJiffies(long j17) {
        this.accUidJiffies = j17;
    }

    public final void setAccWakeLockFullStats(java.util.Map<java.lang.String, java.lang.Long> map) {
        kotlin.jvm.internal.o.g(map, "<set-?>");
        this.accWakeLockFullStats = map;
    }

    public final void setAccWakeLockPartialStats(java.util.Map<java.lang.String, java.lang.Long> map) {
        kotlin.jvm.internal.o.g(map, "<set-?>");
        this.accWakeLockPartialStats = map;
    }
}
