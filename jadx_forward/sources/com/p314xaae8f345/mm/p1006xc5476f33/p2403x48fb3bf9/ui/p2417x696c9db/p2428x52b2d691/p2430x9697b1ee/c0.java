package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/c0;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/SendMsgParams;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GamelifeGeneralReturnParam;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
final class c0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19474xddf4a19f c19474xddf4a19f = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19474xddf4a19f) obj;
        if (c19474xddf4a19f == null) {
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19467x7ab4d1e3(false, "system err"));
                return;
            }
            return;
        }
        z53.t Di = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Di();
        java.lang.String str = c19474xddf4a19f.f267698d;
        if (Di.z0(str).f72763xa3c65b86 == -1) {
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19467x7ab4d1e3(false, "no conversation"));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.f.f267710e.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.f[] m74643xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.f.m74643xcee59d22();
        int length = m74643xcee59d22.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                fVar = null;
                break;
            }
            fVar = m74643xcee59d22[i17];
            if (fVar.f267712d == c19474xddf4a19f.f267702h) {
                break;
            } else {
                i17++;
            }
        }
        int i18 = fVar == null ? -1 : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.b0.f267703a[fVar.ordinal()];
        java.lang.String selfUserName = c19474xddf4a19f.f267700f;
        java.lang.String content = c19474xddf4a19f.f267699e;
        if (i18 == 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfUserName, "selfUserName");
            ((dk5.s5) tg3.t1.a()).fj(str, content, c01.e2.C(str), 0);
        } else if (i18 == 2) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "md5");
        } else if (i18 != 3) {
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19467x7ab4d1e3(false, "system err"));
                return;
            }
            return;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            java.lang.String talker = c19474xddf4a19f.f267701g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfUserName, "selfUserName");
        }
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19467x7ab4d1e3(true, "sendmsg"));
        }
    }
}
