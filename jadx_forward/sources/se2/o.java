package se2;

/* loaded from: classes3.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm2.c f488402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f488403f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f488404g;

    public o(java.lang.String str, lm2.c cVar, in5.s0 s0Var, boolean z17) {
        this.f488401d = str;
        this.f488402e = cVar;
        this.f488403f = s0Var;
        this.f488404g = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentActionListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zl2.r4 r4Var = zl2.r4.f555483a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("boxCommentLikeTrack onSingleTapConfirmed selfLike:");
        lm2.c cVar = this.f488402e;
        sb6.append(cVar.f400907g);
        r4Var.M2(this.f488401d, sb6.toString());
        in5.s0 s0Var = this.f488403f;
        java.lang.Object tag = s0Var.o().getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin");
        se2.d dVar = (se2.d) ((jz5.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb) tag).f195910y).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        dVar.getClass();
        if (!this.f488404g && se2.e.f488380a.a(cVar)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc ocVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214314a;
            ocVar.a();
            dVar.f488378d = view.getBackground();
            se2.w wVar = se2.w.f488428a;
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String tag2 = dVar.f488377c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag2, "tag");
            ocVar.e(new se2.m(cVar, context, tag2), new se2.b(s0Var, dVar, cVar, view), new se2.c(view, dVar), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fc(view, null, (r45.xn1) cVar.f400905e.m75936x14adae67(13), ((mm2.c1) dVar.a(mm2.c1.class)).T, true, true, cVar.a(), cVar.j(), 0, 258, null), (r16 & 16) != 0 ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dc(true, new db5.h4(view.getContext(), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26321xaee9b201.f52302xff8c0727, 0), true), (r16 & 32) != 0 ? null : null);
            if (r4Var.y(cVar) || r4Var.A(cVar)) {
                view.setBackground(view.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563240a16));
            } else {
                view.setBackground(view.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1l));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentActionListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
