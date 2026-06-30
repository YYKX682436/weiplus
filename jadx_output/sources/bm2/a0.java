package bm2;

/* loaded from: classes3.dex */
public final class a0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f21747d;

    /* renamed from: e, reason: collision with root package name */
    public final sf2.e0 f21748e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f21749f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f21750g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21751h;

    public a0(android.content.Context context, sf2.e0 controller, r45.xg7 xg7Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f21747d = context;
        this.f21748e = controller;
        this.f21749f = new java.util.ArrayList();
        this.f21750g = new java.util.ArrayList();
        this.f21751h = context.getResources().getColor(com.tencent.mm.R.color.f479206su);
    }

    public static final java.lang.String x(bm2.a0 a0Var, java.lang.String str) {
        a0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        for (int indexOf = sb6.indexOf("<em>"); indexOf >= 0; indexOf = sb6.indexOf("<em>")) {
            sb6.delete(indexOf, indexOf + 4);
            int indexOf2 = sb6.indexOf("</em>");
            if (indexOf2 < 0) {
                break;
            }
            sb6.delete(indexOf2, indexOf2 + 5);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final void B(java.util.List suggests, boolean z17) {
        int i17;
        kotlin.jvm.internal.o.g(suggests, "suggests");
        java.util.List list = this.f21749f;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i17 = -1;
                break;
            } else {
                if (((bm2.w) listIterator.previous()).f22393a == bm2.v.f22359e) {
                    i17 = listIterator.nextIndex();
                    break;
                }
            }
        }
        ((java.util.ArrayList) list).clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(suggests, 10));
        java.util.Iterator it = suggests.iterator();
        while (it.hasNext()) {
            arrayList2.add(new bm2.w(bm2.v.f22358d, (dk2.vg) it.next()));
        }
        ((java.util.ArrayList) list).addAll(arrayList2);
        if ((!suggests.isEmpty()) && z17) {
            ((java.util.ArrayList) list).add(new bm2.w(bm2.v.f22359e, null));
        } else if (i17 != -1) {
            notifyItemRemoved(i17);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f21749f).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((bm2.w) ((java.util.ArrayList) this.f21749f).get(i17)).f22393a.ordinal();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.List list = this.f21749f;
        if (((bm2.w) ((java.util.ArrayList) list).get(i17)).f22393a != bm2.v.f22358d) {
            return;
        }
        bm2.x xVar = (bm2.x) holder;
        dk2.vg vgVar = ((bm2.w) ((java.util.ArrayList) list).get(i17)).f22394b;
        if (vgVar == null) {
            return;
        }
        r45.d22 d22Var = vgVar.f234254a;
        java.lang.String string = d22Var.getString(2);
        java.lang.CharSequence string2 = xVar.itemView.getContext().getResources().getString(com.tencent.mm.R.string.d4r, string, no0.m.f338730a.b(d22Var.getInteger(12), ":"));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String string3 = d22Var.getString(1);
        android.widget.TextView textView = xVar.f22420d;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, string3, textSize);
        if (!(string == null || string.length() == 0)) {
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            float textSize2 = textView.getTextSize();
            ((ke0.e) xVar3).getClass();
            string2 = com.tencent.mm.pluginsdk.ui.span.c0.j(context2, string2, textSize2);
        }
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
        mn2.q3 q3Var = new mn2.q3(d22Var.getString(4), com.tencent.mm.plugin.finder.storage.y90.f128356f);
        yo0.f fVar = new yo0.f();
        fVar.f464083g = com.tencent.mm.R.drawable.co_;
        wo0.c b17 = d1Var.b(q3Var, fVar.a());
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = xVar.f22422f;
        kotlin.jvm.internal.o.f(mMRoundCornerImageView, "<get-musicCover>(...)");
        ((wo0.b) b17).b(mMRoundCornerImageView, true);
        java.lang.String spannableString = j17.toString();
        kotlin.jvm.internal.o.f(spannableString, "toString(...)");
        z(textView, spannableString);
        android.widget.TextView textView2 = xVar.f22421e;
        kotlin.jvm.internal.o.f(textView2, "<get-musicDuration>(...)");
        z(textView2, string2.toString());
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = xVar.f22423g;
        kotlin.jvm.internal.o.f(weImageView, "<get-musicFavTips>(...)");
        y(weImageView, vgVar.f234256c == 51);
        weImageView.setOnClickListener(new bm2.z(this, xVar, vgVar));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        bm2.v vVar = bm2.v.f22358d;
        android.content.Context context = this.f21747d;
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.amm, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new bm2.x(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ami, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new bm2.u(this, inflate2);
    }

    public final void y(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, boolean z17) {
        if (z17) {
            rr.v.a(weImageView, com.tencent.mm.R.raw.icon_finder_live_music_search_selected, weImageView.getResources().getColor(com.tencent.mm.R.color.Brand_100));
        } else {
            rr.v.a(weImageView, com.tencent.mm.R.raw.icon_finder_live_music_search_not_selected, weImageView.getResources().getColor(com.tencent.mm.R.color.FG_1));
        }
    }

    public final void z(android.widget.TextView textView, java.lang.String str) {
        if (!(str.length() > 0)) {
            textView.setVisibility(8);
            return;
        }
        java.util.List list = this.f21750g;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.clear();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        bm2.y yVar = new bm2.y(0, 0, 3, null);
        for (int indexOf = sb6.indexOf("<em>"); indexOf >= 0; indexOf = sb6.indexOf("<em>")) {
            yVar.f22438a = indexOf;
            sb6.delete(indexOf, indexOf + 4);
            int indexOf2 = sb6.indexOf("</em>");
            if (indexOf2 < 0) {
                break;
            }
            yVar.f22439b = indexOf2;
            sb6.delete(indexOf2, indexOf2 + 5);
            arrayList.add(yVar);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(sb7);
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            bm2.y yVar2 = (bm2.y) it.next();
            int i17 = yVar2.f22438a;
            int i18 = yVar2.f22439b;
            if (i17 < i18) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(this.f21751h), i17, i18, 33);
            }
        }
        textView.setText(spannableString);
        textView.setVisibility(0);
    }
}
