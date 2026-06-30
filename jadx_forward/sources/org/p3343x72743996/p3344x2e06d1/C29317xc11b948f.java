package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.LifetimeAssert */
/* loaded from: classes16.dex */
public class C29317xc11b948f {

    /* renamed from: sTestHook */
    static org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.TestHook f73316x5a385668;

    /* renamed from: mTarget */
    private final java.lang.Object f73317x1aea985e;

    /* renamed from: mWrapper */
    final org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.WrappedReference f73318xfd323766;

    /* renamed from: org.chromium.base.LifetimeAssert$CreationException */
    /* loaded from: classes16.dex */
    public static class CreationException extends java.lang.RuntimeException {
        public CreationException() {
            super("vvv This is where object was created. vvv");
        }
    }

    /* renamed from: org.chromium.base.LifetimeAssert$LifetimeAssertException */
    /* loaded from: classes16.dex */
    public static class LifetimeAssertException extends java.lang.RuntimeException {
        public LifetimeAssertException(java.lang.String str, java.lang.Throwable th6) {
            super(str, th6);
        }
    }

    /* renamed from: org.chromium.base.LifetimeAssert$TestHook */
    /* loaded from: classes16.dex */
    public interface TestHook {
        /* renamed from: onCleaned */
        void m152472x82b755c9(org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.WrappedReference wrappedReference, java.lang.String str);
    }

    /* renamed from: org.chromium.base.LifetimeAssert$WrappedReference */
    /* loaded from: classes16.dex */
    public static class WrappedReference extends java.lang.ref.PhantomReference<java.lang.Object> {

        /* renamed from: mCreationException */
        final org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.CreationException f73321xdbd75343;

        /* renamed from: mSafeToGc */
        boolean f73322x8e26b171;

        /* renamed from: mTargetClass */
        final java.lang.Class<?> f73323x2c3eabba;

        /* renamed from: sReferenceQueue */
        private static java.lang.ref.ReferenceQueue<java.lang.Object> f73320xafd347d9 = new java.lang.ref.ReferenceQueue<>();

        /* renamed from: sActiveWrappers */
        private static java.util.Set<org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.WrappedReference> f73319x22a412b9 = java.util.Collections.synchronizedSet(new java.util.HashSet());

        static {
            new java.lang.Thread("GcStateAssertQueue") { // from class: org.chromium.base.LifetimeAssert.WrappedReference.1
                {
                    setDaemon(true);
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.WrappedReference wrappedReference;
                    java.lang.String format;
                    while (true) {
                        try {
                            wrappedReference = (org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.WrappedReference) org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.WrappedReference.f73320xafd347d9.remove();
                            if (org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.WrappedReference.f73319x22a412b9.remove(wrappedReference)) {
                                if (!wrappedReference.f73322x8e26b171) {
                                    format = java.lang.String.format("Object of type %s was GC'ed without cleanup. Refer to \"Caused by\" for where object was created.", wrappedReference.f73323x2c3eabba.getName());
                                    org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.TestHook testHook = org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.f73316x5a385668;
                                    if (testHook == null) {
                                        break;
                                    } else {
                                        testHook.m152472x82b755c9(wrappedReference, format);
                                    }
                                } else {
                                    org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.TestHook testHook2 = org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.f73316x5a385668;
                                    if (testHook2 != null) {
                                        testHook2.m152472x82b755c9(wrappedReference, null);
                                    }
                                }
                            }
                        } catch (java.lang.InterruptedException e17) {
                            throw new java.lang.RuntimeException(e17);
                        }
                    }
                    throw new org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.LifetimeAssertException(format, wrappedReference.f73321xdbd75343);
                }
            };
        }

        public WrappedReference(java.lang.Object obj, org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.CreationException creationException, boolean z17) {
            super(obj, f73320xafd347d9);
            this.f73321xdbd75343 = creationException;
            this.f73322x8e26b171 = z17;
            this.f73323x2c3eabba = obj.getClass();
            f73319x22a412b9.add(this);
        }
    }

    private C29317xc11b948f(org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.WrappedReference wrappedReference, java.lang.Object obj) {
        this.f73318xfd323766 = wrappedReference;
        this.f73317x1aea985e = obj;
    }

    /* renamed from: assertAllInstancesDestroyedForTesting */
    public static void m152467x1b004abd() {
        if (org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73669xed5d0f11) {
            synchronized (org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.WrappedReference.f73319x22a412b9) {
                try {
                    for (org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.WrappedReference wrappedReference : org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.WrappedReference.f73319x22a412b9) {
                        if (!wrappedReference.f73322x8e26b171) {
                            throw new org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.LifetimeAssertException(java.lang.String.format("Object of type %s was not destroyed after test completed. Refer to \"Caused by\" for where object was created.", wrappedReference.f73323x2c3eabba.getName()), wrappedReference.f73321xdbd75343);
                        }
                    }
                } finally {
                    org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.WrappedReference.f73319x22a412b9.clear();
                }
            }
        }
    }

    /* renamed from: create */
    public static org.p3343x72743996.p3344x2e06d1.C29317xc11b948f m152468xaf65a0fc(java.lang.Object obj) {
        if (org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73669xed5d0f11) {
            return new org.p3343x72743996.p3344x2e06d1.C29317xc11b948f(new org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.WrappedReference(obj, new org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.CreationException(), false), obj);
        }
        return null;
    }

    /* renamed from: resetForTesting */
    public static void m152470x2c3fdbb6() {
        if (org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73669xed5d0f11) {
            org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.WrappedReference.f73319x22a412b9.clear();
        }
    }

    /* renamed from: setSafeToGc */
    public static void m152471xdfbba866(org.p3343x72743996.p3344x2e06d1.C29317xc11b948f c29317xc11b948f, boolean z17) {
        if (org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73669xed5d0f11) {
            synchronized (c29317xc11b948f.f73317x1aea985e) {
                c29317xc11b948f.f73318xfd323766.f73322x8e26b171 = z17;
            }
        }
    }

    /* renamed from: create */
    public static org.p3343x72743996.p3344x2e06d1.C29317xc11b948f m152469xaf65a0fc(java.lang.Object obj, boolean z17) {
        if (org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73669xed5d0f11) {
            return new org.p3343x72743996.p3344x2e06d1.C29317xc11b948f(new org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.WrappedReference(obj, new org.p3343x72743996.p3344x2e06d1.C29317xc11b948f.CreationException(), z17), obj);
        }
        return null;
    }
}
