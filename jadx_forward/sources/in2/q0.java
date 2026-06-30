package in2;

/* loaded from: classes10.dex */
public final class q0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f374411d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f374412e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f374413f;

    /* renamed from: g, reason: collision with root package name */
    public dk2.yg f374414g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.q f374415h;

    public q0(gk2.e liveData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f374411d = liveData;
        this.f374412e = "FinderLiveAnchorMusicEditAdapter";
        this.f374413f = new java.util.ArrayList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        int size = this.f374413f.size();
        zl2.r4.f555483a.M2(this.f374412e, "getItemCount " + size);
        return size;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        in2.o0 holder = (in2.o0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f374413f.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        dk2.yg ygVar = (dk2.yg) obj;
        holder.f374399d.setChecked(ygVar.f315929d);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = ygVar.f315926a;
        android.widget.TextView textView = holder.f374400e;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String valueOf = java.lang.String.valueOf(ygVar.f315927b);
        float textSize2 = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, valueOf, textSize2);
        android.widget.TextView textView2 = holder.f374402g;
        textView2.setText(j17);
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str2 = ygVar.f315933h;
        float textSize3 = textView.getTextSize();
        ((ke0.e) xVar3).getClass();
        android.text.SpannableString j18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context3, str2, textSize3);
        android.widget.TextView textView3 = holder.f374403h;
        textView3.setText(j18);
        android.widget.TextView textView4 = holder.f374404i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView4, "<get-auditStatus>(...)");
        in2.b1.a(textView4, ygVar);
        boolean a86 = ((mm2.c1) this.f374411d.a(mm2.c1.class)).a8();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = holder.f374401f;
        if (a86) {
            c22699x3dcdb352.setVisibility(8);
            if (ygVar.f315927b <= 0) {
                textView2.setText("-");
            }
            int i18 = ygVar.a() ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(textView2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter$MusicEditViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(textView2, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter$MusicEditViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.CharSequence text = textView3.getText();
            if (text == null || text.length() == 0) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
            }
        } else {
            textView2.setVisibility(8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb352, "<get-moveBtn>(...)");
            int i19 = ygVar.a() ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c22699x3dcdb352, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter$MusicEditViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c22699x3dcdb352, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditAdapter$MusicEditViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView3.setVisibility(8);
        }
        textView.setAlpha(ygVar.a() ? 1.0f : 0.3f);
        holder.f3639x46306858.setOnClickListener(new in2.p0(this, holder, i17, ygVar));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.an7, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new in2.o0(this, inflate);
    }

    public final void x(java.util.ArrayList arrayList, java.lang.String str) {
        if (zl2.q4.f555466a.E()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str + "(MusicList):");
            if (arrayList != null) {
                int i17 = 0;
                for (java.lang.Object obj : arrayList) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    sb6.append("[" + i17 + ',' + ((dk2.yg) obj) + ']');
                    i17 = i18;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374412e, sb6.toString());
        }
    }
}
