package f93;

/* loaded from: classes10.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f342019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f93.w1 f342020e;

    public v1(f93.w1 w1Var, java.util.Set set) {
        this.f342020e = w1Var;
        this.f342019d = set;
    }

    @Override // java.lang.Runnable
    public void run() {
        f93.w1 w1Var = this.f342020e;
        java.lang.String string = w1Var.f342026d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9b);
        android.content.Intent intent = new android.content.Intent(w1Var.f342026d, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.class);
        intent.putExtra("list_type", 1);
        intent.putExtra("filter_type", "@all.contact.android");
        intent.putExtra("only_show_contact", true);
        java.util.Set set = this.f342019d;
        if (set.size() > 0) {
            intent.putExtra("titile", string + "(" + set.size() + ")");
        } else {
            intent.putExtra("titile", string);
        }
        intent.putExtra("last_page_source_type", 1);
        intent.putExtra("key_label_click_source", w1Var.f342026d.getIntent().getIntExtra("key_label_click_source", 0));
        intent.putExtra("can_go_to_profile", true);
        intent.putExtra("list_type", 1);
        intent.putExtra("already_select_contact", (java.lang.String[]) set.toArray(new java.lang.String[0]));
        w1Var.f342026d.startActivityForResult(intent, com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14480xb9cc8658);
    }
}
