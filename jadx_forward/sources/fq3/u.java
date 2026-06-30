package fq3;

/* loaded from: classes12.dex */
public class u extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f347093d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f347094e;

    public u(fq3.w wVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.ref.WeakReference weakReference) {
        this.f347093d = f9Var;
        this.f347094e = weakReference;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.onC2CImgScrollTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f347093d;
        long mo78012x3fdd41df = f9Var.mo78012x3fdd41df();
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        if (mo78012x3fdd41df <= nVar.f347061m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityService", "onC2CImgScroll time condition not support %s", k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, f9Var.mo78012x3fdd41df() / 1000));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityService", "C2CImgScrollTask Start To Auto Download %d MsgId %d", 32, java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        java.lang.ref.WeakReference weakReference = this.f347094e;
        if (weakReference.get() != null) {
            fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar2.m134976x2690a4ac();
            r45.rc c17 = nVar2.f347063o.c(f9Var.m124847x74d37ac6());
            if (c17 != null && c17.f466248m == 1) {
                kq3.i.f(c17, f9Var);
            }
            ((java.lang.Runnable) weakReference.get()).run();
        }
        fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar3.m134976x2690a4ac();
        nVar3.f347070v.getClass();
        fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar4.m134976x2690a4ac();
        r45.rc c18 = nVar4.f347063o.c(f9Var.m124847x74d37ac6());
        if (c18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "This Image Sender is Me");
        } else if (c18.f466248m == 1) {
            fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar5.m134976x2690a4ac();
            nVar5.f347063o.g(f9Var.m124847x74d37ac6(), 32, 2);
        }
    }
}
