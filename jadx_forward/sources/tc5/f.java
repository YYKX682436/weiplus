package tc5;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 f499092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b3) {
        super(1);
        this.f499092d = activityC21814x1938a8b3;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        em.d2 d2Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.g option = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.f283230x1;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b3 = this.f499092d;
        wc5.y0 n76 = activityC21814x1938a8b3.n7();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = n76.f526191f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        n76.f526192g = false;
        n76.f526193h = "";
        n76.f526198p = vc5.j.f516857d;
        n76.f526199q = null;
        n76.f526200r = null;
        uc5.f fVar = n76.f526190e;
        fVar.getClass();
        fVar.f508015a = "";
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1 i76 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) n76.U6()).i7();
        if (i76 != null && (d2Var = i76.f283265f) != null) {
            android.text.Editable text = d2Var.d().getText();
            if (text != null) {
                text.clear();
            }
            em.d2 d2Var2 = i76.f283265f;
            if (d2Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                throw null;
            }
            d2Var2.d().clearFocus();
            i76.b();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21818x708ac6f1.e(i76, false, false, false, 4, null);
        }
        n76.V6("", false);
        activityC21814x1938a8b3.B = option;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            activityC21814x1938a8b3.s7(option);
            activityC21814x1938a8b3.u7(option);
            activityC21814x1938a8b3.L = null;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(activityC21814x1938a8b3.m7().post(new tc5.k(activityC21814x1938a8b3))));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.h("MicroMsg.MsgHistoryGalleryUI", m143898xd4a2fc34, "Not yet implemented?", new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
