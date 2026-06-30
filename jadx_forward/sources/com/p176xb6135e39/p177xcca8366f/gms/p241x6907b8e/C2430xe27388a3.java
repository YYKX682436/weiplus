package com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e;

/* renamed from: com.google.android.gms.tasks.DuplicateTaskCompletionException */
/* loaded from: classes13.dex */
public final class C2430xe27388a3 extends java.lang.IllegalStateException {
    private C2430xe27388a3(java.lang.String str, java.lang.Throwable th6) {
        super(str, th6);
    }

    public static java.lang.IllegalStateException of(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<?> abstractC2439x27a9a5) {
        if (!abstractC2439x27a9a5.mo19598xacfcd883()) {
            return new java.lang.IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        java.lang.Exception mo19594x57bd4199 = abstractC2439x27a9a5.mo19594x57bd4199();
        return new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2430xe27388a3("Complete with: ".concat(mo19594x57bd4199 != null ? "failure" : abstractC2439x27a9a5.mo19599x55b0a764() ? "result ".concat(java.lang.String.valueOf(abstractC2439x27a9a5.mo19595x2d64eb13())) : abstractC2439x27a9a5.mo19597xc9602be3() ? "cancellation" : "unknown issue"), mo19594x57bd4199);
    }
}
