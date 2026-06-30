package gq5;

/* loaded from: classes5.dex */
public final class p extends wm3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // wm3.n
    public j75.a T6() {
        eq5.h hVar = new eq5.h();
        hVar.f337447e = m158359x1e885992().getBooleanExtra("isSender", false);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("toUserNick");
        if (stringExtra == null) {
            stringExtra = "";
        }
        hVar.f337448f = stringExtra;
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("toUserHeadUrl");
        hVar.f337449g = stringExtra2 != null ? stringExtra2 : "";
        return hVar;
    }
}
