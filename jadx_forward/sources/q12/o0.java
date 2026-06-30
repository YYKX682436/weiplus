package q12;

/* loaded from: classes5.dex */
public final class o0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public o0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5946x34ca3d16 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5946x34ca3d16) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.ds dsVar = event.f136247g;
        if (dsVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonMsgRevokeListener", "event data is null");
        } else {
            boolean z17 = false;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_emoticon_deletion_event_report_android, false)) {
                java.lang.String str = dsVar.f88031c;
                if (android.text.TextUtils.isEmpty(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonMsgRevokeListener", "talker is empty");
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.j4(str) || c01.e2.U(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.D4(str) || r26.i0.y(str, "gh_", false)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonMsgRevokeListener", "talker is not real chat ".concat(str));
                    } else {
                        z17 = true;
                    }
                }
                if (z17) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(dsVar.f88031c, dsVar.f88029a);
                    if (n17.z0() != null && n17.Q0() != null && n17.mo78013xfb85f7b0() == 47) {
                        pm0.v.V(1000L, new q12.n0(this, n17));
                    }
                }
            }
        }
        return true;
    }
}
