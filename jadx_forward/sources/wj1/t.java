package wj1;

/* loaded from: classes14.dex */
public class t implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 f528167d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5) {
        this.f528167d = activityC12702xc32382a5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5 = this.f528167d;
        android.content.Intent intent = new android.content.Intent(activityC12702xc32382a5.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.ActivityC12543xfc56fe.class);
        intent.putExtra("APPID", activityC12702xc32382a5.f171065e);
        activityC12702xc32382a5.startActivityForResult(intent, 10000);
        return null;
    }
}
