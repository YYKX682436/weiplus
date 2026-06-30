package com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7;

/* loaded from: classes7.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p432xd1075a44.p433x5fb57ca.C3896xa9b9c399 f128769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f128770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f128771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ie.d f128772g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u81.f f128773h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.r f128774i;

    public n(com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.r rVar, com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p432xd1075a44.p433x5fb57ca.C3896xa9b9c399 c3896xa9b9c399, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, boolean z17, ie.d dVar, u81.f fVar) {
        this.f128774i = rVar;
        this.f128769d = c3896xa9b9c399;
        this.f128770e = e9Var;
        this.f128771f = z17;
        this.f128772g = dVar;
        this.f128773h = fVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        this.f128774i.f128786i.x(this.f128769d.getEditableText().toString(), this.f128770e);
        this.f128774i.f128784g.x(this.f128769d.getEditableText().toString(), this.f128770e);
        if (this.f128771f) {
            return;
        }
        try {
            this.f128772g.z();
            this.f128770e.mo32091x9a3f0ba2().N.c(this.f128773h);
        } catch (java.lang.Exception unused) {
        }
    }
}
