package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ec implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f285400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f285401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fc f285402f;

    public ec(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fc fcVar, java.lang.Long l17, int i17) {
        this.f285402f = fcVar;
        this.f285400d = l17;
        this.f285401e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fc fcVar = this.f285402f;
        if (((java.lang.Long) fcVar.f285488a.getTag(com.p314xaae8f345.mm.R.id.bon)).longValue() == this.f285400d.longValue()) {
            int length = fcVar.f285489b.length();
            int i17 = this.f285401e;
            if (i17 < length) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                java.lang.CharSequence charSequence = fcVar.f285489b;
                spannableStringBuilder.append(charSequence.subSequence(0, charSequence.length())).setSpan(fcVar.f285490c.f285564g, i17, fcVar.f285489b.length(), 33);
                android.view.View view = fcVar.f285488a;
                if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) {
                    ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view).b(spannableStringBuilder);
                }
            }
        }
    }
}
