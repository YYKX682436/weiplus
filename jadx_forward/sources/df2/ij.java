package df2;

/* loaded from: classes3.dex */
public final class ij implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.oj f311943a;

    public ij(df2.oj ojVar) {
        this.f311943a = ojVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        df2.oj ojVar = this.f311943a;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ojVar.f312504m, "ljd do CgiAudienceSendCommentToReserveGame success");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(ojVar.f312504m, "ljd do CgiAudienceSendCommentToReserveGame fail errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
