package pv5;

/* loaded from: classes13.dex */
public class b implements pv5.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f440155a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.ServiceConnection f440156b;

    public b(android.content.Context context) {
        this.f440155a = context;
    }

    @Override // pv5.c
    public int a(java.lang.String str) {
        int b17 = b(str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104676xb5885268(new java.io.File(str)));
        android.content.Context context = this.f440155a;
        if (b17 == 0) {
            try {
                this.f440156b = new pv5.a(this);
                context.bindService(new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.ServiceC26593x2ce0e50.class), this.f440156b, 1);
            } catch (java.lang.Throwable unused) {
            }
            qv5.a aVar = com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.IntentServiceC26594x4aa6a22c.f297079d;
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.TinkerPatchService", "run patch service...", new java.lang.Object[0]);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.IntentServiceC26594x4aa6a22c.class);
            intent.putExtra("patch_path_extra", str);
            intent.putExtra("patch_use_emergency_mode", false);
            intent.putExtra("patch_result_class", com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.IntentServiceC26594x4aa6a22c.f297080e.getName());
            try {
                context.startService(intent);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.TinkerPatchService", "run patch service fail, exception:" + th6, new java.lang.Object[0]);
            }
        } else {
            tv5.b.b(context).f503904d.h(new java.io.File(str), b17);
        }
        return b17;
    }

    public int b(java.lang.String str, java.lang.String str2) {
        android.content.Context context = this.f440155a;
        tv5.b b17 = tv5.b.b(context);
        if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104747x96001e18(b17.f503910j) || !com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104746x7b8798c1(context)) {
            return -1;
        }
        if (android.text.TextUtils.isEmpty(str2) || !com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(new java.io.File(str))) {
            return -2;
        }
        if (b17.f503909i) {
            return -4;
        }
        java.lang.String str3 = uv5.a.f513002a;
        if (com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.IntentServiceC26594x4aa6a22c.a(context)) {
            return -3;
        }
        if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104756x7b9a31d4()) {
            return -5;
        }
        tv5.d dVar = b17.f503911k;
        if (!(b17.f503908h && dVar != null && dVar.f503916d)) {
            java.lang.String absolutePath = b17.f503902b.getAbsolutePath();
            try {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17 m104696x91bd9b4d = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17.m104696x91bd9b4d(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104680x3b463ffc(absolutePath), com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104681x4bb4abc7(absolutePath));
                if (m104696x91bd9b4d != null && !com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104743x83891ddd(m104696x91bd9b4d.f55906x3867f718) && !m104696x91bd9b4d.f55906x3867f718.equals(m104696x91bd9b4d.f55910x7d3d13d7)) {
                    if (str2.equals(m104696x91bd9b4d.f55906x3867f718)) {
                        return -6;
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return !uv5.c.b(context).c(str2) ? -7 : 0;
    }
}
