package tj5;

/* loaded from: classes8.dex */
public class b implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 f501367d;

    public b(com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381) {
        this.f501367d = c22479x68a26381;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/search/FTSEditTextView$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (keyEvent.getAction() == 0 && 67 == i17) {
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f501367d;
            int selectionStart = c22479x68a26381.f291349g.getSelectionStart();
            int selectionEnd = c22479x68a26381.f291349g.getSelectionEnd();
            if (selectionStart == 0 && selectionEnd == 0 && ((java.util.ArrayList) c22479x68a26381.f291350h).size() > 0 && c22479x68a26381.f291358s) {
                ((java.util.ArrayList) c22479x68a26381.f291350h).remove(((java.util.ArrayList) r8).size() - 1);
                c22479x68a26381.w();
                com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381.a(c22479x68a26381);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/search/FTSEditTextView$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
