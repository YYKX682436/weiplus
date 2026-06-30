package com.tencent.mm.feature.emoji.api;

/* loaded from: classes6.dex */
public enum ExtensionsOfIGIFJNIServiceIn_boot implements fs.i {
    INSTANCE;

    /* loaded from: classes6.dex */
    public static class LazyIterable<T extends fs.n> implements java.lang.Iterable<fs.q> {

        /* loaded from: classes6.dex */
        public class LazyIterator implements java.util.Iterator<fs.q> {
            private static final int ELEM_COUNT = 1;
            private int mIndex;

            private LazyIterator() {
                this.mIndex = 0;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.mIndex < 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public fs.q next() {
                int i17 = this.mIndex;
                this.mIndex = i17 + 1;
                if (i17 == 0) {
                    return com.tencent.mm.feature.emoji.GIFJNIFeatureServiceProvider.INSTANCE;
                }
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
            }
        }

        private LazyIterable() {
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<fs.q> iterator() {
            return new com.tencent.mm.feature.emoji.api.ExtensionsOfIGIFJNIServiceIn_boot.LazyIterable.LazyIterator();
        }
    }

    @Override // fs.i
    public java.lang.Iterable<fs.q> all() {
        return new com.tencent.mm.feature.emoji.api.ExtensionsOfIGIFJNIServiceIn_boot.LazyIterable();
    }
}
