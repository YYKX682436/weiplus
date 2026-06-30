package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class o0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.r0 f9664d;

    public o0(androidx.appcompat.widget.r0 r0Var, androidx.appcompat.widget.AppCompatSpinner appCompatSpinner) {
        this.f9664d = r0Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        androidx.appcompat.widget.r0 r0Var = this.f9664d;
        r0Var.L.setSelection(i17);
        if (r0Var.L.getOnItemClickListener() != null) {
            r0Var.L.performItemClick(view, i17, r0Var.f9695J.getItemId(i17));
        }
        r0Var.dismiss();
    }
}
