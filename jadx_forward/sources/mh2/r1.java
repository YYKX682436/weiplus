package mh2;

/* loaded from: classes10.dex */
public final class r1 extends mh2.a {

    /* renamed from: c, reason: collision with root package name */
    public final ah2.f f407980c;

    /* renamed from: d, reason: collision with root package name */
    public final lj2.v0 f407981d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f407982e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(android.content.Context context, android.view.ViewGroup root, ah2.f contentService, lj2.v0 pluginAbility) {
        super(context, root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentService, "contentService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        this.f407980c = contentService;
        this.f407981d = pluginAbility;
        this.f407982e = (android.widget.TextView) this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.f567847s01);
    }

    @Override // mh2.a
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.drg;
    }

    @Override // mh2.a
    public void c(om2.d0 singState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singState, "singState");
        lj2.v0 v0Var = this.f407981d;
        lj2.w0 f17 = v0Var.f();
        boolean z17 = false;
        int i17 = (f17 == lj2.w0.f400491d || f17 == lj2.w0.f400493f) ? 0 : 4;
        android.widget.TextView textView = this.f407982e;
        textView.setVisibility(i17);
        tn0.w0 h17 = v0Var.h();
        if (h17 != null && h17.X()) {
            z17 = true;
        }
        android.content.Context context = this.f407824a;
        textView.setText((z17 || zl2.r4.f555483a.x1()) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dko) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dkp));
        textView.setOnClickListener(new mh2.n1(this));
        this.f407980c.b(new mh2.o1(this));
        lj2.w0 f18 = v0Var.f();
        lj2.w0 w0Var = lj2.w0.f400492e;
        android.view.View view = this.f407825b;
        if (f18 == w0Var) {
            view.setTranslationY(i65.a.b(view.getContext(), 60));
        } else {
            view.setTranslationY(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14228x396f85b4 c14228x396f85b4 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14228x396f85b4 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14228x396f85b4) view : null;
        if (c14228x396f85b4 == null) {
            return;
        }
        c14228x396f85b4.m56834x41d4c386(new mh2.q1(this));
    }
}
