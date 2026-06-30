package com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6;

/* loaded from: classes12.dex */
public class a implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f134127a;

    public a(rh.c1 c1Var) {
        this.f134127a = c1Var;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        long max = java.lang.Math.max(1L, o2Var.f477020d / 60000);
        if (max < 5) {
            return;
        }
        for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry : ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c).f134095h.f477093a) {
            if (((java.lang.Long) threadJiffiesEntry.f477085a).longValue() / max < 3000) {
                return;
            }
            rh.c1 c1Var = this.f134127a;
            java.lang.String a17 = c1Var.f476862k.f444868d.A.a(threadJiffiesEntry.f134098b);
            if (!android.text.TextUtils.isEmpty(a17)) {
                ((java.util.HashMap) c1Var.f476861j).put(java.lang.String.valueOf(threadJiffiesEntry.f134098b), a17);
            }
        }
    }
}
