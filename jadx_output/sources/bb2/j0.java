package bb2;

/* loaded from: classes10.dex */
public final class j0 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.oo f18890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f18891b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f18892c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f18893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f18894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f18895f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f18896g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f18897h;

    public j0(r45.oo ooVar, com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, java.util.List list, so2.u1 u1Var, r45.qt2 qt2Var, bb2.w1 w1Var, boolean z17, boolean z18) {
        this.f18890a = ooVar;
        this.f18891b = mMFragmentActivity;
        this.f18892c = list;
        this.f18893d = u1Var;
        this.f18894e = qt2Var;
        this.f18895f = w1Var;
        this.f18896g = z17;
        this.f18897h = z18;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q().r()).booleanValue();
        java.util.List list = this.f18892c;
        if (booleanValue) {
            r45.oo ooVar = this.f18890a;
            int integer = ooVar.getInteger(8);
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f18891b;
            g4Var.h(14, integer > 0 ? com.tencent.mm.plugin.finder.assist.w2.o(ooVar.getInteger(8), false) : mMFragmentActivity.getString(com.tencent.mm.R.string.o8y), com.tencent.mm.R.raw.icons_filled_good, ooVar.getInteger(9) == 0 ? -1 : mMFragmentActivity.getColor(com.tencent.mm.R.color.Red_100));
            if (ooVar.getInteger(9) == 0) {
                list.add(1);
            } else {
                list.add(3);
            }
            g4Var.h(15, mMFragmentActivity.getString(com.tencent.mm.R.string.o8z), com.tencent.mm.R.raw.bullet_screen_filled, -1);
            list.add(2);
            if (!this.f18893d.N0() && ooVar.getInteger(6) != 1) {
                g4Var.h(16, mMFragmentActivity.getString(com.tencent.mm.R.string.p3j), com.tencent.mm.R.raw.heart_off_filled, -1);
                list.add(13);
            }
        } else {
            g4Var.h(5, "", com.tencent.mm.R.raw.icons_filled_bullet_follow_post, -1);
        }
        g4Var.h(6, "", com.tencent.mm.R.raw.icons_filled_more, -1);
        list.add(4);
        bb2.l0.a(bb2.l0.f18908a, "finder_barrage_comments_options", this.f18894e, this.f18890a, this.f18893d, "view_exp", kz5.n0.g0(this.f18892c, "#", null, null, 0, null, null, 62, null), this.f18895f, this.f18896g, this.f18897h, false);
    }
}
