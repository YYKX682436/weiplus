package go2;

/* loaded from: classes2.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f355603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f355604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355605f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context, android.content.Intent intent, java.lang.String str) {
        super(1);
        this.f355603d = context;
        this.f355604e = intent;
        this.f355605f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.xr0 xr0Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.String str = this.f355605f;
        if (fVar != null) {
            eo2.f.f337098a.g(str, fVar);
        }
        if (eo2.f.f337098a.d((fVar == null || (xr0Var = (r45.xr0) fVar.f152151d) == null) ? null : java.lang.Integer.valueOf(xr0Var.f471885e))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Context context = this.f355603d;
            i0Var.Gk(context, this.f355604e, str);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context).finish();
        }
        return jz5.f0.f384359a;
    }
}
