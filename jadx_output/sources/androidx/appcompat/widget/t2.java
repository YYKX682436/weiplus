package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class t2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.Toolbar f9714d;

    public t2(androidx.appcompat.widget.Toolbar toolbar) {
        this.f9714d = toolbar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        androidx.appcompat.widget.u2 u2Var = this.f9714d.R;
        o.u uVar = u2Var == null ? null : u2Var.f9729e;
        if (uVar != null) {
            uVar.collapseActionView();
        }
    }
}
