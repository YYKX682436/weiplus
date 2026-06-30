package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes8.dex */
public final class uh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 f214713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15336x844a2f32 c15336x844a2f32) {
        super(0);
        this.f214713d = c15336x844a2f32;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.sh2 sh2Var;
        g92.b bVar = g92.b.f351302e;
        android.content.Context context = this.f214713d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int i17 = 0;
        m92.b j37 = g92.a.j3(bVar, xy2.c.e(context), false, 2, null);
        if (j37 != null && (sh2Var = (r45.sh2) j37.u0().m75936x14adae67(50)) != null) {
            i17 = sh2Var.m75939xb282bd08(0);
        }
        if (i17 <= 0) {
            i17 = 10;
        }
        return java.lang.Integer.valueOf(i17 * 2);
    }
}
