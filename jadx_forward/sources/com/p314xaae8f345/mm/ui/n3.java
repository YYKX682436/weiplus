package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class n3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f290934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290935e;

    public n3(java.lang.Runnable runnable, android.content.Context context) {
        this.f290934d = runnable;
        this.f290935e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f290934d.run();
        if (com.p314xaae8f345.mm.ui.bk.y()) {
            boolean A = com.p314xaae8f345.mm.ui.bk.A();
            android.content.Context context = this.f290935e;
            if (A && context.getResources().getConfiguration().orientation == 1) {
                return;
            }
            j45.l.u(context, ".ui.EmptyActivity", new android.content.Intent(), null);
        }
    }
}
