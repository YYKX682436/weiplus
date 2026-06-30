package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakeEggAnimFrame */
/* loaded from: classes12.dex */
public class C17663x54eef15d extends android.widget.FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f243624e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f243625d;

    public C17663x54eef15d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f243625d = new java.util.ArrayList();
    }

    /* renamed from: getSize */
    private int m69135xfb854877() {
        return (int) (new android.widget.TextView(getContext()).getTextSize() * 1.2d);
    }

    public void a(android.app.Activity activity, int i17) {
        int i18;
        com.p314xaae8f345.mm.p2614xca6eae71.c cVar;
        com.p314xaae8f345.mm.p2614xca6eae71.b2 b2Var;
        com.p314xaae8f345.mm.p2614xca6eae71.c1 c1Var;
        android.util.SparseArray sparseArray;
        java.util.List list = this.f243625d;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            view.clearAnimation();
            removeView(view);
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        setVisibility(0);
        for (int i19 = 0; i19 < i17; i19++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.l(this, displayMetrics.widthPixels, displayMetrics.heightPixels);
            com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().getClass();
            com.p314xaae8f345.mm.p2614xca6eae71.g.b().getClass();
            boolean z17 = com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d;
            com.p314xaae8f345.mm.p2614xca6eae71.q0 q0Var = com.p314xaae8f345.mm.p2614xca6eae71.l0.f274840a;
            q0Var.getClass();
            com.p314xaae8f345.mm.p2614xca6eae71.p pVar = com.p314xaae8f345.mm.p2614xca6eae71.m.f274842a;
            android.graphics.drawable.Drawable drawable = null;
            com.p314xaae8f345.mm.p2614xca6eae71.f1 f1Var = (com.p314xaae8f345.mm.p2614xca6eae71.f1) pVar.f274860c.get(107, null);
            if (f1Var != null && (i18 = f1Var.f274785e) < q0Var.f274874a.f274789d.size() && i18 >= 0 && (cVar = (com.p314xaae8f345.mm.p2614xca6eae71.c) q0Var.f274874a.f274789d.get(i18)) != null) {
                java.util.LinkedList codePoints = cVar.f274756d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(codePoints, "codePoints");
                java.util.Iterator it6 = codePoints.iterator();
                com.p314xaae8f345.mm.p2614xca6eae71.b bVar = pVar.f274862e;
                int i27 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.Integer num = (java.lang.Integer) next;
                    if (bVar == null || (sparseArray = bVar.f274750b) == null) {
                        c1Var = null;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                        c1Var = (com.p314xaae8f345.mm.p2614xca6eae71.c1) sparseArray.get(num.intValue(), null);
                    }
                    bVar = (com.p314xaae8f345.mm.p2614xca6eae71.l) c1Var;
                    if (bVar == null) {
                        break;
                    }
                    if (i27 == codePoints.size() - 1) {
                        com.p314xaae8f345.mm.p2614xca6eae71.a1 a1Var = bVar.f274749a;
                        if (a1Var instanceof com.p314xaae8f345.mm.p2614xca6eae71.b2) {
                            b2Var = (com.p314xaae8f345.mm.p2614xca6eae71.b2) a1Var;
                        }
                    } else {
                        i27 = i28;
                    }
                }
                b2Var = null;
                if (b2Var != null) {
                    int i29 = com.p314xaae8f345.mm.p2614xca6eae71.e.f274769b;
                    drawable = com.p314xaae8f345.mm.p2614xca6eae71.d.f274766a.a(b2Var, true);
                }
            }
            drawable.setBounds(0, 0, m69135xfb854877(), m69135xfb854877());
            android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(drawable, 1);
            android.text.SpannableString spannableString = new android.text.SpannableString("  ");
            spannableString.setSpan(imageSpan, 0, 1, 33);
            android.widget.TextView textView = new android.widget.TextView(getContext());
            textView.setSingleLine();
            textView.setText(spannableString);
            textView.setAnimation(lVar);
            textView.setTag(lVar);
            addView(textView);
            lVar.f243819d = textView;
            ((java.util.ArrayList) list).add(textView);
        }
    }
}
