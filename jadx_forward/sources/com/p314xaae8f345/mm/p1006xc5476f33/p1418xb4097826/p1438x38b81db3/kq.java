package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class kq extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f185386h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f185387i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp data) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.b3s, data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f185386h = "Finder.FinderMsgMentionedConvert";
        this.f185387i = "@";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        so2.a4 item = (so2.a4) iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username ");
        dm.pd pdVar = item.f491944d;
        java.lang.String str = pdVar.f66131xdec927b;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(" nickname ");
        java.lang.String str2 = pdVar.f66106x21f9b213;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(" url ");
        java.lang.String str3 = pdVar.f66093xa3f9e12a;
        sb6.append(str3 != null ? str3 : "");
        sb6.append(" flag ");
        sb6.append(pdVar.f66082x26b1b2e8);
        sb6.append(" content ");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(pdVar.f66079xad49e234));
        sb6.append(" id ");
        sb6.append(pdVar.f66095xc8a07680);
        sb6.append(" time ");
        sb6.append(pdVar.f66080xac3be4e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f185386h, sb6.toString());
        mn2.n nVar = new mn2.n(pdVar.f66093xa3f9e12a, null, 2, null);
        int i18 = pdVar.f66082x26b1b2e8;
        int i19 = i18 & 2;
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (i19 == 0 && (i18 & 1) == 0) {
            vo0.d l17 = g1Var.l();
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
            l17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f411494o));
        } else {
            vo0.d a17 = g1Var.a();
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
            a17.c(nVar, (android.widget.ImageView) p18, g1Var.h(mn2.f1.f411490h));
        }
        holder.p(com.p314xaae8f345.mm.R.id.k3l);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(this.f185387i);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str4 = pdVar.f66079xad49e234;
        ((ke0.e) xVar).getClass();
        sb7.append((java.lang.Object) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(holder.f374654e, str4));
        textView.setText(sb7.toString());
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.o78);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p19, "getView(...)");
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.o48);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p27, "getView(...)");
        A(pdVar, (android.widget.ImageView) p19, (android.widget.TextView) p27);
    }
}
