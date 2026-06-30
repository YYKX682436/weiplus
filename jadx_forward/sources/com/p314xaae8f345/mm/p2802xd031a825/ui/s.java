package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes5.dex */
public class s extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.w f295757d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p2802xd031a825.ui.w wVar) {
        super(false);
        this.f295757d = wVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.w wVar = this.f295757d;
        db5.d5 d5Var = wVar.f295785h;
        if (d5Var == null || !d5Var.isShowing()) {
            return;
        }
        wVar.f295785h.dismiss();
    }
}
