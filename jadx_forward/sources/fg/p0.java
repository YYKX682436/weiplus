package fg;

/* loaded from: classes7.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final fg.p0 f343334a = new fg.p0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Collection f343335b = new java.util.LinkedHashSet();

    public final void a(boolean z17) {
        java.util.Iterator it = f343335b.iterator();
        while (it.hasNext()) {
            re.b bVar = (re.b) ((fg.h) it.next());
            bVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageViewKeyboardHeightEmitter", "canDispatchKeyboardStatusChanged: " + z17);
            bVar.f475798i = z17;
        }
    }
}
