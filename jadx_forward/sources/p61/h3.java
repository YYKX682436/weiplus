package p61;

/* loaded from: classes5.dex */
public class h3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11368x3bd82e91 f433814d;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11368x3bd82e91 activityC11368x3bd82e91) {
        this.f433814d = activityC11368x3bd82e91;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11368x3bd82e91 activityC11368x3bd82e91 = this.f433814d;
        intent.putExtra("kintent_hint", activityC11368x3bd82e91.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0c));
        intent.putExtra("from_unbind", true);
        j45.l.n(activityC11368x3bd82e91, "account", "com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI", intent, 1);
    }
}
