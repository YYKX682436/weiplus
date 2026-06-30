package bb2;

/* loaded from: classes10.dex */
public final class j0 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.oo f100423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f100424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f100425c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f100426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f100427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f100428f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f100429g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f100430h;

    public j0(r45.oo ooVar, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, java.util.List list, so2.u1 u1Var, r45.qt2 qt2Var, bb2.w1 w1Var, boolean z17, boolean z18) {
        this.f100423a = ooVar;
        this.f100424b = activityC21401x6ce6f73f;
        this.f100425c = list;
        this.f100426d = u1Var;
        this.f100427e = qt2Var;
        this.f100428f = w1Var;
        this.f100429g = z17;
        this.f100430h = z18;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Q().r()).booleanValue();
        java.util.List list = this.f100425c;
        if (booleanValue) {
            r45.oo ooVar = this.f100423a;
            int m75939xb282bd08 = ooVar.m75939xb282bd08(8);
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f100424b;
            g4Var.h(14, m75939xb282bd08 > 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(ooVar.m75939xb282bd08(8), false) : activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o8y), com.p314xaae8f345.mm.R.raw.f79758xc84e73d5, ooVar.m75939xb282bd08(9) == 0 ? -1 : activityC21401x6ce6f73f.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            if (ooVar.m75939xb282bd08(9) == 0) {
                list.add(1);
            } else {
                list.add(3);
            }
            g4Var.h(15, activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o8z), com.p314xaae8f345.mm.R.raw.f78718x6be82418, -1);
            list.add(2);
            if (!this.f100426d.N0() && ooVar.m75939xb282bd08(6) != 1) {
                g4Var.h(16, activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p3j), com.p314xaae8f345.mm.R.raw.f79473x57df6fcb, -1);
                list.add(13);
            }
        } else {
            g4Var.h(5, "", com.p314xaae8f345.mm.R.raw.f79652x1d54b5c9, -1);
        }
        g4Var.h(6, "", com.p314xaae8f345.mm.R.raw.f79813xc8512e6d, -1);
        list.add(4);
        bb2.l0.a(bb2.l0.f100441a, "finder_barrage_comments_options", this.f100427e, this.f100423a, this.f100426d, "view_exp", kz5.n0.g0(this.f100425c, "#", null, null, 0, null, null, 62, null), this.f100428f, this.f100429g, this.f100430h, false);
    }
}
