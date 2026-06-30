package it3;

/* loaded from: classes10.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 f376104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f376106f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2, java.lang.String str, long j17) {
        super(0);
        this.f376104d = activityC16983x775783e2;
        this.f376105e = str;
        this.f376106f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2 = this.f376104d;
        it3.a aVar = activityC16983x775783e2.f237151m;
        if (aVar != null) {
            aVar.u(activityC16983x775783e2.f237154p, activityC16983x775783e2.f237155q);
        }
        long j17 = activityC16983x775783e2.f237147f;
        long j18 = activityC16983x775783e2.f237148g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attachThumbSeekBar duration:");
        long j19 = this.f376106f;
        sb6.append(j19);
        sb6.append(" min:");
        sb6.append(j17);
        sb6.append(" max:");
        sb6.append(j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", sb6.toString());
        activityC16983x775783e2.V6().m66920x5dd7c812(it3.e.f376089a);
        activityC16983x775783e2.V6().m66921x13f495cb(new it3.f(activityC16983x775783e2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe V6 = activityC16983x775783e2.V6();
        V6.f230422e = (int) j19;
        V6.f230432r = j18;
        V6.f230433s = j17;
        V6.f230434t = 500L;
        if (j19 <= j17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16534x56a8ffb4 c16534x56a8ffb4 = V6.f230431q;
            if (c16534x56a8ffb4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("innerSeekBar");
                throw null;
            }
            c16534x56a8ffb4.f230474f = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe V62 = activityC16983x775783e2.V6();
        V62.getClass();
        java.lang.String path = this.f376105e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "initAsync %s", path);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(path) || !com.p314xaae8f345.mm.vfs.w6.j(path)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.l0(V62));
        } else {
            V62.f230421d = path;
            V62.post(V62.f230436v);
        }
        return jz5.f0.f384359a;
    }
}
