package qx5;

/* loaded from: classes13.dex */
public class h0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx5.y f449028e;

    public h0(qx5.y yVar, java.lang.String str) {
        this.f449028e = yVar;
        this.f449027d = str;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        qx5.y yVar = this.f449028e;
        by5.a1.b(yVar.mo161096x76847179(), "xweb_debug_info", this.f449027d);
        android.widget.Toast.makeText(yVar.mo161096x76847179(), "已复制到剪贴板", 0).show();
        return true;
    }
}
