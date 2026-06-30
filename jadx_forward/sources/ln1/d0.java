package ln1;

/* loaded from: classes12.dex */
public class d0 implements sn1.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ln1.c0 f401280a;

    public d0(ln1.c0 c0Var) {
        this.f401280a = c0Var;
    }

    public void a(boolean z17, java.lang.String str, int i17, int i18) {
        long j17 = i17;
        this.f401280a.f401263a.f401344l += j17;
        sn1.i.f491552p.f491620d += j17;
        ln1.r rVar = ln1.s.f401330r;
        rVar.f401329k.addAndGet(-j17);
        rVar.f401324f.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupFlowQueue", "releaseCacheSize [%d]", java.lang.Long.valueOf(rVar.f401329k.get()));
    }
}
