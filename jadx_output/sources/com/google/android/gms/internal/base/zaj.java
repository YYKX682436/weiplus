package com.google.android.gms.internal.base;

/* loaded from: classes13.dex */
final class zaj extends android.graphics.drawable.Drawable.ConstantState {
    int zaa;
    int zab;

    public zaj(com.google.android.gms.internal.base.zaj zajVar) {
        if (zajVar != null) {
            this.zaa = zajVar.zaa;
            this.zab = zajVar.zab;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.zaa;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        return new com.google.android.gms.internal.base.zak(this);
    }
}
