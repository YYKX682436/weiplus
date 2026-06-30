package or1;

/* loaded from: classes9.dex */
public class z0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.co f429137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12981xe277674e f429138b;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12981xe277674e activityC12981xe277674e, r45.co coVar) {
        this.f429138b = activityC12981xe277674e;
        this.f429137a = coVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12981xe277674e activityC12981xe277674e = this.f429138b;
            android.content.Intent intent = activityC12981xe277674e.getIntent();
            intent.putExtra("enterprise_biz_name", this.f429137a.f453209d);
            activityC12981xe277674e.setResult(-1, intent);
            activityC12981xe277674e.finish();
        }
    }
}
