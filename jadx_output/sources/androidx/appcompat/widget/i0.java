package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public abstract class i0 {
    public static android.view.inputmethod.InputConnection a(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo, android.view.View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            }
        }
        return inputConnection;
    }
}
