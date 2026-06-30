package com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0;

/* loaded from: classes11.dex */
public class d0 implements w11.e1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f178370a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f178371b;

    public d0(android.content.Context context) {
        this.f178371b = context;
    }

    @Override // w11.e1
    public void a(boolean z17) {
        boolean z18;
        android.content.Context context = this.f178371b;
        if (this.f178370a || z17) {
            return;
        }
        try {
            for (android.view.Display display : ((android.hardware.display.DisplayManager) context.getApplicationContext().getSystemService("display")).getDisplays()) {
                if (display.getState() == 2) {
                    z18 = true;
                    break;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCoreDBBackup", th6, "Fail to fetch status of displays.", new java.lang.Object[0]);
        }
        z18 = false;
        if (z18) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
        c6231x4f3054ba.f136478g.f89948b = 2;
        c6231x4f3054ba.e();
        if (c6231x4f3054ba.f136479h.f90034b || iq.b.H()) {
            return;
        }
        this.f178370a = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreDBBackup", "app is background now, i can kill quietly");
        ((bt.b1) k35.p.f385476a).a(context, false);
    }
}
