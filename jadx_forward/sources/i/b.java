package i;

@j95.b
/* loaded from: classes16.dex */
public final class b extends i95.w implements l.f {
    public final android.content.Intent a(android.app.Activity activity, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("list_type", 0);
        intent.putExtra("list_attr", 64);
        intent.putExtra("menu_mode", 2);
        intent.putExtra("key_confirm_menu_name", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
        intent.putExtra("recommend_chatroom", true);
        intent.putExtra("need_show_expand_btn", true);
        intent.putExtra("need_show_multiSelect_bottom", true);
        intent.putExtra("already_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
        intent.putExtra("always_exclude_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList2, ","));
        intent.putExtra("default_multi_search", true);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(c01.z1.r());
        arrayList3.add("weixin");
        arrayList3.add("filehelper");
        arrayList3.addAll(c01.e2.i());
        arrayList3.addAll(c01.e2.h());
        arrayList3.addAll(((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ri());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList3)) {
            intent.putExtra("block_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList3, ","));
        }
        pf5.j0.a(intent, aj5.g1.class);
        pf5.j0.a(intent, aj5.i.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, cj5.o.class);
        pf5.j0.a(intent, j93.r0.class);
        return intent;
    }
}
