package ap1;

/* loaded from: classes5.dex */
public final class d2 extends wm3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // wm3.n
    public j75.a T6() {
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("contactListShowSize", false);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("titile");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ap1.c2 c2Var = new ap1.c2(stringExtra, booleanExtra, m158359x1e885992().getIntExtra("contactListSortType", 0), m158359x1e885992().getLongExtra("reportPageId", 999L));
        java.lang.String[] stringArrayExtra = m158359x1e885992().getStringArrayExtra("already_select_contact");
        if (stringArrayExtra != null) {
            kz5.h0.w(c2Var.f94163n, stringArrayExtra);
        }
        return c2Var;
    }
}
