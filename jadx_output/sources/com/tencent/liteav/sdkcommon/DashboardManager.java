package com.tencent.liteav.sdkcommon;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::dashboard")
/* loaded from: classes15.dex */
public class DashboardManager {
    private static final int LOG_MAX_SIZE = 15000;
    private static final java.lang.String TAG = "DashboardManager";
    private final android.content.Context mAppContext;
    private final com.tencent.liteav.sdkcommon.g mDashboardManagerView;
    private boolean mIsInit;
    private final com.tencent.liteav.sdkcommon.g.a mSelectedDashboardChangeListener;
    private java.lang.String mSelectedDashboardId;
    private final android.os.Handler mUIHandler;
    private final java.util.ArrayList<java.lang.String> mDashboards = new java.util.ArrayList<>();
    private final java.util.Map<java.lang.String, java.lang.String> mDashboardStatus = new java.util.HashMap();
    private final java.util.Map<java.lang.String, java.lang.StringBuilder> mDashboardLogs = new java.util.HashMap();

    public DashboardManager() {
        com.tencent.liteav.sdkcommon.g.a aVar = new com.tencent.liteav.sdkcommon.g.a() { // from class: com.tencent.liteav.sdkcommon.DashboardManager.1
            @Override // com.tencent.liteav.sdkcommon.g.a
            public final void a(int i17) {
                if (com.tencent.liteav.sdkcommon.DashboardManager.this.mDashboards.size() <= i17) {
                    return;
                }
                com.tencent.liteav.sdkcommon.DashboardManager dashboardManager = com.tencent.liteav.sdkcommon.DashboardManager.this;
                dashboardManager.mSelectedDashboardId = (java.lang.String) dashboardManager.mDashboards.get(i17);
                if (com.tencent.liteav.sdkcommon.DashboardManager.this.mDashboards.contains(com.tencent.liteav.sdkcommon.DashboardManager.this.mSelectedDashboardId)) {
                    com.tencent.liteav.sdkcommon.DashboardManager.this.mDashboardManagerView.b((java.lang.String) com.tencent.liteav.sdkcommon.DashboardManager.this.mDashboardStatus.get(com.tencent.liteav.sdkcommon.DashboardManager.this.mSelectedDashboardId));
                    java.lang.StringBuilder sb6 = (java.lang.StringBuilder) com.tencent.liteav.sdkcommon.DashboardManager.this.mDashboardLogs.get(com.tencent.liteav.sdkcommon.DashboardManager.this.mSelectedDashboardId);
                    if (sb6 != null) {
                        com.tencent.liteav.sdkcommon.DashboardManager.this.mDashboardManagerView.a(sb6.toString());
                    } else {
                        com.tencent.liteav.sdkcommon.DashboardManager.this.mDashboardManagerView.a("");
                    }
                }
            }
        };
        this.mSelectedDashboardChangeListener = aVar;
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "java DashBoardManager Construct");
        this.mIsInit = false;
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        this.mAppContext = applicationContext;
        this.mDashboardManagerView = new com.tencent.liteav.sdkcommon.g(applicationContext, aVar);
        this.mUIHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDashboardInternal(java.lang.String str) {
        if (this.mDashboards.contains(str)) {
            return;
        }
        this.mDashboards.add(str);
        com.tencent.liteav.sdkcommon.g gVar = this.mDashboardManagerView;
        gVar.f46543e.add(str);
        if (gVar.f46550l == null) {
            gVar.f46550l = gVar.f46543e.getItem(0);
            gVar.f46553o.a(0);
        }
        gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void appendLogInternal(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.sdkcommon.g gVar;
        android.widget.TextView textView;
        if (this.mDashboards.contains(str)) {
            java.lang.StringBuilder sb6 = this.mDashboardLogs.get(str);
            if (sb6 == null) {
                sb6 = new java.lang.StringBuilder();
                this.mDashboardLogs.put(str, sb6);
            }
            sb6.append(str2);
            sb6.append("\n");
            if (sb6.length() > LOG_MAX_SIZE) {
                sb6.delete(0, sb6.length() / 2);
            }
            if (!str.equals(this.mSelectedDashboardId) || (textView = (gVar = this.mDashboardManagerView).f46547i) == null) {
                return;
            }
            textView.append(str2 + "\n");
            android.widget.ScrollView scrollView = gVar.f46549k;
            if (scrollView != null) {
                if ((scrollView.getScrollY() + gVar.f46549k.getHeight()) + gVar.a(100) >= gVar.f46547i.getMeasuredHeight()) {
                    gVar.f46542d.post(com.tencent.liteav.sdkcommon.i.a(gVar));
                }
            }
        }
    }

    private boolean checkPermission() {
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() <= 23 || android.provider.Settings.canDrawOverlays(this.mAppContext)) {
            return true;
        }
        android.widget.Toast.makeText(this.mAppContext, "no system alert window permission, please authorize", 0).show();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean init() {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.sdkcommon.DashboardManager.init():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllDashboardInternal() {
        this.mDashboards.clear();
        this.mDashboardStatus.clear();
        this.mDashboardLogs.clear();
        com.tencent.liteav.sdkcommon.g gVar = this.mDashboardManagerView;
        gVar.f46543e.clear();
        gVar.f46550l = null;
        android.widget.TextView textView = gVar.f46546h;
        if (textView != null) {
            textView.setText("");
        }
        android.widget.TextView textView2 = gVar.f46547i;
        if (textView2 != null) {
            textView2.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDashboardInternal(java.lang.String str) {
        if (this.mDashboards.contains(str)) {
            this.mDashboards.remove(str);
            this.mDashboardStatus.remove(str);
            this.mDashboardLogs.remove(str);
            com.tencent.liteav.sdkcommon.g gVar = this.mDashboardManagerView;
            if (str.equals(gVar.f46550l)) {
                int position = gVar.f46543e.getPosition(gVar.f46550l);
                if (position != gVar.f46543e.getCount() - 1) {
                    int i17 = position + 1;
                    gVar.f46550l = gVar.f46543e.getItem(i17);
                    gVar.f46553o.a(i17 - 1);
                    android.widget.Spinner spinner = gVar.f46548j;
                    if (spinner != null) {
                        spinner.setSelection(i17);
                    }
                } else if (position > 0) {
                    int i18 = position - 1;
                    gVar.f46550l = gVar.f46543e.getItem(i18);
                    gVar.f46553o.a(i18);
                    android.widget.Spinner spinner2 = gVar.f46548j;
                    if (spinner2 != null) {
                        spinner2.setSelection(i18);
                    }
                }
            }
            gVar.f46543e.remove(str);
            if (gVar.f46543e.getCount() == 0) {
                gVar.f46550l = null;
            }
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusInternal(java.lang.String str, java.lang.String str2) {
        if (this.mDashboards.contains(str)) {
            this.mDashboardStatus.put(str, str2);
            if (str.equals(this.mSelectedDashboardId)) {
                this.mDashboardManagerView.b(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDashboardInternal(boolean z17) {
        if (!z17 || (checkPermission() && init())) {
            this.mDashboardManagerView.a(z17);
        } else {
            com.tencent.liteav.base.util.LiteavLog.i(TAG, "init or check permission is fail");
        }
    }

    public int addDashboard(java.lang.String str) {
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "addDashboard dashboardId = ".concat(java.lang.String.valueOf(str)));
        this.mUIHandler.post(com.tencent.liteav.sdkcommon.b.a(this, str));
        return 0;
    }

    public int appendLog(java.lang.String str, java.lang.String str2) {
        this.mUIHandler.post(com.tencent.liteav.sdkcommon.f.a(this, str, str2));
        return 0;
    }

    public int removeAllDashboard() {
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "removeAllDashboard ");
        this.mUIHandler.post(com.tencent.liteav.sdkcommon.d.a(this));
        return 0;
    }

    public int removeDashboard(java.lang.String str) {
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "removeDashboard dashboardId = ".concat(java.lang.String.valueOf(str)));
        this.mUIHandler.post(com.tencent.liteav.sdkcommon.c.a(this, str));
        return 0;
    }

    public int setStatus(java.lang.String str, java.lang.String str2) {
        this.mUIHandler.post(com.tencent.liteav.sdkcommon.e.a(this, str, str2));
        return 0;
    }

    public int showDashboard(boolean z17) {
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "showDashBoard isShow = ".concat(java.lang.String.valueOf(z17)));
        this.mUIHandler.post(com.tencent.liteav.sdkcommon.a.a(this, z17));
        return 0;
    }
}
