package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f;

/* loaded from: classes3.dex */
public final class i extends wm3.a implements wm3.m {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f272492d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f272493e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f272492d = "MicroMsg.BaseBottomSheetOpenWayEnhance";
        this.f272493e = jz5.h.b(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.h(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.elm;
    }

    @Override // wm3.m
    public boolean i() {
        em.p2 p2Var = (em.p2) ((jz5.n) this.f272493e).mo141623x754a37bb();
        if (p2Var.f336237c == null) {
            p2Var.f336237c = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) p2Var.f336235a.findViewById(com.p314xaae8f345.mm.R.id.un7);
        }
        return !p2Var.f336237c.canScrollVertically(-1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.g(this));
        }
    }
}
