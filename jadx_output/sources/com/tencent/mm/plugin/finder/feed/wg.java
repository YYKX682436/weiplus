package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class wg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f110974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f110975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f110976f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(int i17, com.tencent.mm.ui.MMActivity mMActivity, zy2.i5 i5Var) {
        super(0);
        this.f110974d = i17;
        this.f110975e = mMActivity;
        this.f110976f = i5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zy2.i5 i5Var = this.f110976f;
        com.tencent.mm.ui.MMActivity mMActivity = this.f110975e;
        int i17 = this.f110974d;
        if (i17 == -200050) {
            db5.e1.E(mMActivity.getContext(), mMActivity.getContext().getString(com.tencent.mm.R.string.ou6), "", mMActivity.getContext().getString(com.tencent.mm.R.string.f490454vi), false, new com.tencent.mm.plugin.finder.feed.vg(i5Var));
        } else if (i17 == -200045) {
            db5.e1.E(mMActivity.getContext(), mMActivity.getContext().getString(com.tencent.mm.R.string.ou7), "", mMActivity.getContext().getString(com.tencent.mm.R.string.f490454vi), false, new com.tencent.mm.plugin.finder.feed.ug(i5Var));
        } else if (i17 != -200023) {
            db5.t7.m(mMActivity.getContext(), mMActivity.getContext().getString(com.tencent.mm.R.string.dwg));
            tx2.i0 i0Var = com.tencent.mm.plugin.finder.feed.jh.f107102b;
            com.tencent.mm.plugin.finder.feed.jh.f107102b = null;
            if (i0Var != null) {
                i0Var.a();
            }
            i5Var.a(java.lang.Integer.valueOf(com.tencent.mm.plugin.finder.feed.jh.f107104d));
        } else {
            db5.e1.E(mMActivity.getContext(), mMActivity.getContext().getString(com.tencent.mm.R.string.f493737ou5), "", mMActivity.getContext().getString(com.tencent.mm.R.string.f490454vi), false, new com.tencent.mm.plugin.finder.feed.tg(i5Var));
        }
        return jz5.f0.f302826a;
    }
}
