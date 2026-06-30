package com.p166x1da19ac6.jni;

/* renamed from: com.facebook.jni.MapIteratorHelper */
/* loaded from: classes.dex */
public class C1547xb6849a18 {

    /* renamed from: mIterator */
    private final java.util.Iterator<java.util.Map.Entry> f5079x6b79affb;

    /* renamed from: mKey */
    private java.lang.Object f5080x32b2b2;

    /* renamed from: mValue */
    private java.lang.Object f5081xbee9dd04;

    public C1547xb6849a18(java.util.Map map) {
        this.f5079x6b79affb = map.entrySet().iterator();
    }

    /* renamed from: hasNext */
    public boolean m16731x2987b4ad() {
        if (!this.f5079x6b79affb.hasNext()) {
            this.f5080x32b2b2 = null;
            this.f5081xbee9dd04 = null;
            return false;
        }
        java.util.Map.Entry next = this.f5079x6b79affb.next();
        this.f5080x32b2b2 = next.getKey();
        this.f5081xbee9dd04 = next.getValue();
        return true;
    }
}
