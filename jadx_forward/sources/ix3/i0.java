package ix3;

/* loaded from: classes10.dex */
public final class i0 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.emc;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ix3.g0 item = (ix3.g0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View view = holder.f3639x46306858;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.k3s);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BlockMs: ");
        ix3.c cVar2 = item.f376953e;
        sb6.append(cVar2.f376905b);
        sb6.append(' ');
        sb6.append(kz5.z.L(cVar2.f376906c));
        textView.setText(sb6.toString());
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o7z)).setText(k35.m1.e(cVar2.f376904a));
    }
}
