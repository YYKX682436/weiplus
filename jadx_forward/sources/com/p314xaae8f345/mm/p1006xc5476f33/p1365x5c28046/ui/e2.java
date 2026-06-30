package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 f179485d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62) {
        super(1);
        this.f179485d = activityC13304x9b00dd62;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        o12.u uVar = (o12.u) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62 = this.f179485d;
        activityC13304x9b00dd62.d7().setEnabled(true);
        if (uVar != null) {
            android.graphics.Rect rect = uVar.f423721f;
            if (rect.isEmpty()) {
                rect.set(activityC13304x9b00dd62.b7().m54744xe4c43e8c());
            }
            activityC13304x9b00dd62.d7().a(uVar);
        }
        android.view.ViewGroup viewGroup = activityC13304x9b00dd62.f179297o;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textInputLayout");
            throw null;
        }
        activityC13304x9b00dd62.mo53060x36654fab(viewGroup);
        activityC13304x9b00dd62.n7(l12.a.f396514f);
        return jz5.f0.f384359a;
    }
}
