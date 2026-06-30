package si0;

/* loaded from: classes4.dex */
public final class q1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ca4.r0 f489686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f489687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f489688c;

    public q1(ca4.r0 r0Var, yz5.l lVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var) {
        this.f489686a = r0Var;
        this.f489687b = lVar;
        this.f489688c = c0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
    /* renamed from: onResult */
    public final void mo26363x57429edc(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Long l17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserDatePickerFlutterPlugin", "choosePickerDate result:" + z17 + " year:" + obj + " month:" + obj2);
        if ((obj instanceof java.lang.String) && (obj2 instanceof java.lang.String)) {
            ca4.r0 r0Var = this.f489686a;
            java.util.Map map = (java.util.Map) ((java.util.HashMap) r0Var.f121544c).get(obj);
            if ((map != null ? (java.lang.Long) map.get(obj2) : null) != null) {
                bw5.tk0 tk0Var = new bw5.tk0();
                tk0Var.f115030d = java.lang.Integer.parseInt((java.lang.String) obj);
                boolean[] zArr = tk0Var.f115033g;
                zArr[1] = true;
                tk0Var.f115031e = java.lang.Integer.parseInt((java.lang.String) obj2);
                zArr[2] = true;
                java.util.Map map2 = (java.util.Map) ((java.util.HashMap) r0Var.f121544c).get(obj);
                tk0Var.f115032f = (map2 == null || (l17 = (java.lang.Long) map2.get(obj2)) == null) ? 0L : l17.longValue();
                zArr[3] = true;
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                this.f489687b.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(pm0.v.D(tk0Var))));
            }
        }
        this.f489688c.d();
    }
}
