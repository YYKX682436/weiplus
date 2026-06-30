package cw2;

/* loaded from: classes15.dex */
public final class l7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f305377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305378e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, java.lang.String str) {
        super(0);
        this.f305377d = c15188xd8bd4bd;
        this.f305378e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashSet hashSet = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.f212174g2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305377d;
        c15188xd8bd4bd.getClass();
        c15188xd8bd4bd.getPlayer().mo100933x41012807();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class);
        java.lang.String finderVideoProxyHashcode = java.lang.String.valueOf(c15188xd8bd4bd.hashCode());
        c15482x9b531b34.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderVideoProxyHashcode, "finderVideoProxyHashcode");
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = c15482x9b531b34.f215220w;
        concurrentSkipListSet.remove(finderVideoProxyHashcode);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryQuitHandlerThread proxy:");
        sb6.append(finderVideoProxyHashcode);
        sb6.append(" threadId:");
        android.os.HandlerThread handlerThread = c15482x9b531b34.f215219v;
        sb6.append(handlerThread != null ? java.lang.Integer.valueOf(handlerThread.getThreadId()) : null);
        sb6.append(" count：");
        sb6.append(concurrentSkipListSet.size());
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", sb6.toString());
        if (concurrentSkipListSet.size() == 0) {
            android.os.HandlerThread handlerThread2 = c15482x9b531b34.f215219v;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            c15482x9b531b34.f215219v = null;
        }
        c15188xd8bd4bd.q(11);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), this.f305378e + " onReleaseInternal releaseInternal  FinderThumbPlayerProxy " + c15188xd8bd4bd.hashCode() + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(c15188xd8bd4bd));
        return jz5.f0.f384359a;
    }
}
