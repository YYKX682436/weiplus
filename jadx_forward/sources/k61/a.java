package k61;

/* loaded from: classes9.dex */
public class a implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f386014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k61.b f386015b;

    public a(k61.b bVar, km5.b bVar2) {
        this.f386015b = bVar;
        this.f386014a = bVar2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAQueryListInteractor", "on AAQueryList finish, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        int i17 = fVar.f152148a;
        km5.b bVar = this.f386014a;
        if (i17 != 0 || fVar.f152149b != 0) {
            bVar.a(java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 31L, 1L, false);
            return null;
        }
        r45.f0 f0Var = (r45.f0) fVar.f152151d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAQueryListInteractor", "on AAQueryList finish, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(f0Var.f455394d), f0Var.f455395e);
        int i18 = f0Var.f455394d;
        if (i18 != 0) {
            if (i18 <= 0 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f0Var.f455395e)) {
                bVar.a(java.lang.Boolean.FALSE);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 32L, 1L, false);
                return null;
            }
            bVar.a(f0Var.f455395e);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 32L, 1L, false);
            return null;
        }
        java.util.LinkedList linkedList = f0Var.f455396f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAQueryListInteractor", "on AAQueryList finish get success, return record size: %s", java.lang.Integer.valueOf(linkedList.size()));
        int size = linkedList.size();
        k61.b bVar2 = this.f386015b;
        bVar2.f386016o += size;
        java.lang.String str = f0Var.f455398h;
        bVar2.f386017p = str;
        bVar2.f386018q = f0Var.f455399i;
        bVar2.f386019r = f0Var.f455400m;
        bVar2.f386020s = f0Var.f455401n;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar2.f386020s)) {
            bVar2.f386021t = false;
        } else {
            bVar2.f386021t = true;
        }
        bVar.c(linkedList, f0Var.f455397g, java.lang.Boolean.valueOf(bVar2.f386021t));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 30L, 1L, false);
        return null;
    }
}
