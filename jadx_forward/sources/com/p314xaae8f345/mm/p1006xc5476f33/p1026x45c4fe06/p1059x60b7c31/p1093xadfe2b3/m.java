package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes8.dex */
public class m implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f163076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f163077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f163078f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f163079g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f163080h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.u f163081i;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.u uVar, java.lang.Object[] objArr, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, q80.d0 d0Var, android.content.Context context) {
        this.f163081i = uVar;
        this.f163076d = objArr;
        this.f163077e = e9Var;
        this.f163078f = i17;
        this.f163079g = d0Var;
        this.f163080h = context;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898 c10755xa1fef898 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898) obj;
        java.lang.Object[] objArr = this.f163076d;
        java.lang.Object obj2 = objArr[0];
        if (obj2 != null) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) obj2).cancel();
        }
        objArr[1] = java.lang.Boolean.TRUE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f163077e;
        if (c10755xa1fef898 != null) {
            long j17 = c10755xa1fef898.f149938d;
            if (j17 >= 0) {
                q80.d0 d0Var = this.f163079g;
                if (j17 > 0) {
                    d0Var.f442196o = j17;
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(e9Var.getF229340d(), d0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.l(this));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOpenLiteApp", "Open LiteApp fail");
        e9Var.a(this.f163078f, this.f163081i.o("fail"));
    }
}
