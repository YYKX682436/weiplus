package w1;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public d1.g f523489a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.a f523490b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.a f523491c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f523492d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f523493e;

    public b(d1.g rect, yz5.a aVar, yz5.a aVar2, yz5.a aVar3, yz5.a aVar4, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        rect = (i17 & 1) != 0 ? d1.g.f307161e : rect;
        aVar = (i17 & 2) != 0 ? null : aVar;
        aVar2 = (i17 & 4) != 0 ? null : aVar2;
        aVar3 = (i17 & 8) != 0 ? null : aVar3;
        aVar4 = (i17 & 16) != 0 ? null : aVar4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        this.f523489a = rect;
        this.f523490b = aVar;
        this.f523491c = aVar2;
        this.f523492d = aVar3;
        this.f523493e = aVar4;
    }

    public final boolean a(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            yz5.a aVar = this.f523490b;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } else if (itemId == 1) {
            yz5.a aVar2 = this.f523491c;
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
            }
        } else if (itemId == 2) {
            yz5.a aVar3 = this.f523492d;
            if (aVar3 != null) {
                aVar3.mo152xb9724478();
            }
        } else {
            if (itemId != 3) {
                return false;
            }
            yz5.a aVar4 = this.f523493e;
            if (aVar4 != null) {
                aVar4.mo152xb9724478();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    public final boolean b(android.view.ActionMode actionMode, android.view.Menu menu) {
        if (menu == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        if (actionMode == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        if (this.f523490b != null) {
            menu.add(0, 0, 0, android.R.string.copy).setShowAsAction(1);
        }
        if (this.f523491c != null) {
            menu.add(0, 1, 1, android.R.string.paste).setShowAsAction(1);
        }
        if (this.f523492d != null) {
            menu.add(0, 2, 2, android.R.string.cut).setShowAsAction(1);
        }
        if (this.f523493e != null) {
            menu.add(0, 3, 3, android.R.string.selectAll).setShowAsAction(1);
        }
        return true;
    }
}
