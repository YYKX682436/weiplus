package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.Flag */
/* loaded from: classes.dex */
public abstract class AbstractC29308x21738c {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73291x7118e671 = false;

    /* renamed from: sFlagsCreated */
    private static java.util.HashMap<java.lang.String, org.p3343x72743996.p3344x2e06d1.AbstractC29308x21738c> f73292x91f55274 = new java.util.HashMap<>();

    /* renamed from: mFeatureName */
    protected final java.lang.String f73293x93920ff4;

    /* renamed from: mValue */
    protected java.lang.Boolean f73294xbee9dd04;

    public AbstractC29308x21738c(java.lang.String str) {
        this.f73293x93920ff4 = str;
        f73292x91f55274.put(str, this);
    }

    /* renamed from: resetAllInMemoryCachedValuesForTesting */
    public static void m152430xcf3999a3() {
        java.util.Iterator<org.p3343x72743996.p3344x2e06d1.AbstractC29308x21738c> it = f73292x91f55274.values().iterator();
        while (it.hasNext()) {
            it.next().m152432x86192da3();
        }
    }

    /* renamed from: resetFlagsForTesting */
    public static void m152431x3dd1f99f() {
        m152430xcf3999a3();
        f73292x91f55274.clear();
    }

    /* renamed from: clearInMemoryCachedValueForTesting */
    public abstract void m152432x86192da3();

    /* renamed from: getFeatureName */
    public java.lang.String m152433xc35b456b() {
        return this.f73293x93920ff4;
    }

    /* renamed from: isEnabled */
    public abstract boolean m152434x7d80d2b7();
}
