package hb5;

/* loaded from: classes11.dex */
public class z0 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 f361803b;

    public z0(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 activityC21589xad4109a8, java.lang.String str) {
        this.f361803b = activityC21589xad4109a8;
        this.f361802a = str;
    }

    @Override // db5.a1
    /* renamed from: onFinish */
    public boolean mo26039x42fe6352(java.lang.CharSequence charSequence) {
        int i17 = com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8.H;
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 activityC21589xad4109a8 = this.f361803b;
        activityC21589xad4109a8.getClass();
        java.lang.String trim = charSequence == null ? "" : charSequence.toString().trim();
        if (!trim.equals(this.f361802a)) {
            if (trim.length() == 0) {
                db5.e1.T(activityC21589xad4109a8.mo55332x76847179(), activityC21589xad4109a8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574415i42));
                return false;
            }
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785().e();
            s01.h hVar = activityC21589xad4109a8.f279487y;
            activityC21589xad4109a8.f279479q = hVar.f69171x736d1fa8;
            activityC21589xad4109a8.f279486x = hVar.f69167x6e664fd4;
            hVar.f69171x736d1fa8 = trim;
            r01.q3.Ui().P0(activityC21589xad4109a8.f279487y);
            r45.pj pjVar = new r45.pj();
            pjVar.f464618d = activityC21589xad4109a8.f279487y.f69169xf75e5c37;
            pjVar.f464621g = trim;
            pjVar.f464623i = activityC21589xad4109a8.f279486x;
            r01.q3.Ni().n(activityC21589xad4109a8.f279487y.f69170x75756b18, pjVar, activityC21589xad4109a8);
            activityC21589xad4109a8.a7();
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC21589xad4109a8.f279470e).notifyDataSetChanged();
        }
        return true;
    }
}
