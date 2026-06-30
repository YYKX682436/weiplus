package vh;

/* loaded from: classes12.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k f518311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh.c f518312e;

    public b(vh.c cVar, com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k kVar) {
        this.f518312e = cVar;
        this.f518311d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.widget.PopupMenu popupMenu = new android.widget.PopupMenu(view.getContext(), this.f518312e.f518313a);
        popupMenu.getMenu().add("Process :main");
        this.f518311d.getClass();
        for (java.lang.String str : java.util.Collections.emptySet()) {
            if (!com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29.equals(str)) {
                popupMenu.getMenu().add("Process :" + str);
            }
        }
        popupMenu.setOnMenuItemClickListener(new vh.a(this));
        popupMenu.show();
    }
}
