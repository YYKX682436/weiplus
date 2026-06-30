package jq4;

/* loaded from: classes5.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.y f382729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382730e;

    public t(jq4.y yVar, java.lang.String str) {
        this.f382729d = yVar;
        this.f382730e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showRejectCard$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jq4.y yVar = this.f382729d;
        int i17 = yVar.f382772h;
        long j17 = yVar.f382771g;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "voip_banner_after_reject");
        hashMap.put("voip_roomid", java.lang.Integer.valueOf(i17));
        hashMap.put("voip_roomKey", java.lang.Long.valueOf(j17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 26804);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("roomKey", yVar.f382771g);
        intent.putExtra("roomId", yVar.f382772h);
        yn.g.a(intent, jq4.a0.class);
        intent.putExtra("chat_from_scene", 9);
        ((sy.z) ((ty.j0) i95.n0.c(ty.j0.class))).Ai(this.f382730e, intent);
        wu5.c cVar = yVar.f382755w;
        if (cVar != null) {
            cVar.cancel(false);
        }
        jq4.y yVar2 = this.f382729d;
        yVar2.f382755w = null;
        jq4.z0.c(yVar2, true, false, false, 6, null);
        yj0.a.h(this, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showRejectCard$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
