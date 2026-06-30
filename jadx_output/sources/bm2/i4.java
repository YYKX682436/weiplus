package bm2;

/* loaded from: classes8.dex */
public final class i4 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f21972d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f21973e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f21974f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f21975g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f21976h;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f21972d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        android.text.SpannableString n17;
        java.lang.Object obj;
        jz5.f0 f0Var;
        bm2.f4 holder = (bm2.f4) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj2 = this.f21972d.get(i17);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        r45.mu2 mu2Var = (r45.mu2) obj2;
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
        mn2.n nVar = new mn2.n(finderContact != null ? finderContact.getHeadUrl() : null, null, 2, null);
        android.widget.ImageView imageView = holder.f21887f;
        kotlin.jvm.internal.o.f(imageView, "<get-avatar>(...)");
        a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
        android.widget.TextView textView = holder.f21888g;
        java.lang.String string = mu2Var.getString(1);
        if (string == null || string.length() == 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
            java.lang.String nickname = finderContact2 != null ? finderContact2.getNickname() : null;
            float textSize = holder.f21888g.getTextSize();
            ((ke0.e) xVar).getClass();
            n17 = com.tencent.mm.pluginsdk.ui.span.c0.n(context, nickname, textSize);
        } else {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            com.tencent.mm.plugin.finder.search.l4 l4Var = com.tencent.mm.plugin.finder.search.l4.f125761a;
            java.lang.String string2 = mu2Var.getString(1);
            if (string2 == null) {
                string2 = "";
            }
            android.text.Spanned c17 = l4Var.c(string2, "");
            float textSize2 = holder.f21888g.getTextSize();
            ((ke0.e) xVar2).getClass();
            n17 = com.tencent.mm.pluginsdk.ui.span.c0.n(context2, c17, textSize2);
        }
        textView.setText(n17);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
        java.lang.String signature = finderContact3 != null ? finderContact3.getSignature() : null;
        if (signature == null || signature.length() == 0) {
            holder.f21893o.setVisibility(8);
        } else {
            holder.f21893o.setVisibility(0);
            android.widget.TextView textView2 = holder.f21893o;
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context3 = holder.f21893o.getContext();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
            java.lang.String signature2 = finderContact4 != null ? finderContact4.getSignature() : null;
            float textSize3 = holder.f21893o.getTextSize();
            ((ke0.e) xVar3).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context3, signature2, textSize3));
        }
        holder.f21885d.setVisibility(0);
        holder.f21892n.setVisibility(8);
        holder.f21886e.setVisibility(8);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
        java.lang.String username = finderContact5 != null ? finderContact5.getUsername() : null;
        java.util.ArrayList arrayList = this.f21975g;
        synchronized (arrayList) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309172c, username)) {
                        break;
                    }
                }
            }
        }
        if (obj != null) {
            android.widget.TextView textView3 = holder.f21891m;
            textView3.setText(textView3.getContext().getResources().getString(com.tencent.mm.R.string.dmu));
        } else {
            java.util.HashMap hashMap = this.f21973e;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact6 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
            if (hashMap.get(finderContact6 != null ? finderContact6.getUsername() : null) != null) {
                holder.f21886e.setVisibility(0);
                holder.f21885d.setVisibility(8);
            } else {
                java.util.HashMap hashMap2 = this.f21974f;
                com.tencent.mm.protocal.protobuf.FinderContact finderContact7 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
                km2.q qVar = (km2.q) hashMap2.get(finderContact7 != null ? finderContact7.getUsername() : null);
                if (qVar != null) {
                    if (qVar.m()) {
                        holder.f21891m.setText(holder.itemView.getContext().getString(com.tencent.mm.R.string.dmw));
                    } else if (qVar.o()) {
                        holder.f21892n.setVisibility(0);
                        holder.f21885d.setVisibility(8);
                    } else {
                        holder.f21891m.setText(holder.itemView.getContext().getString(com.tencent.mm.R.string.dmv));
                    }
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    holder.f21891m.setText(holder.itemView.getContext().getString(com.tencent.mm.R.string.dmv));
                }
            }
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f460511a;
        android.widget.ImageView imageView2 = holder.f21889h;
        kotlin.jvm.internal.o.f(imageView2, "<get-typeIcon>(...)");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact8 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
        m1Var.c(imageView2, finderContact8 != null ? finderContact8.getAuthInfo() : null, 0);
        holder.f21890i.setOnClickListener(new bm2.g4(this, i17));
        holder.f21886e.setOnClickListener(new bm2.h4(this, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.ata, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new bm2.f4(inflate);
    }

    public final void x(java.util.List data) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(data, "data");
        this.f21972d.clear();
        java.util.ArrayList arrayList = this.f21972d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : data) {
            r45.mu2 mu2Var = (r45.mu2) obj2;
            java.util.ArrayList arrayList3 = this.f21975g;
            synchronized (arrayList3) {
                java.util.Iterator it = arrayList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    java.lang.String str = ((km2.q) next).f309172c;
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
                    if (kotlin.jvm.internal.o.b(str, finderContact != null ? finderContact.getUsername() : null)) {
                        obj = next;
                        break;
                    }
                }
            }
            if (obj == null) {
                arrayList2.add(obj2);
            }
        }
        arrayList.addAll(arrayList2);
    }

    public final void y(java.util.List localRecommApplyMicList) {
        kotlin.jvm.internal.o.g(localRecommApplyMicList, "localRecommApplyMicList");
        java.util.HashMap hashMap = this.f21974f;
        hashMap.clear();
        java.util.Iterator it = localRecommApplyMicList.iterator();
        while (it.hasNext()) {
            km2.q qVar = (km2.q) it.next();
            java.lang.String str = qVar.f309172c;
            if (str != null) {
                hashMap.put(str, qVar);
            }
        }
    }
}
