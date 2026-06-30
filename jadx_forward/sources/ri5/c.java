package ri5;

/* loaded from: classes.dex */
public final class c extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570864el2;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ri5.j item = (ri5.j) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View view = holder.f3639x46306858;
        view.setTag(com.p314xaae8f345.mm.R.id.txo, 1);
        ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.ciy)).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562844q7);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.mj_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb352, "getSelectIcon(...)");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.g_u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "getFoldTip(...)");
        si5.c cVar2 = item.f477646h;
        vi5.d dVar = cVar2 instanceof vi5.d ? (vi5.d) cVar2 : null;
        boolean z18 = dVar != null ? dVar.f519151i : false;
        int i19 = dVar != null ? dVar.f519152j : 0;
        if (z18) {
            c22699x3dcdb352.setRotation(0.0f);
            textView.setText(textView.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1p, java.lang.Integer.valueOf(i19)));
        } else {
            c22699x3dcdb352.setRotation(180.0f);
            android.content.res.Resources resources = textView.getResources();
            textView.setText(resources != null ? resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1q) : null);
        }
        textView.post(new ri5.b(textView));
    }
}
