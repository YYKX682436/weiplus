package we5;

/* loaded from: classes5.dex */
public final class o0 {
    public o0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(yb5.d ui6, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = ui6.f542241c;
        sb5.e eVar = (sb5.e) cVar.a(sb5.e.class);
        android.widget.TextView textView = holder.f284926p;
        if (textView == null) {
            return;
        }
        textView.setBackgroundResource(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) eVar).n0());
        com.p314xaae8f345.mm.ui.bk.s0(holder.f284926p.getPaint());
        holder.f284926p.setTextColor(i65.a.d(ui6.g(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        android.view.ViewGroup.LayoutParams layoutParams = holder.f284926p.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) cVar.a(sb5.e.class))).o0(i65.a.f(ui6.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561089yd));
            holder.f284926p.setLayoutParams(marginLayoutParams);
        }
    }
}
