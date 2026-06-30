package qw3;

/* loaded from: classes9.dex */
public class u extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569) {
        super(false);
        this.f448743d = activityC17101x8420a569;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569 = this.f448743d;
        if (activityC17101x8420a569.L || !activityC17101x8420a569.M) {
            activityC17101x8420a569.a7(true);
        } else {
            android.content.Intent intent = new android.content.Intent(activityC17101x8420a569.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377.class);
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = activityC17101x8420a569.f238022s;
            if (arrayList != null) {
                intent.putParcelableArrayListExtra("key_self_transfer_record_list", arrayList);
            }
            java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = activityC17101x8420a569.f238023t;
            if (arrayList2 != null) {
                intent.putParcelableArrayListExtra("key_freq_transfer_record_list", arrayList2);
            }
            activityC17101x8420a569.startActivityForResult(intent, 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14673, 3);
    }
}
