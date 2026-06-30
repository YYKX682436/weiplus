package com.p166x1da19ac6.jni;

/* renamed from: com.facebook.jni.IteratorHelper */
/* loaded from: classes.dex */
public class C1546xab2945dc {

    /* renamed from: mElement */
    private java.lang.Object f5077x3afbd1cf;

    /* renamed from: mIterator */
    private final java.util.Iterator f5078x6b79affb;

    public C1546xab2945dc(java.util.Iterator it) {
        this.f5078x6b79affb = it;
    }

    /* renamed from: hasNext */
    public boolean m16730x2987b4ad() {
        if (this.f5078x6b79affb.hasNext()) {
            this.f5077x3afbd1cf = this.f5078x6b79affb.next();
            return true;
        }
        this.f5077x3afbd1cf = null;
        return false;
    }

    public C1546xab2945dc(java.lang.Iterable iterable) {
        this.f5078x6b79affb = iterable.iterator();
    }
}
