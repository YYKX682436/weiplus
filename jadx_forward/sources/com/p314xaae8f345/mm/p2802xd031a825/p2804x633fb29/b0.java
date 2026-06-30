package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes5.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f295389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f295390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f295391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab f295392g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f295393h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f295394i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f295395m;

    public b0(android.view.View view, double d17, int i17, com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab c22904x897710ab, android.view.View view2, android.view.View view3, android.widget.TextView textView) {
        this.f295389d = view;
        this.f295390e = d17;
        this.f295391f = i17;
        this.f295392g = c22904x897710ab;
        this.f295393h = view2;
        this.f295394i = view3;
        this.f295395m = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f295389d;
        int width = view.getWidth();
        long longValue = new java.lang.Double(this.f295390e).longValue();
        int i17 = 0;
        int i18 = 0;
        while (longValue != 0) {
            int i19 = (int) (longValue % 10);
            longValue /= 10;
            i17++;
            i18 = i19;
        }
        if (i17 < this.f295391f) {
            android.view.View view2 = this.f295394i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab c22904x897710ab = this.f295392g;
        int left = (int) (((this.f295393h.getLeft() + c22904x897710ab.getLeft()) + ((i18 == 1 ? c22904x897710ab.getPaint().measureText("1") : c22904x897710ab.getPaint().measureText("2")) / 2.0f)) - (width / 2));
        if (left == 0) {
            android.view.View view3 = this.f295394i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.f295394i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f295395m.setText(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.b2.a(i17));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.leftMargin = left;
        view.setLayoutParams(layoutParams);
    }
}
