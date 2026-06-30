package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes.dex */
public final class yb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.zb f287799d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.zb zbVar) {
        super(0);
        this.f287799d = zbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        android.content.Context m80379x76847179 = this.f287799d.m80379x76847179();
        if (m80379x76847179 == null) {
            m80379x76847179 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        int c17 = com.p314xaae8f345.mm.ui.bl.c(m80379x76847179);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            if (i19 >= i18) {
                i18 = i19;
            }
            i17 = i18 - c17;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
