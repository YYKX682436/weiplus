package hr3;

/* loaded from: classes11.dex */
public class jg implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f365236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 f365237e;

    public jg(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f365237e = activityC16871x34c232c9;
        this.f365236d = m1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f365236d;
        r45.my6 my6Var = m1Var.mo808xfb85f7b0() == 30 ? (r45.my6) ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).f270911e.f152244b.f152233a : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = this.f365237e;
        if (my6Var == null || !android.text.TextUtils.equals(activityC16871x34c232c9.f235359q, my6Var.f462463d) || android.text.TextUtils.isEmpty(my6Var.f462467h)) {
            activityC16871x34c232c9.f7(true, "");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "gotoSelfPageWithoutDialog with antispamTicket: %s, username: %s", my6Var.f462467h, my6Var.f462463d);
            activityC16871x34c232c9.f7(true, my6Var.f462467h);
        }
    }
}
