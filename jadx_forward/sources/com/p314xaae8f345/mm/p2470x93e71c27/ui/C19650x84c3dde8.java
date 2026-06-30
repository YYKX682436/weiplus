package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* renamed from: com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView */
/* loaded from: classes8.dex */
public class C19650x84c3dde8 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19648xec05501 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f271346n = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f271347e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f271348f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String[] f271349g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f271350h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f271351i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f271352m;

    public C19650x84c3dde8(android.content.Context context, android.view.View.OnClickListener onClickListener) {
        super(context, null);
        this.f271352m = onClickListener;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19648xec05501
    public void a() {
        this.f271350h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ku7);
        this.f271351i = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.ku6);
        for (int i17 = 0; i17 < 5; i17++) {
            this.f271351i.getChildAt(i17).setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.i2(this));
        }
    }

    public boolean b() {
        int i17;
        android.widget.TextView textView = this.f271350h;
        if (textView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561319f7);
            this.f271350h.setLayoutParams(layoutParams);
        }
        if (this.f271351i == null) {
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271347e) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q0(this.f271347e).booleanValue()) {
            java.lang.String str = this.f271347e;
            if (str != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q0(str).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileMobilePhoneView", "mobile format is error----%s", this.f271347e);
            }
            i17 = 0;
        } else {
            android.view.View childAt = this.f271351i.getChildAt(0);
            if (childAt != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) childAt).setText(this.f271347e);
            }
            i17 = 1;
        }
        int i18 = i17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271348f)) {
            java.lang.String[] c17 = com.p314xaae8f345.mm.p670x38b72420.a.c(this.f271345d, this.f271348f);
            this.f271349g = c17;
            if (c17 != null) {
                setVisibility(0);
                while (i17 < this.f271349g.length + i18) {
                    android.view.View childAt2 = this.f271351i.getChildAt(i17);
                    if (childAt2 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(childAt2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(childAt2, "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        ((android.widget.TextView) childAt2).setText(this.f271349g[i17 - i18]);
                    }
                    i17++;
                }
            }
        }
        while (i17 < 5) {
            android.view.View childAt3 = this.f271351i.getChildAt(i17);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(childAt3, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(childAt3, "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView", "refreshUI", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i17++;
        }
        if (i18 != 1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271348f)) {
            setVisibility(8);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19648xec05501
    /* renamed from: getLayout */
    public int mo67643x22f21e20() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570899cb1;
    }

    public C19650x84c3dde8(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19650x84c3dde8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
