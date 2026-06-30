package cx2;

/* loaded from: classes9.dex */
public class d implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 f306064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f306065b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306066c;

    public d(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var, android.content.Context context, java.lang.String str) {
        this.f306064a = i0Var;
        this.f306065b = context;
        this.f306066c = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0
    public void a(android.widget.EditText editText) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var;
        if (editText == null || (j0Var = (i0Var = this.f306064a).f293355c) == null) {
            return;
        }
        if (j0Var.getWindow() != null) {
            i0Var.f293355c.getWindow().setSoftInputMode(5);
        }
        ((qg5.a) ((ct.p2) i95.n0.c(ct.p2.class))).getClass();
        com.p314xaae8f345.mm.ui.i1.c(editText, this.f306065b, this.f306066c);
        i0Var.f293355c.M = new cx2.c(this);
    }
}
