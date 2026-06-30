package im2;

/* loaded from: classes2.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.b f373774d;

    public a(im2.b bVar) {
        this.f373774d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        im2.b bVar = this.f373774d;
        android.content.Context context = bVar.f195201d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((im2.o6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(im2.o6.class)).f374008n = true;
        android.content.Context context2 = bVar.f195201d.getContext();
        android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity != null) {
            activity.finish();
        }
        android.content.Context context3 = bVar.f195201d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).overridePendingTransition(0, 0);
    }
}
