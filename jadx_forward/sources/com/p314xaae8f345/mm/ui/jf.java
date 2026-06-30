package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class jf {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f290537a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f290538b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f290539c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21424xdbf688d7 f290540d;

    public jf(com.p314xaae8f345.mm.ui.C21424xdbf688d7 c21424xdbf688d7, boolean z17, com.p314xaae8f345.mm.ui.ef efVar) {
        this.f290540d = c21424xdbf688d7;
        this.f290538b = c21424xdbf688d7.findViewById(com.p314xaae8f345.mm.R.id.bzg);
        this.f290539c = (android.widget.TextView) c21424xdbf688d7.findViewById(com.p314xaae8f345.mm.R.id.jx9);
        this.f290537a = (android.widget.LinearLayout) c21424xdbf688d7.findViewById(com.p314xaae8f345.mm.R.id.czs);
    }

    public static void a(com.p314xaae8f345.mm.ui.jf jfVar) {
        jfVar.getClass();
        int i17 = com.p314xaae8f345.mm.ui.C21424xdbf688d7.B;
        com.p314xaae8f345.mm.ui.C21424xdbf688d7 c21424xdbf688d7 = jfVar.f290540d;
        c21424xdbf688d7.i(false);
        android.widget.LinearLayout linearLayout = jfVar.f290537a;
        if (linearLayout.getVisibility() == 0) {
            c21424xdbf688d7.k(linearLayout, 300L);
        }
    }
}
