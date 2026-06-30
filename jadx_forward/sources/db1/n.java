package db1;

/* loaded from: classes5.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db1.p f309381d;

    public n(db1.p pVar) {
        this.f309381d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        db1.p pVar = this.f309381d;
        android.content.Context context = pVar.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pVar.f309400x = new vi1.l0("", context, pVar.f309402z);
        pVar.f309393q.mo7960x6cab2c8d(pVar.f309400x);
        if (pVar.f309402z.size() == 0) {
            pVar.f309391o.setVisibility(8);
            return;
        }
        if (pVar.f309402z.size() == 1) {
            pVar.f309391o.setVisibility(0);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = pVar.f309393q.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
            pVar.f309394r.setText(pVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3s));
            return;
        }
        pVar.f309391o.setVisibility(0);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = pVar.f309393q.mo7946xf939df19();
        if (mo7946xf939df192 != null) {
            mo7946xf939df192.m8146xced61ae5();
        }
        pVar.f309394r.setText(pVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3r));
    }
}
