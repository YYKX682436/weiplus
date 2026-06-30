package vi1;

/* loaded from: classes7.dex */
public final class i2 implements vi1.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final vi1.h0 f518864a;

    /* renamed from: b, reason: collision with root package name */
    public final int f518865b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f518866c;

    /* renamed from: d, reason: collision with root package name */
    public final vi1.y f518867d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f518868e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f518869f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f518870g;

    public i2(android.content.Context mContext, vi1.h0 h0Var) {
        android.text.SpannableString spannableString;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f518864a = h0Var;
        this.f518865b = 3;
        android.view.View inflate = android.view.View.inflate(mContext, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569596fu, null);
        this.f518866c = inflate;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = inflate != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) inflate.findViewById(com.p314xaae8f345.mm.R.id.kut) : null;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mContext));
        }
        vi1.y yVar = new vi1.y(mContext, new java.util.ArrayList(), new vi1.g2(this));
        this.f518867d = yVar;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7960x6cab2c8d(yVar);
        }
        android.widget.TextView textView = inflate != null ? (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kuk) : null;
        this.f518868e = textView;
        if (textView != null) {
            textView.setOnClickListener(new vi1.h2(this));
        }
        this.f518869f = inflate != null ? inflate.findViewById(com.p314xaae8f345.mm.R.id.kus) : null;
        android.widget.TextView textView2 = inflate != null ? (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kur) : null;
        if (textView2 != null) {
            textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        if (textView2 != null) {
            if (h0Var != null) {
                vi1.b2 b2Var = (vi1.b2) h0Var;
                spannableString = vi1.l1.f518932a.a().ka(b2Var.f518810a, b2Var.f518811b, b2Var.f518812c);
            } else {
                spannableString = null;
            }
            textView2.setText(spannableString);
        }
        this.f518870g = inflate != null ? (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kul) : null;
    }

    public void a(boolean z17, java.util.List phoneItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phoneItems, "phoneItems");
        vi1.y yVar = this.f518867d;
        if (yVar != null) {
            yVar.f519038g = z17;
        }
        if (yVar != null) {
            yVar.m8146xced61ae5();
        }
        if (yVar != null) {
            yVar.f519038g = z17;
            yVar.f519036e = (java.util.ArrayList) phoneItems;
            yVar.m8146xced61ae5();
        }
        android.view.View view = this.f518869f;
        int i17 = this.f518865b;
        android.widget.TextView textView = this.f518868e;
        if (z17 || phoneItems.size() >= i17) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView", "updateView", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView", "updateView", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView", "updateView", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerView", "updateView", "(ZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.widget.TextView textView2 = this.f518870g;
        if (z17) {
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
        } else if (phoneItems.size() >= i17) {
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(0);
        } else {
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
        }
    }
}
