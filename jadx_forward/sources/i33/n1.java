package i33;

/* loaded from: classes10.dex */
public interface n1 {
    default void Y0(java.lang.String btnString) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(btnString, "btnString");
        Y2().setText(btnString);
    }

    android.widget.TextView Y2();

    default void k6(boolean z17) {
        Y2().setEnabled(z17);
    }

    default void q6(java.lang.String btnString, yz5.a aVar, com.p314xaae8f345.mm.ui.fb style) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(btnString, "btnString");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        android.widget.TextView Y2 = Y2();
        Y2.setVisibility(0);
        Y2.setText(btnString);
        Y2.setTextSize(0, i65.a.f(Y2.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b));
        int ordinal = style.ordinal();
        if (ordinal != 17) {
            switch (ordinal) {
                case 11:
                    Y2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562603k2);
                    break;
                case 12:
                    Y2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562599jv);
                    Y2.setTextColor(i65.a.e(Y2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io));
                    break;
                case 13:
                    Y2.setBackgroundResource(hq.b.a() ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562594jp : com.p314xaae8f345.mm.R.C30861xcebc809e.f562587jg);
                    Y2.setTextColor(i65.a.e(Y2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560695rm));
                    break;
            }
        } else {
            Y2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562597js);
            Y2.setTextColor(i65.a.d(Y2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        }
        Y2.setOnClickListener(new i33.m1(aVar));
    }
}
