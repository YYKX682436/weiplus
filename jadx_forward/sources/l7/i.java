package l7;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f398326a = new java.util.ArrayList();

    public synchronized t6.o a(java.lang.Class cls) {
        int size = ((java.util.ArrayList) this.f398326a).size();
        for (int i17 = 0; i17 < size; i17++) {
            l7.h hVar = (l7.h) ((java.util.ArrayList) this.f398326a).get(i17);
            if (hVar.f398324a.isAssignableFrom(cls)) {
                return hVar.f398325b;
            }
        }
        return null;
    }
}
