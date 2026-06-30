package xp3;

/* loaded from: classes5.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f537450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328 f537451e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328 abstractC16790x31088328, android.content.Intent intent) {
        this.f537451e = abstractC16790x31088328;
        this.f537450d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = this.f537450d;
        if ("ACTION_ELF_CHECK".equals(intent.getAction())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16792xd1660a86 c16792xd1660a86 = (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16792xd1660a86) intent.getParcelableExtra("MicroMsg.ElfCheckRequest");
            if (c16792xd1660a86 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AbstractProcessChecker", "pass this check,because request is null! ????");
                return;
            }
            long myPid = android.os.Process.myPid();
            long j17 = c16792xd1660a86.f234500d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.AbstractC16790x31088328 abstractC16790x31088328 = this.f537451e;
            boolean l17 = abstractC16790x31088328.l(myPid, j17);
            abstractC16790x31088328.getClass();
            java.lang.String a17 = bm5.f1.a();
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(l17);
            abstractC16790x31088328.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractProcessChecker", "[onReceive] begin to check process[%s] isCanKill:%s isNeedReCall:%s", a17, valueOf, java.lang.Boolean.valueOf(!(abstractC16790x31088328 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16795x1bcb461e)));
            if (l17) {
                abstractC16790x31088328.i();
            } else {
                abstractC16790x31088328.o(false);
            }
        }
    }
}
