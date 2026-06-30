package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class zaz extends com.google.android.gms.dynamic.RemoteCreator {
    private static final com.google.android.gms.common.internal.zaz zaa = new com.google.android.gms.common.internal.zaz();

    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static android.view.View zaa(android.content.Context context, int i17, int i18) {
        com.google.android.gms.common.internal.zaz zazVar = zaa;
        try {
            return (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(((com.google.android.gms.common.internal.zam) zazVar.getRemoteCreatorInstance(context)).zae(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), new com.google.android.gms.common.internal.zax(1, i17, i18, null)));
        } catch (java.lang.Exception e17) {
            throw new com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException("Could not get button with size " + i17 + " and color " + i18, e17);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof com.google.android.gms.common.internal.zam ? (com.google.android.gms.common.internal.zam) queryLocalInterface : new com.google.android.gms.common.internal.zam(iBinder);
    }
}
