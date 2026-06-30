package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class q3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r3 f227095d;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r3 r3Var) {
        this.f227095d = r3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Context context = this.f227095d.f227107b;
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        }
    }
}
