package qy0;

/* loaded from: classes5.dex */
public final class e0 implements com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.b7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.ActivityC11005x7656952 f449119a;

    public e0(com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.ActivityC11005x7656952 activityC11005x7656952) {
        this.f449119a = activityC11005x7656952;
    }

    @Override // com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.b7
    public void b(java.lang.String templateId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(templateId, "@@no_template@@")) {
            return;
        }
        int i18 = com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.ActivityC11005x7656952.f151286f;
        com.p314xaae8f345.mm.p916x4268f0dc.p922xc84c5534.C11017xf7264b1c T6 = this.f449119a.T6();
        T6.getClass();
        T6.c(templateId, false, T6.f151340f);
    }

    @Override // com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.b7
    public void f(java.lang.String templateId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(templateId, "@@no_template@@");
        com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.ActivityC11005x7656952 activityC11005x7656952 = this.f449119a;
        if (b17) {
            int i18 = com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.ActivityC11005x7656952.f151286f;
            activityC11005x7656952.T6().d("", "no_template2");
        } else {
            int i19 = com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.ActivityC11005x7656952.f151286f;
            com.p314xaae8f345.mm.p916x4268f0dc.p922xc84c5534.C11017xf7264b1c T6 = activityC11005x7656952.T6();
            T6.d(templateId, T6.f151340f);
        }
    }
}
