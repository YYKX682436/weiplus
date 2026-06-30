package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.s f288475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u f288476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f288477f;

    public x(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.z zVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.s sVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar, android.content.Context context) {
        this.f288475d = sVar;
        this.f288476e = uVar;
        this.f288477f = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.CharSequence] */
    @Override // java.lang.Runnable
    public void run() {
        java.lang.CharSequence ellipsize;
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar = this.f288476e;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.s sVar = this.f288475d;
        android.content.Context context = this.f288477f;
        try {
            int measuredWidth = ((android.view.ViewGroup) sVar.f288458c.getParent()).getMeasuredWidth();
            if (measuredWidth == 0) {
                return;
            }
            java.lang.String str2 = "@" + uVar.E;
            int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3);
            android.widget.TextView textView = new android.widget.TextView(context);
            float f17 = h17;
            textView.getPaint().setTextSize(f17);
            float measureText = textView.getPaint().measureText(" " + str2);
            textView.getPaint().setTextSize(sVar.f288458c.getTextSize());
            double d17 = (double) measuredWidth;
            if (measureText >= 0.6d * d17) {
                ellipsize = android.text.TextUtils.ellipsize(uVar.f288351y, textView.getPaint(), (float) (d17 * 0.4d), android.text.TextUtils.TruncateAt.END);
                float measureText2 = textView.getPaint().measureText(ellipsize.toString());
                textView.getPaint().setTextSize(f17);
                str = android.text.TextUtils.ellipsize(str2, textView.getPaint(), (measuredWidth - measureText2) - 20.0f, android.text.TextUtils.TruncateAt.END);
            } else {
                ellipsize = android.text.TextUtils.ellipsize(uVar.f288351y, textView.getPaint(), measuredWidth - measureText, android.text.TextUtils.TruncateAt.END);
                str = str2;
            }
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, ((java.lang.Object) ellipsize) + " " + ((java.lang.Object) str));
            android.content.res.ColorStateList e17 = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7);
            i17.setSpan(new android.text.style.TextAppearanceSpan(null, 0, h17, e17, e17), ellipsize.length() + 1, ellipsize.length() + 1 + str.length(), 33);
            i17.setSpan(new r85.b(h17), ellipsize.length() + 1, ellipsize.length() + 1 + str.length(), 33);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(i17, sVar.f288458c);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactDataItemDelegate", "fillingViewItem Exception:%s %s", e18.getClass().getSimpleName(), e18.getMessage());
        }
    }
}
