package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.AffNewLifeSyncManager */
/* loaded from: classes8.dex */
public class C27379x973a84d7 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27684xbd82548f {

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27379x973a84d7 f59704x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27379x973a84d7();

    public C27379x973a84d7() {
        m119450xee932d13("newlife.AffNewLifeSyncManager@Get", null);
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27379x973a84d7 m113806x9cf0d20b() {
        return f59704x21169495;
    }

    /* renamed from: dispatchHandleCmdItem */
    public void m113807x1fa131cb(java.util.ArrayList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47> arrayList, int i17) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("dispatchHandleCmdItem");
            c27687xa835a820.m119499x3320ea8a(com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119632xd1dc376e(arrayList));
            c27687xa835a820.m119510x55370fd8(i17);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeSyncManager.dispatchHandleCmdItem failed", e17);
        }
    }

    /* renamed from: doSync */
    public void m113808xb0e85dc6(int i17, int i18, java.lang.String str, int i19) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("doSync");
            c27687xa835a820.m119510x55370fd8(i17);
            c27687xa835a820.m119510x55370fd8(i18);
            c27687xa835a820.m119508x542d00d0(str);
            c27687xa835a820.m119510x55370fd8(i19);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeSyncManager.doSync failed", e17);
        }
    }

    /* renamed from: doSyncWithConfig */
    public void m113809xc9f62e0e(int i17, int i18, int i19) {
        try {
            com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820 c27687xa835a820 = new com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27687xa835a820();
            c27687xa835a820.m119508x542d00d0(m119453xb1ff73bc());
            c27687xa835a820.m119508x542d00d0("doSyncWithConfig");
            c27687xa835a820.m119510x55370fd8(i17);
            c27687xa835a820.m119510x55370fd8(i18);
            c27687xa835a820.m119510x55370fd8(i19);
            m119456xb9724478(c27687xa835a820.m119495xeed4b35e());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeSyncManager.doSyncWithConfig failed", e17);
        }
    }
}
