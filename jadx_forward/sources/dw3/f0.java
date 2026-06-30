package dw3;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final dw3.f0 f325739a = new dw3.f0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f325740b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f325741c = "MicroMsg.MemLeakUtil";

    public final void a() {
        java.lang.String str = f325741c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "release panel ");
        java.util.ArrayList arrayList = f325740b;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            yv3.a aVar = (yv3.a) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "release panel " + aVar);
            aVar.f492925c.a();
        }
        arrayList.clear();
    }
}
