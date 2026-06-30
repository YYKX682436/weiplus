package e33;

/* loaded from: classes10.dex */
public class w1 implements t23.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.x1 f329056d;

    public w1(e33.x1 x1Var) {
        this.f329056d = x1Var;
    }

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        e33.x1 x1Var = this.f329056d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumPreviewUI", "RetrieveFavMediaTask onQueryMediaFinished cancelUINotify: %s.", java.lang.Boolean.valueOf(x1Var.f329072h));
        if (x1Var.f329072h) {
            return;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (linkedList != null) {
            linkedList2.addAll(linkedList);
        }
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next()).f219971p;
        }
        e33.s1 s1Var = new e33.s1(null);
        s1Var.f328987d = x1Var.f329068d;
        s1Var.f328988e = x1Var.f329069e;
        s1Var.f328991h = linkedList2;
        s1Var.f328993m = x1Var.f329070f;
        t23.p0.n().c(s1Var);
    }
}
