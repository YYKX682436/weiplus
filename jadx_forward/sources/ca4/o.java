package ca4;

/* loaded from: classes.dex */
public final class o implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f121535d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f121536e;

    public o(java.lang.Object obj, yz5.l action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f121535d = action;
        this.f121536e = new java.lang.ref.WeakReference(obj);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDismiss", "com.tencent.mm.plugin.sns.data.SafeDialogDismissListener");
        this.f121535d.mo146xb9724478(this.f121536e.get());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDismiss", "com.tencent.mm.plugin.sns.data.SafeDialogDismissListener");
    }
}
