package ok5;

/* loaded from: classes12.dex */
public final class b extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ok5.c cVar = ok5.c.f427598a;
        android.content.Intent intent = m158359x1e885992();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.util.Map b17 = cVar.b(intent);
        if (b17 != null) {
            kz5.h0.A(b17.entrySet(), ok5.a.f427597d);
            cVar.a(m158359x1e885992());
        }
    }
}
