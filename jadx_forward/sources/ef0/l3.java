package ef0;

/* loaded from: classes11.dex */
public final class l3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.m3 f333801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qk.v8 f333802b;

    public l3(ef0.m3 m3Var, qk.v8 v8Var) {
        this.f333801a = m3Var;
        this.f333802b = v8Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingListenSyncFeatureService", "doListenSync callback errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b);
        ef0.m3 m3Var = this.f333801a;
        m3Var.f333812i = false;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
            bw5.ac0 ac0Var = (bw5.ac0) resp;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSyncSuccess synGap: ");
            sb6.append(ac0Var.f106660e);
            sb6.append(", syncId: ");
            bw5.xb0 b17 = ac0Var.b();
            sb6.append(b17 != null ? b17.b() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingListenSyncFeatureService", sb6.toString());
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = ac0Var.f106668p[4] ? ac0Var.f106661f : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
            if (gVar != null) {
                java.lang.String encodeToString = android.util.Base64.encodeToString(gVar.g(), 2);
                m3Var.f333809f = encodeToString;
                gm4.a.f355090a.j("ting_listen_sync_session_buffer", encodeToString);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingListenSyncFeatureService", "onSyncSuccess sessionBuffer: " + encodeToString);
            } else {
                m3Var.f333809f = "";
                gm4.a.f355090a.j("ting_listen_sync_session_buffer", "");
            }
            bw5.xb0 b18 = ac0Var.b();
            if (b18 != null) {
                m3Var.f333808e = b18;
                gm4.a.f355090a.h("ting_listen_sync_item", b18.mo14344x5f01b1f6());
            }
            gm4.a aVar = gm4.a.f355090a;
            bw5.xb0 b19 = ac0Var.b();
            java.lang.String b27 = b19 != null ? b19.b() : null;
            aVar.j("key_ting_listen_sync_id", b27 != null ? b27 : "");
            int i17 = ac0Var.f106660e;
            if (i17 >= 7200) {
                m3Var.f333811h = i17;
                aVar.i("key_ting_listen_sync_gap", i17);
            }
            qk.v8 v8Var = this.f333802b;
            if (v8Var != null) {
                ((kp1.j0) v8Var).a((bw5.ac0) fVar.f152151d);
            }
        } else {
            qk.v8 v8Var2 = this.f333802b;
            if (v8Var2 != null) {
                ((kp1.j0) v8Var2).a(null);
            }
        }
        ef0.m3 m3Var2 = this.f333801a;
        bw5.ac0 ac0Var2 = (bw5.ac0) fVar.f152151d;
        synchronized (m3Var2.f333807d) {
            java.util.Iterator it = m3Var2.f333807d.iterator();
            while (it.hasNext()) {
                ((kp1.j0) ((qk.v8) it.next())).a(ac0Var2);
            }
        }
        return jz5.f0.f384359a;
    }
}
