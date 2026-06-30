package cw1;

/* loaded from: classes8.dex */
public final class c3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13113x92bcd2ee f304382d;

    public c3(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13113x92bcd2ee activityC13113x92bcd2ee) {
        this.f304382d = activityC13113x92bcd2ee;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.List list = this.f304382d.f177253d;
        if (list != null) {
            return list.size();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        throw null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String e17;
        cw1.e3 holder = (cw1.e3) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13113x92bcd2ee activityC13113x92bcd2ee = this.f304382d;
        java.util.List list = activityC13113x92bcd2ee.f177253d;
        if (list == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            throw null;
        }
        jz5.l lVar = (jz5.l) ((java.util.ArrayList) list).get(i17);
        holder.f3639x46306858.setTag(lVar);
        java.lang.String str = (java.lang.String) lVar.f384366d;
        long longValue = ((java.lang.Number) lVar.f384367e).longValue();
        android.view.View view = holder.f304437h;
        int i18 = i17 == 0 ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$Adapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$Adapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(holder.f304433d, str, null);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            e17 = c01.a2.f(str, str);
        } else {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            e17 = c01.a2.e(str);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView = holder.f304434e;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC13113x92bcd2ee, e17, textSize));
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(str, longValue);
        ((bt.p0) ((com.p314xaae8f345.mm.p2621x8fb0427b.h8) i95.n0.c(com.p314xaae8f345.mm.p2621x8fb0427b.h8.class))).getClass();
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        if (w7Var.f135437d == null) {
            w7Var.f135437d = new com.p314xaae8f345.mm.app.u7(w7Var);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.g8 g8Var = w7Var.f135437d;
        int A0 = n17.A0();
        java.lang.String j17 = n17.j();
        int mo78013xfb85f7b0 = n17.mo78013xfb85f7b0();
        ((com.p314xaae8f345.mm.app.u7) g8Var).getClass();
        holder.f304435f.setText(qm.a0.l(A0, str, j17, mo78013xfb85f7b0, activityC13113x92bcd2ee));
        holder.f304436g.setText(k35.m1.f(activityC13113x92bcd2ee, n17.mo78012x3fdd41df(), true, false));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b0n, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new cw1.e3(this.f304382d, inflate);
    }
}
