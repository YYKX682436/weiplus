package fq3;

/* loaded from: classes12.dex */
public class v extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f347095d;

    /* renamed from: e, reason: collision with root package name */
    public final int f347096e;

    public v(fq3.w wVar, java.lang.String str, int i17) {
        this.f347095d = str;
        this.f347096e = i17;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.C2CMsgConsumeTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        if (nVar.f347072x != null) {
            fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar2.m134976x2690a4ac();
            mq3.b bVar = nVar2.f347072x;
            bVar.getClass();
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.m134976x2690a4ac();
            nVar3.f347069u.a(new mq3.a(bVar, this.f347095d, 2, this.f347096e));
        }
    }
}
