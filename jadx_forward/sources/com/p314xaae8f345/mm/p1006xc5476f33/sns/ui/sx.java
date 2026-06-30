package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class sx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f252021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f252022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vx f252023f;

    public sx(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vx vxVar, android.view.View view, android.view.View view2) {
        this.f252023f = vxVar;
        this.f252021d = view;
        this.f252022e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix initCommentView.");
        android.view.View view = this.f252022e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vx vxVar = this.f252023f;
        vxVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        android.view.View view2 = this.f252021d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) view2.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(baseViewHolder.f250801f);
        if (k17 != null) {
            m21.w.d(740);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(k17);
            ca4.z0.T(k17);
            k17.m70377x3172ed();
            k17.m70375x338a8cc7();
            k17.m70374x6bf53a6c();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/TimeLineCommentHelper", "initCommentView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/TimeLineCommentHelper", "initCommentView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix cacheCommentContainer visible.");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = vxVar.f252251b;
        view.startAnimation(bsVar.f249581n);
        view.sendAccessibilityEvent(8);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f564373pe);
        vxVar.f252255f = linearLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = bsVar.f249572e;
        linearLayout.setOnClickListener(iVar.f251349s);
        android.widget.LinearLayout linearLayout2 = vxVar.f252255f;
        android.view.View.OnTouchListener onTouchListener = bsVar.K;
        linearLayout2.setOnTouchListener(onTouchListener);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f564403qd);
        vxVar.f252256g = linearLayout3;
        linearLayout3.setOnClickListener(iVar.f251350t);
        vxVar.f252256g.setOnTouchListener(onTouchListener);
        vxVar.f252256g.setTag(baseViewHolder);
        vxVar.f252255f.setTag(baseViewHolder);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) vxVar.f252256g.findViewById(com.p314xaae8f345.mm.R.id.f564402qc);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) vxVar.f252255f.findViewById(com.p314xaae8f345.mm.R.id.f564364p5);
        c22699x3dcdb3522.m82040x7541828(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        android.widget.TextView textView = (android.widget.TextView) vxVar.f252256g.findViewById(com.p314xaae8f345.mm.R.id.f564404qe);
        android.widget.TextView textView2 = (android.widget.TextView) vxVar.f252255f.findViewById(com.p314xaae8f345.mm.R.id.f564374pf);
        boolean f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.f(baseViewHolder.f250797d);
        android.content.Context context = vxVar.f252250a;
        if (f17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix isInValid.");
            vxVar.f252255f.setEnabled(false);
            vxVar.f252256g.setEnabled(false);
            textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a5z));
            if (baseViewHolder.f250793b == 10) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79400x2dd4e820);
                c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f79404xbe798344);
            } else {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80143xebd704ef);
                c22699x3dcdb352.m82040x7541828(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f79406xbc8ac860);
            }
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jc8));
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a5z));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix Valid.");
            vxVar.f252255f.setEnabled(true);
            if (baseViewHolder.f250793b == 10) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.alk);
                c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.all);
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a67));
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a67));
            } else {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            }
            vxVar.f252256g.setEnabled(true);
            if (baseViewHolder.f250803g == 0) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80143xebd704ef);
                c22699x3dcdb352.m82040x7541828(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jc8));
                textView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jc8));
            } else {
                if (vxVar.f252253d) {
                    c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79774xc850a2af);
                    c22699x3dcdb352.m82040x7541828(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
                } else {
                    c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80143xebd704ef);
                    c22699x3dcdb352.m82040x7541828(view2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                }
                textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jam));
                textView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j5o));
            }
        }
        if (baseViewHolder.f250793b == 10) {
            vxVar.f252256g.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563496an5);
            vxVar.f252255f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.an6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper$1");
    }
}
