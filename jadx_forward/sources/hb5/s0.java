package hb5;

/* loaded from: classes11.dex */
public class s0 implements s01.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 f361790a;

    public s0(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 activityC21589xad4109a8) {
        this.f361790a = activityC21589xad4109a8;
    }

    @Override // s01.l
    public void a(s01.k kVar) {
        if (kVar == null || kVar.f483424c == null) {
            return;
        }
        long j17 = kVar.f483423b;
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 activityC21589xad4109a8 = this.f361790a;
        if (j17 != activityC21589xad4109a8.f279478p || kVar.f483422a == s01.j.DELETE) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatroomInfoUI", "bizChatExtension bizChat change");
        activityC21589xad4109a8.f279487y = r01.q3.Ui().z0(activityC21589xad4109a8.f279478p);
        activityC21589xad4109a8.m79365xf050804b();
    }
}
