package wt1;

/* loaded from: classes4.dex */
public class j0 implements com.p314xaae8f345.mm.p944x882e457a.u0, i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f530830d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f530831e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f530832f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f530833g;

    /* renamed from: h, reason: collision with root package name */
    public xt1.d0 f530834h;

    public j0() {
        gm0.j1.n().f354821b.a(1058, this);
        this.f530833g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }

    public void a(java.lang.String str, wt1.i0 i0Var) {
        synchronized (this.f530830d) {
            try {
                if (((java.util.HashMap) this.f530830d).get(str) != null) {
                    ((java.util.Set) ((java.util.HashMap) this.f530830d).get(str)).remove(i0Var);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        synchronized (this.f530831e) {
            this.f530831e.remove(str);
        }
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        java.util.Set set;
        java.lang.String str;
        if (!z17) {
            return true;
        }
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        if (e17 != null) {
            e17.m(this);
        }
        synchronized (this.f530830d) {
            set = (java.util.Set) ((java.util.HashMap) this.f530830d).get(this.f530832f);
        }
        if (set == null || set.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardShopLBSManager", "onGetLocation, already cancelled, no need to doScene");
            return false;
        }
        synchronized (this.f530831e) {
            str = (java.lang.String) this.f530831e.get(this.f530832f);
        }
        xt1.d0 d0Var = new xt1.d0(this.f530832f, f17, f18, str);
        if (gm0.j1.n().f354821b.h(d0Var, 0)) {
            this.f530834h = d0Var;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardShopLBSManager", "doScene fail, callback immediate");
            this.f530833g.mo50293x3498a0(new wt1.h0(this, this.f530832f, false, null));
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f530834h = null;
        xt1.d0 d0Var = (xt1.d0) m1Var;
        java.lang.String str2 = d0Var.f537991f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardShopLBSManager", "onSceneEnd, reqCardTpId = %s, errType = %d, errCode = %d", str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f530833g;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardShopLBSManager", "onSceneEnd, cardshoplbs fail");
            n3Var.mo50293x3498a0(new wt1.h0(this, str2, false, null));
        } else {
            java.util.ArrayList arrayList = d0Var.f537992g;
            if (arrayList != null) {
                arrayList.size();
            }
            n3Var.mo50293x3498a0(new wt1.h0(this, str2, true, arrayList));
        }
    }
}
