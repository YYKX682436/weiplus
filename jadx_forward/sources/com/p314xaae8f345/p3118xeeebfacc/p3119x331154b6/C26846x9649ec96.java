package com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6;

/* renamed from: com.tencent.unit_rc.cleaner.Cleaner */
/* loaded from: classes16.dex */
public final class C26846x9649ec96 {

    /* renamed from: impl */
    final com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.RunnableC26847x4fd887d6 f57678x316220 = new com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.RunnableC26847x4fd887d6();

    /* renamed from: com.tencent.unit_rc.cleaner.Cleaner$Cleanable */
    /* loaded from: classes16.dex */
    public interface Cleanable {
        /* renamed from: clean */
        void mo106055x5a5b649();
    }

    private C26846x9649ec96() {
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.C26846x9649ec96 m106053xaf65a0fc() {
        com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.C26846x9649ec96 c26846x9649ec96 = new com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.C26846x9649ec96();
        c26846x9649ec96.f57678x316220.m106058x68ac462(c26846x9649ec96);
        return c26846x9649ec96;
    }

    /* renamed from: register */
    public com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.C26846x9649ec96.Cleanable m106054xd6dc2ea3(java.lang.Object obj, java.lang.Runnable runnable) {
        java.util.Objects.requireNonNull(obj, "obj");
        java.util.Objects.requireNonNull(runnable, "action");
        return new com.p314xaae8f345.p3118xeeebfacc.p3119x331154b6.RunnableC26847x4fd887d6.PhantomCleanableRef(obj, this, runnable);
    }
}
