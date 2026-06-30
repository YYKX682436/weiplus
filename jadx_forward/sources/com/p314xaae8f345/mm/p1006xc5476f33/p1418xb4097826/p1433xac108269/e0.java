package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 f183636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f183638f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f183639g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f183640h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183641i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var, android.content.Context context, android.content.Intent intent, int i17, int i18, java.lang.String str) {
        super(1);
        this.f183636d = i0Var;
        this.f183637e = context;
        this.f183638f = intent;
        this.f183639g = i17;
        this.f183640h = i18;
        this.f183641i = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar != null) {
            eo2.f.f337098a.g(this.f183641i, fVar);
        }
        if (fVar != null && fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = this.f183636d;
            android.content.Context context = this.f183637e;
            android.content.Intent intent = this.f183638f;
            int i17 = this.f183639g;
            int i18 = this.f183640h;
            java.lang.String str = this.f183641i;
            r45.xr0 xr0Var = (r45.xr0) fVar.f152151d;
            java.lang.Integer valueOf = xr0Var != null ? java.lang.Integer.valueOf(xr0Var.f471884d) : null;
            r45.xr0 xr0Var2 = (r45.xr0) fVar.f152151d;
            i0Var.Mk(context, intent, i17, i18, str, valueOf, xr0Var2 != null ? java.lang.Integer.valueOf(xr0Var2.f471885e) : null);
        } else {
            this.f183636d.Mk(this.f183637e, this.f183638f, this.f183639g, this.f183640h, this.f183641i, null, null);
        }
        return jz5.f0.f384359a;
    }
}
