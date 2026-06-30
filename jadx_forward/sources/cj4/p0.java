package cj4;

/* loaded from: classes4.dex */
public final class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f123548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f123549e;

    public p0(cj4.i1 i1Var, java.lang.StringBuilder sb6) {
        this.f123548d = i1Var;
        this.f123549e = sb6;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.Object systemService = this.f123548d.w().getSystemService("clipboard");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(null, this.f123549e.toString()));
    }
}
