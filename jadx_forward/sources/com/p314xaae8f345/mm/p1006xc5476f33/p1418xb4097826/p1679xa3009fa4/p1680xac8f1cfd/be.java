package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class be implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ce f215401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f215402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f215403f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f215404g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f215405h;

    public be(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ce ceVar, long j17, java.lang.ref.WeakReference weakReference, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, boolean z17) {
        this.f215401d = ceVar;
        this.f215402e = j17;
        this.f215403f = weakReference;
        this.f215404g = h0Var;
        this.f215405h = z17;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        in5.s0 s0Var;
        android.view.View view;
        r45.ln2 ln2Var = (r45.ln2) obj;
        android.widget.TextView textView = (android.widget.TextView) this.f215404g.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ln2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ce ceVar = this.f215401d;
        ceVar.getClass();
        boolean z17 = this.f215405h;
        if (z17) {
            s0Var = (in5.s0) this.f215403f.get();
            if (s0Var == null) {
                return;
            }
            so2.j5 j5Var = (so2.j5) s0Var.f374658i;
            if (!(j5Var != null && j5Var.mo2128x1ed62e84() == this.f215402e)) {
                return;
            }
        } else {
            s0Var = null;
        }
        if (ln2Var.m75939xb282bd08(1) == 1) {
            if (!z17 || s0Var == null) {
                view = ceVar.f215548d;
            } else {
                bw2.o oVar = bw2.o.f106402a;
                view = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f106410i).mo141623x754a37bb()).mo146xb9724478(s0Var)).a();
            }
            if (z17) {
                if (view == null || (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.lob)) == null) {
                    textView = null;
                } else {
                    com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                    textView.setTextSize(1, 14.0f);
                }
            }
            java.lang.String m75945x2fec8307 = ln2Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            if (textView != null) {
                textView.setText(m75945x2fec8307);
            }
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view2 = view;
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRecommendUIC", "onRecommendDataNotify", "(JLjava/lang/ref/WeakReference;Landroid/widget/TextView;Lcom/tencent/mm/protocal/protobuf/FinderObjectWordingInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRecommendUIC", "onRecommendDataNotify", "(JLjava/lang/ref/WeakReference;Landroid/widget/TextView;Lcom/tencent/mm/protocal/protobuf/FinderObjectWordingInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedRecommendUIC", "recommendReason: " + ((java.lang.Object) m75945x2fec8307));
        }
    }
}
