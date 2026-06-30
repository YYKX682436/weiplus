package qd2;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final qd2.d0 f443247a = new qd2.d0();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820 f443248b;

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f443249c;

    /* renamed from: d, reason: collision with root package name */
    public static zy2.i5 f443250d;

    /* renamed from: e, reason: collision with root package name */
    public static zy2.i5 f443251e;

    public final boolean a(java.lang.String str) {
        return o35.a.b(str) && o35.a.g(str) > 0;
    }

    public final void b(android.content.Context context, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "[onFailed]");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820 c15199x5a7ac820 = f443248b;
        if (c15199x5a7ac820 != null) {
            c15199x5a7ac820.mo48239x360802();
        }
        f443248b = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = f443249c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        f443249c = null;
        if (z17) {
            db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.eqz, 0).show();
        }
    }

    public final void c(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820 c15199x5a7ac820 = f443248b;
        if (c15199x5a7ac820 != null) {
            c15199x5a7ac820.mo48239x360802();
        }
        f443248b = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = f443249c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        f443249c = null;
        long b17 = bu2.z.b(c19792x256d2725);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_feed_video_path", str);
        intent.putExtra("key_feed_video_duration_ms", b17);
        intent.putExtra("key_duration_min_limit", i17);
        intent.putExtra("key_duration_max_limit", i18);
        intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/helper/FinderOpenRedPacketEditPageHelper", "gotoEditPage", "(Landroid/content/Context;Ljava/lang/String;JII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/helper/FinderOpenRedPacketEditPageHelper", "gotoEditPage", "(Landroid/content/Context;Ljava/lang/String;JII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
