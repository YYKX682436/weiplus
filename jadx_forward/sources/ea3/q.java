package ea3;

/* loaded from: classes10.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f332204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ea3.r f332205e;

    public q(ea3.r rVar, java.util.Map map) {
        this.f332205e = rVar;
        this.f332204d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1809x62f6fe4.p1810x5897e6f.C16227xc3198c81 c16227xc3198c81 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1809x62f6fe4.p1810x5897e6f.C16227xc3198c81) this.f332205e.f332206d.F;
        c16227xc3198c81.getClass();
        java.util.Map map = this.f332204d;
        if (map != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumView", "onAlbumChange" + map);
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = c16227xc3198c81.f225654e;
            if (c28688xe8dbe4c2 != null) {
                c28688xe8dbe4c2.m138438xd8c5c779("onAlbumChange", map);
            }
        }
    }
}
