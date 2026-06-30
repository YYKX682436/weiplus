package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes5.dex */
public class t1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 f272857d;

    public t1(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030) {
        this.f272857d = c19642xb279030;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f272857d.f271318e.size() + 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return i17 == mo1894x7e414b06() - 1 ? 1 : 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.z1 z1Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.z1) k3Var;
        if (mo863xcdaf1228(i17) != 1) {
            java.lang.String str = (java.lang.String) this.f272857d.f271318e.get(i17);
            android.view.View view = z1Var.f3639x46306858;
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.jbx);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactAdapter", "onBindViewHolder", "(Lcom/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactAdapter", "onBindViewHolder", "(Lcom/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
            com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w wVar = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class));
            android.widget.ImageView imageView = z1Var.f273636d;
            wVar.Ai(imageView, str, null);
            ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            imageView.setContentDescription(c01.a2.e(str));
            view.setTag(str);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.f272857d;
        return (i17 != 1 || c19642xb279030.f271325o.booleanValue()) ? new com.p314xaae8f345.mm.p2470x93e71c27.ui.z1(c19642xb279030, c19642xb279030.f271324n.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cjk, (android.view.ViewGroup) null, false), i17) : new com.p314xaae8f345.mm.p2470x93e71c27.ui.z1(c19642xb279030, c19642xb279030.f271324n.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c5i, (android.view.ViewGroup) null, false), i17);
    }
}
