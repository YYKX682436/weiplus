package jb4;

/* loaded from: classes4.dex */
public class r extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f380372a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f380373b = "";

    /* renamed from: c, reason: collision with root package name */
    public final int f380374c;

    /* renamed from: d, reason: collision with root package name */
    public final int f380375d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f380376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jb4.v f380377f;

    public r(jb4.v vVar, java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f380377f = vVar;
        this.f380372a = str;
        this.f380374c = i17;
        this.f380375d = i18;
        this.f380376e = str2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(9:14|(1:16)|17|18|19|20|21|22|23)|50|18|19|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00be, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0118, code lost:
    
        r16.f380373b = r0.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereImageLoader", "ImageDecodeTask, exp:" + r16.f380373b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0067, code lost:
    
        if (r12.f380386b < 1080) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014a  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doInBackground(java.lang.Object[] r17) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jb4.r.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$ImageDecodeTask");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$ImageDecodeTask");
        jb4.u uVar = this.f380377f.f380385a;
        if (uVar != null) {
            uVar.a(bitmap != null, this.f380373b, bitmap, this.f380372a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$ImageDecodeTask");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostExecute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$ImageDecodeTask");
    }
}
