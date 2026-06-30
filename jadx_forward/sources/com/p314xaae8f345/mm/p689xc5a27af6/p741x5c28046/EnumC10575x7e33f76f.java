package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* renamed from: com.tencent.mm.feature.emoji.ExtensionsOfGIFJNIFactoryFeatureServiceIn_boot */
/* loaded from: classes6.dex */
public enum EnumC10575x7e33f76f implements fs.i {
    INSTANCE;

    /* renamed from: com.tencent.mm.feature.emoji.ExtensionsOfGIFJNIFactoryFeatureServiceIn_boot$LazyIterable */
    /* loaded from: classes6.dex */
    public static class LazyIterable<T extends fs.n> implements java.lang.Iterable<fs.q> {

        /* renamed from: com.tencent.mm.feature.emoji.ExtensionsOfGIFJNIFactoryFeatureServiceIn_boot$LazyIterable$LazyIterator */
        /* loaded from: classes6.dex */
        public class LazyIterator implements java.util.Iterator<fs.q> {

            /* renamed from: ELEM_COUNT */
            private static final int f28837x6aff183f = 1;

            /* renamed from: mIndex */
            private int f28838xbe387465;

            private LazyIterator() {
                this.f28838xbe387465 = 0;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f28838xbe387465 < 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public fs.q next() {
                int i17 = this.f28838xbe387465;
                this.f28838xbe387465 = i17 + 1;
                if (i17 == 0) {
                    return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.EnumC10579xbc9955b9.INSTANCE;
                }
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
            }
        }

        private LazyIterable() {
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<fs.q> iterator() {
            return new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.EnumC10575x7e33f76f.LazyIterable.LazyIterator();
        }
    }

    @Override // fs.i
    public java.lang.Iterable<fs.q> all() {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.EnumC10575x7e33f76f.LazyIterable();
    }
}
