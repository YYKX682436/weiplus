package gv2;

/* loaded from: classes8.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f357530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gv2.k f357532f;

    public d(in5.s0 s0Var, java.lang.String str, gv2.k kVar) {
        this.f357530d = s0Var;
        this.f357531e = str;
        this.f357532f = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f357530d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        iv2.a aVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) this.f357532f.f357566e).f211861m;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        java.lang.String userName = this.f357531e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", userName);
        java.lang.String str = aVar.f376651a;
        if (str == null) {
            str = "";
        }
        intent.putExtra("key_text_status_comment_id", str);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 60);
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
