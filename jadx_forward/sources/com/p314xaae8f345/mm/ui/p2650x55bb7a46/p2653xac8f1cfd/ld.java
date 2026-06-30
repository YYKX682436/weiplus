package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes13.dex */
public class ld extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f280943d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f280944e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.dd f280945f;

    public ld(android.content.Context context, java.util.List list, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.dd ddVar) {
        this.f280943d = context;
        this.f280944e = list;
        this.f280945f = ddVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f280944e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.util.List list = this.f280944e;
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fd fdVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fd) k3Var;
        rn.c cVar = (rn.c) list.get(i17);
        android.view.View view = fdVar.f280576d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean v07 = cVar.v0();
        android.content.Context context = this.f280943d;
        android.widget.ImageView imageView = fdVar.f280578f;
        android.widget.TextView textView = fdVar.f280579g;
        if (v07) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562706bh1);
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ayn));
        } else {
            k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(cVar.f66266xdec927b);
            if (Bi == null) {
                ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Di(cVar.f66266xdec927b, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hd(this, fdVar, cVar));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f66263x29dd02d3)) {
                    java.lang.String str = cVar.f66263x29dd02d3;
                    if (str == null) {
                        str = "";
                    }
                    textView.setText(str);
                }
            } else {
                n11.a.b().h(Bi.f68920x68aa7b8d, imageView, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fd.f280575n);
                java.lang.String str2 = cVar.f66263x29dd02d3;
                java.lang.String str3 = Bi.f68913x21f9b213;
                if (str2 == null) {
                    str2 = str3;
                }
                textView.setText(str2);
            }
        }
        android.widget.RelativeLayout relativeLayout = fdVar.f280577e;
        if (i17 == 0) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (layoutParams.leftMargin == 0) {
                layoutParams.leftMargin = i65.a.b(context, 2);
                relativeLayout.setLayoutParams(layoutParams);
            }
        } else {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (layoutParams2.leftMargin != 0) {
                layoutParams2.leftMargin = 0;
                relativeLayout.setLayoutParams(layoutParams2);
            }
        }
        int i18 = cVar.f66262x29d3a50c;
        android.widget.RelativeLayout relativeLayout2 = fdVar.f280581i;
        android.widget.RelativeLayout relativeLayout3 = fdVar.f280580h;
        if (i18 == 0) {
            relativeLayout3.setVisibility(8);
            if (cVar.f66256x7fe5621 > 0) {
                relativeLayout2.setVisibility(0);
                fdVar.f280582m.setText("" + cVar.f66256x7fe5621);
            } else {
                relativeLayout2.setVisibility(8);
            }
        } else if (i18 == 1) {
            relativeLayout3.setVisibility(0);
            relativeLayout2.setVisibility(8);
            relativeLayout3.setTag(cVar);
            relativeLayout3.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.id(this, fdVar));
        }
        relativeLayout.setTag(cVar);
        relativeLayout.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jd(this, fdVar));
        relativeLayout.setOnLongClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kd(this, fdVar));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fd(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569971tb, viewGroup, false));
    }
}
