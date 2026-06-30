package ri5;

/* loaded from: classes.dex */
public final class m extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cka;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ri5.j item = (ri5.j) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jrw);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jqn);
        android.content.Context context = holder.f3639x46306858.getContext();
        if (item.f477661y) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.idk, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ffq));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.b(string, textView);
            imageView.setRotation(0.0f);
            return;
        }
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.idl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.b(string2, textView);
        imageView.setRotation(180.0f);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
