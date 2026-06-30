package h93;

/* loaded from: classes11.dex */
public abstract class c extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f361227d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f361228e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f361229f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f361229f = jz5.h.b(new h93.b(activity));
    }

    public abstract java.lang.Object O6();

    public abstract int P6();

    public final h93.k Q6() {
        return (h93.k) ((jz5.n) this.f361229f).mo141623x754a37bb();
    }

    public abstract java.lang.String R6();

    public void S6() {
        java.lang.Object O6 = O6();
        if (O6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130 = (com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130) O6;
            c16180x2cdd3130.m79138x7e5ecb64(com.p314xaae8f345.mm.R.C30861xcebc809e.f563438d60);
            c16180x2cdd3130.m79140x4a0e4618(com.p314xaae8f345.mm.R.C30861xcebc809e.f563439d61);
            c16180x2cdd3130.m79139xb10bdb09(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
            c16180x2cdd3130.m79124x6c4032e7(new h93.a(this));
        }
    }

    public void T6(java.util.ArrayList selectedList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedList, "selectedList");
    }

    public abstract void U6(java.lang.String str, java.util.List list);

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f361227d = m158359x1e885992().getStringExtra("label_username");
        m158359x1e885992().getBooleanExtra("is_stranger", false);
        this.f361228e = m158359x1e885992().getStringExtra("Contact_ReportSessionId");
        S6();
    }
}
