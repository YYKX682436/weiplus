package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2267x5897e6f;

/* loaded from: classes11.dex */
public final class d extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2267x5897e6f.b f254750e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2267x5897e6f.b onItemClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClickListener, "onItemClickListener");
        this.f254750e = onItemClickListener;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.czk;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        fj4.c item = (fj4.c) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f568965om4);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18627xdbbda7b2 c18627xdbbda7b2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18627xdbbda7b2) holder.p(com.p314xaae8f345.mm.R.id.f566831h75);
        textView.setText(item.f344763g);
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        java.util.List list2 = item.f344761e;
        boolean z18 = list2 == null || list2.isEmpty();
        android.content.Context context = holder.f374654e;
        if (z18) {
            textView.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
            c18627xdbbda7b2.setVisibility(4);
        } else {
            textView.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
            c18627xdbbda7b2.setVisibility(0);
            c18627xdbbda7b2.b(item.f344761e, item.f344762f);
            holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2267x5897e6f.c(this, holder, item));
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
