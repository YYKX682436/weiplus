package bb2;

/* loaded from: classes10.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f100360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.oo f100361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f100362f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f100363g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f100364h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f100365i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f100366m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f100367n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.view.View f100368o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f100369p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f100370q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f100371r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f100372s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ yz5.a f100373t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, r45.oo ooVar, boolean z17, r45.qt2 qt2Var, so2.u1 u1Var, bb2.w1 w1Var, boolean z18, in5.s0 s0Var, android.view.View view, float f17, float f18, int i17, android.widget.PopupWindow.OnDismissListener onDismissListener, yz5.a aVar) {
        super(1);
        this.f100360d = activityC21401x6ce6f73f;
        this.f100361e = ooVar;
        this.f100362f = z17;
        this.f100363g = qt2Var;
        this.f100364h = u1Var;
        this.f100365i = w1Var;
        this.f100366m = z18;
        this.f100367n = s0Var;
        this.f100368o = view;
        this.f100369p = f17;
        this.f100370q = f18;
        this.f100371r = i17;
        this.f100372s = onDismissListener;
        this.f100373t = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        db5.o4 b17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        az2.f fVar2 = bb2.l0.f100445e;
        if (fVar2 != null) {
            fVar2.b();
        }
        bb2.l0.f100445e = null;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = fVar.f152151d;
        r45.b51 b51Var = fVar3 instanceof r45.b51 ? (r45.b51) fVar3 : null;
        r45.po poVar = b51Var != null ? (r45.po) b51Var.m75936x14adae67(1) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GetBulletCommentUser errType:");
        sb6.append(fVar.f152148a);
        sb6.append(", errCode:");
        sb6.append(fVar.f152149b);
        sb6.append("， nickname=");
        sb6.append(poVar != null ? poVar.m75945x2fec8307(1) : null);
        sb6.append(", is_in_black_list=");
        sb6.append(poVar != null ? java.lang.Integer.valueOf(poVar.m75939xb282bd08(2)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletPopupHelper", sb6.toString());
        int i17 = fVar.f152148a;
        bb2.l0 l0Var = bb2.l0.f100441a;
        if (i17 == 0 && fVar.f152149b == 0) {
            z17 = false;
            b17 = bb2.l0.b(l0Var, this.f100360d, this.f100361e, this.f100362f, poVar != null && poVar.m75939xb282bd08(2) == 1, this.f100363g, this.f100364h, this.f100365i, this.f100366m);
        } else {
            z17 = false;
            b17 = bb2.l0.b(l0Var, this.f100360d, this.f100361e, this.f100362f, false, this.f100363g, this.f100364h, this.f100365i, this.f100366m);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(this.f100360d, 1, z17);
        k0Var.f293405n = b17;
        k0Var.f293414s = bb2.l0.c(l0Var, this.f100360d, this.f100367n, this.f100368o, this.f100364h, this.f100361e, this.f100369p, this.f100370q, this.f100362f, this.f100363g, this.f100371r, this.f100365i, this.f100366m, this.f100372s, this.f100373t);
        k0Var.f293387d = new bb2.b0(this.f100372s);
        k0Var.C = new bb2.c0(this.f100363g, this.f100361e, this.f100364h, this.f100365i, this.f100362f, this.f100366m);
        k0Var.v();
        return jz5.f0.f384359a;
    }
}
