package com.p314xaae8f345.p347x615374d.p349x208df1fe.api;

/* renamed from: com.tencent.kinda.framework.api.ExtensionsOfIOfflinePayTsmServicesIn_boot */
/* loaded from: classes6.dex */
public enum EnumC3108x86a04423 implements fs.i {
    INSTANCE;

    /* renamed from: com.tencent.kinda.framework.api.ExtensionsOfIOfflinePayTsmServicesIn_boot$LazyIterable */
    /* loaded from: classes6.dex */
    public static class LazyIterable<T extends fs.n> implements java.lang.Iterable<fs.q> {

        /* renamed from: com.tencent.kinda.framework.api.ExtensionsOfIOfflinePayTsmServicesIn_boot$LazyIterable$LazyIterator */
        /* loaded from: classes6.dex */
        public class LazyIterator implements java.util.Iterator<fs.q> {

            /* renamed from: ELEM_COUNT */
            private static final int f11882x6aff183f = 1;

            /* renamed from: mIndex */
            private int f11883xbe387465;

            private LazyIterator() {
                this.f11883xbe387465 = 0;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f11883xbe387465 < 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public fs.q next() {
                int i17 = this.f11883xbe387465;
                this.f11883xbe387465 = i17 + 1;
                if (i17 == 0) {
                    return com.p314xaae8f345.p347x615374d.p349x208df1fe.EnumC3088x2002fa38.INSTANCE;
                }
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
            }
        }

        private LazyIterable() {
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<fs.q> iterator() {
            return new com.p314xaae8f345.p347x615374d.p349x208df1fe.api.EnumC3108x86a04423.LazyIterable.LazyIterator();
        }
    }

    @Override // fs.i
    public java.lang.Iterable<fs.q> all() {
        return new com.p314xaae8f345.p347x615374d.p349x208df1fe.api.EnumC3108x86a04423.LazyIterable();
    }
}
