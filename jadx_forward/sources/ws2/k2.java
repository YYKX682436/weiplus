package ws2;

/* loaded from: classes3.dex */
public final class k2 implements ws2.m2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f530619a;

    public k2(java.lang.ref.WeakReference rReplayPluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rReplayPluginLayout, "rReplayPluginLayout");
        this.f530619a = rReplayPluginLayout;
    }

    @Override // ws2.m2
    public void a(boolean z17) {
    }

    @Override // ws2.m2
    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a8 a8Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 m17 = m();
        if (m17 == null || (a8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a8) m17.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a8.class)) == null) {
            return;
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.y7(a8Var, z17));
    }

    @Override // ws2.m2
    public void c(java.lang.String userId, boolean z17) {
        zi2.w wVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userId, "userId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 m17 = m();
        if (m17 == null || (wVar = (zi2.w) m17.mo57682x2a5e9229(zi2.w.class)) == null) {
            return;
        }
        wVar.G1(userId, z17);
    }

    @Override // ws2.m2
    public void d() {
    }

    @Override // ws2.m2
    public void e() {
        zi2.w wVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 m17 = m();
        if (m17 == null || (wVar = (zi2.w) m17.mo57682x2a5e9229(zi2.w.class)) == null) {
            return;
        }
        wVar.D1();
    }

    @Override // ws2.m2
    public void f(java.lang.String str) {
        zi2.w wVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 m17 = m();
        if (m17 == null || (wVar = (zi2.w) m17.mo57682x2a5e9229(zi2.w.class)) == null) {
            return;
        }
        wVar.K1(str);
    }

    @Override // ws2.m2
    public void g(boolean z17, boolean z18) {
        at2.u1 u1Var;
        dt2.a0 a0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 m17 = m();
        if (m17 == null || (u1Var = (at2.u1) m17.mo57682x2a5e9229(at2.u1.class)) == null || (a0Var = u1Var.f95295q) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = a0Var.f324691a;
        java.lang.Object obj = c14932xfc4acec9.f206425h;
        if (obj == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textureView");
            throw null;
        }
        ((android.view.View) obj).forceLayout();
        java.lang.Object obj2 = c14932xfc4acec9.f206425h;
        if (obj2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textureView");
            throw null;
        }
        android.view.View view = (android.view.View) obj2;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824);
        java.lang.Object obj3 = c14932xfc4acec9.f206425h;
        if (obj3 != null) {
            view.measure(makeMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(((android.view.View) obj3).getMeasuredHeight(), 1073741824));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textureView");
            throw null;
        }
    }

    @Override // ws2.m2
    public boolean h(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, boolean z17, jz5.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 m17 = m();
        if (m17 != null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57628x9aa6f4f1(m17, jSONObject, jSONObject2, jSONObject3, false, null, 24, null);
        }
        return false;
    }

    @Override // ws2.m2
    public void i(org.json.JSONArray jSONArray) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 m17 = m();
        if (m17 == null) {
            return;
        }
        m17.m57753x31fdc122(jSONArray);
    }

    @Override // ws2.m2
    public void j(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 m17 = m();
        if (m17 != null) {
            m17.m57748x69521950(jSONObject);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 m18 = m();
        if (m18 == null) {
            return;
        }
        m18.m57744x969233da(jSONObject2);
    }

    @Override // ws2.m2
    public void k() {
    }

    @Override // ws2.m2
    public void l() {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 m() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) this.f530619a.get();
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SeiProcessCallbackFullUIProxy", "getPluginLayout fail!");
        }
        return k0Var;
    }

    @Override // ws2.m2
    /* renamed from: statusChange */
    public void mo174392x60d69242(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 m17 = m();
        if (m17 != null) {
            m17.mo46557x60d69242(status, bundle);
        }
    }
}
