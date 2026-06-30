package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44;

/* loaded from: classes8.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10 f241344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10 c17334xac4daa10) {
        super(0);
        this.f241344d = c17334xac4daa10;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10.ScanProductLiveList m68829xd056bd20;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10 c17334xac4daa10 = this.f241344d;
        android.content.Context context = c17334xac4daa10.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        m68829xd056bd20 = c17334xac4daa10.m68829xd056bd20();
        d04.d2 d2Var = new d04.d2(context, m68829xd056bd20, new in5.s() { // from class: com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView$buildItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductNewMaskDecorView", "type: " + type);
                return type == 2 ? new d04.i2() : new d04.e2();
            }
        });
        d2Var.mo8164xbbdced85(true);
        return d2Var;
    }
}
