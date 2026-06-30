package fu0;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fu0.l f348318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fu0.l lVar) {
        super(3);
        this.f348318d = lVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        ((java.lang.Boolean) obj3).booleanValue();
        fu0.l lVar = this.f348318d;
        lVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMusicApply: music=");
        sb6.append(c16997xb0aa383a != null ? c16997xb0aa383a.f237256t : null);
        sb6.append(", cached=");
        sb6.append(c16997xb0aa383a != null ? java.lang.Boolean.valueOf(c16997xb0aa383a.f237249m) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.MusicPicking", sb6.toString());
        boolean z17 = false;
        if (c16997xb0aa383a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.MusicPicking", "handleMusicApply: audioCacheInfo is null, return origin music");
            lVar.c(lVar.b(lVar.f348325f), false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2 = lVar.f348325f;
            if (c16997xb0aa383a2 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c16997xb0aa383a2.C, c16997xb0aa383a.C) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c16997xb0aa383a2.f237256t, c16997xb0aa383a.f237256t) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c16997xb0aa383a2.f237247h, c16997xb0aa383a.f237247h)) {
                z17 = true;
            }
            lVar.c(lVar.b(c16997xb0aa383a), !z17);
        }
        return jz5.f0.f384359a;
    }
}
