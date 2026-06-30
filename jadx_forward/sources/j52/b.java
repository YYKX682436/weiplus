package j52;

/* loaded from: classes15.dex */
public class b implements yj0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j52.c f379330a;

    public b(j52.c cVar) {
        this.f379330a = cVar;
    }

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        boolean equals = "onPostOpen".equals(str2);
        j52.c cVar = this.f379330a;
        if (equals) {
            if (objArr.length >= 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor, onPostOpen: %b", objArr[0]);
                cVar.d(0, java.lang.System.currentTimeMillis());
                j52.c.a(cVar, obj, true);
                return;
            }
            return;
        }
        if ("onPostClose".equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor, onPostClose:");
            cVar.d(1, java.lang.System.currentTimeMillis());
            j52.c.a(cVar, obj, false);
        }
    }
}
