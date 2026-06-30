package xp3;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16794xbccf947f f537459d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16794xbccf947f c16794xbccf947f) {
        this.f537459d = c16794xbccf947f;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16794xbccf947f c16794xbccf947f = this.f537459d;
        if (!c16794xbccf947f.f234491b.f537453e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c16794xbccf947f.e(), "[onCallUp] you can't see me, perry!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c16794xbccf947f.e(), "[onCallUp] My God, you saw me!");
            jx3.f.INSTANCE.mo68477x336bdfd8(959L, 7L, 1L, true);
        }
    }
}
