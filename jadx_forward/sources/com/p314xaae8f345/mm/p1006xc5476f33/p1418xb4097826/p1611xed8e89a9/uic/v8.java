package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class v8 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f205825e;

    public v8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar, ya2.b2 b2Var) {
        this.f205824d = obVar;
        this.f205825e = b2Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205824d;
        android.widget.TextView f76 = obVar.f7();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = obVar.f205597i.getContext();
        java.lang.String z07 = this.f205825e.z0();
        ((ke0.e) xVar).getClass();
        f76.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, z07));
    }
}
