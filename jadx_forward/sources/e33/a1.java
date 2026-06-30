package e33;

/* loaded from: classes10.dex */
public class a1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f328646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f328647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd f328648f;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, int i17) {
        this.f328648f = activityC15653x403456cd;
        this.f328646d = abstractC15633xee433078;
        this.f328647e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumPreviewUI", "ShowAlert");
        android.content.Intent intent = new android.content.Intent();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("file://");
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = this.f328646d;
        sb6.append(android.net.Uri.encode(abstractC15633xee433078.f219963e));
        intent.setData(android.net.Uri.parse(sb6.toString()));
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd.f220042t2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f328648f;
        activityC15653x403456cd.T7(-1, intent);
        o23.m.f423959a.c(abstractC15633xee433078.f219963e, activityC15653x403456cd.J1, this.f328647e);
        activityC15653x403456cd.finish();
    }
}
