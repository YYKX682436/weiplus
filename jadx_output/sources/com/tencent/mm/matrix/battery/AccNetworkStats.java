package com.tencent.mm.matrix.battery;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u000e\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R:\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u001a0\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R:\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u001a0\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 ¨\u0006("}, d2 = {"Lcom/tencent/mm/matrix/battery/AccNetworkStats;", "Lcom/tencent/matrix/battery/accumulate/persist/FlattParcelable;", "", "getCurrVer", "getSize", "describeContents", "", "isExpired", "isInvalid", "another", "Ljz5/f0;", "merge", "", "accProcName", "Ljava/lang/String;", "getAccProcName", "()Ljava/lang/String;", "setAccProcName", "(Ljava/lang/String;)V", "", "accBeginTime", "J", "getAccBeginTime", "()J", "setAccBeginTime", "(J)V", "", "accRxStats", "Ljava/util/Map;", "getAccRxStats", "()Ljava/util/Map;", "setAccRxStats", "(Ljava/util/Map;)V", "accTxStats", "getAccTxStats", "setAccTxStats", "<init>", "()V", "Companion", "cr0/d", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class AccNetworkStats extends com.tencent.matrix.battery.accumulate.persist.FlattParcelable {
    private static final int ACC_FIELD_COUNT = 4;
    private static final int VERSION = 1;

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 2, type = long.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)
    private long accBeginTime;

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 1, type = java.lang.String.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)
    private java.lang.String accProcName = "";

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 3, type = java.util.Map.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)
    private java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Long>> accRxStats = new java.util.LinkedHashMap();

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 4, type = java.util.Map.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)
    private java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Long>> accTxStats = new java.util.LinkedHashMap();
    public static final cr0.d Companion = new cr0.d(null);
    public static final android.os.Parcelable.Creator<com.tencent.mm.matrix.battery.AccNetworkStats> CREATOR = new cr0.c();

    @Override // com.tencent.matrix.battery.accumulate.persist.FlattParcelable, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getAccBeginTime() {
        return this.accBeginTime;
    }

    public final java.lang.String getAccProcName() {
        return this.accProcName;
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> getAccRxStats() {
        return this.accRxStats;
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> getAccTxStats() {
        return this.accTxStats;
    }

    @Override // com.tencent.matrix.battery.accumulate.persist.FlattParcelable
    public int getCurrVer() {
        return 1;
    }

    @Override // com.tencent.matrix.battery.accumulate.persist.FlattParcelable
    public int getSize() {
        return 4;
    }

    public final boolean isExpired() {
        return this.accBeginTime < ((dr0.m) ((lh.l) i95.n0.c(lh.l.class))).Ri();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ff, code lost:
    
        if (r1 != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[LOOP:6: B:97:0x0022->B:114:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[LOOP:4: B:58:0x009d->B:75:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInvalid() {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.matrix.battery.AccNetworkStats.isInvalid():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void merge(com.tencent.mm.matrix.battery.AccNetworkStats r13) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.matrix.battery.AccNetworkStats.merge(com.tencent.mm.matrix.battery.AccNetworkStats):void");
    }

    public final void setAccBeginTime(long j17) {
        this.accBeginTime = j17;
    }

    public final void setAccProcName(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.accProcName = str;
    }

    public final void setAccRxStats(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Long>> map) {
        kotlin.jvm.internal.o.g(map, "<set-?>");
        this.accRxStats = map;
    }

    public final void setAccTxStats(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, java.lang.Long>> map) {
        kotlin.jvm.internal.o.g(map, "<set-?>");
        this.accTxStats = map;
    }
}
