package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1342x688f269;

/* renamed from: com.tencent.mm.plugin.component.editor.model.nativenote.spans.IndentationSpan */
/* loaded from: classes12.dex */
public class C13160x42b2ec93 extends android.text.style.LeadingMarginSpan.Standard implements px1.h, px1.g {

    /* renamed from: d, reason: collision with root package name */
    public final int f178143d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f178144e;

    public C13160x42b2ec93(int i17, boolean z17) {
        super(i17);
        this.f178143d = i17;
        this.f178144e = z17;
    }

    @Override // px1.g
    public px1.g a() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1342x688f269.C13160x42b2ec93(this.f178143d, this.f178144e);
    }

    @Override // android.text.style.LeadingMarginSpan.Standard, android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z17) {
        if (this.f178144e) {
            return 0;
        }
        return this.f178143d;
    }

    @Override // px1.h
    /* renamed from: getValue */
    public java.lang.Object mo54603x754a37bb() {
        return java.lang.Integer.valueOf(this.f178143d);
    }
}
