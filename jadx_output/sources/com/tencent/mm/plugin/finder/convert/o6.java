package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class o6 implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior f104157d;

    public o6(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior) {
        this.f104157d = bottomSheetBehavior;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f104157d;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.D(3);
    }
}
