package uj3;

/* loaded from: classes14.dex */
public final class o implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uj3.p f509866a;

    public o(uj3.p pVar) {
        this.f509866a = pVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num != null && num.intValue() == 0) {
            return;
        }
        uj3.p pVar = this.f509866a;
        if (num != null && -17 == num.intValue()) {
            db5.t7.g(pVar.getContext(), pVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cf7));
        } else {
            db5.t7.g(pVar.getContext(), pVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibr));
        }
        uj3.k1 m168149x29665661 = pVar.m168149x29665661();
        if (m168149x29665661 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            m168149x29665661.f509847j = num.intValue();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().h();
    }
}
