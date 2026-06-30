package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class zp extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f186654h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp data) {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.b3l, data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f186654h = "Finder.FinderMsgFollowMemberConvert";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp
    public void r(in5.s0 holder, so2.i iVar, int i17, java.util.List list) {
        so2.u3 item = (so2.u3) iVar;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f186654h, sb6.toString());
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFollowMemberConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollowMember;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderMsgFollowMemberConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollowMember;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.knh);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderMsgFollowMemberConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollowMember;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderMsgFollowMemberConvert", "convertMsg", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderMsgFollowMember;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.n nVar = new mn2.n(pdVar.f66093xa3f9e12a, null, 2, null);
        int i18 = pdVar.f66082x26b1b2e8;
        int i19 = i18 & 2;
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (i19 == 0 && (i18 & 1) == 0) {
            vo0.d l17 = g1Var.l();
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p19, "getView(...)");
            l17.c(nVar, (android.widget.ImageView) p19, g1Var.h(mn2.f1.f411494o));
        } else {
            vo0.d a17 = g1Var.a();
            android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p27, "getView(...)");
            a17.c(nVar, (android.widget.ImageView) p27, g1Var.h(mn2.f1.f411490h));
        }
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567524jt2)).setText(holder.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.epf));
    }
}
