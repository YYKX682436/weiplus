package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class kq extends com.tencent.mm.plugin.finder.convert.rp {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f103853h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f103854i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(com.tencent.mm.plugin.finder.convert.kp data) {
        super(com.tencent.mm.R.layout.b3s, data);
        kotlin.jvm.internal.o.g(data, "data");
        this.f103853h = "Finder.FinderMsgMentionedConvert";
        this.f103854i = "@";
    }

    @Override // com.tencent.mm.plugin.finder.convert.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        so2.a4 item = (so2.a4) iVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username ");
        dm.pd pdVar = item.f410411d;
        java.lang.String str = pdVar.field_username;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(" nickname ");
        java.lang.String str2 = pdVar.field_nickname;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(" url ");
        java.lang.String str3 = pdVar.field_headUrl;
        sb6.append(str3 != null ? str3 : "");
        sb6.append(" flag ");
        sb6.append(pdVar.field_extFlag);
        sb6.append(" content ");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.G1(pdVar.field_content));
        sb6.append(" id ");
        sb6.append(pdVar.field_id);
        sb6.append(" time ");
        sb6.append(pdVar.field_createTime);
        com.tencent.mars.xlog.Log.i(this.f103853h, sb6.toString());
        mn2.n nVar = new mn2.n(pdVar.field_headUrl, null, 2, null);
        int i18 = pdVar.field_extFlag;
        int i19 = i18 & 2;
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (i19 == 0 && (i18 & 1) == 0) {
            vo0.d l17 = g1Var.l();
            android.view.View p17 = holder.p(com.tencent.mm.R.id.a_4);
            kotlin.jvm.internal.o.f(p17, "getView(...)");
            l17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f329961o));
        } else {
            vo0.d a17 = g1Var.a();
            android.view.View p18 = holder.p(com.tencent.mm.R.id.a_4);
            kotlin.jvm.internal.o.f(p18, "getView(...)");
            a17.c(nVar, (android.widget.ImageView) p18, g1Var.h(mn2.f1.f329957h));
        }
        holder.p(com.tencent.mm.R.id.k3l);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485991jt2);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(this.f103854i);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str4 = pdVar.field_content;
        ((ke0.e) xVar).getClass();
        sb7.append((java.lang.Object) com.tencent.mm.pluginsdk.ui.span.c0.i(holder.f293121e, str4));
        textView.setText(sb7.toString());
        android.view.View p19 = holder.p(com.tencent.mm.R.id.o78);
        kotlin.jvm.internal.o.f(p19, "getView(...)");
        android.view.View p27 = holder.p(com.tencent.mm.R.id.o48);
        kotlin.jvm.internal.o.f(p27, "getView(...)");
        A(pdVar, (android.widget.ImageView) p19, (android.widget.TextView) p27);
    }
}
