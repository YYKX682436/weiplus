package hr3;

/* loaded from: classes11.dex */
public class g1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 f365102d;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2) {
        this.f365102d = activityC16840x4302a3e2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    public void b(int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "story_cat onMuteIn");
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.U;
        this.f365102d.getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    public void j(int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    /* renamed from: onPostClose */
    public void mo14951x73fef619() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a;
        bi4.i0 R;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = this.f365102d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC16840x4302a3e2.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((uj4.e) pf5.z.f435481a.a(activity).a(uj4.e.class)).Q6();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = activityC16840x4302a3e2.f235187d;
        if (rVar != null && (viewOnClickListenerC16860xc669c20a = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("contact_profile_header_normal")) != null && (R = viewOnClickListenerC16860xc669c20a.R()) != null) {
            R.W(false);
            R.mo14951x73fef619();
        }
        activityC16840x4302a3e2.m78602x5a7a36a0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC16840x4302a3e2.f235187d).h("contact_profile_header_normal");
        android.view.View view2 = (viewOnClickListenerC16860xc669c20a2 == null || (view = viewOnClickListenerC16860xc669c20a2.T) == null) ? null : ((hr3.u9) view.getTag()).H;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view3 = view2;
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "showDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "showDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    /* renamed from: onPostOpen */
    public void mo14952xd2370609(boolean z17) {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = this.f365102d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC16840x4302a3e2.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((uj4.e) pf5.z.f435481a.a(activity).a(uj4.e.class)).R6();
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.U;
        bi4.i0 Z6 = activityC16840x4302a3e2.Z6();
        if (Z6 != null) {
            Z6.mo14952xd2370609(z17);
        }
        activityC16840x4302a3e2.m78531x8f8cf1fb();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC16840x4302a3e2.f235187d).h("contact_profile_header_normal");
        android.view.View view2 = (viewOnClickListenerC16860xc669c20a == null || (view = viewOnClickListenerC16860xc669c20a.T) == null) ? null : ((hr3.u9) view.getTag()).H;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "hideDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/ContactInfoUI", "hideDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    /* renamed from: onPreClose */
    public void mo14953x56608c14() {
        bi4.i0 R;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = this.f365102d;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = activityC16840x4302a3e2.f235187d;
        if (rVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("contact_profile_header_normal");
            if (viewOnClickListenerC16860xc669c20a != null && (R = viewOnClickListenerC16860xc669c20a.R()) != null) {
                R.mo14953x56608c14();
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC16840x4302a3e2.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((uj4.e) pf5.z.f435481a.a(activity).a(uj4.e.class)).S6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    /* renamed from: onPreOpen */
    public void mo14954x3c9d44ae() {
        bi4.i0 R;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = this.f365102d;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = activityC16840x4302a3e2.f235187d;
        if (rVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("contact_profile_header_normal");
            if (viewOnClickListenerC16860xc669c20a != null && (R = viewOnClickListenerC16860xc669c20a.R()) != null) {
                R.W(true);
                R.mo14954x3c9d44ae();
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC16840x4302a3e2.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2 U6 = ((uj4.e) pf5.z.f435481a.a(activity).a(uj4.e.class)).U6();
            if (U6 != null) {
                U6.mo14954x3c9d44ae();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    public void p() {
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.U;
        this.f365102d.getClass();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    public void q(int i17) {
    }
}
