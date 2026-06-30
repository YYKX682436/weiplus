package rn1;

/* loaded from: classes12.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f479144d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1254xc8603089.ActivityC12834x3f237cc9 activityC12834x3f237cc9, int i17) {
        this.f479144d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcUI", "low battery, user click sure. battery:%d", java.lang.Integer.valueOf(this.f479144d));
    }
}
