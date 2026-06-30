package ej4;

/* loaded from: classes11.dex */
public final class z extends ej4.r {

    /* renamed from: d, reason: collision with root package name */
    public final int f334924d;

    /* renamed from: e, reason: collision with root package name */
    public final bi4.d f334925e;

    /* renamed from: f, reason: collision with root package name */
    public final bi4.c f334926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.lang.String userName, android.widget.TextView iconTV, int i17, bi4.d iconType, bi4.c iconScene) {
        super(iconTV, userName, null, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconTV, "iconTV");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconType, "iconType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconScene, "iconScene");
        this.f334924d = i17;
        this.f334925e = iconType;
        this.f334926f = iconScene;
        b();
    }

    @Override // ej4.r
    public void b() {
        java.lang.String str;
        int color;
        java.lang.Object obj = a().get();
        android.text.SpannableStringBuilder spannableStringBuilder = null;
        android.widget.TextView textView = obj instanceof android.widget.TextView ? (android.widget.TextView) obj : null;
        if (textView == null) {
            return;
        }
        bk4.i.a();
        java.lang.CharSequence text = textView.getText();
        int i17 = this.f334924d;
        bi4.d iconType = this.f334925e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconType, "iconType");
        bi4.c iconScene = this.f334926f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconScene, "iconScene");
        java.lang.String str2 = this.f334907a;
        boolean z17 = true;
        boolean z18 = false;
        if (!(str2 == null || r26.n0.N(str2))) {
            if (!(text == null || text.length() == 0)) {
                mj4.h M = ai4.m0.f86706a.M(str2);
                android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
                if (M != null) {
                    if (bk4.i.a().K() || bk4.i.a().G()) {
                        str = "";
                    } else {
                        str = " " + bk4.i.a().m(xe0.j0.a(M, false, 1, null));
                    }
                    java.lang.String str3 = str;
                    mj4.k kVar = (mj4.k) M;
                    android.text.style.ImageSpan k17 = bk4.i.a().k(textView, kVar.h(), iconType, kVar.z() ? bi4.b.GREY : bi4.b.DEFAULT, iconScene, i17, M);
                    if (!r26.n0.E(spannableStringBuilder2, (char) 8199, false, 2, null)) {
                        spannableStringBuilder2.append((char) 8199);
                    }
                    spannableStringBuilder2.append((java.lang.CharSequence) str3);
                    spannableStringBuilder2.setSpan(k17, 0, spannableStringBuilder2.length() - str3.length(), 34);
                    pj4.o1 d17 = bk4.g0.d(bk4.f0.f103002e, kVar.h());
                    pj4.g0 h17 = d17 != null ? bk4.g0.h(d17) : null;
                    if (kVar.z()) {
                        color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29);
                    } else {
                        if (h17 != null && bk4.g0.j(h17)) {
                            z18 = true;
                        }
                        if (z18) {
                            try {
                                color = android.graphics.Color.parseColor(h17.f436589q);
                            } catch (java.lang.Throwable th6) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.IStatusIconHelper", "hy: given color is incorrect.use default .e:" + th6);
                                color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560080ah);
                            }
                        } else {
                            color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560080ah);
                        }
                    }
                    spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(color), spannableStringBuilder2.length() - str3.length(), spannableStringBuilder2.length(), 34);
                } else {
                    z17 = false;
                }
                if (z17) {
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
        }
        if (spannableStringBuilder == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(textView.getText(), spannableStringBuilder)) {
            return;
        }
        textView.setTextSize(10.0f);
        textView.setText(spannableStringBuilder);
        textView.requestLayout();
    }
}
