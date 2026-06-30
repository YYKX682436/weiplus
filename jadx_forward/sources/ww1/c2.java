package ww1;

/* loaded from: classes9.dex */
public final class c2 implements vg3.z4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f531698a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f531699b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ww1.d2 f531700c;

    public c2(ww1.d2 d2Var) {
        this.f531700c = d2Var;
    }

    @Override // vg3.z4
    public void a() {
        ww1.d2 d2Var = this.f531700c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d2Var.f531704h, "flushNotifyAllMsg");
        if (!ww1.d2.q(d2Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d2Var.f531704h, "enable byp notify false");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f531699b;
        arrayList.addAll(list);
        ((java.util.ArrayList) list).clear();
        if (arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d2Var.f531704h, "lastClone is empty");
        } else if (ct1.c.f303753g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d2Var.f531704h, "notifyOther");
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(ct1.c.f303753g.mo13945x23b2dd47()).mo50293x3498a0(new ww1.a2(arrayList));
        }
    }

    @Override // vg3.z4
    public void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r45.j4 j4Var) {
        ww1.d2 d2Var = this.f531700c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d2Var.f531704h, "[notifyNewMsg] msg=" + f9Var + " addMsg=" + j4Var);
        mm.w.e("PayMsg");
        if (!ww1.d2.q(d2Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d2Var.f531704h, "enable byp notify false");
            return;
        }
        if (ct1.c.f303753g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d2Var.f531704h, "notify is null");
            return;
        }
        boolean z17 = false;
        if (f9Var != null && f9Var.A0() == 0) {
            if (f9Var != null && f9Var.P0() == 4) {
                z17 = true;
            }
            if (!z17) {
                if (this.f531698a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d2Var.f531704h, "add to newmsg list");
                    ((java.util.ArrayList) this.f531699b).add(f9Var);
                    return;
                } else {
                    this.f531698a = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d2Var.f531704h, "notifyFirst");
                    new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(ct1.c.f303753g.mo13945x23b2dd47()).mo50293x3498a0(new ww1.b2(f9Var));
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d2Var.f531704h, "not new msg, ignore");
        mm.w.f("notNewMsg");
    }
}
