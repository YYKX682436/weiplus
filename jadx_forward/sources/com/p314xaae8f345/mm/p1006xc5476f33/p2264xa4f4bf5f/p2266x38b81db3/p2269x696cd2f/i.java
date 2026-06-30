package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class i extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f254819e;

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571103d06;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.widget.LinearLayout linearLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d item = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String str = item.f254798e;
        boolean z18 = false;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "arrow@name")) {
            ((android.widget.LinearLayout) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ii7)).setVisibility(8);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.hk9);
            c22699x3dcdb352.setVisibility(0);
            c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.f(this, item));
            return;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ooa);
        if (textView != null) {
            textView.setText(e17);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ooa);
        if (textView2 != null) {
            mj4.h hVar = item.f254800g;
            if (hVar != null && !((mj4.k) hVar).z()) {
                z18 = true;
            }
            android.content.Context context = holder.f374654e;
            if (z18) {
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
            } else {
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.hke);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
        imageView.setTag("status_avatar_" + str);
        ((android.widget.LinearLayout) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ii7)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.g(holder, item, imageView));
        if (1 == bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.C20708x7a1a2a36())) {
            if ((z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) && (linearLayout = (android.widget.LinearLayout) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ii7)) != null) {
                linearLayout.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.h(item, holder));
            }
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
