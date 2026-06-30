package w1;

/* loaded from: classes14.dex */
public final class a extends android.view.ActionMode.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final w1.b f523488a;

    public a(w1.b callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f523488a = callback;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        return this.f523488a.a(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        this.f523488a.b(actionMode, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(android.view.ActionMode actionMode) {
        this.f523488a.getClass();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(android.view.ActionMode actionMode, android.view.View view, android.graphics.Rect rect) {
        d1.g gVar = this.f523488a.f523489a;
        if (rect != null) {
            rect.set((int) gVar.f307162a, (int) gVar.f307163b, (int) gVar.f307164c, (int) gVar.f307165d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        this.f523488a.getClass();
        return false;
    }
}
