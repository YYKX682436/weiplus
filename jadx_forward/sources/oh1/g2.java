package oh1;

/* loaded from: classes4.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f426751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oh1.j2 f426752e;

    public g2(oh1.j2 j2Var, int i17) {
        this.f426752e = j2Var;
        this.f426751d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        oh1.j2 j2Var = this.f426752e;
        if (j2Var.f426776f.get() > this.f426751d) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) j2Var.f426774d).values().iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                break;
            }
            oh1.e2 e2Var = (oh1.e2) it.next();
            if (e2Var.b()) {
                r45.l46 l46Var = new r45.l46();
                l46Var.f460661e = e2Var.f426738b;
                l46Var.f460660d = e2Var.f426737a;
                if (e2Var.f426741e == 1) {
                    linkedList2.add(l46Var);
                } else {
                    linkedList.add(l46Var);
                }
            }
        }
        j2Var.getClass();
        boolean z18 = false;
        if (!linkedList.isEmpty()) {
            linkedList.size();
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 2954;
            lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/getupdatablemsginfo";
            r45.tp3 tp3Var = new r45.tp3();
            tp3Var.f468180d = linkedList;
            lVar.f152197a = tp3Var;
            lVar.f152198b = new r45.up3();
            com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new oh1.h2(j2Var, linkedList, linkedList2), false);
            z17 = false;
        }
        if (linkedList2.isEmpty()) {
            z18 = z17;
        } else {
            linkedList2.size();
            com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar2.f152200d = 17438;
            lVar2.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/getchattoolmsginfo";
            r45.ad3 ad3Var = new r45.ad3();
            ad3Var.f451474d = linkedList2;
            lVar2.f152197a = ad3Var;
            lVar2.f152198b = new r45.bd3();
            com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar2.a(), new oh1.i2(j2Var, linkedList, linkedList2), false);
        }
        if (z18) {
            j2Var.h();
        }
    }
}
