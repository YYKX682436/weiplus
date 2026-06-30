package in2;

/* loaded from: classes10.dex */
public final class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f374416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.yg f374417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f374418f;

    public r(in2.s sVar, dk2.yg ygVar, int i17) {
        this.f374416d = sVar;
        this.f374417e = ygVar;
        this.f374418f = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        in2.s sVar = this.f374416d;
        if (itemId == sVar.K) {
            sVar.B1.a();
            sf2.x xVar = sVar.I;
            int i18 = this.f374418f;
            xVar.getClass();
            dk2.yg musicItem = this.f374417e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicItem, "musicItem");
            dk2.yg c17 = ((mm2.m6) xVar.m56788xbba4bfc0(mm2.m6.class)).f410774f.c();
            java.lang.String str = c17 != null ? c17.f315926a : null;
            java.lang.Integer num = (java.lang.Integer) ((mm2.m6) xVar.m56788xbba4bfc0(mm2.m6.class)).f410774f.f315585a.mo3195x754a37bb();
            java.lang.String str2 = musicItem.f315926a;
            gn2.a aVar = xVar.f488880p;
            if (aVar != null) {
                java.lang.Object O6 = xVar.O6();
                java.util.ArrayList songName = aVar.p(musicItem.f315926a);
                long j17 = ((mm2.e1) xVar.m56788xbba4bfc0(mm2.e1.class)).f410516m;
                long m75942xfb822ef2 = ((mm2.e1) xVar.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
                java.lang.String userName = ((mm2.c1) xVar.m56788xbba4bfc0(mm2.c1.class)).f410385o;
                sf2.c cVar = new sf2.c(aVar, i18, str, str2, num, xVar, musicItem);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songName, "songName");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                pq5.g l17 = new ek2.b3(songName, java.lang.System.currentTimeMillis(), j17, m75942xfb822ef2, userName, null, 32, null).l();
                l17.K(new xl2.b(cVar));
                if (O6 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                    l17.f((im5.b) O6);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicSingSongController", "deleteMusic bgMusicId:" + str + ", songPlayId:" + str2);
        }
    }
}
