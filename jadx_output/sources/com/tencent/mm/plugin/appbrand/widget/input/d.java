package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class d extends com.tencent.mm.plugin.appbrand.widget.input.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.f f91383d;

    public d(com.tencent.mm.plugin.appbrand.widget.input.f fVar) {
        this.f91383d = fVar;
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.widget.input.f fVar = this.f91383d;
        if (fVar.n() != null) {
            android.text.Editable editableText = fVar.n().getEditableText();
            com.tencent.mm.plugin.appbrand.widget.input.a5 a5Var = fVar.f91431d;
            if (a5Var != null) {
                ((com.tencent.mm.plugin.appbrand.widget.input.t0) a5Var).a(editableText == null ? "" : editableText.toString(), android.text.Selection.getSelectionEnd(editableText), com.tencent.mm.plugin.appbrand.widget.input.z4.CHANGED);
            }
        }
    }
}
