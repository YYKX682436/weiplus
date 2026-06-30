package ey2;

/* loaded from: classes2.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.b0 f339096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ey2.b0 b0Var) {
        super(0);
        this.f339096d = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ey2.b0 b0Var = this.f339096d;
        android.content.res.Resources resources = b0Var.m80379x76847179().getResources();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s8 s8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s8.f214560a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = b0Var.m158354x19263085();
        java.lang.String string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ocy);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.i8 i8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.i8.f213826d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d8.f213413d;
        java.lang.String string2 = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ocz);
        java.lang.String string3 = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.od6);
        in5.c Lj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Lj(b0Var.m158354x19263085());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = Lj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) Lj : null;
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L));
        lVarArr[1] = new jz5.l("session_buffer", abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.g0() : null);
        lVarArr[2] = new jz5.l("ref_commentscene", java.lang.Integer.valueOf(b0Var.m158359x1e885992().getIntExtra("KEY_OPEN_FINDER_ENTRANCE_REF_COMMENT_SCENE", 0)));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
        s8Var.c(m158354x19263085, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h8(string, i8Var, d8Var, string2, string3, ey2.y.f339111d, new ey2.z(b0Var), new ey2.a0(b0Var), "open_entrance_know", "open_entrance_set", "open_entrance_popup", k17));
        return jz5.f0.f384359a;
    }
}
