package com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31;

/* renamed from: com.tencent.kinda.framework.jsapi.ExtensionsOfKindaJSInvokeListenerIn_boot */
/* loaded from: classes6.dex */
public enum EnumC3165x127f35f5 implements fs.i {
    INSTANCE;

    /* renamed from: com.tencent.kinda.framework.jsapi.ExtensionsOfKindaJSInvokeListenerIn_boot$LazyIterable */
    /* loaded from: classes6.dex */
    public static class LazyIterable<T extends fs.n> implements java.lang.Iterable<fs.q> {

        /* renamed from: com.tencent.kinda.framework.jsapi.ExtensionsOfKindaJSInvokeListenerIn_boot$LazyIterable$LazyIterator */
        /* loaded from: classes6.dex */
        public class LazyIterator implements java.util.Iterator<fs.q> {

            /* renamed from: ELEM_COUNT */
            private static final int f12205x6aff183f = 1;

            /* renamed from: mIndex */
            private int f12206xbe387465;

            private LazyIterator() {
                this.f12206xbe387465 = 0;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f12206xbe387465 < 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public fs.q next() {
                int i17 = this.f12206xbe387465;
                this.f12206xbe387465 = i17 + 1;
                if (i17 == 0) {
                    return com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.EnumC3172x7a1f4c33.INSTANCE;
                }
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
            }
        }

        private LazyIterable() {
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<fs.q> iterator() {
            return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.EnumC3165x127f35f5.LazyIterable.LazyIterator();
        }
    }

    @Override // fs.i
    public java.lang.Iterable<fs.q> all() {
        return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.EnumC3165x127f35f5.LazyIterable();
    }
}
