package com.tencent.mm.plugin.component.editor.model.nativenote.spans;

/* loaded from: classes12.dex */
public class IndentationSpan extends android.text.style.LeadingMarginSpan.Standard implements px1.h, px1.g {

    /* renamed from: d, reason: collision with root package name */
    public final int f96610d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f96611e;

    public IndentationSpan(int i17, boolean z17) {
        super(i17);
        this.f96610d = i17;
        this.f96611e = z17;
    }

    @Override // px1.g
    public px1.g a() {
        return new com.tencent.mm.plugin.component.editor.model.nativenote.spans.IndentationSpan(this.f96610d, this.f96611e);
    }

    @Override // android.text.style.LeadingMarginSpan.Standard, android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z17) {
        if (this.f96611e) {
            return 0;
        }
        return this.f96610d;
    }

    @Override // px1.h
    public java.lang.Object getValue() {
        return java.lang.Integer.valueOf(this.f96610d);
    }
}
