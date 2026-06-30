package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes5.dex */
public class r0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f222155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f222156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 f222157f;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var, android.content.Intent intent, android.content.Context context) {
        this.f222157f = p0Var;
        this.f222155d = intent;
        this.f222156e = context;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        android.content.Intent intent = this.f222155d;
        if (c10756x2a5d7b2d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10756x2a5d7b2d.f149939d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameExternalService", "localId is null");
            intent.putExtra(dm.i4.f66867x2a5c95c7, "");
        } else {
            intent.putExtra(dm.i4.f66867x2a5c95c7, c10756x2a5d7b2d.f149939d);
        }
        this.f222157f.cj(this.f222156e, intent);
    }
}
