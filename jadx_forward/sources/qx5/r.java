package qx5;

/* loaded from: classes13.dex */
public class r implements cy5.o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f449043a = false;

    /* renamed from: b, reason: collision with root package name */
    public android.app.ProgressDialog f449044b = null;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449045c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f449046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f449047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cy5.p f449048f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f449049g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f449050h;

    public r(java.lang.String str, boolean z17, android.content.Context context, cy5.p pVar, boolean z18, android.webkit.ValueCallback valueCallback) {
        this.f449045c = str;
        this.f449046d = z17;
        this.f449047e = context;
        this.f449048f = pVar;
        this.f449049g = z18;
        this.f449050h = valueCallback;
    }

    @Override // cy5.o
    public void a() {
        d(this.f449045c + " 下载更新中");
    }

    @Override // cy5.o
    public void b(int i17) {
        android.app.ProgressDialog progressDialog;
        if (this.f449043a || (progressDialog = this.f449044b) == null) {
            return;
        }
        progressDialog.setProgress(i17);
    }

    @Override // cy5.o
    public void c(int i17) {
        this.f449043a = true;
        java.lang.String str = this.f449045c;
        cy5.h d17 = cy5.m.d(str);
        int f17 = d17 != null ? d17.f(true) : -1;
        boolean z17 = this.f449049g;
        switch (i17) {
            case -11:
                d(str + " 更新失败，插件安装失败，ErrCode = " + i17);
                break;
            case -10:
                d(str + " 更新失败，插件下载失败，ErrCode = " + i17);
                break;
            case -9:
                d(str + " 更新失败，插件下载或安装失败，ErrCode = " + i17);
                break;
            case -8:
                d(str + " 更新失败，未找到可用更新，当前已安装版本" + f17 + "，ErrCode = " + i17);
                android.app.ProgressDialog progressDialog = this.f449044b;
                if (progressDialog != null && z17) {
                    progressDialog.dismiss();
                    break;
                }
                break;
            case -7:
                d(str + " 更新失败，配置中未包含插件信息，ErrCode = " + i17);
                break;
            case -6:
                d(str + " 更新失败，配置解析失败，ErrCode = " + i17);
                break;
            case -5:
                d(str + " 更新失败，配置下载失败，ErrCode = " + i17);
                break;
            case -4:
                d(str + " 更新失败，其它任务正在更新插件，ErrCode = " + i17);
                break;
            case -3:
                d(str + " 更新失败，未到检查时间，ErrCode = " + i17);
                break;
            case -2:
                d(str + " 更新失败，无网络，ErrCode = " + i17);
                break;
            case -1:
                d(str + " 更新被取消，ErrCode = " + i17);
                break;
            case 0:
                d(str + " 更新完成，已安装版本" + f17);
                android.app.ProgressDialog progressDialog2 = this.f449044b;
                if (progressDialog2 != null) {
                    progressDialog2.setProgress(100);
                    this.f449044b.getButton(-2).setVisibility(8);
                    this.f449044b.getButton(-1).setVisibility(0);
                    if (z17) {
                        this.f449044b.dismiss();
                        break;
                    }
                }
                break;
            default:
                d(str + " 更新失败，未知错误，ErrCode = " + i17);
                break;
        }
        android.webkit.ValueCallback valueCallback = this.f449050h;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(java.lang.Integer.valueOf(i17));
        }
    }

    public final void d(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showMessage, shouldAlert:");
        boolean z17 = this.f449046d;
        sb6.append(z17);
        sb6.append(", message:");
        sb6.append(str);
        by5.c4.f("XWebDebugPluginHelper", sb6.toString());
        android.content.Context context = this.f449047e;
        if (!z17) {
            android.widget.Toast.makeText(context, str, 0).show();
            return;
        }
        if (this.f449044b == null) {
            android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(context);
            this.f449044b = progressDialog;
            progressDialog.setProgressStyle(1);
            this.f449044b.setMessage(str);
            this.f449044b.setCancelable(false);
            this.f449044b.setCanceledOnTouchOutside(false);
            this.f449044b.setButton(-2, "取消", new qx5.p(this));
            this.f449044b.setButton(-1, "完成", new qx5.q(this));
            this.f449044b.show();
            this.f449044b.getButton(-1).setVisibility(8);
        }
        this.f449044b.setMessage(str);
    }
}
