package dk1;

/* loaded from: classes4.dex */
public final class k extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f314685d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.text.SimpleDateFormat f314686e;

    /* renamed from: f, reason: collision with root package name */
    public final java.text.SimpleDateFormat f314687f;

    public k() {
        java.util.Locale locale = java.util.Locale.US;
        this.f314686e = new java.text.SimpleDateFormat("HH:mm", locale);
        this.f314687f = new java.text.SimpleDateFormat("MM/dd HH:mm", locale);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f314685d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        dk1.l holder = (dk1.l) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f314685d;
        try {
            r45.wf7 wf7Var = (r45.wf7) arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wf7Var);
            android.widget.TextView textView = holder.f314688d;
            if (textView != null) {
                r45.xf7 xf7Var = wf7Var.f470674e;
                textView.setText(xf7Var != null ? xf7Var.f471590e : null);
            }
            android.widget.TextView textView2 = holder.f314690f;
            if (textView2 != null) {
                long j17 = wf7Var.f470675f * 1000;
                textView2.setText(android.text.format.DateUtils.isToday(j17) ? this.f314686e.format(new java.util.Date(j17)) : this.f314687f.format(new java.util.Date(j17)));
            }
            android.widget.TextView textView3 = holder.f314689e;
            if (textView3 != null) {
                r45.yf7 yf7Var = wf7Var.f470673d;
                java.lang.String str = yf7Var != null ? yf7Var.f472575e : null;
                if (str == null || str.length() == 0) {
                    textView3.setVisibility(8);
                } else {
                    textView3.setVisibility(0);
                    textView3.setText(textView3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a49, str));
                }
            }
            android.view.View view = holder.f314691g;
            if (view == null) {
                return;
            }
            int i18 = i17 != arrayList.size() - 1 ? 4 : 0;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/privacy/use_record/PrivacyUseRecordAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/ui/privacy/use_record/PrivacyUseRecordViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/privacy/use_record/PrivacyUseRecordAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/ui/privacy/use_record/PrivacyUseRecordViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPrivacyUseRecordPage", "onBindViewHolder, get useRecord fail since " + e17 + ", position: " + i17);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        return new dk1.l(parent);
    }

    public final void x(java.util.List fetchedUseRecordList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fetchedUseRecordList, "fetchedUseRecordList");
        java.util.ArrayList arrayList = this.f314685d;
        int size = arrayList.size();
        int size2 = fetchedUseRecordList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrivacyUseRecordPage", "appendFetchedUseRecordList, posInsert: " + size + ", insertCount: " + size2);
        arrayList.addAll(fetchedUseRecordList);
        m8153xd399a4d9(size, size2);
    }
}
