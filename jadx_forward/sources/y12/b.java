package y12;

/* loaded from: classes9.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f540383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y12.c f540384e;

    public b(y12.c cVar, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        this.f540384e = cVar;
        this.f540383d = c21053xdbf1e5f4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f540383d;
        if (c21053xdbf1e5f4 == null || c21053xdbf1e5f4.E0()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiFileCheckerMgr", "chatting emoji broken. try to recover:%s", c21053xdbf1e5f4.mo42933xb5885648());
        this.f540384e.a(c21053xdbf1e5f4, true);
    }
}
