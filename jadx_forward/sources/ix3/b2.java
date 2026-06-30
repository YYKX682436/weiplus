package ix3;

/* loaded from: classes10.dex */
public final class b2 extends wm3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // wm3.n
    public j75.a T6() {
        ix3.a2 a2Var = new ix3.a2();
        java.lang.String stringExtra = m158359x1e885992().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (stringExtra == null) {
            stringExtra = "";
        }
        a2Var.f376893e = stringExtra;
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("dirPath");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        a2Var.f376894f = stringExtra2;
        java.lang.String stringExtra3 = m158359x1e885992().getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
        a2Var.f376895g = stringExtra3 != null ? stringExtra3 : "";
        return a2Var;
    }
}
