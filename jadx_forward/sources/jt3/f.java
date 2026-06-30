package jt3;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jt3.h f383156d;

    public f(jt3.h hVar) {
        this.f383156d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map = this.f383156d.f383167f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "access$getViewMap$p(...)");
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce) ((java.util.Map.Entry) it.next()).getValue()).mo9065x41012807();
        }
    }
}
