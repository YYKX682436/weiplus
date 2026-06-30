package eg4;

/* loaded from: classes4.dex */
public final class y extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dyi;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        eg4.d2 item = (eg4.d2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = holder.f3639x46306858.getContext();
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f564231lm);
        boolean z18 = item.f334223d;
        if (textView != null) {
            textView.setVisibility(z18 ? 0 : 8);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.mfo);
        if (viewGroup != null) {
            viewGroup.setVisibility(z18 ? 8 : 0);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.mfo);
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new eg4.v(context, item));
        }
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.f564229lk);
        if (viewGroup3 != null) {
            viewGroup3.setOnClickListener(new eg4.x(context, item));
        }
    }
}
