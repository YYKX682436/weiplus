package qx5;

/* loaded from: classes13.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx5.y f449022d;

    public e0(qx5.y yVar) {
        this.f449022d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        new android.app.AlertDialog.Builder(this.f449022d.mo161096x76847179()).setTitle("保存页面").setMessage("确定保存页面?").setPositiveButton("确定", new qx5.d0(this)).setNegativeButton("取消", new qx5.c0(this)).show();
    }
}
