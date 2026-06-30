package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class zq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.es f287706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f287707e;

    public zq(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.es esVar, yz5.p pVar) {
        this.f287706d = esVar;
        this.f287707e = pVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/DyeingTemplateUtil$payRecepitDetailClickJumpToWeapp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/DyeingTemplateUtil$payRecepitDetailClickJumpToWeapp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DyeingTemplateUtil", "setClickJumpToPayDetailListener to weapp");
        java.lang.Object tag = view.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag : null;
        if ((erVar != null ? erVar.c() : null) != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.es esVar = this.f287706d;
            if ((esVar != null ? esVar.f285469f : null) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17 = erVar.c();
                sb6.append(c17 != null ? java.lang.Long.valueOf(c17.I0()) : null);
                sb6.append(':');
                sb6.append(erVar.f285439b);
                sb6.append(':');
                sb6.append(esVar.f285469f.x());
                sb6.append(':');
                sb6.append(esVar.f285468e);
                c12559xbdae8559.f169324g = sb6.toString();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(erVar.f285439b)) {
                    java.lang.String str = esVar.f285468e;
                    c12559xbdae8559.f169323f = (str == null || !r26.i0.y(str, "SUBSCRIPTION", false)) ? 1014 : 1107;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).aj(esVar.f285469f.g(), esVar.f285464a, null, esVar.f285466c, esVar.f285467d, esVar.f285465b, c12559xbdae8559);
                } else {
                    c12559xbdae8559.f169323f = 1043;
                    this.f287707e.mo149xb9724478(erVar.f285439b, c12559xbdae8559);
                }
                yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/DyeingTemplateUtil$payRecepitDetailClickJumpToWeapp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DyeingTemplateUtil", "tplPayDetailLayout param has null !");
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/DyeingTemplateUtil$payRecepitDetailClickJumpToWeapp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
