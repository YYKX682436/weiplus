package lx;

/* loaded from: classes9.dex */
public final class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f403476e;

    public s3(yz5.l lVar, java.util.List list) {
        this.f403475d = lVar;
        this.f403476e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        java.util.List list = this.f403476e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(yw.h1.f547865a.h((java.lang.String) it.next()));
        }
        this.f403475d.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(arrayList)));
    }
}
