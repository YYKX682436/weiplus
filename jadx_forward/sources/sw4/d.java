package sw4;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.ActivityC19268x2f81ee00 f495016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f495017e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.ActivityC19268x2f81ee00 activityC19268x2f81ee00, android.graphics.Bitmap bitmap) {
        super(1);
        this.f495016d = activityC19268x2f81ee00;
        this.f495017e = bitmap;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.ActivityC19268x2f81ee00 activityC19268x2f81ee00 = this.f495016d;
        activityC19268x2f81ee00.getWindow().getDecorView().setBackground(new android.graphics.drawable.BitmapDrawable(activityC19268x2f81ee00.mo55332x76847179().getResources(), (android.graphics.Bitmap) obj));
        this.f495017e.recycle();
        return jz5.f0.f384359a;
    }
}
