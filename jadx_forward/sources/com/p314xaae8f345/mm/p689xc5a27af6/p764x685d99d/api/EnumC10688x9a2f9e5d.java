package com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api;

/* renamed from: com.tencent.mm.feature.sight.api.ExtensionsOfISightJNIServiceIn_boot */
/* loaded from: classes6.dex */
public enum EnumC10688x9a2f9e5d implements fs.i {
    INSTANCE;

    /* renamed from: com.tencent.mm.feature.sight.api.ExtensionsOfISightJNIServiceIn_boot$LazyIterable */
    /* loaded from: classes6.dex */
    public static class LazyIterable<T extends fs.n> implements java.lang.Iterable<fs.q> {

        /* renamed from: com.tencent.mm.feature.sight.api.ExtensionsOfISightJNIServiceIn_boot$LazyIterable$LazyIterator */
        /* loaded from: classes6.dex */
        public class LazyIterator implements java.util.Iterator<fs.q> {

            /* renamed from: ELEM_COUNT */
            private static final int f28929x6aff183f = 1;

            /* renamed from: mIndex */
            private int f28930xbe387465;

            private LazyIterator() {
                this.f28930xbe387465 = 0;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f28930xbe387465 < 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public fs.q next() {
                int i17 = this.f28930xbe387465;
                this.f28930xbe387465 = i17 + 1;
                if (i17 == 0) {
                    return be0.f.INSTANCE;
                }
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
            }
        }

        private LazyIterable() {
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<fs.q> iterator() {
            return new com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.EnumC10688x9a2f9e5d.LazyIterable.LazyIterator();
        }
    }

    @Override // fs.i
    public java.lang.Iterable<fs.q> all() {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.EnumC10688x9a2f9e5d.LazyIterable();
    }
}
