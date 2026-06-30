package rf4;

/* loaded from: classes4.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd f476610d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd c18475x542840cd) {
        this.f476610d = c18475x542840cd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd.f253425r;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: animNext ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd c18475x542840cd = this.f476610d;
        sb6.append(c18475x542840cd.f253428f);
        sb6.append(' ');
        sb6.append(c18475x542840cd.isPause);
        sb6.append(' ');
        java.util.ArrayList arrayList = c18475x542840cd.f253427e;
        sb6.append(arrayList.size());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = c18475x542840cd.f253426d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (c18475x542840cd.isPause || arrayList.size() <= 0) {
            return;
        }
        int i18 = c18475x542840cd.f253428f + 1;
        c18475x542840cd.f253428f = i18;
        int size = i18 % arrayList.size();
        c18475x542840cd.f253428f = size;
        java.lang.Object obj = arrayList.get(size);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        gf4.a aVar = (gf4.a) obj;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(c18475x542840cd.getContext());
        boolean z17 = aVar.f352869g;
        android.view.View inflate = from.inflate(z17 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.cwb : com.p314xaae8f345.mm.R.C30864xbddafb2a.cwa, (android.view.ViewGroup) c18475x542840cd, false);
        inflate.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.nkz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.nl8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568657nl2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        imageView.setClickable(false);
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w wVar = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class));
        java.lang.String str2 = aVar.f352863a;
        wVar.Ni(imageView, str2);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = textView.getContext();
        java.lang.String g27 = n17 != null ? n17.g2() : null;
        if (g27 == null) {
            g27 = "";
        }
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        java.lang.CharSequence j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, g27, textSize);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(aVar.f352872j, true);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = textView.getContext();
        java.lang.String g28 = n18 != null ? n18.g2() : null;
        java.lang.String str3 = g28 == null ? "" : g28;
        float textSize2 = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        android.text.SpannableString j18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str3, textSize2);
        if (aVar.f352874l != 0) {
            j17 = ((java.lang.Object) j17) + ' ' + textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572074y0) + ' ' + ((java.lang.Object) j18);
        }
        textView.setText(j17);
        if (z17) {
            textView2.setVisibility(8);
            pm0.v.c(textView);
        } else {
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context3 = textView2.getContext();
            float textSize3 = textView2.getTextSize();
            ((ke0.e) xVar3).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context3, aVar.f352864b, textSize3));
        }
        inflate.setOnClickListener(new rf4.j(c18475x542840cd));
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 c18474x76daa3b7 = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7) inflate;
        int measuredHeight = (c18475x542840cd.getMeasuredHeight() * 2) / 3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "LogStory: is enhance comment " + aVar.f352871i);
        c18474x76daa3b7.setId(size);
        c18474x76daa3b7.setVisibility(4);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = c18475x542840cd.getMeasuredHeight() - measuredHeight;
        c18475x542840cd.addView(c18474x76daa3b7, layoutParams);
        c18475x542840cd.post(new rf4.i(c18474x76daa3b7, c18475x542840cd, aVar, measuredHeight));
    }
}
