package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class q0 implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.skyline.jni.SkylineJNI.getSkylineDebugInfo(hashMap);
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            arrayList.add("[" + ((java.lang.String) entry.getKey()) + "] " + ((java.lang.String) entry.getValue()));
        }
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            next = ((java.lang.String) next) + '\n' + ((java.lang.String) it.next());
        }
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText((java.lang.String) next);
        textView.setGravity(8388627);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        textView.setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
        db5.e1.q(context, null, textView, null).setCanceledOnTouchOutside(false);
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        return "Skyline调试信息";
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        return z65.c.a() && pageView.p2();
    }
}
