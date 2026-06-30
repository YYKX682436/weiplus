package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class a2 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b2 f239161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b2 b2Var) {
        super(false);
        this.f239161d = b2Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b2 b2Var = this.f239161d;
        android.view.View.OnClickListener onClickListener = b2Var.f239179f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
            b2Var.dismiss();
        }
    }
}
