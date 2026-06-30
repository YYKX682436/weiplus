package p3321xbce91901.jvm.p3324x21ffc6bd;

/* loaded from: classes7.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f391659a;

    public l0(int i17) {
        this.f391659a = new java.util.ArrayList(i17);
    }

    public void a(java.lang.Object obj) {
        this.f391659a.add(obj);
    }

    public void b(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        boolean z17 = obj instanceof java.lang.Object[];
        java.util.ArrayList arrayList = this.f391659a;
        if (z17) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                java.util.Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof java.util.Collection) {
            arrayList.addAll((java.util.Collection) obj);
            return;
        }
        if (obj instanceof java.lang.Iterable) {
            java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof java.util.Iterator)) {
                throw new java.lang.UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            java.util.Iterator it6 = (java.util.Iterator) obj;
            while (it6.hasNext()) {
                arrayList.add(it6.next());
            }
        }
    }

    public int c() {
        return this.f391659a.size();
    }

    public java.lang.Object[] d(java.lang.Object[] objArr) {
        return this.f391659a.toArray(objArr);
    }
}
