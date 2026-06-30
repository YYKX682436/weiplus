package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2450x688f269;

/* renamed from: com.tencent.mm.plugin.wenote.model.nativenote.spans.IndentationSpan */
/* loaded from: classes12.dex */
public class C19518x42b2ec93 extends android.text.style.LeadingMarginSpan.Standard implements oz4.h, oz4.g {

    /* renamed from: d, reason: collision with root package name */
    public final int f269660d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f269661e;

    public C19518x42b2ec93(int i17, boolean z17) {
        super(i17);
        this.f269660d = i17;
        this.f269661e = z17;
    }

    @Override // oz4.g
    public oz4.g a() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2450x688f269.C19518x42b2ec93(this.f269660d, this.f269661e);
    }

    @Override // android.text.style.LeadingMarginSpan.Standard, android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z17) {
        if (this.f269661e) {
            return 0;
        }
        return this.f269660d;
    }

    @Override // oz4.h
    /* renamed from: getValue */
    public java.lang.Object mo74982x754a37bb() {
        return java.lang.Integer.valueOf(this.f269660d);
    }
}
