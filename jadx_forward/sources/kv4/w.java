package kv4;

/* loaded from: classes12.dex */
public final class w implements g75.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv4.i0 f394276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f394277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f394278c;

    public w(rv4.i0 i0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        this.f394276a = i0Var;
        this.f394277b = h0Var;
        this.f394278c = h0Var2;
    }

    @Override // g75.s
    public void a(g75.x result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f394278c;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f394277b;
        rv4.i0 i0Var = this.f394276a;
        int i17 = result.f350937a;
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSTeachHotSearchLineItem", "loading image %s failed !", i0Var.f482029g);
            ((android.widget.ImageView) h0Var2.f391656d).setVisibility(8);
            ((android.widget.FrameLayout) h0Var.f391656d).setVisibility(0);
        } else {
            if (i17 != 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSTeachHotSearchLineItem", "successfully load image from url: %s", i0Var.f482029g);
            ((android.widget.ImageView) h0Var2.f391656d).setVisibility(0);
            ((android.widget.FrameLayout) h0Var.f391656d).setVisibility(8);
        }
    }
}
