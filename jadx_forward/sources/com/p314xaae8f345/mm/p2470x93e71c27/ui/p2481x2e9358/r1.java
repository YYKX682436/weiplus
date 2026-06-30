package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class r1 implements fl5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272127a;

    public r1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272127a = c19666xfd6e2f33;
    }

    @Override // fl5.f
    public void a(java.lang.CharSequence charSequence) {
        java.lang.CharSequence charSequence2;
        fl5.i iVar;
        if (charSequence == null || charSequence.length() <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272127a;
        if (c19666xfd6e2f33.f271555m2 || !c19666xfd6e2f33.f271561n2) {
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                try {
                    charSequence2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.a();
                } catch (java.lang.SecurityException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatFooter", "commitText getText SecurityException: " + e17.getMessage());
                    android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
                    charSequence2 = null;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence2) && charSequence2.toString().equals(charSequence.toString())) {
                    boolean z17 = c19666xfd6e2f33.f271555m2;
                    u35.a aVar = u35.a.f505960a;
                    if (z17) {
                        c19666xfd6e2f33.f271555m2 = false;
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19666xfd6e2f33.f271488a3;
                        int length = charSequence.length();
                        if (y4Var != null) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6657x5b628c83 c6657x5b628c83 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6657x5b628c83();
                            c6657x5b628c83.f140035h = 5;
                            c6657x5b628c83.f140031d = 1L;
                            c6657x5b628c83.q(y4Var.c());
                            if (length > 0) {
                                c6657x5b628c83.f140037j = 1L;
                                c6657x5b628c83.f140039l = length;
                            }
                            c6657x5b628c83.p(u35.a.f505961b);
                            c6657x5b628c83.f140041n = java.lang.System.currentTimeMillis();
                            aVar.a(c6657x5b628c83);
                            c6657x5b628c83.k();
                        }
                    } else if (!c19666xfd6e2f33.f271561n2 && (iVar = c19666xfd6e2f33.f271554m) != null && (iVar.getText() == null || c19666xfd6e2f33.f271554m.getText().length() == 0)) {
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var2 = c19666xfd6e2f33.f271488a3;
                        int length2 = charSequence.length();
                        if (y4Var2 != null) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6657x5b628c83 c6657x5b628c832 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6657x5b628c83();
                            c6657x5b628c832.f140035h = 6;
                            c6657x5b628c832.f140031d = 1L;
                            c6657x5b628c832.q(y4Var2.c());
                            if (length2 > 0) {
                                c6657x5b628c832.f140037j = 1L;
                                c6657x5b628c832.f140039l = length2;
                            }
                            c6657x5b628c832.p(u35.a.f505961b);
                            c6657x5b628c832.f140041n = java.lang.System.currentTimeMillis();
                            aVar.a(c6657x5b628c832);
                            c6657x5b628c832.k();
                        }
                    }
                }
            } finally {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        c19666xfd6e2f33.f271555m2 = false;
    }

    @Override // fl5.f
    /* renamed from: sendKeyEvent */
    public void mo480x359d3323(android.view.KeyEvent keyEvent) {
    }
}
