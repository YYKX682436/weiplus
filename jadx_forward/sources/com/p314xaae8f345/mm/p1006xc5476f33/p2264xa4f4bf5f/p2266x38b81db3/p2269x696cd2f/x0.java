package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nj4.e f254919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f254920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(nj4.e eVar, in5.s0 s0Var) {
        super(0);
        this.f254919d = eVar;
        this.f254920e = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view;
        nj4.e eVar = this.f254919d;
        if (eVar.f419469d.f86668b.size() > 0) {
            ai4.e eVar2 = eVar.f419469d;
            java.lang.String o17 = ((mj4.k) ((mj4.h) eVar2.f86668b.get(0))).o();
            in5.s0 s0Var = this.f254920e;
            android.view.View findViewWithTag = s0Var.f3639x46306858.findViewWithTag("status_avatar_".concat(o17));
            if (findViewWithTag != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                if (findViewWithTag.getLocalVisibleRect(rect) && rect.height() == findViewWithTag.getHeight()) {
                    view = findViewWithTag;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4 h4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255011o;
                    android.content.Context context = s0Var.f374654e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4.b(h4Var, context, o17, 1002, null, null, view, null, null, 216, null);
                    mj4.k kVar = (mj4.k) ((mj4.h) eVar2.f86668b.get(0));
                    qj4.s.n(qj4.s.f445491a, 6L, kVar.h(), eVar2.f86668b.size(), kVar.o(), null, null, 0, 0L, 0L, xe0.j0.a(kVar, false, 1, null).f436751i, java.lang.Integer.valueOf(xe0.j0.a(kVar, false, 1, null).f436758s), null, null, null, 14832, null);
                }
            }
            view = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4 h4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255011o;
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4.b(h4Var2, context2, o17, 1002, null, null, view, null, null, 216, null);
            mj4.k kVar2 = (mj4.k) ((mj4.h) eVar2.f86668b.get(0));
            qj4.s.n(qj4.s.f445491a, 6L, kVar2.h(), eVar2.f86668b.size(), kVar2.o(), null, null, 0, 0L, 0L, xe0.j0.a(kVar2, false, 1, null).f436751i, java.lang.Integer.valueOf(xe0.j0.a(kVar2, false, 1, null).f436758s), null, null, null, 14832, null);
        }
        return jz5.f0.f384359a;
    }
}
