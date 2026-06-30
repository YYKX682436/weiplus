package nj2;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nj2.h f419364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(nj2.h hVar) {
        super(1);
        this.f419364d = hVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.kf5 kf5Var;
        r45.nu1 nu1Var = (r45.nu1) obj;
        if (nu1Var != null) {
            nj2.h hVar = this.f419364d;
            int i17 = 0;
            hVar.f0(false);
            r45.r7 r7Var = (r45.r7) nu1Var.m75936x14adae67(1);
            int m75939xb282bd08 = r7Var != null ? r7Var.m75939xb282bd08(0) : 0;
            android.widget.TextView textView = hVar.Q;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("serviceText");
                throw null;
            }
            android.content.Context context = hVar.f199716e;
            textView.setText(m75939xb282bd08 > 0 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mmt, java.lang.Integer.valueOf(m75939xb282bd08)) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mms));
            android.widget.TextView textView2 = hVar.P;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micPriceText");
                throw null;
            }
            r45.il4 il4Var = ((mm2.o4) hVar.H.a(mm2.o4.class)).U;
            if (il4Var != null && (kf5Var = il4Var.f458665g) != null) {
                i17 = kf5Var.f460191f;
            }
            textView2.setText(java.lang.String.valueOf(i17));
            nj2.h.e0(hVar).n();
            ((mj2.f) ((jz5.n) hVar.N).mo141623x754a37bb()).r("onBind");
        }
        return jz5.f0.f384359a;
    }
}
