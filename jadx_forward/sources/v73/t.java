package v73;

/* loaded from: classes9.dex */
public class t implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.d f515277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6 f515278b;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6 activityC16100x8f3665d6, r73.d dVar) {
        this.f515278b = activityC16100x8f3665d6;
        this.f515277a = dVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.di4 di4Var = this.f515277a.f474700r.f472526g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6 activityC16100x8f3665d6 = this.f515278b;
        if (di4Var != null) {
            db5.e1.C(activityC16100x8f3665d6, di4Var.f454041d, "", di4Var.f454043f, di4Var.f454042e, false, new v73.s(this), null);
            activityC16100x8f3665d6.m83114xe5d7a18f();
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14 = activityC16100x8f3665d6.f223838f;
            if (viewOnFocusChangeListenerC22906x9d30fd14 != null) {
                viewOnFocusChangeListenerC22906x9d30fd14.a();
            }
            activityC16100x8f3665d6.m83114xe5d7a18f();
        }
    }
}
