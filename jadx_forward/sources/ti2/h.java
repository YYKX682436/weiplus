package ti2;

/* loaded from: classes10.dex */
public class h extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.am6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vi2.c item = (vi2.c) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.nzh);
        if (textView != null) {
            fj2.k kVar = fj2.k.f344708d;
            fj2.k kVar2 = item.f519076d;
            android.content.Context context = holder.f374654e;
            if (kVar2 == kVar) {
                textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eg8));
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560631px));
            } else {
                textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eg7));
                textView.setTextColor(android.graphics.Color.parseColor("#6467F0"));
            }
        }
    }
}
