package hr3;

/* loaded from: classes11.dex */
public class c1 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 f364970d;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2) {
        this.f364970d = activityC16840x4302a3e2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a2;
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.U;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = this.f364970d;
        activityC16840x4302a3e2.V6(i27 - i18);
        int b17 = bi4.e.b(activityC16840x4302a3e2.mo55332x76847179(), view);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC16840x4302a3e2.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        boolean X6 = ((uj4.e) zVar.a(activity).a(uj4.e.class)).X6();
        if (activityC16840x4302a3e2.E != b17 && X6 && activityC16840x4302a3e2.R != null && (c22702xa9a9ae2a2 = activityC16840x4302a3e2.f235199s) != null) {
            activityC16840x4302a3e2.E = b17;
            int i39 = bi4.e.a(activityC16840x4302a3e2)[1];
            c22702xa9a9ae2a2.f293683f = true;
            c22702xa9a9ae2a2.A = b17;
            c22702xa9a9ae2a2.f293684g = false;
            c22702xa9a9ae2a2.B = i39;
            activityC16840x4302a3e2.f235199s.m82047x681476c3(new hr3.d1(activityC16840x4302a3e2, b17));
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = activityC16840x4302a3e2.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((uj4.e) zVar.a(activity2).a(uj4.e.class)).W6(activityC16840x4302a3e2.E);
        }
        bi4.i0 Z6 = activityC16840x4302a3e2.Z6();
        if (Z6 == null || (c22702xa9a9ae2a = activityC16840x4302a3e2.f235199s) == null || c22702xa9a9ae2a.f293680J) {
            return;
        }
        Z6.W(true);
    }
}
