package com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8;

/* renamed from: com.tencent.mm.plugin.zero.ExtensionsOfLoadProtocolJNIServiceIn_boot */
/* loaded from: classes6.dex */
public enum EnumC19571xdf0a8cf3 implements fs.i {
    INSTANCE;

    /* renamed from: com.tencent.mm.plugin.zero.ExtensionsOfLoadProtocolJNIServiceIn_boot$LazyIterable */
    /* loaded from: classes6.dex */
    public static class LazyIterable<T extends fs.n> implements java.lang.Iterable<fs.q> {

        /* renamed from: com.tencent.mm.plugin.zero.ExtensionsOfLoadProtocolJNIServiceIn_boot$LazyIterable$LazyIterator */
        /* loaded from: classes6.dex */
        public class LazyIterator implements java.util.Iterator<fs.q> {

            /* renamed from: ELEM_COUNT */
            private static final int f38809x6aff183f = 1;

            /* renamed from: mIndex */
            private int f38810xbe387465;

            private LazyIterator() {
                this.f38810xbe387465 = 0;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f38810xbe387465 < 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public fs.q next() {
                int i17 = this.f38810xbe387465;
                this.f38810xbe387465 = i17 + 1;
                if (i17 == 0) {
                    return com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.EnumC19575x61ebbbf.INSTANCE;
                }
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
            }
        }

        private LazyIterable() {
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<fs.q> iterator() {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.EnumC19571xdf0a8cf3.LazyIterable.LazyIterator();
        }
    }

    @Override // fs.i
    public java.lang.Iterable<fs.q> all() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.EnumC19571xdf0a8cf3.LazyIterable();
    }
}
