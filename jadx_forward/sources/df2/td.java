package df2;

/* loaded from: classes3.dex */
public final class td implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ud f312967d;

    public td(df2.ud udVar) {
        this.f312967d = udVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((r45.rk6) lVar.f384366d).m75939xb282bd08(1));
        df2.ud udVar = this.f312967d;
        udVar.f313051u = valueOf;
        udVar.f313052v = (java.lang.String) lVar.f384367e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(udVar.f313043m, "curTargetType:" + udVar.f313051u + ", curTaskId:" + udVar.f313052v);
        android.view.View view = udVar.f313045o;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController$onViewMount$1$1", "onChanged", "(Lkotlin/Pair;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController$onViewMount$1$1", "onChanged", "(Lkotlin/Pair;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = udVar.f313049s;
        if (textView != null) {
            r45.d62 a17 = r45.d62.a(((r45.rk6) lVar.f384366d).m75939xb282bd08(1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "forNumber(...)");
            int ordinal = a17.ordinal();
            java.lang.String string = ordinal != 4 ? ordinal != 15 ? ordinal != 22 ? ordinal != 26 ? ordinal != 40 ? ordinal != 43 ? ordinal != 44 ? ordinal != 59 ? ordinal != 60 ? "" : udVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpq) : udVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpi) : udVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpt) : udVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpp) : udVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpb) : udVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573393mq4) : udVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mph) : udVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mq7) : udVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mps);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            textView.setText(string);
        }
        android.view.View view2 = udVar.f313045o;
        if (view2 != null) {
            view2.post(new df2.sd(udVar, lVar));
        }
    }
}
