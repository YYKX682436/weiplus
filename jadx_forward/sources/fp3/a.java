package fp3;

/* loaded from: classes9.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d f346835d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d activityC16776x1b9c0a0d) {
        this.f346835d = activityC16776x1b9c0a0d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d activityC16776x1b9c0a0d = this.f346835d;
        if (id6 == com.p314xaae8f345.mm.R.id.kkv) {
            dp3.c cVar = activityC16776x1b9c0a0d.f234364h.f234353b;
            if (cVar != null) {
                hp3.d.c(activityC16776x1b9c0a0d, cVar.f323738d);
                com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d.U6(activityC16776x1b9c0a0d, activityC16776x1b9c0a0d.f234364h.f234353b.f323735a);
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.kl_ || view.getId() == com.p314xaae8f345.mm.R.id.kl9) {
            java.util.ArrayList arrayList2 = activityC16776x1b9c0a0d.f234364h.f234354c;
            if (arrayList2 != null && arrayList2.size() > 0) {
                if (!(!android.text.TextUtils.isEmpty(((com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) activityC16776x1b9c0a0d.f234364h.f234354c.get(0)).f234347i) ? hp3.d.c(activityC16776x1b9c0a0d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) activityC16776x1b9c0a0d.f234364h.f234354c.get(0)).f234347i) : false)) {
                    hp3.d.b(activityC16776x1b9c0a0d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) activityC16776x1b9c0a0d.f234364h.f234354c.get(0)).f234348m);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d.U6(activityC16776x1b9c0a0d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16775xba5fef49) activityC16776x1b9c0a0d.f234364h.f234354c.get(0)).f234343e);
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.kl8) {
            android.os.Bundle m83105x7498fe14 = activityC16776x1b9c0a0d.m83105x7498fe14();
            m83105x7498fe14.putParcelableArrayList("order_product_list", activityC16776x1b9c0a0d.f234364h.f234354c);
            m83105x7498fe14.putInt("key_enter_id", 0);
            m83105x7498fe14.putString("key_trans_id", activityC16776x1b9c0a0d.f234374u);
            m83105x7498fe14.putString("appname", activityC16776x1b9c0a0d.f234364h.f234358g);
            com.p314xaae8f345.mm.p2802xd031a825.a.d(activityC16776x1b9c0a0d, new android.os.Bundle());
            com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d.U6(activityC16776x1b9c0a0d, activityC16776x1b9c0a0d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.grj));
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.klp) {
            java.lang.String string = activityC16776x1b9c0a0d.m83105x7498fe14().getString("key_trans_id");
            android.os.Bundle m83105x7498fe142 = activityC16776x1b9c0a0d.m83105x7498fe14();
            m83105x7498fe142.putString("key_trans_id", string);
            m83105x7498fe142.putInt("key_enter_id", 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.a aVar = activityC16776x1b9c0a0d.f234364h;
            if (aVar != null) {
                m83105x7498fe142.putParcelable("transaction_data", aVar.f234352a);
            }
            com.p314xaae8f345.mm.p2802xd031a825.a.d(activityC16776x1b9c0a0d, m83105x7498fe142);
            com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d.U6(activityC16776x1b9c0a0d, activityC16776x1b9c0a0d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gri));
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.kkq) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d.B;
            db5.e1.A(activityC16776x1b9c0a0d, "商家已退全款，总价125元，包含商品价格115元，邮费10元，请确认是否同意通过该处理结果。", activityC16776x1b9c0a0d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gr9), activityC16776x1b9c0a0d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.grk), activityC16776x1b9c0a0d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.grl), new fp3.b(activityC16776x1b9c0a0d), new fp3.c(activityC16776x1b9c0a0d));
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.h1b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.a aVar2 = activityC16776x1b9c0a0d.f234364h;
            if (aVar2 != null && (str = aVar2.f234357f) != null) {
                activityC16776x1b9c0a0d.f234360d = str;
                if (!android.text.TextUtils.isEmpty(str)) {
                    android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:" + activityC16776x1b9c0a0d.f234360d));
                    intent.addFlags(268435456);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(intent);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(activityC16776x1b9c0a0d, arrayList3.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "dialPhone", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC16776x1b9c0a0d.startActivity((android.content.Intent) arrayList3.get(0));
                    yj0.a.f(activityC16776x1b9c0a0d, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI", "dialPhone", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d.U6(activityC16776x1b9c0a0d, activityC16776x1b9c0a0d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.grh));
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.pr7) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d0(activityC16776x1b9c0a0d, activityC16776x1b9c0a0d.f234364h.f234358g);
            com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d.U6(activityC16776x1b9c0a0d, activityC16776x1b9c0a0d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.grn));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
