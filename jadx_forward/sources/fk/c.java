package fk;

/* loaded from: classes12.dex */
public final class c extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344790a;

    public c(java.lang.String str) {
        this.f344790a = str;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = fk.d.f344791a;
        java.lang.String aid = this.f344790a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aid, "aid");
        fk.a aVar = (fk.a) fk.d.f344791a.get(aid);
        if (aVar != null) {
            synchronized (aVar) {
                if (aVar.f344782b == 0) {
                    aVar.f344782b = ik.f.f373354a.b();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = fk.d.f344791a;
        java.lang.String aid = this.f344790a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aid, "aid");
        fk.a aVar = (fk.a) fk.d.f344791a.get(aid);
        if (aVar != null) {
            synchronized (aVar) {
                aVar.f344783c += aVar.f344782b != 0 ? ik.f.f373354a.b() - aVar.f344782b : 0L;
                aVar.f344782b = 0L;
            }
        }
    }
}
