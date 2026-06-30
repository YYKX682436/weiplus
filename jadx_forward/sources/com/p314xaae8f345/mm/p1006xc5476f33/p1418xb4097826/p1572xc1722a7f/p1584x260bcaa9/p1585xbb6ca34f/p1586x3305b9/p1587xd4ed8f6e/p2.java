package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class p2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203412e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(in5.s0 s0Var, java.lang.String str) {
        super(1);
        this.f203411d = s0Var;
        this.f203412e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        java.lang.String str;
        java.lang.String num;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
        java.lang.String str2 = "";
        in5.s0 s0Var = this.f203411d;
        if (booleanValue) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) {
                str = "";
            }
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            ml2.u1 u1Var = ml2.u1.f409573e;
            a4Var.a(str, "", b17, "square_card_friend_like_avatar_half", this.f203412e);
        } else {
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar != null && (num = java.lang.Integer.valueOf(nyVar.f216913n).toString()) != null) {
                str2 = num;
            }
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b18 = b52.b.b();
            ml2.t1 t1Var = ml2.t1.f409475e;
            a4Var.b(str2, b18, "square_card_friend_like_avatar_half", this.f203412e);
        }
        return jz5.f0.f384359a;
    }
}
