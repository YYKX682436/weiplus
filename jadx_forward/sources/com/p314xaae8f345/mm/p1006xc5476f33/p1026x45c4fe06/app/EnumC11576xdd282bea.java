package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* renamed from: com.tencent.mm.plugin.appbrand.app.ExtensionsOfZstdJNIWrapperIn_boot */
/* loaded from: classes6.dex */
public enum EnumC11576xdd282bea implements fs.i {
    INSTANCE;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.ExtensionsOfZstdJNIWrapperIn_boot$LazyIterable */
    /* loaded from: classes6.dex */
    public static class LazyIterable<T extends fs.n> implements java.lang.Iterable<fs.q> {

        /* renamed from: com.tencent.mm.plugin.appbrand.app.ExtensionsOfZstdJNIWrapperIn_boot$LazyIterable$LazyIterator */
        /* loaded from: classes6.dex */
        public class LazyIterator implements java.util.Iterator<fs.q> {

            /* renamed from: ELEM_COUNT */
            private static final int f33427x6aff183f = 1;

            /* renamed from: mIndex */
            private int f33428xbe387465;

            private LazyIterator() {
                this.f33428xbe387465 = 0;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f33428xbe387465 < 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public fs.q next() {
                int i17 = this.f33428xbe387465;
                this.f33428xbe387465 = i17 + 1;
                if (i17 == 0) {
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.EnumC11581x2854e0a8.INSTANCE;
                }
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
            }
        }

        private LazyIterable() {
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<fs.q> iterator() {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.EnumC11576xdd282bea.LazyIterable.LazyIterator();
        }
    }

    @Override // fs.i
    public java.lang.Iterable<fs.q> all() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.EnumC11576xdd282bea.LazyIterable();
    }
}
