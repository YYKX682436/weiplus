package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db;

/* renamed from: com.tencent.kinda.framework.widget.tools.ExtensionsOfKindaStaticActivityLifeCycleCallbacksIn_boot */
/* loaded from: classes6.dex */
public enum EnumC3366xc31f7429 implements fs.i {
    INSTANCE;

    /* renamed from: com.tencent.kinda.framework.widget.tools.ExtensionsOfKindaStaticActivityLifeCycleCallbacksIn_boot$LazyIterable */
    /* loaded from: classes6.dex */
    public static class LazyIterable<T extends fs.n> implements java.lang.Iterable<fs.q> {

        /* renamed from: com.tencent.kinda.framework.widget.tools.ExtensionsOfKindaStaticActivityLifeCycleCallbacksIn_boot$LazyIterable$LazyIterator */
        /* loaded from: classes6.dex */
        public class LazyIterator implements java.util.Iterator<fs.q> {

            /* renamed from: ELEM_COUNT */
            private static final int f13328x6aff183f = 1;

            /* renamed from: mIndex */
            private int f13329xbe387465;

            private LazyIterator() {
                this.f13329xbe387465 = 0;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f13329xbe387465 < 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public fs.q next() {
                int i17 = this.f13329xbe387465;
                this.f13329xbe387465 = i17 + 1;
                if (i17 == 0) {
                    return com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.EnumC3372xe8de7f.INSTANCE;
                }
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
            }
        }

        private LazyIterable() {
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<fs.q> iterator() {
            return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.EnumC3366xc31f7429.LazyIterable.LazyIterator();
        }
    }

    @Override // fs.i
    public java.lang.Iterable<fs.q> all() {
        return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.EnumC3366xc31f7429.LazyIterable();
    }
}
