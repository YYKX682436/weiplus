package qw3;

/* loaded from: classes9.dex */
public class e0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569) {
        super(false);
        this.f448687d = activityC17101x8420a569;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        java.util.ArrayList<? extends android.os.Parcelable> arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "click arrive time et");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569 = this.f448687d;
        activityC17101x8420a569.mo48674x36654fab();
        activityC17101x8420a569.f238012f.e();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569.W6(activityC17101x8420a569)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(activityC17101x8420a569.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17107xca3bc51d.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17098x7cd03d04 c17098x7cd03d04 = activityC17101x8420a569.F;
        if (c17098x7cd03d04 != null && (arrayList = c17098x7cd03d04.f237995o) != null) {
            intent.putParcelableArrayListExtra("key_arrive_time_parcel_list", arrayList);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17099x4fad1e0e c17099x4fad1e0e = activityC17101x8420a569.E;
        if (c17099x4fad1e0e != null) {
            intent.putExtra("key_select_arrive_time", c17099x4fad1e0e.f237998d);
        }
        activityC17101x8420a569.startActivityForResult(intent, 3);
    }
}
