package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class up extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.up f209682d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.up();

    public up() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (lu2.m.f402913b) {
            lu2.m.f402913b = false;
            android.view.View view = lu2.m.f402915d;
            if (view != null) {
                android.view.WindowManager windowManager = lu2.m.f402914c;
                if (windowManager != null) {
                    windowManager.removeView(view);
                }
                lu2.m.f402915d = null;
            }
        } else {
            lu2.m.f402913b = true;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.Object systemService = context.getSystemService("window");
            lu2.m.f402914c = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setPadding(10, 10, 10, 10);
            textView.setBackgroundColor(android.graphics.Color.parseColor("#26000000"));
            textView.setText("红点mock");
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560082aj));
            textView.setTextSize(0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
            textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            textView.setOnClickListener(new lu2.k(context));
            lu2.m.f402915d = textView;
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.gravity = 53;
            layoutParams.flags = 8;
            layoutParams.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
            android.view.WindowManager windowManager2 = lu2.m.f402914c;
            if (windowManager2 != null) {
                windowManager2.addView(lu2.m.f402915d, layoutParams);
            }
        }
        return jz5.f0.f384359a;
    }
}
