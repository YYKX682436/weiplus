package com.tencent.mm.matrix.battery;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R:\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0\u001a0\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/tencent/mm/matrix/battery/AccBinderCallsStats;", "Lcom/tencent/matrix/battery/accumulate/persist/FlattParcelable;", "", "getCurrVer", "getSize", "describeContents", "another", "Ljz5/f0;", "merge", "", "isExpired", "isInvalid", "", "accProcName", "Ljava/lang/String;", "getAccProcName", "()Ljava/lang/String;", "setAccProcName", "(Ljava/lang/String;)V", "", "accBeginTime", "J", "getAccBeginTime", "()J", "setAccBeginTime", "(J)V", "", "Lcom/tencent/mm/matrix/battery/BinderTracker$Timer;", "accBinderCallsStats", "Ljava/util/Map;", "getAccBinderCallsStats", "()Ljava/util/Map;", "setAccBinderCallsStats", "(Ljava/util/Map;)V", "<init>", "()V", "Companion", "cr0/b", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class AccBinderCallsStats extends com.tencent.matrix.battery.accumulate.persist.FlattParcelable {
    private static final int ACC_FIELD_COUNT = 3;
    private static final int VERSION = 4;

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 2, type = long.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)
    private long accBeginTime;
    public static final cr0.b Companion = new cr0.b(null);
    public static final android.os.Parcelable.Creator<com.tencent.mm.matrix.battery.AccBinderCallsStats> CREATOR = new cr0.a();

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 1, type = java.lang.String.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)
    private java.lang.String accProcName = "";

    @com.tencent.matrix.battery.accumulate.persist.FlattProperty(index = 3, type = java.util.Map.class, workProc = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)
    private java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer>> accBinderCallsStats = new java.util.LinkedHashMap();

    @Override // com.tencent.matrix.battery.accumulate.persist.FlattParcelable, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getAccBeginTime() {
        return this.accBeginTime;
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer>> getAccBinderCallsStats() {
        return this.accBinderCallsStats;
    }

    public final java.lang.String getAccProcName() {
        return this.accProcName;
    }

    @Override // com.tencent.matrix.battery.accumulate.persist.FlattParcelable
    public int getCurrVer() {
        return 4;
    }

    @Override // com.tencent.matrix.battery.accumulate.persist.FlattParcelable
    public int getSize() {
        return 3;
    }

    public final boolean isExpired() {
        return this.accBeginTime < ((dr0.m) ((lh.l) i95.n0.c(lh.l.class))).Ri();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[LOOP:2: B:43:0x001f->B:60:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInvalid() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.matrix.battery.AccBinderCallsStats.isInvalid():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void merge(com.tencent.mm.matrix.battery.AccBinderCallsStats r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "another"
            kotlin.jvm.internal.o.g(r1, r2)
            long r2 = r1.accBeginTime
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r2.longValue()
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 1
            r9 = 0
            if (r7 <= 0) goto L27
            long r10 = r0.accBeginTime
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 <= 0) goto L25
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L27
        L25:
            r3 = r8
            goto L28
        L27:
            r3 = r9
        L28:
            if (r3 == 0) goto L2b
            goto L2c
        L2b:
            r2 = 0
        L2c:
            if (r2 == 0) goto L34
            long r2 = r2.longValue()
            r0.accBeginTime = r2
        L34:
            java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer>> r1 = r1.accBinderCallsStats
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L3e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc6
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.util.Map r2 = (java.util.Map) r2
            boolean r4 = r2.isEmpty()
            r4 = r4 ^ r8
            if (r4 == 0) goto L3e
            java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer>> r4 = r0.accBinderCallsStats
            java.util.Map r4 = r0.asMutable(r4)
            java.lang.Object r7 = r4.get(r3)
            if (r7 != 0) goto L71
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            r4.put(r3, r7)
        L71:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L7b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            com.tencent.mm.matrix.battery.BinderTracker$Timer r3 = (com.tencent.mm.matrix.battery.BinderTracker$Timer) r3
            java.util.Map r10 = r0.asMutable(r7)
            java.lang.Object r11 = r10.get(r4)
            if (r11 != 0) goto Lad
            com.tencent.mm.matrix.battery.BinderTracker$Timer r11 = new com.tencent.mm.matrix.battery.BinderTracker$Timer
            r13 = 0
            r14 = 0
            r16 = 3
            r17 = 0
            r12 = r11
            r12.<init>(r13, r14, r16, r17)
            r10.put(r4, r11)
        Lad:
            com.tencent.mm.matrix.battery.BinderTracker$Timer r11 = (com.tencent.mm.matrix.battery.BinderTracker$Timer) r11
            int r4 = r11.f68689d
            int r10 = r3.f68689d
            if (r10 >= 0) goto Lb6
            r10 = r9
        Lb6:
            int r4 = r4 + r10
            r11.f68689d = r4
            long r12 = r11.f68690e
            long r3 = r3.f68690e
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 >= 0) goto Lc2
            r3 = r5
        Lc2:
            long r12 = r12 + r3
            r11.f68690e = r12
            goto L7b
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.matrix.battery.AccBinderCallsStats.merge(com.tencent.mm.matrix.battery.AccBinderCallsStats):void");
    }

    public final void setAccBeginTime(long j17) {
        this.accBeginTime = j17;
    }

    public final void setAccBinderCallsStats(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer>> map) {
        kotlin.jvm.internal.o.g(map, "<set-?>");
        this.accBinderCallsStats = map;
    }

    public final void setAccProcName(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.accProcName = str;
    }
}
