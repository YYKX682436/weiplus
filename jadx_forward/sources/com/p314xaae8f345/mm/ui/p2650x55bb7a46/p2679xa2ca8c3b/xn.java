package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class xn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f287531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f287532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.yn f287533f;

    public xn(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.yn ynVar, java.lang.Long l17, int i17) {
        this.f287533f = ynVar;
        this.f287531d = l17;
        this.f287532e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.yn ynVar = this.f287533f;
        ((java.lang.Long) ynVar.f287622a.getTag(com.p314xaae8f345.mm.R.id.bon)).longValue();
        if (((java.lang.Long) ynVar.f287622a.getTag(com.p314xaae8f345.mm.R.id.bon)).longValue() == this.f287531d.longValue()) {
            int length = ynVar.f287623b.length();
            int i17 = this.f287532e;
            if (i17 < length) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                java.lang.CharSequence charSequence = ynVar.f287623b;
                spannableStringBuilder.append(charSequence.subSequence(0, charSequence.length())).setSpan(ynVar.f287624c.f287702g, i17, ynVar.f287623b.length(), 33);
                android.view.View view = ynVar.f287622a;
                if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) {
                    ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view).b(spannableStringBuilder);
                }
            }
        }
    }
}
