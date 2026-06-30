package qx1;

/* loaded from: classes10.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx1.a f448824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx1.q f448825e;

    public j(qx1.q qVar, mx1.a aVar) {
        this.f448825e = qVar;
        this.f448824d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.h(4);
        com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
        java.util.Map map = c10402x5bc41468.f146312h;
        ((java.util.HashMap) map).put("plugin_filter", java.lang.Boolean.TRUE);
        ((java.util.HashMap) map).put("plugin_poi", true);
        ((java.util.HashMap) map).put("plugin_tip", true);
        ((java.util.HashMap) map).put("plugin_menu", true);
        h17.f237210o = c10402x5bc41468;
        qx1.q qVar = this.f448825e;
        if (qVar.f448854o) {
            ut3.m.f512715a.d(qVar.f448841b.getContext(), 4100, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1, h17, 0);
        } else {
            android.content.Intent intent = new android.content.Intent();
            qVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63) intent.getParcelableExtra("KEY_SIGHT_PARAMS");
            if (c16528xd9aafd63 == null) {
                c16528xd9aafd63 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(4, 0);
            }
            java.lang.String str = "micromsg_" + java.lang.System.currentTimeMillis();
            java.lang.String str2 = lp0.b.m() + str + ".mp4";
            java.lang.String str3 = lp0.b.m() + str + ".jpeg";
            int intExtra = intent.getIntExtra("key_pick_local_media_duration", 60);
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd632 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(4, 1);
            c16528xd9aafd632.f230351e = 2;
            c16528xd9aafd632.f230350d = 0;
            if (c16528xd9aafd632.f230352f == null) {
                c16528xd9aafd632.f230352f = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
            }
            c16528xd9aafd632.f230352f.f152728h = intExtra;
            c16528xd9aafd632.a(str, str2, str3, q75.c.d() + java.lang.String.format("%s%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpg"));
            intent.putExtra("KEY_SIGHT_PARAMS", c16528xd9aafd63);
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context context = qVar.f448841b.getContext();
            ((ub0.r) oVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.j(context, 4101, intent, 4, 1);
        }
        this.f448824d.q0(256L);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
