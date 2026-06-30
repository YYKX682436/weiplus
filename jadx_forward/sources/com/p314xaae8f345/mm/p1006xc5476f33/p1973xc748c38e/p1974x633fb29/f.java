package com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29;

/* loaded from: classes.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f236490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f236491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f236492f;

    public f(android.content.Context context, android.content.Intent intent, java.lang.String str) {
        this.f236490d = context;
        this.f236491e = intent;
        this.f236492f = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        try {
            android.content.Context context = this.f236490d;
            if (context != null) {
                android.content.Intent intent = this.f236491e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/qrcode/model/GetA8KeyRedirect$2", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.scanner.GetA8KeyRedirect", e17, "", new java.lang.Object[0]);
            android.content.Context context2 = this.f236490d;
            if (context2 != null) {
                db5.t7.g(context2, this.f236492f);
            }
        }
    }
}
