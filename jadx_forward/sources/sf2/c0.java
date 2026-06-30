package sf2;

/* loaded from: classes3.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f488601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.e0 f488602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.u82 f488604g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i17, sf2.e0 e0Var, java.lang.String str, r45.u82 u82Var) {
        super(0);
        this.f488601d = i17;
        this.f488602e = e0Var;
        this.f488603f = str;
        this.f488604g = u82Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sf2.e0 e0Var = this.f488602e;
        int i17 = this.f488601d;
        if (i17 == -1001) {
            zl2.r4.f555483a.f3(e0Var.O6(), "(DEBUG)搜索失败" + i17);
        }
        java.lang.String str = e0Var.f488647p;
        java.lang.String str2 = this.f488603f;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSearchMusicController", "Search for:" + str2 + " result accepted and shown");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i8 i8Var = e0Var.f488644m;
            if (i8Var != null) {
                i8Var.j0(false);
            }
            ((mm2.c1) e0Var.m56788xbba4bfc0(mm2.c1.class)).Z6().n(str2, this.f488604g);
            e0Var.b7();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSearchMusicController", "Search for:" + str2 + " has outdated. Drop search result and wait for " + e0Var.f488647p + "'s result back");
        }
        return jz5.f0.f384359a;
    }
}
