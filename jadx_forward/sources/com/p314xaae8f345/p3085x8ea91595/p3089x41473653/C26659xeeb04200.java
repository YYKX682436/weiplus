package com.p314xaae8f345.p3085x8ea91595.p3089x41473653;

/* renamed from: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager */
/* loaded from: classes13.dex */
public class C26659xeeb04200 {

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200 f56043x46143c22;

    /* renamed from: mContext */
    protected android.content.Context f56047xd6cfe882;

    /* renamed from: mSDKClientList */
    protected static java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18> f56045xe29e5776 = new java.util.ArrayList<>();

    /* renamed from: mSDKSettingClient */
    protected static com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26661xdca5da4e f56046x3f46e2ae = null;

    /* renamed from: mOpenSDKClientList */
    protected static java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e> f56044x7e66e7cc = new java.util.ArrayList<>();

    public C26659xeeb04200(android.content.Context context) {
        this.f56047xd6cfe882 = context;
    }

    /* renamed from: about */
    public static java.lang.String m104841x585238d() {
        return "TMAssistantDownloadSDKManager_2014_03_04_17_55_release_25406";
    }

    /* renamed from: closeAllService */
    public static synchronized void m104842xe742a1ec(android.content.Context context) {
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200.class) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i("TMAssistantDownloadSDKManager", "closeAllService method!");
            if (f56043x46143c22 == null) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i("TMAssistantDownloadSDKManager", "manager minstance == null");
                return;
            }
            java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18> arrayList = f56045xe29e5776;
            if (arrayList != null && arrayList.size() > 0) {
                java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18> it = f56045xe29e5776.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 next = it.next();
                    if (next != null) {
                        next.m104839x38ee5776();
                    }
                }
                f56045xe29e5776.clear();
            }
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26661xdca5da4e c26661xdca5da4e = f56046x3f46e2ae;
            if (c26661xdca5da4e != null) {
                c26661xdca5da4e.m104839x38ee5776();
                f56046x3f46e2ae = null;
            }
            f56043x46143c22 = null;
        }
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200 m104843x9cf0d20b(android.content.Context context) {
        com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200 c26659xeeb04200;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200.class) {
            if (f56043x46143c22 == null) {
                f56043x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200(context);
            }
            c26659xeeb04200 = f56043x46143c22;
        }
        return c26659xeeb04200;
    }

    /* renamed from: getDownloadOpenSDKClient */
    public synchronized com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e m104844xe404c81d(java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e> it = f56044x7e66e7cc.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e next = it.next();
            if (next.f56037x938e4a7.equals(str)) {
                return next;
            }
        }
        com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e c26656xb6f7a66e = new com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26656xb6f7a66e(this.f56047xd6cfe882, str, "com.tencent.android.qqdownloader.SDKService");
        if (!c26656xb6f7a66e.mo104821xc3bb29fd()) {
            return null;
        }
        f56044x7e66e7cc.add(c26656xb6f7a66e);
        return c26656xb6f7a66e;
    }

    /* renamed from: getDownloadSDKClient */
    public synchronized com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 m104845xe4a9fc47(java.lang.String str) {
        if (str != null) {
            if (str.length() > 0) {
                java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18> it = f56045xe29e5776.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 next = it.next();
                    if (next.f56037x938e4a7.equals(str)) {
                        return next;
                    }
                }
                com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 c26657x9422ab18 = new com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18(this.f56047xd6cfe882, str);
                c26657x9422ab18.mo104821xc3bb29fd();
                f56045xe29e5776.add(c26657x9422ab18);
                return c26657x9422ab18;
            }
        }
        return null;
    }

    /* renamed from: getDownloadSDKSettingClient */
    public synchronized com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26661xdca5da4e m104846x87c8a63f() {
        if (f56046x3f46e2ae == null) {
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26661xdca5da4e c26661xdca5da4e = new com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26661xdca5da4e(this.f56047xd6cfe882, "TMAssistantDownloadSDKManager");
            f56046x3f46e2ae = c26661xdca5da4e;
            c26661xdca5da4e.mo104821xc3bb29fd();
        }
        return f56046x3f46e2ae;
    }

    /* renamed from: releaseDownloadSDKClient */
    public synchronized boolean m104847x68aabbb6(java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18> it = f56045xe29e5776.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 next = it.next();
            if (next != null && next.f56037x938e4a7.equals(str)) {
                next.m104839x38ee5776();
                it.remove();
                return true;
            }
        }
        com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26661xdca5da4e c26661xdca5da4e = f56046x3f46e2ae;
        if (c26661xdca5da4e == null || !c26661xdca5da4e.f56037x938e4a7.equals(str)) {
            return false;
        }
        f56046x3f46e2ae.m104839x38ee5776();
        f56046x3f46e2ae = null;
        return true;
    }
}
