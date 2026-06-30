package com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6;

/* renamed from: com.tencent.mm.accessibility.feature.ExtensionsOfActivityAccCallbacksIn_boot */
/* loaded from: classes6.dex */
public enum EnumC4955xb1173005 implements fs.i {
    INSTANCE;

    /* renamed from: com.tencent.mm.accessibility.feature.ExtensionsOfActivityAccCallbacksIn_boot$LazyIterable */
    /* loaded from: classes6.dex */
    public static class LazyIterable<T extends fs.n> implements java.lang.Iterable<fs.q> {

        /* renamed from: com.tencent.mm.accessibility.feature.ExtensionsOfActivityAccCallbacksIn_boot$LazyIterable$LazyIterator */
        /* loaded from: classes6.dex */
        public class LazyIterator implements java.util.Iterator<fs.q> {

            /* renamed from: ELEM_COUNT */
            private static final int f21315x6aff183f = 1;

            /* renamed from: mIndex */
            private int f21316xbe387465;

            private LazyIterator() {
                this.f21316xbe387465 = 0;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f21316xbe387465 < 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public fs.q next() {
                int i17 = this.f21316xbe387465;
                this.f21316xbe387465 = i17 + 1;
                if (i17 == 0) {
                    return com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.EnumC4949x4d437c2d.INSTANCE;
                }
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
            }
        }

        private LazyIterable() {
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<fs.q> iterator() {
            return new com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.EnumC4955xb1173005.LazyIterable.LazyIterator();
        }
    }

    @Override // fs.i
    public java.lang.Iterable<fs.q> all() {
        return new com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.EnumC4955xb1173005.LazyIterable();
    }
}
