package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class mm implements com.p314xaae8f345.mm.p2802xd031a825.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d f228730a;

    public mm(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d) {
        this.f228730a = activityC16390x60cac25d;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z
    /* renamed from: onClick */
    public void mo48650xaf6b9ae9(android.view.View view) {
        r45.wv3 wv3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = this.f228730a;
        int i17 = activityC16390x60cac25d.f228067v;
        if (i17 < 0 || i17 >= ((java.util.ArrayList) activityC16390x60cac25d.f228065t).size()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm zmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm) ((java.util.ArrayList) activityC16390x60cac25d.f228065t).get(activityC16390x60cac25d.f228067v);
        if (!zmVar.f229325a || (wv3Var = zmVar.f229326b) == null) {
            return;
        }
        java.lang.String str = wv3Var.f471033f;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("key_red_packet_preview_material_id", str);
        hashMap.put("key_red_packet_preview_scene", "1");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.j) ((mh0.n) i95.n0.c(mh0.n.class))).Ai(activityC16390x60cac25d.mo55332x76847179(), hashMap);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18892, 3, java.lang.Integer.valueOf(activityC16390x60cac25d.f228068w + 1), java.lang.Integer.valueOf(activityC16390x60cac25d.f228067v + 1), activityC16390x60cac25d.K, zmVar.f229326b.f471033f, activityC16390x60cac25d.f228048J, java.lang.Integer.valueOf(activityC16390x60cac25d.f228057n.mo1894x7e414b06() - 1), java.lang.Integer.valueOf(activityC16390x60cac25d.a7()), java.lang.Integer.valueOf(activityC16390x60cac25d.k7()), activityC16390x60cac25d.j7());
    }
}
