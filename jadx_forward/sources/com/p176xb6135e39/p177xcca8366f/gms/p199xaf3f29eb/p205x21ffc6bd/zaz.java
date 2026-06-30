package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* loaded from: classes13.dex */
public final class zaz extends com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.AbstractC2033x8ba694e6 {
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zaz zaa = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zaz();

    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static android.view.View zaa(android.content.Context context, int i17, int i18) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zaz zazVar = zaa;
        try {
            return (android.view.View) com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18683xcdecea63(((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zam) zazVar.m18686xf09ca05(context)).zae(com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(context), new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zax(1, i17, i18, null)));
        } catch (java.lang.Exception e17) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.AbstractC2033x8ba694e6.RemoteCreatorException("Could not get button with size " + i17 + " and color " + i18, e17);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.AbstractC2033x8ba694e6
    /* renamed from: getRemoteCreator */
    public final /* synthetic */ java.lang.Object mo18399x19672150(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zam ? (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zam) queryLocalInterface : new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zam(iBinder);
    }
}
