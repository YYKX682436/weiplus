package vh;

/* loaded from: classes12.dex */
public class a implements android.widget.PopupMenu.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vh.b f518310a;

    public a(vh.b bVar) {
        this.f518310a = bVar;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String charSequence = menuItem.getTitle().toString();
        if (charSequence.contains(":")) {
            java.lang.String substring = charSequence.substring(charSequence.lastIndexOf(":") + 1);
            vh.b bVar = this.f518310a;
            bVar.f518312e.f518313a.setText(":" + substring);
            vh.c cVar = bVar.f518312e;
            vh.y yVar = cVar.f518314b.f134155d;
            yVar.f518362e = substring;
            yVar.f518361d = 0;
            yVar.f518360c.post(new vh.w(yVar));
            cVar.f518314b.f134155d.b();
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.ActivityC4641x313ebfe1.O6(cVar.f518314b, 0);
        }
        return false;
    }
}
