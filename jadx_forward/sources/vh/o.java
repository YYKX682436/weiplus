package vh;

/* loaded from: classes12.dex */
public class o extends vh.s {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f518344f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f518345g;

    public o(android.view.View view) {
        super(view);
        this.f518344f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oqb);
        this.f518345g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oqh);
    }

    @Override // vh.s
    public void i(vh.h hVar) {
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4645x401e7211 c4645x401e7211 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4645x401e7211) hVar;
        this.f518351d = c4645x401e7211;
        this.f518344f.setText(((java.text.DateFormat) vh.s.f518350e.b()).format(new java.util.Date(c4645x401e7211.f134133e)));
        this.f518345g.setText(c4645x401e7211.f134162f);
    }
}
