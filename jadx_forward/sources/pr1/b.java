package pr1;

/* loaded from: classes9.dex */
public class b implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 f439467d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1) {
        this.f439467d = viewOnCreateContextMenuListenerC12986xffd38cd1;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        java.lang.Object tag = view.getTag();
        if (tag == null || !(tag instanceof pr1.k)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandServiceSortView", "view tag is null or is not a instance of ResHolder.");
            yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        pr1.k kVar = (pr1.k) tag;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f439474a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandServiceSortView", "username is null or nil.");
            yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        tg0.t1 t1Var = (tg0.t1) i95.n0.c(tg0.t1.class);
        java.lang.String str = kVar.f439474a;
        ((sg0.m3) t1Var).getClass();
        su4.t2.a(str);
        ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1 = this.f439467d;
        com.p314xaae8f345.mm.ui.p2690x38b72420.c9.a(viewOnCreateContextMenuListenerC12986xffd38cd1.f175580J, 12, 4, i17 - 1);
        if (viewOnCreateContextMenuListenerC12986xffd38cd1.B) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", kVar.f439474a);
            intent.putExtra("Select_Conv_User", kVar.f439474a);
            if (viewOnCreateContextMenuListenerC12986xffd38cd1.getContext() instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) viewOnCreateContextMenuListenerC12986xffd38cd1.getContext();
                activity.setResult(-1, intent);
                activity.finish();
                yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
        }
        if (!viewOnCreateContextMenuListenerC12986xffd38cd1.f175588z) {
            if (viewOnCreateContextMenuListenerC12986xffd38cd1.f175583u == 0) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_conv_mass_send_hide_enable_android, 0) == 1) {
                    if ((c01.s0.a() & 1) != 0) {
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("Contact_User", kVar.f439474a);
                        intent2.putExtra("force_get_contact", true);
                        intent2.putExtra("key_use_new_contact_profile", true);
                        j45.l.j(viewOnCreateContextMenuListenerC12986xffd38cd1.getContext(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
                    }
                }
            }
            java.lang.String str2 = kVar.f439474a;
            android.content.Context context = viewOnCreateContextMenuListenerC12986xffd38cd1.getContext();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BrandServiceApplication", "startChattingUI");
            android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", str2);
            putExtra.putExtra("finish_direct", true);
            putExtra.putExtra("chat_from_scene", 2);
            putExtra.putExtra("specific_chat_from_scene", 4);
            putExtra.putExtra("img_gallery_enter_from_chatting_ui", true);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(putExtra, context);
        }
        pr1.i iVar = viewOnCreateContextMenuListenerC12986xffd38cd1.F;
        if (iVar != null) {
            iVar.b6(i17, kVar.f439474a);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
