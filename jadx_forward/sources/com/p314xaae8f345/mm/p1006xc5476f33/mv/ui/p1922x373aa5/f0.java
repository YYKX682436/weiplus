package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f233356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a f233357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t3 f233358f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a c16687xe732929a, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t3 t3Var) {
        super(0);
        this.f233356d = view;
        this.f233357e = c16687xe732929a;
        this.f233358f = t3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fm3.w wVar;
        try {
            android.widget.ImageView imageView = (android.widget.ImageView) this.f233356d.findViewById(com.p314xaae8f345.mm.R.id.p0n);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            wVar = fm3.x.a(imageView);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mv.MusicMVCardChooseView", "generate animation info fail:" + e17.getLocalizedMessage());
            wVar = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.b0 b0Var = this.f233357e.G;
        if (b0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a) b0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t3 data = this.f233358f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
            activityC16653xffd2636a.a7(wVar, new jm3.p0(activityC16653xffd2636a, data));
        }
        return jz5.f0.f384359a;
    }
}
