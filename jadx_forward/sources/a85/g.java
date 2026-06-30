package a85;

/* loaded from: classes15.dex */
public final class g extends android.widget.RelativeLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final a85.b f83933d;

    /* renamed from: e, reason: collision with root package name */
    public final x75.a f83934e;

    /* renamed from: f, reason: collision with root package name */
    public final a85.a f83935f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10439xce021022 f83936g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, a85.b bVar) {
        super(context, null, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f83933d = bVar;
        x75.b bVar2 = new x75.b();
        this.f83934e = bVar2;
        a85.a aVar = new a85.a();
        this.f83935f = aVar;
        gm0.j1.n().f354821b.a(2999, bVar2);
        setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571006co0, (android.view.ViewGroup) this, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
        relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.bzg).setOnClickListener(this);
        android.view.View findViewById = relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.dbs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10439xce021022 c10439xce021022 = (com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10439xce021022) findViewById;
        this.f83936g = c10439xce021022;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, 4);
        c1161x57298f5d.B = new a85.c(this, c1161x57298f5d);
        c10439xce021022.mo7967x900dcbe1(c1161x57298f5d);
        c10439xce021022.m7965x440a0e9(0);
        c10439xce021022.mo7960x6cab2c8d(aVar);
        c10439xce021022.i(new kr.b(c10439xce021022));
        c10439xce021022.m43698x53aed94a(1);
        c10439xce021022.m43694xe2690162(3);
        int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.f271298e;
        aVar.f402153g = new y75.c(1);
    }

    public static final java.util.ArrayList a(a85.g gVar, org.json.JSONArray jSONArray) {
        gVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).wi("MicroMsg.SimilarEmoji", jSONObject, c21053xdbf1e5f4);
            arrayList.add(c21053xdbf1e5f4);
        }
        return arrayList;
    }

    public static final java.util.List b(a85.g gVar, org.json.JSONArray jSONArray) {
        gVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.v5.class))).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).wi("MicroMsg.SimilarEmoji", jSONObject, c21053xdbf1e5f4);
            arrayList.add(new ir.g(c21053xdbf1e5f4, 102, null, 0, 12, null));
        }
        return arrayList;
    }

    /* renamed from: getDialog */
    public final a85.b m866x15b1203e() {
        return this.f83933d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        a85.b bVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/search/ui/SimilarEmojiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.bzg && (bVar = this.f83933d) != null) {
            bVar.cancel();
        }
        yj0.a.h(this, "com/tencent/mm/search/ui/SimilarEmojiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
