package ut2;

/* loaded from: classes.dex */
public final class n1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v65.n f512545a;

    public n1(v65.n nVar) {
        this.f512545a = nVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean z17 = fVar != null && fVar.f152148a == 0;
        v65.n nVar = this.f512545a;
        if (z17 && fVar.f152149b == 0) {
            nVar.a(java.lang.Boolean.TRUE);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("open price failed, errType = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
            sb6.append(", errCode = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveShoppingViewHolder", sb6.toString());
            nVar.a(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}
