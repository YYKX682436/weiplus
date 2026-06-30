package r35;

/* loaded from: classes9.dex */
public class a1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 f450569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f450570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450571c;

    public a1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var, android.content.Context context, java.lang.String str) {
        this.f450569a = i0Var;
        this.f450570b = context;
        this.f450571c = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0
    public void a(android.widget.EditText editText) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var;
        if (editText == null || (j0Var = (i0Var = this.f450569a).f293355c) == null) {
            return;
        }
        if (j0Var.getWindow() != null) {
            i0Var.f293355c.getWindow().setSoftInputMode(5);
        }
        com.p314xaae8f345.mm.ui.i1.c(editText, this.f450570b, this.f450571c);
        i0Var.f293355c.M = new r35.z0(this);
    }
}
