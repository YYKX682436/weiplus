package com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7;

/* loaded from: classes7.dex */
public class h implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p432xd1075a44.p433x5fb57ca.C3896xa9b9c399 f128742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f128743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f128744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.r f128745g;

    public h(com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.r rVar, com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p432xd1075a44.p433x5fb57ca.C3896xa9b9c399 c3896xa9b9c399, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, boolean z17) {
        this.f128745g = rVar;
        this.f128742d = c3896xa9b9c399;
        this.f128743e = e9Var;
        this.f128744f = z17;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        this.f128745g.f128786i.x(this.f128742d.getEditableText().toString(), this.f128743e);
        return this.f128744f;
    }
}
