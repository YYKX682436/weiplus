package tm;

/* loaded from: classes8.dex */
public class b implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f501948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f501949b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f501950c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm.a f501951d;

    public b(tm.a aVar, android.content.DialogInterface.OnClickListener onClickListener, android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener2) {
        this.f501951d = aVar;
        this.f501948a = onClickListener;
        this.f501949b = context;
        this.f501950c = onClickListener2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        if (!z17) {
            android.content.DialogInterface.OnClickListener onClickListener = this.f501950c;
            if (onClickListener != null) {
                onClickListener.onClick(null, -2);
                return;
            }
            return;
        }
        android.content.DialogInterface.OnClickListener onClickListener2 = this.f501948a;
        if (onClickListener2 != null) {
            onClickListener2.onClick(null, -1);
            return;
        }
        tm.a aVar = this.f501951d;
        int i17 = aVar.f501936f;
        android.content.Context context = this.f501949b;
        if (i17 != -100) {
            java.lang.String str2 = aVar.f501931a;
            if ((str2 == null || str2.length() == 0) || context == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || !gm0.j1.a()) {
                intent.putExtra("neverGetA8Key", true);
            }
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, i17);
            return;
        }
        java.lang.String str3 = aVar.f501931a;
        if ((str3 == null || str3.length() == 0) || context == null) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", str3);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || !gm0.j1.a()) {
            intent2.putExtra("neverGetA8Key", true);
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent2, null);
    }
}
