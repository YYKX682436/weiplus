package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes15.dex */
public class t0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.z0 f214617a;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.z0 z0Var) {
        this.f214617a = z0Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.z0 z0Var = this.f214617a;
        boolean z17 = z0Var.f214962l;
        z0Var.getClass();
        int i18 = message.what;
        if (i18 == 1) {
            z0Var.f214959i.mo62213x8be36c27(z0Var.f214967q);
            return;
        }
        if (i18 == 2) {
            z0Var.f214958h.removeMessages(3);
            z0Var.f214963m = false;
            z0Var.f214964n = true;
            z0Var.f214959i.mo62211x4f8d808(z0Var.f214967q);
            return;
        }
        if (i18 != 3) {
            if (i18 == 4) {
                z0Var.f214971u = false;
                return;
            } else {
                throw new java.lang.RuntimeException("Unknown message " + message);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w0 w0Var = z0Var.f214961k;
        if (w0Var != null) {
            if (z0Var.f214962l) {
                z0Var.f214963m = true;
            } else {
                w0Var.mo62214x2f29e7a3(z0Var.f214967q);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.z0 z0Var, android.os.Handler handler) {
        super(handler.getLooper());
        this.f214617a = z0Var;
    }
}
