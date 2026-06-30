package fu0;

/* loaded from: classes5.dex */
public final class a implements iv3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f348288a;

    public a(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f348288a = qVar;
    }

    @Override // iv3.a
    public void a(boolean z17, lv3.a musicData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicData, "musicData");
        p3325xe03a0797.p3326xc267989b.q qVar = this.f348288a;
        if (!z17) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            return;
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(musicData.f403042b, false);
        if (i17 == null) {
            i17 = "";
        }
        lv3.a aVar = new lv3.a(musicData.f403041a, i17, 0L, 4, null);
        i95.m c17 = i95.n0.c(m40.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((c61.p7) ((m40.k0) c17)).fj(i17);
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(aVar));
    }
}
