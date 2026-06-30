package com.tencent.mm.matrix.battery;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R:\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u00140\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR:\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0\u00140\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001a¨\u0006#"}, d2 = {"com/tencent/mm/matrix/battery/NetSceneProfiler$AccCgiStats", "Lcom/tencent/matrix/battery/accumulate/persist/FlattParcelable;", "", "getCurrVer", "getSize", "describeContents", "", "accProcName", "Ljava/lang/String;", "getAccProcName", "()Ljava/lang/String;", "setAccProcName", "(Ljava/lang/String;)V", "", "accBeginTime", "J", "getAccBeginTime", "()J", "setAccBeginTime", "(J)V", "", "accRunCgiStats", "Ljava/util/Map;", "getAccRunCgiStats", "()Ljava/util/Map;", "setAccRunCgiStats", "(Ljava/util/Map;)V", "Lcom/tencent/mm/matrix/battery/BinderTracker$Timer;", "accFinCgiStats", "getAccFinCgiStats", "setAccFinCgiStats", "<init>", "()V", "Companion", "cr0/u2", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class NetSceneProfiler$AccCgiStats extends com.tencent.matrix.battery.accumulate.persist.FlattParcelable {
    private static final int ACC_FIELD_COUNT = 4;
    private static final int VERSION = 1;

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 2, type = long.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)
    private long accBeginTime;
    public static final cr0.u2 Companion = new cr0.u2(null);
    public static final android.os.Parcelable.Creator<com.tencent.mm.matrix.battery.NetSceneProfiler$AccCgiStats> CREATOR = new cr0.t2();

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 1, type = java.lang.String.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)
    private java.lang.String accProcName = "";

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 3, type = java.util.Map.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)
    private java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Long>> accRunCgiStats = new java.util.LinkedHashMap();

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 4, type = java.util.Map.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)
    private java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer>> accFinCgiStats = new java.util.LinkedHashMap();

    @Override // com.tencent.matrix.battery.accumulate.persist.FlattParcelable, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getAccBeginTime() {
        return this.accBeginTime;
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer>> getAccFinCgiStats() {
        return this.accFinCgiStats;
    }

    public final java.lang.String getAccProcName() {
        return this.accProcName;
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> getAccRunCgiStats() {
        return this.accRunCgiStats;
    }

    @Override // com.tencent.matrix.battery.accumulate.persist.FlattParcelable
    public int getCurrVer() {
        return 1;
    }

    @Override // com.tencent.matrix.battery.accumulate.persist.FlattParcelable
    public int getSize() {
        return 4;
    }

    public final void setAccBeginTime(long j17) {
        this.accBeginTime = j17;
    }

    public final void setAccFinCgiStats(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer>> map) {
        kotlin.jvm.internal.o.g(map, "<set-?>");
        this.accFinCgiStats = map;
    }

    public final void setAccProcName(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.accProcName = str;
    }

    public final void setAccRunCgiStats(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Long>> map) {
        kotlin.jvm.internal.o.g(map, "<set-?>");
        this.accRunCgiStats = map;
    }
}
