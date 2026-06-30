package gt4;

/* loaded from: classes8.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.a1 f356930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f356931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f356932f;

    public b(db5.a1 a1Var, android.widget.EditText editText, android.content.Context context) {
        this.f356930d = a1Var;
        this.f356931e = editText;
        this.f356932f = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        db5.a1 a1Var = this.f356930d;
        if (a1Var != null ? a1Var.mo26039x42fe6352(this.f356931e.getText().toString().trim()) : true) {
            dialogInterface.dismiss();
            if (this.f356932f instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gt4.a(this));
            }
        }
    }
}
