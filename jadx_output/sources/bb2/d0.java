package bb2;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f18827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.oo f18828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f18829f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f18830g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f18831h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f18832i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f18833m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f18834n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.view.View f18835o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f18836p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f18837q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18838r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f18839s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ yz5.a f18840t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, r45.oo ooVar, boolean z17, r45.qt2 qt2Var, so2.u1 u1Var, bb2.w1 w1Var, boolean z18, in5.s0 s0Var, android.view.View view, float f17, float f18, int i17, android.widget.PopupWindow.OnDismissListener onDismissListener, yz5.a aVar) {
        super(1);
        this.f18827d = mMFragmentActivity;
        this.f18828e = ooVar;
        this.f18829f = z17;
        this.f18830g = qt2Var;
        this.f18831h = u1Var;
        this.f18832i = w1Var;
        this.f18833m = z18;
        this.f18834n = s0Var;
        this.f18835o = view;
        this.f18836p = f17;
        this.f18837q = f18;
        this.f18838r = i17;
        this.f18839s = onDismissListener;
        this.f18840t = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        db5.o4 b17;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        az2.f fVar2 = bb2.l0.f18912e;
        if (fVar2 != null) {
            fVar2.b();
        }
        bb2.l0.f18912e = null;
        com.tencent.mm.protobuf.f fVar3 = fVar.f70618d;
        r45.b51 b51Var = fVar3 instanceof r45.b51 ? (r45.b51) fVar3 : null;
        r45.po poVar = b51Var != null ? (r45.po) b51Var.getCustom(1) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GetBulletCommentUser errType:");
        sb6.append(fVar.f70615a);
        sb6.append(", errCode:");
        sb6.append(fVar.f70616b);
        sb6.append("， nickname=");
        sb6.append(poVar != null ? poVar.getString(1) : null);
        sb6.append(", is_in_black_list=");
        sb6.append(poVar != null ? java.lang.Integer.valueOf(poVar.getInteger(2)) : null);
        com.tencent.mars.xlog.Log.i("FinderBulletPopupHelper", sb6.toString());
        int i17 = fVar.f70615a;
        bb2.l0 l0Var = bb2.l0.f18908a;
        if (i17 == 0 && fVar.f70616b == 0) {
            z17 = false;
            b17 = bb2.l0.b(l0Var, this.f18827d, this.f18828e, this.f18829f, poVar != null && poVar.getInteger(2) == 1, this.f18830g, this.f18831h, this.f18832i, this.f18833m);
        } else {
            z17 = false;
            b17 = bb2.l0.b(l0Var, this.f18827d, this.f18828e, this.f18829f, false, this.f18830g, this.f18831h, this.f18832i, this.f18833m);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(this.f18827d, 1, z17);
        k0Var.f211872n = b17;
        k0Var.f211881s = bb2.l0.c(l0Var, this.f18827d, this.f18834n, this.f18835o, this.f18831h, this.f18828e, this.f18836p, this.f18837q, this.f18829f, this.f18830g, this.f18838r, this.f18832i, this.f18833m, this.f18839s, this.f18840t);
        k0Var.f211854d = new bb2.b0(this.f18839s);
        k0Var.C = new bb2.c0(this.f18830g, this.f18828e, this.f18831h, this.f18832i, this.f18829f, this.f18833m);
        k0Var.v();
        return jz5.f0.f302826a;
    }
}
