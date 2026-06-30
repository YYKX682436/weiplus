package e04;

/* loaded from: classes.dex */
public final class h2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f327484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f327485e;

    public h2(android.content.Context context, java.lang.String str) {
        this.f327484d = context;
        this.f327485e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Context context = this.f327484d;
        java.lang.String str = this.f327485e;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(context, str, str, null);
    }
}
