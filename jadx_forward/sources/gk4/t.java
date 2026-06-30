package gk4;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f354163a;

    public t(java.util.List trackList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trackList, "trackList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f354163a = arrayList;
        arrayList.addAll(trackList);
        if (arrayList.isEmpty()) {
            return;
        }
        long j17 = 0;
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            gk4.s sVar = (gk4.s) obj;
            long j18 = ((float) (sVar.f354159e - sVar.f354158d)) / sVar.f354160f;
            sVar.f354156b = j17;
            j17 += j18;
            sVar.f354157c = j17;
            i17 = i18;
        }
    }
}
