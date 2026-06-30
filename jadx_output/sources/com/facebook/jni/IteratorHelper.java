package com.facebook.jni;

/* loaded from: classes.dex */
public class IteratorHelper {
    private java.lang.Object mElement;
    private final java.util.Iterator mIterator;

    public IteratorHelper(java.util.Iterator it) {
        this.mIterator = it;
    }

    public boolean hasNext() {
        if (this.mIterator.hasNext()) {
            this.mElement = this.mIterator.next();
            return true;
        }
        this.mElement = null;
        return false;
    }

    public IteratorHelper(java.lang.Iterable iterable) {
        this.mIterator = iterable.iterator();
    }
}
