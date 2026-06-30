package d04;

/* loaded from: classes8.dex */
public final class e2 extends in5.r {
    @Override // in5.r
    public in5.s0 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.View convertView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertView, "convertView");
        return new d04.b2(convertView);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570959en1;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        d04.j2 item = (d04.j2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        if (holder instanceof d04.b2) {
            android.view.View view = ((d04.b2) holder).f306916n;
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = item.f306982g;
            } else {
                layoutParams = null;
            }
            view.setLayoutParams(layoutParams);
        }
    }
}
