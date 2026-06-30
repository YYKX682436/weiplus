package ft5;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static gt5.a f348277a;

    public static void a(android.content.Context context, ft5.b bVar) {
        if (f348277a == null) {
            f348277a = new gt5.a(context);
        }
        gt5.a aVar = f348277a;
        aVar.getClass();
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (arrayList.size() == 0) {
                if (bVar != null) {
                    ((vm0.b) bVar).a(-10, null);
                    return;
                }
                return;
            }
            it5.a aVar2 = new it5.a();
            aVar2.f376139f = aVar.b();
            it5.c cVar = new it5.c();
            aVar2.f376137d = cVar;
            cVar.f376162d = 6;
            cVar.f376163e = 1;
            cVar.f376164f = 0;
            cVar.f376165g = 0;
            cVar.f376166h = 0;
            cVar.f376167i = null;
            cVar.f376168m = 0;
            cVar.f376173r = 1;
            aVar2.f376138e = new java.util.ArrayList();
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                gt5.a.a(aVar.f357120a, (ft5.a) arrayList.get(i17), i17);
                aVar2.f376138e.add(null);
            }
            byte[] a17 = aVar.f357121b.a(aVar2);
            if (a17 == null) {
                if (bVar != null) {
                    ((vm0.b) bVar).a(-20, null);
                }
            } else if (bVar != null) {
                ((vm0.b) bVar).a(0, a17);
            }
        } catch (java.lang.Throwable unused) {
            if (bVar != null) {
                ((vm0.b) bVar).a(-100, null);
            }
        }
    }
}
