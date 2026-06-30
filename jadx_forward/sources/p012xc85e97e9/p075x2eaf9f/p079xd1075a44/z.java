package p012xc85e97e9.p075x2eaf9f.p079xd1075a44;

/* loaded from: classes13.dex */
public class z implements android.view.ActionMode.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ActionMode.Callback f92638a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f92639b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Class f92640c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Method f92641d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f92642e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f92643f = false;

    public z(android.view.ActionMode.Callback callback, android.widget.TextView textView) {
        this.f92638a = callback;
        this.f92639b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        return this.f92638a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        return this.f92638a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(android.view.ActionMode actionMode) {
        this.f92638a.onDestroyActionMode(actionMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[SYNTHETIC] */
    @Override // android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p075x2eaf9f.p079xd1075a44.z.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}
