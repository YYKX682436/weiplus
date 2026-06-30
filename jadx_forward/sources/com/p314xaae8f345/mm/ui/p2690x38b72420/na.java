package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes9.dex */
public class na implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f288576d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f288577e;

    public na(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8, java.util.ArrayList arrayList, com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8.AnonymousClass1 anonymousClass1) {
        this.f288576d = new java.lang.ref.WeakReference(activityC22325x8baa24f8);
        this.f288577e = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = (com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8) this.f288576d.get();
        if (activityC22325x8baa24f8 == null) {
            return;
        }
        java.lang.String r17 = c01.z1.r();
        java.util.ArrayList<java.lang.String> arrayList = this.f288577e;
        java.util.Iterator<java.lang.String> it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.String next = it.next();
            i17 += com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(next) ? 1 : 0;
            k70.i0 i0Var = new k70.i0();
            i0Var.f386175a = 4;
            java.lang.String stringExtra = activityC22325x8baa24f8.getIntent().getStringExtra("shareImagePath");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str = stringExtra == null ? "" : stringExtra;
            java.lang.String str2 = r17 == null ? "" : r17;
            if (next == null) {
                next = "";
            }
            r70.g gVar = new r70.g(str, 0, str2, next, i0Var);
            gVar.f474641j = "select_contact_ui_send_img";
            ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
        }
        activityC22325x8baa24f8.C.dismiss();
        android.content.Intent intent = new android.content.Intent();
        intent.putStringArrayListExtra("Select_Contact", arrayList);
        activityC22325x8baa24f8.setResult(-1, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11048, 1, java.lang.Integer.valueOf(arrayList.size() - i17), java.lang.Integer.valueOf(i17));
        activityC22325x8baa24f8.finish();
    }
}
