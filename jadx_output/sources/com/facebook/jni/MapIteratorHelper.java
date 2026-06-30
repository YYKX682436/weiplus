package com.facebook.jni;

/* loaded from: classes.dex */
public class MapIteratorHelper {
    private final java.util.Iterator<java.util.Map.Entry> mIterator;
    private java.lang.Object mKey;
    private java.lang.Object mValue;

    public MapIteratorHelper(java.util.Map map) {
        this.mIterator = map.entrySet().iterator();
    }

    public boolean hasNext() {
        if (!this.mIterator.hasNext()) {
            this.mKey = null;
            this.mValue = null;
            return false;
        }
        java.util.Map.Entry next = this.mIterator.next();
        this.mKey = next.getKey();
        this.mValue = next.getValue();
        return true;
    }
}
