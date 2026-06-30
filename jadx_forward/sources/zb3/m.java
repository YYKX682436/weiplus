package zb3;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f552809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zb3.o f552810e;

    public m(zb3.o oVar, android.view.View view) {
        this.f552810e = oVar;
        this.f552809d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        zb3.o oVar = this.f552810e;
        boolean isShown = oVar.f552815g.f227296q.isShown();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b activityC16343x55c0d8b = oVar.f552815g;
        android.view.View view = this.f552809d;
        if (!isShown && view.isShown()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b.V6(activityC16343x55c0d8b);
        }
        activityC16343x55c0d8b.f227295p.m121476x53eb72f9(oVar.f552813e);
        activityC16343x55c0d8b.f227295p.m121469xce4186ff((android.widget.EditText) view);
        ((android.view.inputmethod.InputMethodManager) activityC16343x55c0d8b.mo55332x76847179().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
