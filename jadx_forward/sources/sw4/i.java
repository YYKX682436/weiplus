package sw4;

/* loaded from: classes7.dex */
public class i implements sw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.ActivityC19269x3c5b5e6 f495019a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.ActivityC19269x3c5b5e6 activityC19269x3c5b5e6) {
        this.f495019a = activityC19269x3c5b5e6;
    }

    @Override // sw4.e
    public void a(android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("input_data", bundle);
        intent.putExtra("event_type", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.ActivityC19269x3c5b5e6 activityC19269x3c5b5e6 = this.f495019a;
        activityC19269x3c5b5e6.setResult(-1, intent);
        activityC19269x3c5b5e6.finish();
    }

    @Override // sw4.e
    public void f(android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("input_data", bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.ActivityC19269x3c5b5e6 activityC19269x3c5b5e6 = this.f495019a;
        activityC19269x3c5b5e6.setResult(-1, intent);
        activityC19269x3c5b5e6.finish();
    }
}
