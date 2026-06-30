package qx5;

/* loaded from: classes13.dex */
public class w implements zx5.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f449062a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f449063b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.ProgressDialog f449064c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f449065d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f449066e = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f449067f = new java.util.ArrayList();

    public w(android.content.Context context, boolean z17) {
        this.f449062a = context;
        this.f449063b = context instanceof android.app.Activity ? z17 : false;
        h("· 开始检查更新 (点空白区域取消)");
    }

    @Override // zx5.a
    public void a(boolean z17, int i17, int i18, java.util.HashMap hashMap) {
        h("· 音频助听参数更新完成");
    }

    @Override // zx5.a
    public void b(int i17) {
        try {
            if (!this.f449066e) {
                h("· 内核更新中");
                this.f449066e = true;
            }
            android.app.ProgressDialog progressDialog = this.f449064c;
            if (progressDialog != null) {
                progressDialog.setCancelable(false);
                this.f449064c.setProgress(i17);
            }
        } catch (java.lang.Exception e17) {
            by5.c4.f("XWebDebugRuntimeHelper", "onUpdateProgressed error:" + e17);
        }
    }

    @Override // zx5.a
    public void c() {
        h("· 主配置更新完成");
    }

    @Override // zx5.a
    public void d(int i17) {
        this.f449066e = false;
        if (i17 == 0) {
            h("· 开始更新内核");
        } else {
            h("· 开始更新内核(predown)");
        }
    }

    @Override // zx5.a
    public void e() {
        h("· 插件配置更新完成");
    }

    @Override // zx5.a
    public void f(int i17, int i18) {
        try {
            if (i17 == 0) {
                h("· 更新完成，点击重启生效");
                this.f449065d = true;
                android.app.ProgressDialog progressDialog = this.f449064c;
                if (progressDialog != null) {
                    progressDialog.setCancelable(true);
                    this.f449064c.setCanceledOnTouchOutside(true);
                    this.f449064c.setProgress(100);
                }
            } else if (i17 == -2) {
                h("· 更新取消(可能无新内核)");
                android.app.ProgressDialog progressDialog2 = this.f449064c;
                if (progressDialog2 != null) {
                    progressDialog2.setCancelable(true);
                    this.f449064c.setCanceledOnTouchOutside(true);
                }
            } else {
                h("· 更新失败，错误码:" + i18);
                android.app.ProgressDialog progressDialog3 = this.f449064c;
                if (progressDialog3 != null) {
                    progressDialog3.setCancelable(true);
                    this.f449064c.setCanceledOnTouchOutside(true);
                }
            }
        } catch (java.lang.Exception e17) {
            by5.c4.f("XWebDebugRuntimeHelper", "onUpdateFinished error:" + e17);
        }
    }

    @Override // zx5.a
    public void g(boolean z17) {
        h("· 多Profile开关更新完成:" + z17);
    }

    public final void h(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showMessage, shouldAlert:");
        boolean z17 = this.f449063b;
        sb6.append(z17);
        sb6.append(", message:");
        sb6.append(str);
        by5.c4.f("XWebDebugRuntimeHelper", sb6.toString());
        if (z17) {
            if (this.f449064c == null) {
                android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(this.f449062a);
                this.f449064c = progressDialog;
                progressDialog.setProgressStyle(1);
                this.f449064c.setMessage(str);
                this.f449064c.setOnCancelListener(new qx5.v(this));
                this.f449064c.setCancelable(true);
                this.f449064c.show();
            }
            java.util.List list = this.f449067f;
            list.add(str);
            this.f449064c.setMessage(android.text.TextUtils.join("\n", list));
        }
    }
}
