package kr5;

/* loaded from: classes13.dex */
public class j implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        ur5.c cVar = ur5.b.f511968a;
        cVar.getClass();
        if (kr5.p.f393104b.f393094p) {
            vr5.a aVar = cVar.f511970b;
            aVar.getClass();
            synchronized (vr5.a.f521350e) {
                arrayList = new java.util.ArrayList();
                android.database.Cursor cursor = null;
                try {
                    try {
                        cursor = aVar.b().query("lookupDB", null, null, null, null, null, null);
                        if (cursor != null && cursor.getCount() > 0) {
                            cursor.moveToFirst();
                            do {
                                arrayList.add(new vr5.b(cursor.getString(cursor.getColumnIndex("host")), vr5.c.b(cursor.getBlob(cursor.getColumnIndex("result")))));
                            } while (cursor.moveToNext());
                        }
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (java.lang.Exception e17) {
                                or5.b.b("cursor close error " + e17, new java.lang.Object[0]);
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        or5.b.b("read from db fail " + e18, new java.lang.Object[0]);
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (java.lang.Exception e19) {
                                or5.b.b("cursor close error " + e19, new java.lang.Object[0]);
                            }
                        }
                    }
                } finally {
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                vr5.b bVar = (vr5.b) it.next();
                ((java.util.concurrent.ConcurrentHashMap) cVar.f511969a).put(bVar.f521352a, bVar.f521353b);
                bs5.g gVar = (bs5.g) bVar.f521353b.f503026e;
                if (gVar == null || (java.lang.System.currentTimeMillis() > gVar.f105566p && java.lang.System.currentTimeMillis() > gVar.f105567q)) {
                    arrayList2.add(bVar.f521352a);
                }
            }
            cVar.f511970b.a((java.lang.String[]) arrayList2.toArray(new java.lang.String[arrayList2.size()]));
        }
    }
}
