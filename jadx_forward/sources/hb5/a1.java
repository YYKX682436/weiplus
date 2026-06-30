package hb5;

/* loaded from: classes11.dex */
public class a1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 f361682d;

    public a1(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 activityC21589xad4109a8) {
        this.f361682d = activityC21589xad4109a8;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8.H;
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21589xad4109a8 activityC21589xad4109a8 = this.f361682d;
        activityC21589xad4109a8.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatroomInfoUI", "deleteChatroom");
        s01.y Ni = r01.q3.Ni();
        java.lang.String str = activityC21589xad4109a8.f279477o;
        java.lang.String str2 = activityC21589xad4109a8.f279487y.f69169xf75e5c37;
        Ni.getClass();
        gm0.j1.n().f354821b.g(new s01.n0(str, str2));
        activityC21589xad4109a8.F = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC21589xad4109a8, activityC21589xad4109a8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC21589xad4109a8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new hb5.b1(activityC21589xad4109a8));
        gm0.j1.e().j(new c01.h0(activityC21589xad4109a8.f279477o, activityC21589xad4109a8.f279478p, new hb5.r0(activityC21589xad4109a8, Q)));
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("Contact_User", activityC21589xad4109a8.f279477o);
        j45.l.j(activityC21589xad4109a8.mo55332x76847179(), "brandservice", ".ui.BizChatConversationUI", intent, null);
        activityC21589xad4109a8.finish();
    }
}
