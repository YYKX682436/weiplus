package db0;

/* loaded from: classes8.dex */
public final class h implements db0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db0.j f309362a;

    public h(db0.j jVar) {
        this.f309362a = jVar;
    }

    @Override // db0.e
    public void a(java.lang.Object obj, int i17) {
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.e0 item = (com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.e0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = item.f148863d;
        int hashCode = c10597xb1f0d2.hashCode();
        db0.j jVar = this.f309362a;
        if (jVar.f309367d.indexOfKey(hashCode) >= 0) {
            return;
        }
        jVar.f309367d.put(hashCode, true);
        ((di1.f) jVar.f309364a).i(1L, c10597xb1f0d2.f148119d, c10597xb1f0d2.f148121f, c10597xb1f0d2.f148127o ? c10597xb1f0d2.f148128p : 3);
    }
}
