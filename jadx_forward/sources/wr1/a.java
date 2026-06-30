package wr1;

/* loaded from: classes.dex */
public final class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569750ku;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xr1.e item = (xr1.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        android.content.Context context = holder.f374654e;
        if (i17 == 0) {
            layoutParams.height = i65.a.b(context, 48);
        } else {
            layoutParams.height = i65.a.b(context, 68);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.alw);
        android.text.TextPaint paint = textView != null ? textView.getPaint() : null;
        if (paint != null) {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
        if (paint2 != null) {
            paint2.setStrokeWidth(0.8f);
        }
        textView.setText(item.f537719f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPCRecentReadDateConvert", "dateTv.text = " + ((java.lang.Object) textView.getText()));
    }
}
