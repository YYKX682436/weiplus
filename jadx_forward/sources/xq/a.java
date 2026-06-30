package xq;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ xq.a f537502a = new xq.a();

    public final android.graphics.RectF a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        ks5.a mo84153x22f21e20 = textView.mo84153x22f21e20();
        java.lang.CharSequence a17 = textView.a();
        com.p314xaae8f345.mm.p2614xca6eae71.r0 r0Var = null;
        android.text.Spannable spannable = a17 instanceof android.text.Spannable ? (android.text.Spannable) a17 : null;
        if (mo84153x22f21e20 != null && spannable != null) {
            int i17 = 0;
            java.lang.Object[] spans = spannable.getSpans(0, spannable.length(), com.p314xaae8f345.mm.p2614xca6eae71.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(spans, "getSpans(...)");
            com.p314xaae8f345.mm.p2614xca6eae71.r0[] r0VarArr = (com.p314xaae8f345.mm.p2614xca6eae71.r0[]) spans;
            int length = r0VarArr.length;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                com.p314xaae8f345.mm.p2614xca6eae71.r0 r0Var2 = r0VarArr[i17];
                if (r0Var2.f274885f) {
                    r0Var = r0Var2;
                    break;
                }
                i17++;
            }
            if (r0Var != null) {
                return r0Var.f274888i;
            }
        }
        return new android.graphics.RectF();
    }
}
