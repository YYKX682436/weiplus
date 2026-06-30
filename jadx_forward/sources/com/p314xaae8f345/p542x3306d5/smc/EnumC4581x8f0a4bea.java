package com.p314xaae8f345.p542x3306d5.smc;

/* renamed from: com.tencent.mars.smc.ExtensionsOfUDRKVCommReportFeatureServiceIn_boot */
/* loaded from: classes6.dex */
public enum EnumC4581x8f0a4bea implements fs.i {
    INSTANCE;

    /* renamed from: com.tencent.mars.smc.ExtensionsOfUDRKVCommReportFeatureServiceIn_boot$LazyIterable */
    /* loaded from: classes6.dex */
    public static class LazyIterable<T extends fs.n> implements java.lang.Iterable<fs.q> {

        /* renamed from: com.tencent.mars.smc.ExtensionsOfUDRKVCommReportFeatureServiceIn_boot$LazyIterable$LazyIterator */
        /* loaded from: classes6.dex */
        public class LazyIterator implements java.util.Iterator<fs.q> {

            /* renamed from: ELEM_COUNT */
            private static final int f19527x6aff183f = 1;

            /* renamed from: mIndex */
            private int f19528xbe387465;

            private LazyIterator() {
                this.f19528xbe387465 = 0;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f19528xbe387465 < 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public fs.q next() {
                int i17 = this.f19528xbe387465;
                this.f19528xbe387465 = i17 + 1;
                if (i17 == 0) {
                    return com.p314xaae8f345.p542x3306d5.smc.EnumC4590x1f5279de.INSTANCE;
                }
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
            }
        }

        private LazyIterable() {
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<fs.q> iterator() {
            return new com.p314xaae8f345.p542x3306d5.smc.EnumC4581x8f0a4bea.LazyIterable.LazyIterator();
        }
    }

    @Override // fs.i
    public java.lang.Iterable<fs.q> all() {
        return new com.p314xaae8f345.p542x3306d5.smc.EnumC4581x8f0a4bea.LazyIterable();
    }
}
