package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class b extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f232571d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f232571d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.a(activity));
    }

    public final j75.r O6() {
        return (j75.r) ((jz5.n) this.f232571d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.content.Intent intent = m158354x19263085().getIntent();
        r45.oc5 oc5Var = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16648x604060db.f232392d;
        r45.oc5 oc5Var2 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16648x604060db.f232392d;
        if (oc5Var2 != null) {
            O6().B3(new pm3.b(oc5Var2));
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16648x604060db.f232392d = null;
            return;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("PreviewItemObj");
        if (byteArrayExtra != null) {
            r45.oc5 oc5Var3 = new r45.oc5();
            oc5Var3.mo11468x92b714fd(byteArrayExtra);
            O6().B3(new pm3.b(oc5Var3));
        }
    }
}
