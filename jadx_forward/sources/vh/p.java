package vh;

/* loaded from: classes12.dex */
public class p extends vh.s implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f518346f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f518347g;

    public p(android.view.View view) {
        super(view);
        this.f518346f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oqb);
        this.f518347g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oqh);
        view.findViewById(com.p314xaae8f345.mm.R.id.hyj).setOnClickListener(this);
    }

    @Override // vh.s
    public void i(vh.h hVar) {
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4646xe0faec95 c4646xe0faec95 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4646xe0faec95) hVar;
        this.f518351d = c4646xe0faec95;
        this.f518346f.setText(((java.text.DateFormat) vh.s.f518350e.b()).format(new java.util.Date(c4646xe0faec95.f134133e)));
        this.f518347g.setText(c4646xe0faec95.f134137g);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(view.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cvh, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.opf);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("EVENT_ID: ");
        sb6.append(((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4646xe0faec95) this.f518351d).f134163i.f134136f);
        sb6.append("\n\n");
        for (java.lang.String str : ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4646xe0faec95) this.f518351d).f134163i.f134138h.keySet()) {
            sb6.append(str);
            sb6.append(" = ");
            sb6.append(((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4646xe0faec95) this.f518351d).f134163i.f134138h.get(str));
            sb6.append("\n\n");
        }
        textView.setText(sb6.toString());
        p012xc85e97e9.p016x746ad0e3.app.l lVar = new p012xc85e97e9.p016x746ad0e3.app.l(view.getContext());
        java.lang.String str2 = ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4646xe0faec95) this.f518351d).f134137g;
        p012xc85e97e9.p016x746ad0e3.app.h hVar = lVar.f90726a;
        hVar.f90665d = str2;
        hVar.f90668g = "确定";
        hVar.f90669h = null;
        hVar.f90672k = true;
        hVar.f90677p = inflate;
        lVar.a().show();
    }
}
