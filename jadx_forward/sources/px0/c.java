package px0;

/* loaded from: classes4.dex */
public final class c implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f440300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc f440301e;

    public c(android.content.Context context, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc) {
        this.f440300d = context;
        this.f440301e = c10988x551cb0cc;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.content.Context context = this.f440300d;
            g4Var.d(1001, b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23), context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p_o));
            if (this.f440301e.f151188s.length() > 0) {
                g4Var.f(1002, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p_p));
            }
        }
    }
}
