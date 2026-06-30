package fj2;

/* loaded from: classes.dex */
public final class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f344696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344698f;

    public d(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17, android.content.Context context, java.lang.String str) {
        this.f344696d = h0Var;
        this.f344697e = context;
        this.f344698f = str;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) this.f344696d.f391656d;
        if (k0Var != null) {
            k0Var.o(null);
        }
        g4Var.clear();
        g4Var.d(0, this.f344697e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560856wd), this.f344698f);
    }
}
