package hr1;

/* loaded from: classes11.dex */
public final class f implements hr1.d {
    @Override // hr1.d
    public void a(hr1.e owner) {
        java.lang.CharSequence i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(owner.f66326xbed8694c, "bizfansnofiticationholder@bizfansmsg")) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n5n);
            owner.f364878p0 = string;
            owner.Z = string;
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(owner.f66326xbed8694c, "bizfansgreetholder@bizfansmsg")) {
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573586o13);
            owner.f364878p0 = string2;
            owner.Z = string2;
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(owner.f66326xbed8694c, true);
        owner.Y = n17;
        owner.f364878p0 = n17 != null ? n17.g2() : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = owner.Y;
        if (z3Var == null || (i17 = z3Var.J2) == null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.String str = owner.f364878p0;
            ((ke0.e) xVar).getClass();
            i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str);
        }
        owner.Z = i17;
    }

    @Override // hr1.d
    public java.lang.CharSequence b(hr1.e owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = owner.f66319x51f5672e;
        boolean z17 = true;
        if (!(str == null || r26.n0.N(str))) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572266n51));
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31)), 0, spannableStringBuilder.length(), 33);
            android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) " ");
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = owner.f66319x51f5672e;
            ((ke0.e) xVar).getClass();
            append.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2));
            return spannableStringBuilder;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(owner.f66317x6b1f5383, "47") && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(owner.f66317x6b1f5383, "1048625")) {
            z17 = false;
        }
        if (z17) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571915tf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str3 = owner.f66316xf66fcca9;
        ((ke0.e) xVar2).getClass();
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str3);
    }
}
