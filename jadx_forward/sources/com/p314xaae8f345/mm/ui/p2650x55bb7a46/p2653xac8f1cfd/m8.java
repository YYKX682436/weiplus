package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class m8 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 f281020a;

    public m8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var) {
        this.f281020a = y8Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void a() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var = this.f281020a;
        android.widget.TextView y07 = y8Var.y0();
        boolean z17 = false;
        if (y07 != null && y07.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            y8Var.A0().G("show_btn_guide", true);
        }
        if (y8Var.A0().q("longclick_guide_first_time", 0L) == 0) {
            y8Var.A0().B("longclick_guide_first_time", java.lang.System.currentTimeMillis());
        }
        y8Var.G0();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void b(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 B0;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var = this.f281020a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 v07 = y8Var.v0();
        java.lang.String m75458x24dd4e59 = v07 != null ? v07.m75458x24dd4e59() : null;
        if (!(m75458x24dd4e59 == null || r26.n0.N(m75458x24dd4e59)) || (B0 = y8Var.B0()) == null) {
            return;
        }
        B0.c(i17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void c(float f17, float f18) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var = this.f281020a;
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8.r0(y8Var)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8.q0(y8Var, f17, f18);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void d() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var = this.f281020a;
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8.r0(y8Var)) {
            if (y8Var.f281819J == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a8.f280143d) {
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - y8Var.G;
                u35.e eVar = u35.e.f505969a;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var = y8Var.f281826n;
                java.lang.String str3 = (h9Var == null || (str2 = h9Var.f271888a) == null) ? "" : str2;
                java.lang.String x17 = y8Var.f280113d.x();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var2 = y8Var.f281826n;
                eVar.a(elapsedRealtime, str3, x17, (h9Var2 == null || (str = h9Var2.f271889b) == null) ? "" : str);
            }
            if (y8Var.f281819J == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a8.f280144e) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8.o0(y8Var);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var3 = y8Var.f281826n;
            if (h9Var3 != null) {
                h9Var3.c();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void e(float f17, float f18) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var = this.f281020a;
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8.r0(y8Var)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8.p0(y8Var, f17, f18);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    public void f() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 v07 = this.f281020a.v0();
        if (v07 != null) {
            v07.z1();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    /* renamed from: onHide */
    public void mo75913xc39a57c1() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var = this.f281020a;
        android.view.View F0 = y8Var.F0();
        if (F0 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(F0, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$initSpeechInputLayout$5", "onHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            F0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(F0, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$initSpeechInputLayout$5", "onHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gp gpVar = y8Var.f281838z;
        if (gpVar != null) {
            gpVar.c();
        }
        y8Var.G0();
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32.f271353y.a() == 2) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8.n0(y8Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.w2
    /* renamed from: onShow */
    public void mo75914xc39f557c() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var = this.f281020a;
        boolean z17 = false;
        if (y8Var.f281837y) {
            android.view.View F0 = y8Var.F0();
            if (F0 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(F0, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$initSpeechInputLayout$5", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            F0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(F0, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$initSpeechInputLayout$5", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View F02 = y8Var.F0();
        if (F02 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(F02, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$initSpeechInputLayout$5", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            F02.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(F02, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$initSpeechInputLayout$5", "onShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b31.l.f99146a.h(F02, 1, y8Var.f280113d.x());
            if (!y8Var.f281835w) {
                y8Var.G0();
            }
        }
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32.f271353y.a() == 2) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 B0 = y8Var.B0();
            if (B0 != null && B0.getCurV2TStatus() == 1) {
                z17 = true;
            }
            if (z17) {
                y8Var.J0();
            } else {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8.n0(y8Var);
            }
        }
    }
}
