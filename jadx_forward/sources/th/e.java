package th;

/* loaded from: classes12.dex */
public class e implements android.widget.PopupMenu.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f500777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f500778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ th.h f500779c;

    public e(th.h hVar, java.util.List list, android.widget.TextView textView) {
        this.f500779c = hVar;
        this.f500777a = list;
        this.f500778b = textView;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String charSequence = menuItem.getTitle().toString();
        if (!charSequence.contains(":")) {
            return false;
        }
        java.lang.String substring = charSequence.substring(charSequence.lastIndexOf(":") + 1);
        for (m3.d dVar : this.f500777a) {
            if (charSequence.equals("Process :" + th.o.c((java.lang.String) dVar.f404626b))) {
                th.h hVar = this.f500779c;
                hVar.f500783e.f500799d = dVar;
                this.f500778b.setText(":" + substring);
                hVar.f500782d.setText(java.lang.String.valueOf(hVar.f500783e.f500799d.f404625a));
            }
        }
        return false;
    }
}
