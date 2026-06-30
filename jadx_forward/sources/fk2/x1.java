package fk2;

/* loaded from: classes2.dex */
public final class x1 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f345047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gj1 f345048e;

    public x1(android.content.Context context, r45.gj1 gj1Var) {
        this.f345047d = context;
        this.f345048e = gj1Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocation$Companion$setPoiSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        fk2.y1 y1Var = fk2.a2.f344842n;
        android.content.Context context = this.f345047d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        r45.gj1 payload = this.f345048e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payload, "payload");
        android.content.Intent intent = new android.content.Intent();
        r45.f96 f96Var = new r45.f96();
        boolean z17 = false;
        r45.ze2 ze2Var = (r45.ze2) payload.m75936x14adae67(0);
        f96Var.set(1, java.lang.Float.valueOf(ze2Var != null ? ze2Var.m75938x746dc8a6(1) : 0.0f));
        r45.ze2 ze2Var2 = (r45.ze2) payload.m75936x14adae67(0);
        f96Var.set(0, java.lang.Float.valueOf(ze2Var2 != null ? ze2Var2.m75938x746dc8a6(0) : 0.0f));
        r45.ze2 ze2Var3 = (r45.ze2) payload.m75936x14adae67(0);
        f96Var.set(2, ze2Var3 != null ? ze2Var3.m75945x2fec8307(2) : null);
        intent.putExtra("key_location", f96Var.mo14344x5f01b1f6());
        intent.putExtra("key_from_type", zy2.o9.f559050e);
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
        if (Sj != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj;
            intent.putExtra("key_from_scene", nyVar.f216913n);
            intent.putExtra("key_context_id", nyVar.f216915p);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        g0Var.B(1663L, 8L);
        com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20298x46d4560a c20298x46d4560a = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20298x46d4560a();
        if (j62.e.g().c(c20298x46d4560a) == 1 || bm5.o1.f104252a.h(c20298x46d4560a) == 1) {
            r45.ze2 ze2Var4 = (r45.ze2) payload.m75936x14adae67(0);
            if (ze2Var4 != null && (m75945x2fec8307 = ze2Var4.m75945x2fec8307(5)) != null && r26.i0.y(m75945x2fec8307, "foursquare_", false)) {
                z17 = true;
            }
            if (!z17 && ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.b1().r()).intValue() != 0) {
                i95.m c17 = i95.n0.c(c61.ub.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.ub.w2((c61.ub) c17, context, intent, f96Var, 0, 8, null);
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocation$Companion$setPoiSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Uk(context, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocation$Companion$setPoiSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f345047d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560582ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
