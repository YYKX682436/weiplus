package y53;

/* loaded from: classes4.dex */
public final class v implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u53.v f541042b;

    public v(java.lang.String str, u53.v vVar) {
        this.f541041a = str;
        this.f541042b = vVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152149b;
        u53.v vVar = this.f541042b;
        if (i17 == 0 && fVar.f152148a == 0) {
            v53.e eVar = (v53.e) fVar.f152151d;
            vVar.a(eVar.f514868e, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f541041a, eVar.f514867d.f514854d) ? ((v53.e) fVar.f152151d).f514867d.f514855e : false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLife.ContactService", "isBlackListAssociateWithWAGame errCode:%d,errType:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f152148a));
            vVar.a(false, false);
        }
        return jz5.f0.f384359a;
    }
}
