package gu0;

/* loaded from: classes5.dex */
public final class s implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e f357336d;

    public s(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e activityC10926xa2f37a4e) {
        this.f357336d = activityC10926xa2f37a4e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", "close confirmed by user");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e activityC10926xa2f37a4e = this.f357336d;
        gu0.k2 k2Var = activityC10926xa2f37a4e.f150710d;
        if (k2Var != null) {
            k2Var.p(true, new gu0.r(activityC10926xa2f37a4e));
        }
    }
}
