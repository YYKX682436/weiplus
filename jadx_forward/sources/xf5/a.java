package xf5;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f535865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xf5.b f535866e;

    public a(xf5.b bVar, long j17) {
        this.f535866e = bVar;
        this.f535865d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = new java.lang.Object[5];
        xf5.b bVar = this.f535866e;
        objArr[0] = java.lang.Boolean.valueOf(bVar.f535867a != null);
        objArr[1] = java.lang.Boolean.valueOf(bVar.f535868b);
        objArr[2] = bVar.f535869c;
        objArr[3] = java.lang.Long.valueOf(bVar.f535870d);
        long j17 = this.f535865d;
        objArr[4] = java.lang.Long.valueOf(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvBoxConversationService", "refreshConversationTime thread run boxConv:%s isUpdate:%s child_username:%s callTime:%s convTime:%s", objArr);
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = bVar.f535867a;
        if (l4Var != null) {
            l4Var.n1(j17);
            if (bVar.f535868b) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(bVar.f535867a, "conversationboxservice");
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(bVar.f535867a);
            }
        }
    }
}
