package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui;

/* loaded from: classes11.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.e f243595d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.e eVar) {
        this.f243595d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.e eVar = this.f243595d;
        if (id6 == com.p314xaae8f345.mm.R.id.b8u) {
            eVar.dismiss();
            com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.d dVar = eVar.H;
            if (dVar != null) {
                dVar.a();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardDialog", "close ShakeCardDialog");
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.b76) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c cVar = eVar.G;
            com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c cVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.PRE_ACCEPT;
            com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c cVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.ACCEPTING;
            if (cVar == cVar2) {
                eVar.G = cVar3;
                eVar.f243612o.setVisibility(0);
                eVar.e();
                com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.e.c(eVar);
            } else if (cVar != cVar3) {
                if (cVar == com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.ACCEPTED_FAIL) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.e.c(eVar);
                } else if (cVar == com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.ACCEPTED_SUCCES) {
                    eVar.I.mo48813x58998cd();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardDialog", "goCardDetailUI ShakeCardDialog");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(11665, eVar.E);
                    android.content.Context context = eVar.getContext();
                    java.lang.String str = eVar.E;
                    java.lang.String str2 = eVar.C.f340863c;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil doCardDetailUI()");
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_card_id", str);
                    intent.putExtra("key_card_ext", str2);
                    intent.putExtra("key_from_scene", 15);
                    j45.l.j(context, "card", ".ui.CardDetailUI", intent, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
