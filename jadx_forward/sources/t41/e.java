package t41;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f497021a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f497022b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f497023c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f497024d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f497025e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f497026f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f497027g = new java.util.ArrayList();

    public void a(java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.yz4 yz4Var = (r45.yz4) it.next();
            int i17 = yz4Var.f473069e;
            if (i17 == 0) {
                ((java.util.ArrayList) this.f497021a).add(yz4Var.f473068d);
            } else if (i17 == 3) {
                ((java.util.ArrayList) this.f497023c).add(yz4Var.f473068d);
            } else if (i17 == 1) {
                ((java.util.ArrayList) this.f497024d).add(yz4Var.f473068d);
            } else if (i17 == 2) {
                ((java.util.ArrayList) this.f497022b).add(yz4Var.f473068d);
            } else if (i17 == 4) {
                ((java.util.ArrayList) this.f497025e).add(yz4Var.f473068d);
            } else if (i17 != 5) {
                if (i17 == 6) {
                    ((java.util.ArrayList) this.f497026f).add(yz4Var.f473068d);
                } else if (i17 == 10) {
                    ((java.util.ArrayList) this.f497027g).add(yz4Var.f473068d);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("OpenIMChatRoomMember.Classifier", "unknown member status : status = " + i17);
                }
            }
        }
    }
}
