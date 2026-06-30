package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class h1 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.shadow.core.common.IWVAPermissionListener f69078a;

    public h1(com.tencent.shadow.core.common.IWVAPermissionListener iWVAPermissionListener) {
        this.f69078a = iWVAPermissionListener;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.shadow.core.common.IWVAPermissionListener iWVAPermissionListener = this.f69078a;
        if (iWVAPermissionListener != null) {
            iWVAPermissionListener.onRequestPermissionsResult(i17, strArr, iArr);
        }
    }
}
