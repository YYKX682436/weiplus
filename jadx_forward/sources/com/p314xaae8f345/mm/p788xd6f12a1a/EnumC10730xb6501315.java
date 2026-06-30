package com.p314xaae8f345.mm.p788xd6f12a1a;

/* renamed from: com.tencent.mm.hardcoder.ExtensionsOfWXHardCoderJNIIn_boot */
/* loaded from: classes6.dex */
public enum EnumC10730xb6501315 implements fs.i {
    INSTANCE;

    /* renamed from: com.tencent.mm.hardcoder.ExtensionsOfWXHardCoderJNIIn_boot$LazyIterable */
    /* loaded from: classes6.dex */
    public static class LazyIterable<T extends fs.n> implements java.lang.Iterable<fs.q> {

        /* renamed from: com.tencent.mm.hardcoder.ExtensionsOfWXHardCoderJNIIn_boot$LazyIterable$LazyIterator */
        /* loaded from: classes6.dex */
        public class LazyIterator implements java.util.Iterator<fs.q> {

            /* renamed from: ELEM_COUNT */
            private static final int f28988x6aff183f = 1;

            /* renamed from: mIndex */
            private int f28989xbe387465;

            private LazyIterator() {
                this.f28989xbe387465 = 0;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f28989xbe387465 < 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public fs.q next() {
                int i17 = this.f28989xbe387465;
                this.f28989xbe387465 = i17 + 1;
                if (i17 == 0) {
                    return com.p314xaae8f345.mm.p788xd6f12a1a.EnumC10735x58932f1d.INSTANCE;
                }
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
            }
        }

        private LazyIterable() {
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<fs.q> iterator() {
            return new com.p314xaae8f345.mm.p788xd6f12a1a.EnumC10730xb6501315.LazyIterable.LazyIterator();
        }
    }

    @Override // fs.i
    public java.lang.Iterable<fs.q> all() {
        return new com.p314xaae8f345.mm.p788xd6f12a1a.EnumC10730xb6501315.LazyIterable();
    }
}
