package bg2;

/* loaded from: classes2.dex */
public final class c extends tc2.c {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f101489e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101489e = "Finder.LiveBrandController";
    }

    @Override // tc2.c
    public void P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.kr0 m59293x6b032749;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        r45.nw1 m59258xd0557130;
        java.lang.String l17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3;
        r45.nw1 m59258xd05571302;
        in5.s0 s0Var;
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        android.widget.ImageView imageView = (gVar == null || (s0Var = ((sb2.l) gVar).f498674d.f498682i) == null) ? null : (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.f564991ax2);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        tc2.g gVar2 = this.f498674d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar2.f498681h;
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59293x6b032749 = feedObject.m59293x6b032749()) == null || (m75941xfb821914 = m59293x6b032749.m75941xfb821914(12)) == null) {
            return;
        }
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.kz3 kz3Var = (r45.kz3) obj;
            if (kz3Var.m75939xb282bd08(0) == 6 && ((r45.mg6) kz3Var.m75936x14adae67(1)) != null) {
                break;
            }
        }
        if (((r45.kz3) obj) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = gVar2.f498681h;
            r45.i92 i92Var = (abstractC14490x69736cb52 == null || (feedObject3 = abstractC14490x69736cb52.getFeedObject()) == null || (m59258xd05571302 = feedObject3.m59258xd0557130()) == null) ? null : (r45.i92) m59258xd05571302.m75936x14adae67(55);
            if (i92Var != null && i92Var.m75939xb282bd08(0) == 1) {
                java.lang.String m75945x2fec8307 = i92Var.m75945x2fec8307(1);
                java.lang.String str = "";
                java.lang.String str2 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
                if (imageView != null) {
                    i95.m c17 = i95.n0.c(s40.w0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    s40.w0 w0Var = (s40.w0) c17;
                    android.content.Context context = imageView.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    float q17 = i65.a.q(context);
                    float s17 = i65.a.s(context);
                    s40.w0.S2(w0Var, imageView, str2, q17 > s17 ? s17 : q17, null, 8, null);
                    imageView.setVisibility(0);
                    uc2.g gVar3 = (uc2.g) O6(uc2.g.class);
                    r45.qt2 c76 = gVar3 != null ? ((sb2.l) gVar3).c7() : null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
                    ml2.u1 u1Var = ml2.u1.F2;
                    jz5.l[] lVarArr = new jz5.l[1];
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = gVar2.f498681h;
                    if (abstractC14490x69736cb53 != null && (feedObject2 = abstractC14490x69736cb53.getFeedObject()) != null && (m59258xd0557130 = feedObject2.m59258xd0557130()) != null && (l17 = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) != null) {
                        str = l17;
                    }
                    lVarArr[0] = new jz5.l("liveid", str);
                    v3Var.c(c76, u1Var, kz5.c1.i(lVarArr));
                    p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
                    g0Var.f391654d = c01.id.c();
                    ym5.a1.h(imageView, new bg2.b(this, g0Var));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101489e, "brandUrl ".concat(str2));
            }
        }
    }
}
