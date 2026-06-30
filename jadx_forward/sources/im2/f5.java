package im2;

/* loaded from: classes3.dex */
public final class f5 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f373850d;

    public f5(im2.h6 h6Var) {
        this.f373850d = h6Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public final void mo889xb349b3ab() {
        im2.h6 h6Var = this.f373850d;
        h6Var.N = null;
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        h6Var.Y().f492192n.m75942xfb822ef2(0);
        long j17 = h6Var.Y().f492181c;
        int i17 = !h6Var.Y().f492187i ? 1 : 0;
        r0Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("is_finder", java.lang.String.valueOf(i17));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.M1, hashMap, null, null, null, null, false, 124, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23059, liveid = " + ((java.lang.String) hashMap.get("liveid")) + ", feedid = " + ((java.lang.String) hashMap.get("feedid")) + ", is_finder = " + ((java.lang.String) hashMap.get("is_finder")));
    }
}
