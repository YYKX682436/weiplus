package hb5;

/* loaded from: classes4.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f361793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 f361794e;

    public u0(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 activityC21589xad4109a8, int i17) {
        this.f361794e = activityC21589xad4109a8;
        this.f361793d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 activityC21589xad4109a8 = this.f361794e;
        android.view.View x17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.b) activityC21589xad4109a8.f279470e).x(this.f361793d, activityC21589xad4109a8.m79335xcc101dd9());
        if (x17 != null) {
            zg5.a.a(activityC21589xad4109a8.mo55332x76847179(), x17);
        }
    }
}
