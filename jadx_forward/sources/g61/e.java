package g61;

/* loaded from: classes15.dex */
public class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5273xb7fd67e f350582a;

    public e(g61.f fVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5273xb7fd67e c5273xb7fd67e) {
        this.f350582a = c5273xb7fd67e;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CloseAAUrgeNotifyEventIListener", "close aa urge notify cgiback, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CloseAAUrgeNotifyEventIListener", "close aa urge notify failed");
            dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.b99, 1).show();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 28L, 1L, false);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CloseAAUrgeNotifyEventIListener", "close aa urge notify success");
        r45.e eVar = (r45.e) fVar.f152151d;
        if (eVar.f454409d > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f454410e)) {
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, ((r45.e) fVar.f152151d).f454410e, 0).show();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 29L, 1L, false);
            return null;
        }
        if (((r45.e) fVar.f152151d).f454409d != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CloseAAUrgeNotifyEventIListener", "illegal resp");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 29L, 1L, false);
            return null;
        }
        dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.b9_, 0).show();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 27L, 1L, false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.e) fVar.f152151d).f454411f)) {
            return null;
        }
        am.c3 c3Var = this.f350582a.f135597g;
        h61.o.t(c3Var.f87841b, c3Var.f87842c, ((r45.e) fVar.f152151d).f454411f);
        return null;
    }
}
