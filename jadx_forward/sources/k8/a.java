package k8;

/* loaded from: classes15.dex */
public class a extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink f386382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k8.b f386383b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k8.b bVar, android.content.Context context, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink) {
        super(context);
        this.f386383b = bVar;
        this.f386382a = eventSink;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        k8.c cVar = this.f386383b.f386385e;
        int i18 = cVar.f386390h;
        if ((i18 != 0 || (i17 < 300 && i17 > 60)) && ((i18 != 1 || i17 < 30 || i17 > 150) && ((i18 != 2 || i17 < 120 || i17 > 240) && (i18 != 3 || i17 < 210 || i17 > 330)))) {
            cVar.f386390h = ((i17 + 45) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) / 90;
        }
        int i19 = cVar.f386390h;
        char c17 = i19 == 0 ? (char) 1 : i19 == 1 ? '\b' : i19 == 2 ? '\t' : i19 == 3 ? (char) 0 : (char) 65535;
        java.lang.String str = c17 == 1 ? "DeviceOrientation.portraitUp" : c17 == '\t' ? "DeviceOrientation.portraitDown" : c17 == 0 ? "DeviceOrientation.landscapeLeft" : c17 == '\b' ? "DeviceOrientation.landscapeRight" : null;
        if (str != null) {
            this.f386382a.mo138418x90b54003(str);
        }
    }
}
