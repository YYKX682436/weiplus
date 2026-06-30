package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class br extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f184528e;

    public br(boolean z17) {
        this.f184528e = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveFollowAllDividerConvert", "#init");
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b4f;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String string;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveFollowAllDividerConvert", "onBindViewHolder size:" + item.f192727f.size() + " continueAtTheEnd:" + item.f192725d.m75933x41a8a7f2(10));
        item.f192729h = i17;
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.k6_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        boolean z18 = this.f184528e;
        if (z18) {
            findViewById.setBackground(findViewById.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ast));
        } else {
            findViewById.setBackground(findViewById.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ass));
        }
        android.view.View findViewById2 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.k6b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        if (z18) {
            textView.setTextColor(textView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
            textView.setTextSize(0, i65.a.f(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561967xt));
        }
        android.view.View findViewById3 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.i_c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3;
        if (z18) {
            c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        }
        java.lang.String valueOf = item.f192727f.size() > 0 ? java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) item.f192727f.get(0)).getFeedObject().getNickNameSpan()) : "";
        boolean z19 = true;
        java.lang.String valueOf2 = item.f192727f.size() > 1 ? java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) item.f192727f.get(1)).getFeedObject().getNickNameSpan()) : "";
        int m75939xb282bd08 = item.f192725d.m75939xb282bd08(24);
        int size = item.f192727f.size();
        android.content.Context context = holder.f374654e;
        java.lang.String string2 = size == 2 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h6p) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h6o, java.lang.Integer.valueOf(m75939xb282bd08));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        if (android.text.TextUtils.isEmpty(valueOf) || android.text.TextUtils.isEmpty(valueOf2)) {
            string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h6q);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else {
            string = valueOf + (char) 12289 + valueOf2 + ' ' + string2;
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.k6b);
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
            z19 = false;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i27 = a17.f278668a;
        if (!z19 && i27 > (i19 = a17.f278669b)) {
            i27 = i19;
        }
        int dimensionPixelOffset = (i27 - textView2.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz)) - textView2.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        android.text.TextPaint paint = textView2.getPaint();
        float measureText = paint.measureText(string);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveFollowAllDividerConvert", "setTips before textShowWidth:" + dimensionPixelOffset + " textPaintWidth:" + measureText + " nickname1:" + valueOf + " nickname2:" + valueOf2 + " dividerTips:" + string);
        float f17 = (float) dimensionPixelOffset;
        if (measureText > f17) {
            if (valueOf2.length() > 4) {
                java.lang.String substring = valueOf2.substring(0, 4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                valueOf2 = substring.concat("...");
            }
            string = valueOf + (char) 12289 + valueOf2 + ' ' + string2;
        }
        float measureText2 = paint.measureText(string);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveFollowAllDividerConvert", "setTips after nickname1 textShowWidth:" + dimensionPixelOffset + " textPaintWidth:" + measureText2 + " nickname1:" + valueOf + " nickname2:" + valueOf2 + " dividerTips:" + string);
        if (measureText2 > f17) {
            if (valueOf.length() > 4) {
                java.lang.String substring2 = valueOf.substring(0, 4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                valueOf = substring2.concat("...");
            }
            string = valueOf + (char) 12289 + valueOf2 + ' ' + string2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveFollowAllDividerConvert", "setTips after nickname2 textShowWidth:" + dimensionPixelOffset + " textPaintWidth:" + paint.measureText(string) + " nickname1:" + valueOf + " nickname2:" + valueOf2 + " dividerTips:" + string);
        if (android.text.TextUtils.isEmpty(string)) {
            return;
        }
        holder.s(com.p314xaae8f345.mm.R.id.k6b, string);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
