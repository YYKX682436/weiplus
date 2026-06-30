package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes13.dex */
public class n implements yy3.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f241492a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Integer f241493b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Integer f241494c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Integer f241495d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 f241496e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d116) {
        this.f241496e = c17345xe981d116;
    }

    public void a(long j17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17345xe981d116 c17345xe981d116 = this.f241496e;
        if (j17 == c17345xe981d116.f241422q && bundle.containsKey("param_card_edge")) {
            boolean[] booleanArray = bundle.getBooleanArray("param_card_edge");
            c17345xe981d116.f241424s.m68903x4ab5af24(booleanArray);
            int i17 = c17345xe981d116.f241421p;
            if ((i17 == 9 || i17 == 11) && c17345xe981d116.o()) {
                this.f241495d = java.lang.Integer.valueOf(this.f241495d.intValue() + 1);
                boolean z17 = booleanArray[0];
                java.util.LinkedList linkedList = this.f241492a;
                if (z17 && booleanArray[1] && booleanArray[2] && booleanArray[3]) {
                    linkedList.add(0);
                } else {
                    this.f241493b = java.lang.Integer.valueOf(this.f241493b.intValue() + 1);
                    linkedList.add(1);
                }
                if (linkedList.size() > 60 && ((java.lang.Integer) linkedList.pollFirst()).intValue() == 1) {
                    this.f241493b = java.lang.Integer.valueOf(this.f241493b.intValue() - 1);
                }
                if (this.f241495d.intValue() < 0) {
                    this.f241495d = 0;
                }
                if (this.f241495d.intValue() < 70) {
                    return;
                }
                if (this.f241493b.intValue() >= 53) {
                    android.widget.TextView textView = (android.widget.TextView) c17345xe981d116.f241426u.findViewById(com.p314xaae8f345.mm.R.id.avx);
                    textView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.k(this, c17345xe981d116.f241426u.findViewById(com.p314xaae8f345.mm.R.id.avw), textView, c17345xe981d116.f241426u.findViewById(com.p314xaae8f345.mm.R.id.avv)));
                } else {
                    if (this.f241493b.intValue() < 40 || this.f241494c.intValue() == 2) {
                        return;
                    }
                    this.f241494c = 2;
                    android.widget.TextView textView2 = (android.widget.TextView) c17345xe981d116.f241426u.findViewById(com.p314xaae8f345.mm.R.id.avx);
                    textView2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.m(this, c17345xe981d116.f241426u.findViewById(com.p314xaae8f345.mm.R.id.avw), textView2, c17345xe981d116.f241426u.findViewById(com.p314xaae8f345.mm.R.id.avv)));
                }
            }
        }
    }
}
