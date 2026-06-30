package sc2;

/* loaded from: classes2.dex */
public final class w0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f487857f;

    public w0(sc2.h1 h1Var, in5.s0 s0Var, r45.t01 t01Var) {
        this.f487855d = h1Var;
        this.f487856e = s0Var;
        this.f487857f = t01Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        sc2.h1 h1Var = this.f487855d;
        if (h1Var.A1 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g3.f206578e) {
            h1Var.A1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g3.f206579f;
        }
        h1Var.P(this.f487856e, true, true, this.f487857f);
    }
}
