package com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5;

/* renamed from: com.tencent.tinker.lib.service.AbstractResultService */
/* loaded from: classes11.dex */
public abstract class AbstractIntentServiceC26590x407102b6 extends android.app.IntentService {
    public AbstractIntentServiceC26590x407102b6() {
        super("TinkerResultService");
    }

    public static void b(android.content.Context context, com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.C26592x819d2665 c26592x819d2665, java.lang.String str) {
        if (str == null) {
            throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("resultServiceClass is null.");
        }
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(context, str);
            intent.putExtra("result_extra", c26592x819d2665);
            context.startService(intent);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.AbstractResultService", "run result service fail, exception:" + th6, new java.lang.Object[0]);
        }
    }

    public abstract void a(com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.C26592x819d2665 c26592x819d2665);

    @Override // android.app.IntentService
    public void onHandleIntent(android.content.Intent intent) {
        if (intent == null) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.AbstractResultService", "AbstractResultService received a null intent, ignoring.", new java.lang.Object[0]);
        } else {
            a((com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.C26592x819d2665) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104652x44c1999b(intent, "result_extra"));
        }
    }
}
