package lx;

/* loaded from: classes11.dex */
public final class r2 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx.v2 f403464d;

    public r2(lx.v2 v2Var) {
        this.f403464d = v2Var;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object obj;
        if (w0Var == null || (obj = w0Var.f398509d) == null) {
            return;
        }
        hr1.e eVar = obj instanceof hr1.e ? (hr1.e) obj : null;
        if (eVar == null) {
            return;
        }
        java.lang.String field_selfBiz = eVar.f66325xea7a0fe2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_selfBiz, "field_selfBiz");
        lx.v2 v2Var = this.f403464d;
        if (v2Var.c(field_selfBiz)) {
            lx.v2.a(v2Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "[onConversationStorageChange] eventId=" + w0Var.f398507b + ", sessionId=" + eVar.f66326xbed8694c);
            eVar.u0();
            v2Var.f403514g.post(new lx.q2(w0Var, v2Var, eVar));
            return;
        }
        lx.v2.a(v2Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onConversationStorageChange] not self biz, skip, updateBiz: ");
        sb6.append(eVar.f66325xea7a0fe2);
        sb6.append(", loginBiz: ");
        v2Var.getClass();
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f501403d;
        sb6.append(((ox.r) d0Var).Bi(2).c());
        sb6.append(", serviceType: 5");
        v2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", sb6.toString());
    }
}
