package gp3;

/* loaded from: classes9.dex */
public class r implements hp3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gp3.s f355919a;

    public r(gp3.s sVar) {
        this.f355919a = sVar;
    }

    @Override // hp3.a
    /* renamed from: onClick */
    public void mo68436xaf6b9ae9(android.view.View view) {
        android.view.View.OnClickListener onClickListener = this.f355919a.S;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
