package androidx.compose.ui.platform;

/* loaded from: classes13.dex */
public final class d4 {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.d4 f10539a = new androidx.compose.ui.platform.d4();

    public final void a(android.view.ActionMode actionMode) {
        kotlin.jvm.internal.o.g(actionMode, "actionMode");
        actionMode.invalidateContentRect();
    }

    public final android.view.ActionMode b(android.view.View view, android.view.ActionMode.Callback actionModeCallback, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(actionModeCallback, "actionModeCallback");
        return view.startActionMode(actionModeCallback, i17);
    }
}
