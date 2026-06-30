package l02;

/* loaded from: classes8.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.i0 f396343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m02.q f396344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396345f;

    public f(l02.k kVar, p012xc85e97e9.p016x746ad0e3.app.i0 i0Var, m02.q qVar, java.lang.String str) {
        this.f396343d = i0Var;
        this.f396344e = qVar;
        this.f396345f = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/DownloadAppAlertDelegateImpl$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f396343d.dismiss();
        m02.q qVar = this.f396344e;
        if (qVar != null) {
            qVar.a();
        }
        o02.a.b(15, 1502, 1, 23, this.f396345f, "", "");
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/DownloadAppAlertDelegateImpl$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
