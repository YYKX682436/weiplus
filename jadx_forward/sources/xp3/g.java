package xp3;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16794xbccf947f f537458d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16794xbccf947f c16794xbccf947f) {
        this.f537458d = c16794xbccf947f;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16794xbccf947f c16794xbccf947f = this.f537458d;
        if (c16794xbccf947f.f234498i || c16794xbccf947f.h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MainProcessChecker", "escaped killing");
            return;
        }
        c16794xbccf947f.A |= 256;
        c16794xbccf947f.r(true);
        c16794xbccf947f.i();
    }
}
