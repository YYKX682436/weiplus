package oi4;

/* loaded from: classes11.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj4.a f427156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f427157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oi4.c f427159g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f427160h;

    public b(kj4.a aVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, oi4.c cVar, android.content.Context context) {
        this.f427156d = aVar;
        this.f427157e = h0Var;
        this.f427158f = str;
        this.f427159g = cVar;
        this.f427160h = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/like/CommentHistoryItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kj4.a aVar = this.f427156d;
        mj4.e eVar = aVar.f389984d;
        int i17 = eVar.f76559xb0238158;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f427157e;
        if (i17 == 1) {
            h0Var.f391656d = "";
        }
        java.lang.String str = eVar.f76564xa2260b25;
        boolean b17 = str == null ? false : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, en1.a.a());
        oi4.c cVar = this.f427159g;
        java.lang.String statusId = this.f427158f;
        if (b17) {
            si4.a G = ai4.m0.f86706a.G();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(statusId, "$statusId");
            mj4.h t17 = G.t(statusId);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("item onClick self, ");
            sb6.append(statusId);
            sb6.append(", exist=");
            sb6.append(t17 != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.CommentHistoryItemConvert", sb6.toString());
            if (t17 != null) {
                java.lang.String field_TextStatusOwnerUserName = aVar.f389984d.f76564xa2260b25;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_TextStatusOwnerUserName, "field_TextStatusOwnerUserName");
                cVar.n(field_TextStatusOwnerUserName, t17, (java.lang.String) h0Var.f391656d);
            } else {
                android.content.Context context = this.f427160h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
                java.lang.String field_TextStatusId = aVar.f389984d.f76563x5493d43f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_TextStatusId, "field_TextStatusId");
                cVar.p(context, field_TextStatusId, (java.lang.String) h0Var.f391656d);
            }
        } else {
            si4.a G2 = ai4.m0.f86706a.G();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(statusId, "$statusId");
            mj4.h t18 = G2.t(statusId);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("item onClick owner=");
            sb7.append(aVar.f389984d.f76564xa2260b25);
            sb7.append(", ");
            sb7.append(statusId);
            sb7.append(", exist=");
            sb7.append(t18 != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.CommentHistoryItemConvert", sb7.toString());
            if (t18 == null) {
                cVar.o(cVar.f427179f);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("textstatus_expire_cannot_view_toast", "view_exp", new java.util.HashMap(), 28809);
            } else {
                java.lang.String field_TextStatusOwnerUserName2 = aVar.f389984d.f76564xa2260b25;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_TextStatusOwnerUserName2, "field_TextStatusOwnerUserName");
                cVar.n(field_TextStatusOwnerUserName2, t18, (java.lang.String) h0Var.f391656d);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.CommentHistoryItemConvert", "onBindViewHolder: refCommentId:" + ((java.lang.String) h0Var.f391656d) + ' ');
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/like/CommentHistoryItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
