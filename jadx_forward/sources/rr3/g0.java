package rr3;

/* loaded from: classes4.dex */
public final class g0 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a1v;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        rr3.d item = (rr3.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ((android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.d1x)).setVisibility(i17 == 0 ? 0 : 8);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f568103lp0);
        r45.ym ymVar = item.f480714d;
        r45.nm nmVar = ymVar.f472741d;
        textView.setText(nmVar != null ? nmVar.f463026e : null);
        android.widget.TextView textView2 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f568105lp2);
        long j17 = ymVar.f472742e;
        java.util.Locale locale = java.util.Locale.US;
        long j18 = j17 * 1000;
        textView2.setText(android.text.format.DateUtils.isToday(j18) ? new java.text.SimpleDateFormat("HH:mm", locale).format(new java.util.Date(j18)) : new java.text.SimpleDateFormat("MM/dd HH:mm", locale).format(new java.util.Date(j18)));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
