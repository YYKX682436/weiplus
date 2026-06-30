package e05;

/* loaded from: classes9.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef f327714d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef viewOnClickListenerC19553xcfaf7ef) {
        this.f327714d = viewOnClickListenerC19553xcfaf7ef;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef viewOnClickListenerC19553xcfaf7ef = this.f327714d;
        if ((viewOnClickListenerC19553xcfaf7ef.f270059f == null || viewOnClickListenerC19553xcfaf7ef.f270060g == null || (viewOnClickListenerC19553xcfaf7ef.f270070t.getVisibility() == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnClickListenerC19553xcfaf7ef.f270070t.getText().toString())) || ((viewOnClickListenerC19553xcfaf7ef.f270071u.getVisibility() == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnClickListenerC19553xcfaf7ef.f270071u.getText().toString())) || ((viewOnClickListenerC19553xcfaf7ef.f270068r.getVisibility() == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnClickListenerC19553xcfaf7ef.f270068r.getText().toString())) || ((viewOnClickListenerC19553xcfaf7ef.f270072v.getVisibility() == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnClickListenerC19553xcfaf7ef.f270072v.getText().toString())) || ((viewOnClickListenerC19553xcfaf7ef.f270073w.getVisibility() == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnClickListenerC19553xcfaf7ef.f270073w.getText().toString())) || (viewOnClickListenerC19553xcfaf7ef.f270069s.getVisibility() == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnClickListenerC19553xcfaf7ef.f270069s.getText().toString()))))))) ? false : true) {
            d05.l lVar = viewOnClickListenerC19553xcfaf7ef.f270059f;
            if (lVar.f307149h == null) {
                lVar.f307144c = viewOnClickListenerC19553xcfaf7ef.f270070t.getText().toString();
            } else if (viewOnClickListenerC19553xcfaf7ef.f270071u.getVisibility() == 0) {
                viewOnClickListenerC19553xcfaf7ef.f270059f.f307149h.f307144c = viewOnClickListenerC19553xcfaf7ef.f270071u.getText().toString();
            }
            d05.l lVar2 = viewOnClickListenerC19553xcfaf7ef.f270060g;
            if (lVar2.f307149h == null) {
                lVar2.f307144c = viewOnClickListenerC19553xcfaf7ef.f270072v.getText().toString();
            } else if (viewOnClickListenerC19553xcfaf7ef.f270073w.getVisibility() == 0) {
                viewOnClickListenerC19553xcfaf7ef.f270060g.f307149h.f307144c = viewOnClickListenerC19553xcfaf7ef.f270073w.getText().toString();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(viewOnClickListenerC19553xcfaf7ef.f270059f);
            arrayList2.add(viewOnClickListenerC19553xcfaf7ef.f270060g);
            viewOnClickListenerC19553xcfaf7ef.m83096xe7b1ccf7(new d05.c(arrayList2, viewOnClickListenerC19553xcfaf7ef.m83105x7498fe14().getString("kreq_token"), viewOnClickListenerC19553xcfaf7ef.m83105x7498fe14().getString("key_bank_type")));
        } else {
            db5.t7.m123882x26a183b(viewOnClickListenerC19553xcfaf7ef.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.l2x, 0).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
