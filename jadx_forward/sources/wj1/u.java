package wj1;

/* loaded from: classes14.dex */
public class u implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 f528169d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5) {
        this.f528169d = activityC12702xc32382a5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5 = this.f528169d;
        android.content.Intent intent = new android.content.Intent(activityC12702xc32382a5.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.ActivityC12544xcfbd2e8a.class);
        intent.putExtra("APPID", activityC12702xc32382a5.f171065e);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        intent.putExtra("PAGEPATH", "");
        activityC12702xc32382a5.startActivityForResult(intent, 10001);
        return null;
    }
}
