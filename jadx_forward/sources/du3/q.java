package du3;

/* loaded from: classes.dex */
public final class q extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f325212d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f325213e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f325214f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f325215g;

    public q(yz5.l clickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickListener, "clickListener");
        this.f325212d = clickListener;
        this.f325213e = "MicroMsg.ImproveEditPhotoAiListAdapter";
        this.f325214f = new java.util.ArrayList();
        x(false);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f325214f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((du3.b) this.f325214f.get(i17)).f325053a;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        du3.d holder = (du3.d) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f325214f.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        du3.b bVar = (du3.b) obj;
        ((android.widget.TextView) ((jz5.n) holder.f325088d).mo141623x754a37bb()).setText(bVar.f325055c);
        du3.a aVar = du3.b.f325046e;
        if (bVar.f325053a == 0) {
            holder.f3639x46306858.setOnClickListener(null);
            return;
        }
        holder.f3639x46306858.setOnClickListener(new du3.n(this, bVar));
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.pk(itemView, "sns_ai_template_btn");
        aVar2.fk(itemView, "sns_publish_sessionid", ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi());
        aVar2.fk(itemView, "yb_content_type", java.lang.Integer.valueOf(this.f325215g ? 1 : 2));
        aVar2.fk(itemView, "yb_template_id", bVar.f325054b);
        aVar2.ik(itemView, 40, 36244);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == du3.b.f325052k) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eha, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            return new du3.d((android.view.ViewGroup) inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ehb, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
        return new du3.d((android.view.ViewGroup) inflate2);
    }

    public final void x(boolean z17) {
        java.util.ArrayList arrayList = this.f325214f;
        arrayList.clear();
        if (z17) {
            du3.a aVar = du3.b.f325046e;
            jz5.l lVar = du3.b.f325047f;
            java.lang.String str = (java.lang.String) lVar.f384366d;
            java.lang.Object obj = lVar.f384367e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "<get-second>(...)");
            arrayList.add(du3.a.a(aVar, str, (java.lang.String) obj, null, 4, null));
            jz5.l lVar2 = du3.b.f325048g;
            java.lang.String str2 = (java.lang.String) lVar2.f384366d;
            java.lang.Object obj2 = lVar2.f384367e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "<get-second>(...)");
            arrayList.add(du3.a.a(aVar, str2, (java.lang.String) obj2, null, 4, null));
        } else {
            du3.a aVar2 = du3.b.f325046e;
            jz5.l lVar3 = du3.b.f325049h;
            java.lang.String str3 = (java.lang.String) lVar3.f384366d;
            java.lang.Object obj3 = lVar3.f384367e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "<get-second>(...)");
            arrayList.add(du3.a.a(aVar2, str3, (java.lang.String) obj3, null, 4, null));
            jz5.l lVar4 = du3.b.f325050i;
            java.lang.String str4 = (java.lang.String) lVar4.f384366d;
            java.lang.Object obj4 = lVar4.f384367e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "<get-second>(...)");
            arrayList.add(du3.a.a(aVar2, str4, (java.lang.String) obj4, null, 4, null));
        }
        du3.a aVar3 = du3.b.f325046e;
        int i17 = du3.b.f325052k;
        java.lang.String str5 = du3.b.f325051j;
        java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.pdk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_photo_edit_ai_template_host, "https://yuanbao.tencent.com/aigi/templates/", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Zi, "getExpt(...)");
        arrayList.add(new du3.b(i17, str5, r17, Zi));
        arrayList.add(aVar3.b());
        m8146xced61ae5();
    }
}
