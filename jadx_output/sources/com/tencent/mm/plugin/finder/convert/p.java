package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class p extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.aef;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String nickname;
        so2.i0 item = (so2.i0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = item.f410415d;
        boolean S3 = com.tencent.mm.storage.z3.S3(finderContact.getUsername());
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (S3) {
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(finderContact.getHeadUrl(), null, 2, null);
            android.view.View p17 = holder.p(com.tencent.mm.R.id.e_n);
            kotlin.jvm.internal.o.f(p17, "getView(...)");
            a17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f329957h));
        } else {
            java.lang.String headUrl = finderContact.getHeadUrl();
            if (headUrl == null || headUrl.length() == 0) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) holder.p(com.tencent.mm.R.id.e_n), finderContact.getUsername(), null);
            } else {
                vo0.d l17 = g1Var.l();
                mn2.n nVar2 = new mn2.n(finderContact.getHeadUrl(), null, 2, null);
                android.view.View p18 = holder.p(com.tencent.mm.R.id.e_n);
                kotlin.jvm.internal.o.f(p18, "getView(...)");
                l17.c(nVar2, (android.widget.ImageView) p18, g1Var.h(mn2.f1.f329961o));
            }
        }
        java.lang.String nickname2 = finderContact.getNickname();
        if (nickname2 == null || nickname2.length() == 0) {
            java.lang.String username = finderContact.getUsername();
            nickname = "";
            if (!com.tencent.mm.sdk.platformtools.t8.K0(username)) {
                i95.m c17 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                nickname = c61.yb.md((c61.yb) c17, username == null ? "" : username, "", false, 4, null);
            }
        } else {
            nickname = finderContact.getNickname();
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.e_o);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(holder.f293121e, nickname));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
