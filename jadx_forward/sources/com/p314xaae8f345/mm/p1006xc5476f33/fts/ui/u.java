package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class u implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee f219722d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee activityC15588x58c11aee) {
        this.f219722d = activityC15588x58c11aee;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.fi6 fi6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee activityC15588x58c11aee = this.f219722d;
        su4.p1 p1Var = activityC15588x58c11aee.U;
        if (m1Var != p1Var || p1Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSAddFriendUI", "OnPardusSearchSceneEnd, errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
        if (i17 == 0 && i18 == 0 && (fi6Var = activityC15588x58c11aee.U.f494569f.f457396m) != null) {
            if (fi6Var.f455920d.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTS.FTSAddFriendUI", "buildRelevantFooter: sugResult is null or empty");
                return;
            }
            activityC15588x58c11aee.f219414x.removeAllViews();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = fi6Var.f455920d.iterator();
            int i19 = -1;
            while (it.hasNext()) {
                r45.di6 di6Var = (r45.di6) it.next();
                i19++;
                android.view.View inflate = android.view.LayoutInflater.from(activityC15588x58c11aee.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efp, (android.view.ViewGroup) activityC15588x58c11aee.f219413w, false);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(di6Var.f454053o)) {
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ltk)).setText(o13.q.g(di6Var.f454053o, activityC15588x58c11aee.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77742x25702ef)));
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(di6Var.f454045d)) {
                    return;
                } else {
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ltk)).setText(o13.q.e(p13.i.d(di6Var.f454045d, p13.r.b(activityC15588x58c11aee.f219443n, false), false, false)).f432638a);
                }
                if (i19 > 0) {
                    sb6.append("|");
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(di6Var.f454045d)) {
                    sb6.append(di6Var.f454045d);
                }
                if (i19 == fi6Var.f455920d.size() - 1) {
                    android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.lt8);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "buildRelevantFooter", "(Lcom/tencent/mm/protocal/protobuf/SugResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "buildRelevantFooter", "(Lcom/tencent/mm/protocal/protobuf/SugResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.lt8);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "buildRelevantFooter", "(Lcom/tencent/mm/protocal/protobuf/SugResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "buildRelevantFooter", "(Lcom/tencent/mm/protocal/protobuf/SugResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.t(activityC15588x58c11aee, di6Var));
                inflate.setTag(di6Var);
                activityC15588x58c11aee.f219414x.addView(inflate);
            }
            activityC15588x58c11aee.Q = sb6.toString();
        }
    }
}
