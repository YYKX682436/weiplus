package u4;

/* loaded from: classes9.dex */
public abstract class z0 {
    public static java.util.ArrayList a(java.util.ArrayList arrayList, java.lang.Object obj) {
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        if (!arrayList.contains(obj)) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static java.util.ArrayList b(java.util.ArrayList arrayList, java.lang.Object obj) {
        if (arrayList == null) {
            return arrayList;
        }
        arrayList.remove(obj);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
