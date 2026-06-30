package i34;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f369836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f369837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f369838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f369839g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f369840h;

    public a(android.widget.ImageView imageView, java.lang.String str, int i17, java.lang.String str2, int i18) {
        this.f369836d = imageView;
        this.f369837e = str;
        this.f369838f = i17;
        this.f369839g = str2;
        this.f369840h = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView = this.f369836d;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        java.lang.String str = this.f369837e;
        i34.d dVar = (drawable == null || !(drawable instanceof i34.d)) ? new i34.d(imageView, str, this.f369838f) : (i34.d) drawable;
        java.lang.String str2 = dVar.f369847e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = this.f369839g;
        if (str2.equals(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeAvatarDrawable", "same: %s", str3);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeAvatarDrawable", "not same refresh :%s, old: %s", str3, dVar.f369847e);
            imageView.setImageDrawable(null);
            dVar.f369846d = this.f369840h;
            dVar.f369847e = str3;
            dVar.f369848f = str;
        }
        imageView.setImageDrawable(dVar);
    }
}
