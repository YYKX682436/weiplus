package ie;

/* loaded from: classes7.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ie.d f372484d;

    public a(ie.d dVar) {
        this.f372484d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener = this.f372484d.G;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
