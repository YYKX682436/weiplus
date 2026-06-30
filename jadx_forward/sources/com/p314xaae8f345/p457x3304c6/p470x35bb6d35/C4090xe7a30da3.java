package com.p314xaae8f345.p457x3304c6.p470x35bb6d35;

/* renamed from: com.tencent.maas.instamovie.MJTaskTrace */
/* loaded from: classes13.dex */
public class C4090xe7a30da3 {

    /* renamed from: TASK_TRAIT_NETWORK */
    public static final int f16048x3e792b83 = 0;

    /* renamed from: entryMap */
    private final java.util.Map<java.lang.Long, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3.Entry> f16049x8334f78a;

    /* renamed from: name */
    private final java.lang.String f16050x337a8b;

    /* renamed from: com.tencent.maas.instamovie.MJTaskTrace$Entry */
    /* loaded from: classes13.dex */
    public class Entry {

        /* renamed from: duration */
        private final double f16051x89444d94;

        /* renamed from: hasSubTask */
        private final boolean f16052x9c40beb;

        /* renamed from: id, reason: collision with root package name */
        private final long f129704id;

        /* renamed from: isComplete */
        private final boolean f16053xacfcd883;

        /* renamed from: name */
        private final java.lang.String f16054x337a8b;

        /* renamed from: traits */
        private final java.util.BitSet f16056xcc665025;

        public Entry(long j17, java.lang.String str, double d17, long j18, boolean z17, boolean z18) {
            this.f129704id = j17;
            this.f16054x337a8b = str;
            this.f16051x89444d94 = d17;
            java.util.BitSet bitSet = new java.util.BitSet();
            this.f16056xcc665025 = bitSet;
            if ((j18 & 0) != 0) {
                bitSet.set(0);
            }
            this.f16053xacfcd883 = z17;
            this.f16052x9c40beb = z18;
        }

        /* renamed from: equals */
        public boolean m33734xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3.Entry entry = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3.Entry) obj;
            return this.f129704id == entry.f129704id && this.f16051x89444d94 == entry.f16051x89444d94 && this.f16053xacfcd883 == entry.f16053xacfcd883 && this.f16052x9c40beb == entry.f16052x9c40beb;
        }

        /* renamed from: getDuration */
        public double m33735x51e8b0a() {
            return this.f16051x89444d94;
        }

        /* renamed from: getId */
        public long m33736x5db1b11() {
            return this.f129704id;
        }

        /* renamed from: getName */
        public java.lang.String m33737xfb82e301() {
            return this.f16054x337a8b;
        }

        /* renamed from: getTraits */
        public java.util.BitSet m33738x317d731b() {
            return this.f16056xcc665025;
        }

        /* renamed from: hasSubTask */
        public boolean m33739x9c40beb() {
            return this.f16052x9c40beb;
        }

        /* renamed from: hashCode */
        public int m33740x8cdac1b() {
            long j17 = this.f129704id;
            return (int) (j17 ^ (j17 >>> 32));
        }

        /* renamed from: isComplete */
        public boolean m33741xacfcd883() {
            return this.f16053xacfcd883;
        }

        /* renamed from: toString */
        public java.lang.String m33742x9616526c() {
            return "Entry{id=" + this.f129704id + ", name='" + this.f16054x337a8b + "', duration=" + this.f16051x89444d94 + ", traits=" + this.f16056xcc665025 + ", isComplete=" + this.f16053xacfcd883 + ", hasSubTask=" + this.f16052x9c40beb + '}';
        }
    }

    public C4090xe7a30da3(double d17, java.nio.ByteBuffer byteBuffer) {
        vg.h m171933x92b714fd = vg.h.m171933x92b714fd(byteBuffer);
        this.f16050x337a8b = m171933x92b714fd.m171947x2a9626ba();
        this.f16049x8334f78a = new java.util.HashMap();
        for (vg.d dVar : m171933x92b714fd.m171942xf184f0fb()) {
            boolean z17 = !java.lang.Double.isNaN(dVar.m171894x51e8b0a());
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3.Entry entry = new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3.Entry(dVar.m171900x30961476(), dVar.m171901x63651726(), z17 ? dVar.m171894x51e8b0a() : d17 - dVar.m171896x8082fb99(), dVar.m171905x29a33200(), z17, dVar.m171898x8e06ae05() > 0);
            this.f16049x8334f78a.put(java.lang.Long.valueOf(entry.m33736x5db1b11()), entry);
        }
    }

    /* renamed from: getName */
    public java.lang.String m33732xfb82e301() {
        return this.f16050x337a8b;
    }

    /* renamed from: getRunningLeafEntries */
    public java.util.List<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3.Entry> m33733x66884e09() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4090xe7a30da3.Entry entry : this.f16049x8334f78a.values()) {
            if (!entry.m33741xacfcd883() && !entry.m33739x9c40beb()) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }
}
