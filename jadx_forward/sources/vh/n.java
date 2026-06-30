package vh;

/* loaded from: classes12.dex */
public class n extends vh.s {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f518342f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f518343g;

    public n(android.view.View view) {
        super(view);
        this.f518342f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oqb);
        this.f518343g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oqh);
    }

    @Override // vh.s
    public void i(vh.h hVar) {
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4644x40105a90 c4644x40105a90 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4644x40105a90) hVar;
        this.f518351d = c4644x40105a90;
        this.f518342f.setText(((java.text.DateFormat) vh.s.f518350e.b()).format(new java.util.Date(c4644x40105a90.f134133e)));
        this.f518343g.setText(c4644x40105a90.f134161f);
    }
}
