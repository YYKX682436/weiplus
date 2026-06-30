package com.tencent.maas.instamovie;

/* loaded from: classes13.dex */
public class MJTaskTrace {
    public static final int TASK_TRAIT_NETWORK = 0;
    private final java.util.Map<java.lang.Long, com.tencent.maas.instamovie.MJTaskTrace.Entry> entryMap;
    private final java.lang.String name;

    /* loaded from: classes13.dex */
    public class Entry {
        private final double duration;
        private final boolean hasSubTask;

        /* renamed from: id, reason: collision with root package name */
        private final long f48171id;
        private final boolean isComplete;
        private final java.lang.String name;
        private final java.util.BitSet traits;

        public Entry(long j17, java.lang.String str, double d17, long j18, boolean z17, boolean z18) {
            this.f48171id = j17;
            this.name = str;
            this.duration = d17;
            java.util.BitSet bitSet = new java.util.BitSet();
            this.traits = bitSet;
            if ((j18 & 0) != 0) {
                bitSet.set(0);
            }
            this.isComplete = z17;
            this.hasSubTask = z18;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.tencent.maas.instamovie.MJTaskTrace.Entry entry = (com.tencent.maas.instamovie.MJTaskTrace.Entry) obj;
            return this.f48171id == entry.f48171id && this.duration == entry.duration && this.isComplete == entry.isComplete && this.hasSubTask == entry.hasSubTask;
        }

        public double getDuration() {
            return this.duration;
        }

        public long getId() {
            return this.f48171id;
        }

        public java.lang.String getName() {
            return this.name;
        }

        public java.util.BitSet getTraits() {
            return this.traits;
        }

        public boolean hasSubTask() {
            return this.hasSubTask;
        }

        public int hashCode() {
            long j17 = this.f48171id;
            return (int) (j17 ^ (j17 >>> 32));
        }

        public boolean isComplete() {
            return this.isComplete;
        }

        public java.lang.String toString() {
            return "Entry{id=" + this.f48171id + ", name='" + this.name + "', duration=" + this.duration + ", traits=" + this.traits + ", isComplete=" + this.isComplete + ", hasSubTask=" + this.hasSubTask + '}';
        }
    }

    public MJTaskTrace(double d17, java.nio.ByteBuffer byteBuffer) {
        vg.h parseFrom = vg.h.parseFrom(byteBuffer);
        this.name = parseFrom.getTraceName();
        this.entryMap = new java.util.HashMap();
        for (vg.d dVar : parseFrom.getTaskTimeTraceList()) {
            boolean z17 = !java.lang.Double.isNaN(dVar.getDuration());
            com.tencent.maas.instamovie.MJTaskTrace.Entry entry = new com.tencent.maas.instamovie.MJTaskTrace.Entry(dVar.getTaskId(), dVar.getTaskName(), z17 ? dVar.getDuration() : d17 - dVar.getStartTime(), dVar.getTaskTraits(), z17, dVar.getSubTaskIdCount() > 0);
            this.entryMap.put(java.lang.Long.valueOf(entry.getId()), entry);
        }
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.util.List<com.tencent.maas.instamovie.MJTaskTrace.Entry> getRunningLeafEntries() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.maas.instamovie.MJTaskTrace.Entry entry : this.entryMap.values()) {
            if (!entry.isComplete() && !entry.hasSubTask()) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }
}
