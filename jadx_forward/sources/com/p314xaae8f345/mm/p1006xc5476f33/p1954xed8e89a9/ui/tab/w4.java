package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class w4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 f236217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90) {
        super(0);
        this.f236217d = c16892x4a36dc90;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = 0;
        int intExtra = this.f236217d.f235731d.getIntent().getIntExtra("biz_profile_tab_type", 0);
        if (intExtra <= 4 && intExtra >= 0) {
            i17 = intExtra;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
