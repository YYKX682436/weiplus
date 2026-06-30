package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at;

/* loaded from: classes.dex */
public final class r extends in5.r {
    public r(java.lang.Boolean bool) {
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.anw;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.t) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = holder.f3639x46306858.getContext();
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.eno);
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        p13.i iVar = new p13.i();
        android.content.res.Resources resources = context.getResources();
        java.lang.Object[] objArr = new java.lang.Object[1];
        p13.r rVar = item.f210438h;
        java.lang.String str = rVar != null ? rVar.f432662a : null;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        iVar.f432626a = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cll, objArr);
        iVar.f432627b = item.f210438h;
        iVar.f432628c = false;
        iVar.f432629d = false;
        iVar.f432633h = textView.getPaint();
        textView.setText(o13.q.e(iVar).f432638a);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
