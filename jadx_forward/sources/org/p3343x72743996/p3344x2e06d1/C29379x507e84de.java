package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.UnownedUserDataKey */
/* loaded from: classes16.dex */
public final class C29379x507e84de<T extends org.p3343x72743996.p3344x2e06d1.InterfaceC29376x1b753dc1> {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73486x7118e671 = false;

    /* renamed from: mClazz */
    private final java.lang.Class<T> f73487xbde2f5eb;

    /* renamed from: mWeakHostAttachments */
    private final java.util.Set<org.p3343x72743996.p3344x2e06d1.C29377xbf50df09> f73488xf84b2ca3 = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    public C29379x507e84de(java.lang.Class<T> cls) {
        this.f73487xbde2f5eb = cls;
    }

    /* renamed from: assertNoDestroyedAttachments */
    private void m152762x479fe21e() {
        if (org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73669xed5d0f11) {
            java.util.Iterator<org.p3343x72743996.p3344x2e06d1.C29377xbf50df09> it = this.f73488xf84b2ca3.iterator();
            while (it.hasNext()) {
                if (it.next().m152760xbca8d80f()) {
                    throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    /* renamed from: removeHostAttachment */
    private void m152763x4243c68f(org.p3343x72743996.p3344x2e06d1.C29377xbf50df09 c29377xbf50df09) {
        c29377xbf50df09.m152761xc84af884(this);
        this.f73488xf84b2ca3.remove(c29377xbf50df09);
    }

    /* renamed from: attachToHost */
    public final void m152764x80581568(org.p3343x72743996.p3344x2e06d1.C29377xbf50df09 c29377xbf50df09, T t17) {
        java.util.Objects.requireNonNull(t17);
        c29377xbf50df09.set(this, t17);
        if (m152770x25c9e951(c29377xbf50df09)) {
            return;
        }
        this.f73488xf84b2ca3.add(c29377xbf50df09);
    }

    /* renamed from: detachFromAllHosts */
    public final void m152765xff660ba7(T t17) {
        m152762x479fe21e();
        java.util.Iterator it = new java.util.ArrayList(this.f73488xf84b2ca3).iterator();
        while (it.hasNext()) {
            org.p3343x72743996.p3344x2e06d1.C29377xbf50df09 c29377xbf50df09 = (org.p3343x72743996.p3344x2e06d1.C29377xbf50df09) it.next();
            if (t17.equals(c29377xbf50df09.get(this))) {
                m152763x4243c68f(c29377xbf50df09);
            }
        }
    }

    /* renamed from: detachFromHost */
    public final void m152766xa953d525(org.p3343x72743996.p3344x2e06d1.C29377xbf50df09 c29377xbf50df09) {
        m152762x479fe21e();
        java.util.Iterator it = new java.util.ArrayList(this.f73488xf84b2ca3).iterator();
        while (it.hasNext()) {
            org.p3343x72743996.p3344x2e06d1.C29377xbf50df09 c29377xbf50df092 = (org.p3343x72743996.p3344x2e06d1.C29377xbf50df09) it.next();
            if (c29377xbf50df09.equals(c29377xbf50df092)) {
                m152763x4243c68f(c29377xbf50df092);
            }
        }
    }

    /* renamed from: getHostAttachmentCount */
    public int m152767x2df8dfae(T t17) {
        m152762x479fe21e();
        java.util.Iterator<org.p3343x72743996.p3344x2e06d1.C29377xbf50df09> it = this.f73488xf84b2ca3.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (t17.equals(it.next().get(this))) {
                i17++;
            }
        }
        return i17;
    }

    /* renamed from: getValueClass */
    public final java.lang.Class<T> m152768x667d1e7d() {
        return this.f73487xbde2f5eb;
    }

    /* renamed from: isAttachedToAnyHost */
    public final boolean m152769xfe80d6b(T t17) {
        return m152767x2df8dfae(t17) > 0;
    }

    /* renamed from: isAttachedToHost */
    public final boolean m152770x25c9e951(org.p3343x72743996.p3344x2e06d1.C29377xbf50df09 c29377xbf50df09) {
        return m152771x850cc098(c29377xbf50df09) != null;
    }

    /* renamed from: retrieveDataFromHost */
    public final T m152771x850cc098(org.p3343x72743996.p3344x2e06d1.C29377xbf50df09 c29377xbf50df09) {
        m152762x479fe21e();
        java.util.Iterator<org.p3343x72743996.p3344x2e06d1.C29377xbf50df09> it = this.f73488xf84b2ca3.iterator();
        while (it.hasNext()) {
            if (c29377xbf50df09.equals(it.next())) {
                return (T) c29377xbf50df09.get(this);
            }
        }
        return null;
    }
}
