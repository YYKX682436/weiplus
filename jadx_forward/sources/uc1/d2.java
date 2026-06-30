package uc1;

/* loaded from: classes13.dex */
public class d2 extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76856x366c91de = 200;

    /* renamed from: NAME */
    public static final java.lang.String f76857x24728b = "translateMapMarker";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f507840g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f507841h = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        super.A(lVar, jSONObject, i17);
        ((java.util.ArrayList) this.f507840g).add(new uc1.b2(this, lVar, jSONObject, i17));
        F();
    }

    public final synchronized void F() {
        if (this.f507841h.get()) {
            return;
        }
        if (((java.util.ArrayList) this.f507840g).size() == 0) {
            return;
        }
        java.lang.Runnable runnable = (java.lang.Runnable) ((java.util.ArrayList) this.f507840g).remove(0);
        if (runnable != null) {
            ik1.h0.a().m77784x795fa299(runnable);
        }
    }

    public final void G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, java.lang.String str, boolean z17) {
        C(lVar, i17, o(str), str.equals("ok"), z17);
        this.f507841h.set(false);
        F();
    }
}
