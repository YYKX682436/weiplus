package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class ax extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f199333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(android.content.Context context) {
        super(0);
        this.f199333d = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(this.f199333d);
        return java.lang.Integer.valueOf(java.lang.Math.min(b17.x, b17.y));
    }
}
