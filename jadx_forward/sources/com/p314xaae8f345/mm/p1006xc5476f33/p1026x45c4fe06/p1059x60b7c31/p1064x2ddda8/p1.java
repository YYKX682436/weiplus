package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar) {
        super(0);
        this.f161213d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y mComponent = this.f161213d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mComponent, "mComponent");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        if (!L.getBoolean("has_ever_show_wmpf_voip_call_in_scope_auth_notify_bottom_sheet", false)) {
            fl1.g2 m48800x14ed3266 = mComponent.t3().m48800x14ed3266();
            android.content.Context f229340d = mComponent.getF229340d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f229340d, "getContext(...)");
            ((fl1.c0) m48800x14ed3266).c(new ui1.e0(f229340d));
            L.putBoolean("has_ever_show_wmpf_voip_call_in_scope_auth_notify_bottom_sheet", true);
        }
        return jz5.f0.f384359a;
    }
}
