package ap1;

/* loaded from: classes5.dex */
public final class d2 extends wm3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // wm3.n
    public j75.a T6() {
        boolean booleanExtra = getIntent().getBooleanExtra("contactListShowSize", false);
        java.lang.String stringExtra = getIntent().getStringExtra("titile");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ap1.c2 c2Var = new ap1.c2(stringExtra, booleanExtra, getIntent().getIntExtra("contactListSortType", 0), getIntent().getLongExtra("reportPageId", 999L));
        java.lang.String[] stringArrayExtra = getIntent().getStringArrayExtra("already_select_contact");
        if (stringArrayExtra != null) {
            kz5.h0.w(c2Var.f12630n, stringArrayExtra);
        }
        return c2Var;
    }
}
